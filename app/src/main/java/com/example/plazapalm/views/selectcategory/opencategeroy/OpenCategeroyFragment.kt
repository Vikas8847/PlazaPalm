package com.example.plazapalm.views.selectcategory.opencategeroy

import android.Manifest
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
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FragmentOpenCategeroyBinding
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateWithId
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class OpenCategeroyFragment : Fragment(R.layout.fragment_open_categeroy), clickItem {

    private var binding: FragmentOpenCategeroyBinding? = null
    private val viewmodel: OpenCategeroyViewModel by viewModels()
    private lateinit var mFusedLocation: FusedLocationProviderClient

    @Inject
    lateinit var pref: PreferenceFile
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {

        binding = FragmentOpenCategeroyBinding.inflate(inflater, container, false)
        mFusedLocation = LocationServices.getFusedLocationProviderClient(requireContext())



        return binding?.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.vm = viewmodel

        if (pref.retrieveCategoryLocation() != null && pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT).toDouble()!=0.0) {
            viewmodel.address.set(pref.retrieveCategoryLocation())
            viewmodel.latitude.set(pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT).toDouble())
            viewmodel.longitude.set(pref.retvieLatlong(Constants.CATEGORY_SCREEN_LONG).toDouble())
            Log.e("QQQQQQ",pref.retrieveCategoryLocation().toString())
            getdata()
        }else
        {
            getLastLocation()
        }
    }

    private fun getdata() {

        binding?.tvCategories?.visibility = View.VISIBLE
        viewmodel.isChecked.set(false)
        binding?.rvCategoryLocation?.isSelected = false
        viewmodel.getCategoriesApi(binding!!.rvCategoryLocation, requireActivity(), this)

        /** Get Data from Add cities screen **/

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("bundle")
            ?.observe(viewLifecycleOwner) { data ->

                val datafromLocation = data
                // Split will return an array
                val split = datafromLocation.split("/")

                val lati = split[0] // First element
                val longi = split[1] // Second element
                val address = split[2] // Second element

                /***
                 * */
                viewmodel.address.set(address)
                viewmodel.longitude.set(longi.toDouble())
                viewmodel.latitude.set(lati.toDouble())
                viewmodel.address.set(address)

                Log.e("ADDKFJSDFJSDJF", data.toString() + "CIIDDDD" + address)

            }

    }

    override fun click(categoryName: String, position: Int, c_id: String?, s: String, color: Int?) {

        val bundle = Bundle()
        bundle.putString("fromOpencate", "openCategeroy")
        bundle.putString("cateName", categoryName)
        bundle.putString("c_id", c_id)
        bundle.putDouble("longitude", viewmodel.longitude.get()!!)
        bundle.putDouble("latitude", viewmodel.latitude.get()!!)
        bundle.putString("status", "OPEN")

        view?.navigateWithId(R.id.dashBoardFragment, bundle)

        Log.e("SFSDs", categoryName.toString())

    }

    // Get current location
    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                if (ActivityCompat.checkSelfPermission(
                        requireActivity(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        requireActivity(),
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
                    } else {
                        val geocoder = Geocoder(requireContext(), Locale.getDefault())
                        val list: List<Address> =
                            geocoder.getFromLocation(location.latitude, location.longitude, 1) as List<Address>
                        viewmodel.latitude.set(list[0].latitude!!)
                        viewmodel.longitude.set(list[0].longitude!!)

                      //  viewmodel.name.set(list[0].countryName)
                        viewmodel.address.set(list[0].countryName)

                        getdata()
                        Log.e("countryName", "" + list[0].locality + "" + list[0].countryName + "XCXCX" +
                                list[0].latitude + "LATTTTT " + list[0].longitude)
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

    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(false)
    }

}