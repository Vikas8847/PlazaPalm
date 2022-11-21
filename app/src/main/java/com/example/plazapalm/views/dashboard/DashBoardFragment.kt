package com.example.plazapalm.views.dashboard

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.DashBoardFragmentBinding
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.utils.CommonMethods
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.collections.ArrayList


@AndroidEntryPoint
class DashBoardFragment : Fragment(R.layout.dash_board_fragment) {
    private var binding: DashBoardFragmentBinding? = null
    private lateinit var mFusedLocation: FusedLocationProviderClient
    private val viewModel: DashBoardVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DashBoardFragmentBinding.inflate(layoutInflater)
        mFusedLocation = LocationServices.getFusedLocationProviderClient(requireContext())
        getLastLocation()
        getdata()
        getCategoriesListAndID()
        viewModel.getProfileByCategory()

        return binding?.root
    }

    private fun getdata() {
        if (arguments?.getString("fromOpencate") != null) {
            binding!!.ivDashBoardFilter.visibility = View.GONE
            binding!!.searchBar.visibility = View.GONE
            binding!!.ivDashBoardSelectedList.visibility = View.GONE
            binding!!.tvDashBoardTitle.text = arguments?.getString("cateName")
            viewModel.status.set(arguments?.getString("status"))
        }
        else
        {
            viewModel.status.set("DashBoard")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
        binding?.vm = viewModel
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {
        binding?.rvDashBoard?.layoutManager = GridLayoutManager(requireContext(), 2)
        binding?.rvDashBoard?.adapter?.notifyDataSetChanged()
    }

    private fun getCategoriesListAndID() {
        if (arguments != null) {
            when {
                arguments?.getString("fromOpencate")!=null -> {
                    viewModel.lati.set(arguments?.getDouble("openCateLati")!!)
                    viewModel.longi.set(arguments?.getDouble("openCateLongi")!!)
                    //viewModel.longi.set(arguments?.getDouble("openCateLati")!!)
                }


                arguments?.getString("fromCategoriesList")!=null && arguments?.containsKey("fromCategoriesList")!!->{
                    val idData: ArrayList<CategoriesData> = arguments?.getParcelableArrayList("fromCategoriesList")!!
                    for (idx in 0 until idData.size){
                        viewModel.idList.addAll(listOf(idData[idx]._id!!))

                    }
                    /* = java.util.ArrayList<com.example.plazapalm.models.CategoriesData> */ /* = java.util.ArrayList<com.example.plazapalm.models.CategoriesData> */
                    viewModel.lati.set(arguments?.getDouble("latitude")!!)
                    viewModel.longi.set(arguments?.getDouble("longitude")!!)
                }

                arguments?.getStringArrayList("filterCategoriesIds")!=null->{
                    val idData: ArrayList<CategoriesData> = arguments?.getParcelableArrayList("filterCategoriesIds")!!
                    for (idx in 0 until idData.size){
                        viewModel.idList.addAll(listOf(idData[idx]._id!!))

                    }
                    viewModel.lati.set(arguments?.getDouble("Filterlongitude")!!)
                    viewModel.longi.set(arguments?.getDouble("Filterlatitude")!!)
                }
                arguments?.getStringArrayList("FromLoginScreenCategoriesIds")!=null->{
                    val idData: ArrayList<CategoriesData> = arguments?.getParcelableArrayList("FromLoginScreenCategoriesIds")!!
                    for(idx in 0 until idData.size){
                        viewModel.idList.addAll(listOf(idData[idx]._id!!))

                    }
                    viewModel.lati.set(arguments?.getDouble("Loginlongitude")!!)
                    viewModel.longi.set(arguments?.getDouble("Loginlatitude")!!)
                }
                else ->
                {

                }
            }

        }
    }

    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                if (ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
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
                        viewModel.lati.set(location.latitude)
                        viewModel.longi.set(location.longitude)

                     /*   val geocoder = Geocoder(requireContext(), Locale.getDefault())
                        val list: List<Address> = geocoder.getFromLocation(location.latitude, location.longitude, 1)
                        viewmodel.latitude.set(list[0].latitude)
                        viewmodel.longitude.set(list[0].longitude)
                        list[0].countryName
                        Log.e("countryName", "" + list[0].locality + "" + list[0].countryName)*/
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
    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(true)
        getLastLocation()
    }

}