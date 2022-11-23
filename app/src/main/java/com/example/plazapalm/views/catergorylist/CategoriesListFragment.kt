package com.example.plazapalm.views.catergorylist

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.Parcelable
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.CategoriesListFragmentBinding
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.models.CategoriesResponseModel
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.utils.navigateWithId
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class CategoriesListFragment : Fragment(R.layout.categories_list_fragment) {
    private lateinit var mFusedLocation: FusedLocationProviderClient
    var bottomNavigationView: BottomNavigationView? = null
    private var binding: CategoriesListFragmentBinding? = null
    private val viewmodel: CategoriesListVM by viewModels()

    private var loading = true
    var pastVisiblesItems = 0
    var visibleItemCount: Int = 0
    var totalItemCount: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CategoriesListFragmentBinding.inflate(inflater, container, false)
        mFusedLocation = LocationServices.getFusedLocationProviderClient(requireContext())
      //  getCurrentCoOrdinates()
        getLastLocation()
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewmodel
        bottomNavigationView = requireActivity().findViewById(R.id.bottNavMain)
        showCategories()
        getData()

        //vikas 10-10-2022
        /*  if (viewmodel.categoriesDataList.size < 0) {
              binding?.rvCategoryLocation?.visibility = View.GONE
          } else {
              binding?.rvCategoryLocation?.visibility = View.VISIBLE
          }*/
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun showCategories() {
        binding?.rvCategoryLocation?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvCategoryLocation?.adapter = viewmodel.adapterCategories
        binding?.rvCategoryLocation?.adapter?.notifyDataSetChanged()

/*
        binding?.rvCategoryLocation?.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                // Check for scrol dowen
                Log.v("VVVCCC", "Last Item Wow !" )

                if (dy > 0) {
                    visibleItemCount = binding?.rvCategoryLocation!!.layoutManager!!.getChildCount()
                    totalItemCount = LinearLayoutManager(requireContext()).getItemCount()
                    pastVisiblesItems = LinearLayoutManager(requireContext()).findFirstVisibleItemPosition()

                    val lastitem = visibleItemCount + pastVisiblesItems


                    if (loading) {
                        var page = 1
                        if (lastitem==totalItemCount) {
                            loading = false
                            page++
                            Log.v("VVVCCC", "Last Item Wow !" + page)
                            // Do pagination.. i.e. fetch new data
                            viewmodel.page.set(page)
                            binding?.rvCategoryLocation?.adapter?.notifyDataSetChanged()
                            loading = true
                        }
                    }

                }
            }
        })
*/

    }

    /**Get Type from previous screen using bundle **/
    private fun getData() {
        if (arguments != null) {
            when (arguments?.getString("comingFrom")) {
                "isFilter" -> {
                    viewmodel.getCategoriesApi()
                    binding?.tvCategories?.text = "Choose Category"
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.ivCategory?.visibility = View.VISIBLE
                    binding?.ivCategoriesForward?.visibility = View.VISIBLE
                    binding?.ivCategoriesForward?.setOnClickListener {
                        //from here we have to send categories id's and send in dashboard getProfile by id api..
                        val dataList=viewmodel.categoriesDataList.filter { it.isCheck==true }
                        if (dataList.isNotEmpty()){
                            val bundle=Bundle()
                            bundle.putParcelableArrayList("filterCategoriesIds",dataList as ArrayList<CategoriesData>)
                            bundle.putDouble("Filterlongitude",viewmodel.longitude.get())
                            bundle.putDouble("Filterlatitude",viewmodel.latitude.get())
                            bundle.putDouble("currentLatitude",viewmodel.currentLatitude.get())
                            bundle.putDouble("currentLongitude",viewmodel.currentLongitude.get())
                            view?.navigateWithId(R.id.dashBoardFragment,bundle)
                        }
                        else
                        {
                            CommonMethods.showToast(CommonMethods.context, "Please select categories first")
                        }
                    }
                    if (viewmodel.isChecked.get()) {
                        viewmodel.isChecked.set(false)
                    } else {
                        viewmodel.isChecked.set(true)
                    }
                    bottomNavigationView?.visibility = View.GONE


                }
                "main" -> {
                    binding?.tvCategories?.text = "Category"
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.ivCategory?.visibility = View.GONE
                    binding?.ivCategoriesForward?.visibility = View.GONE
                    viewmodel.isChecked.set(false)
                    binding?.rvCategoryLocation?.isSelected = false
                    viewmodel.getCategoriesApi()

                }
                "login" -> {
                    viewmodel.getCategoriesApi()
                    binding?.tvCategories?.text = "Choose Category"
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.ivCategory?.visibility = View.VISIBLE
                    binding?.ivCategoriesForward?.visibility = View.VISIBLE
                    binding?.ivCategoriesForward?.setOnClickListener {
                        val dataList=viewmodel.categoriesDataList.filter { it.isCheck==true }
                        if (dataList.isNotEmpty()){
                            val bundle=Bundle()
                            bundle.putParcelableArrayList("FromLoginScreenCategoriesIds",dataList as ArrayList<CategoriesData>)
                            bundle.putDouble("Loginlongitude",viewmodel.longitude.get())
                            bundle.putDouble("Loginlatitude",viewmodel.latitude.get())
                            bundle.putDouble("currentLatitude",viewmodel.currentLatitude.get())
                            bundle.putDouble("currentLongitude",viewmodel.currentLongitude.get())
                            view?.navigateWithId(R.id.dashBoardFragment,bundle)
                        }
                        else
                        {
                            CommonMethods.showToast(CommonMethods.context, "Please select categories first")
                        }
                    }
                    bottomNavigationView?.visibility = View.GONE
                }
                "signup" -> {
                    viewmodel.getCategoriesApi()
                    binding?.tvCategories?.text = "Choose Category"
                    binding?.ivCategory?.visibility = View.VISIBLE
                    binding?.ivCategoriesForward?.visibility = View.VISIBLE

                    binding?.ivCategoriesForward?.setOnClickListener {
                        //from here we have to send categories id's and send in dashboard getProfile by id api..
                     val dataList=viewmodel.categoriesDataList.filter { it.isCheck==true }

                        Log.e("BANDRA" , dataList.toString())

                        if (dataList.isNotEmpty()){
                            val bundle=Bundle()
                            /// now
                            bundle.putString("fromCategories" , "fromCategoriesFragList")
                            bundle.putParcelableArrayList("fromCategoriesList",dataList as ArrayList<CategoriesData>)
                            bundle.putDouble("longitude",viewmodel.longitude.get())
                            bundle.putDouble("latitude",viewmodel.latitude.get())
                            bundle.putDouble("currentLatitude",viewmodel.currentLatitude.get())
                            bundle.putDouble("currentLongitude",viewmodel.currentLongitude.get())
                            view?.navigateWithId(R.id.dashBoardFragment,bundle)
                        } else {
                            CommonMethods.showToast(CommonMethods.context, "Please select categories first")
                        }
                    }

                    bottomNavigationView?.visibility = View.GONE
                }

                "addCities" -> {
                    viewmodel.getCategoriesApi()
                    var longitude = arguments?.containsKey("longitude")
                    var latitude = arguments?.containsKey("latitude")
                    viewmodel.address.set(arguments?.getString("addressFromCities"))
                }
                "postProfile" -> {
                    viewmodel.getCategoriesApi()
                    binding?.tvCategories?.text = "Choose Category"
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.ivCategory?.visibility = View.VISIBLE

                }
                else -> {
                    /*binding?.tvCategories?.text = "Category"
                    binding?.tvCategories?.visibility = View.VISIBLE
                    binding?.ivCategory?.visibility = View.GONE
                    binding?.ivCategoriesForward?.visibility = View.GONE
                    viewmodel.getCategoriesApi()*/
                }
            }
        }
    }
    // Get current location
    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                if (ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
                ) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return
                }
                mFusedLocation.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        CommonMethods.requestNewLocationData()
                    }
                    else
                    {
                        viewmodel.currentLatitude.set(location.latitude)
                        viewmodel.currentLongitude.set(location.longitude)

                        val geocoder = Geocoder(requireContext(), Locale.getDefault())
                        val list: List<Address> = geocoder.getFromLocation(location.latitude, location.longitude, 1)
                        viewmodel.latitude.set(list[0].latitude)
                        viewmodel.longitude.set(list[0].longitude)
                        list[0].countryName
                        Log.e("countryName", "" + list[0].locality + "" + list[0].countryName)
                    }
                }
            } else {
                CommonMethods.showToast(requireContext(), "Turn on Location")
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        } else {
            CommonMethods.requestPermissions()
        }
    }

    // What must happen when permission is granted
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == CommonMethods.pERMISSION_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
            }
        }
    }

/*
    private fun getCurrentCoOrdinates(){
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        mFusedLocation.lastLocation?.addOnCompleteListener {
            val location:Location=it.result
            if (!location.equals("")){
                viewmodel.currentLatitude.set(location.latitude)
                viewmodel.currentLongitude.set(location.longitude)
            }
            else{
                CommonMethods.requestNewLocationData()
            }
        }
    }
*/

    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(false)
        getLastLocation()
    }

}