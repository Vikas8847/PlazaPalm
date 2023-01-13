package com.example.plazapalm.views.advancesettings.map

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.work.PeriodicWorkRequestBuilder
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceMapFragmentBinding
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.advanceMap_Permission_ID
import com.example.plazapalm.utils.CommonMethods.checkPermissions
import com.example.plazapalm.utils.CommonMethods.currentLocation
import com.example.plazapalm.utils.CommonMethods.isLocationEnabled
import com.example.plazapalm.utils.CommonMethods.mFusedLocationClient
import com.example.plazapalm.utils.CommonMethods.requestNewLocationData
import com.example.plazapalm.workmanager.WorkManager
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.*
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
import com.google.android.gms.maps.model.*
import com.google.android.libraries.places.api.Places
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject


@AndroidEntryPoint
class AdvanceMapFragment : Fragment(R.layout.advance_map_fragment), OnMapReadyCallback,
    GoogleMap.OnPolylineClickListener, GoogleMap.OnMapClickListener,
    LocationSource.OnLocationChangedListener {
    private val PATTERN_GAP_LENGTH_PX = 20
    private val DOT: PatternItem = Dot()
    private val GAP: PatternItem = Gap(PATTERN_GAP_LENGTH_PX.toFloat())
    var markerList = ArrayList<Marker>()

    // Create a stroke pattern of a gap followed by a dot.
    private val PATTERN_POLYLINE_DOTTED = listOf(GAP, DOT)

    private lateinit var marker: MarkerOptions
    lateinit var mMap: GoogleMap
    //  var latLng = LatLng(30.741482, 76.768066)

    @Inject
    lateinit var pref : PreferenceFile

//    var isDrag =ObservableBoolean(false)

    lateinit var mapFragment: SupportMapFragment
    private var binding: AdvanceMapFragmentBinding? = null
    private val viewModel: AdvanceMapVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
         ): View? {
        binding = AdvanceMapFragmentBinding.inflate(layoutInflater)
        mapFragment = SupportMapFragment()
        CommonMethods.statusBar(true)
        setApiData()

        onClicks()
        return binding?.root

    }


    private fun setApiData() {
        viewModel.darkThemeLive.observe(viewLifecycleOwner){
            if (it!=null){
                if (it.equals(true)){
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setChecked(true)
                    mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(requireContext(), R.raw.map_json_dark_mode))

                }else{
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setChecked(false)
                    Log.e("ASDQWQQqq","SADASD")
                }
            }
        }

        viewModel.locationOnOFLive.observe(viewLifecycleOwner){
            if (it!=null){
                if (it.equals(true)){
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setChecked(true)

                }else{
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setChecked(false)
                    Log.e("ASDQWQQqq","SADASD")
                }
            }
        }

        viewModel.followLive.observe(viewLifecycleOwner){
            if (it!=null){
                if (it.equals(true)){
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setChecked(true)

                }else{
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setOnCheckedChangeListener (null)
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setChecked(false)
                    Log.e("ASDQWQQqq","SADASD")
                }
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchApiKey()
        viewModel.mapFeatureGet()

        binding?.vm = viewModel
    }

    private fun fetchApiKey() {
        /**Fetching API_KEY which we wrapped**/
        val ai: ApplicationInfo =
            requireContext().applicationContext?.packageManager!!.getApplicationInfo(
                requireContext().applicationContext.packageName,
                PackageManager.GET_META_DATA
            )
        val value = ai.metaData["com.google.android.geo.API_KEY"]
        val apiKey = value.toString()
        /** Initialized Places Api key with the help of API -KEY **/
        if (!Places.isInitialized()) {
            Places.initialize(context?.applicationContext!!, apiKey)
        }
        /** Initializing Map..**/
        mapFragment = childFragmentManager.findFragmentById(R.id.mapFragment1) as SupportMapFragment
        mapFragment.getMapAsync(this)
        /** Initializing fused location client **/
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())
    }

    // Services such as getLastLocation()
    // will only run once map is ready
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        this.mMap.setOnMapClickListener(this)
        getLastLocation()

//        var lat =  pref.retvieLatlong("lati").toDouble()
//        val long =  pref.retvieLatlong("longi").toDouble()
//        val currentLoc  = LatLng(lat,long)
//
//
//        googleMap.addMarker(
//            MarkerOptions()
//                .position(currentLoc).draggable(true)
//        )

        this.mMap.setOnMarkerDragListener(@SuppressLint("PotentialBehaviorOverride")
        object : OnMarkerDragListener {
            override fun onMarkerDragStart(marker: Marker) {
                // TODO Auto-generated method stub
            }

            override fun onMarkerDragEnd(marker: Marker) {
                // TODO Auto-generated method stub
//                lat = marker.position.latitude
//                lng = marker.position.longitude
            }

            override fun onMarkerDrag(marker: Marker) {
                // TODO Auto-generated method stub
            }
        })

    }


    // Get current location
    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        requestNewLocationData()
                    } else {

                        currentLocation = LatLng(location.latitude, location.longitude)
                        mMap.clear()
                        val  markerOptions = MarkerOptions().position(currentLocation)
                            .title("I am here! On Your Current Location").draggable(true)
                        mMap.animateCamera(CameraUpdateFactory.newLatLng(currentLocation))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 15F))
                        mMap.isMyLocationEnabled = true
                        mMap.addMarker(markerOptions)


                        Log.e("ASDQWXCSD" , currentLocation.toString() + "  -- DDDDDD0" )

                      /*  if (isDrag.get() ==true){
                            currentLocation = LatLng(location.latitude, location.longitude)
                            mMap.clear()
                           val  markerOptions = MarkerOptions().position(currentLocation)
                                .title("I am here! On Your Current Location").draggable(true)
                            mMap.animateCamera(CameraUpdateFactory.newLatLng(currentLocation,))
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 15F))
                            mMap.isMyLocationEnabled = true
                            mMap.addMarker(markerOptions)

                            isDrag.set(false)
                            Log.e("isDrag","Working1")
                        }else{
                           val currentLocation = LatLng(location.latitude, location.longitude)
                            mMap.clear()
                            val markerOptions = MarkerOptions().position(currentLocation)
                                .title("I am here! On Your Current Location").draggable(false)
                            mMap.animateCamera(CameraUpdateFactory.newLatLng(CommonMethods.currentLocation,))
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(CommonMethods.currentLocation, 15F))
                            mMap.isMyLocationEnabled = true
                            mMap.addMarker(markerOptions)

                            isDrag.set(true)
                            Log.e("isDrag","Working2")

                        }
*/
                        /* mMap.addMarker(MarkerOptions().position(latLng)
                                 .title("Your Destination is Here ")
                                 .snippet("Destination Description")
                         )*/
                        // addPolyGon()

                        /**Poly lines clicks ***/
                        mMap.setOnPolylineClickListener(this@AdvanceMapFragment)
                        mMap.setOnPolylineClickListener(this@AdvanceMapFragment)

                        mMap.setOnMarkerDragListener(object : OnMarkerDragListener {
                            override fun onMarkerDragStart(marker: Marker) {
                                // TODO Auto-generated method stub
                            }

                            override fun onMarkerDragEnd(marker: Marker) {
                                // TODO Auto-generated method stub
                                var lat = LatLng(marker.position.latitude,marker.position.longitude)
                               currentLocation =  lat

//                                isDrag.set(true)

                                Log.e("DFFoppop",lat.toString() )
                            }

                            override fun onMarkerDrag(marker: Marker) {
                                // TODO Auto-generated method stub
                            }
                        })
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

    /*// function to check if GPS is on
    private fun isLocationEnabled(): Boolean {
        val locationManager = requireContext().getSystemService(Context.LOCATION_SERVICE) as LocationManager
        locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        return false
    }*/

    // What must happen when permission is granted
    @Deprecated("Deprecated in Java")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == advanceMap_Permission_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
            }
        }
    }

    private fun onClicks() {
        binding?.btCurrentLocation?.setOnClickListener {
            /****Here get Last location latlng */
            getLastLocation()
        }


        /**Here on Switch button click dark mode and light mode handled (Dark Mode enabled-disabled)**/
        binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnClickListener {

            if (viewModel.darkTheme.get()==true) {
                viewModel.setMapThemeAPI(false, viewModel.locationOnOF.get(), viewModel.follow.get())
                Log.e("SDFSDF2",viewModel.darkTheme.get().toString())
                mMap.setMapStyle(null)
                viewModel.darkTheme.set(false)
            } else {
                viewModel.setMapThemeAPI(true,viewModel.locationOnOF.get(), viewModel.follow.get())
                viewModel.darkTheme.set(true)
                mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(requireContext(), R.raw.map_json_dark_mode))

                Log.e("SDFSDF1",viewModel.darkTheme.get().toString())

//                mMap.setMapStyle(null)
//                CommonMethods.showToast(requireContext(), "Map data feature data saved")

            }

        }

        /**Here on Switch button click enabled-disabled the GPS Location and hit MAp Featured API... ) **/
        binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnClickListener {
            if (viewModel.locationOnOF.get() == true) {
                viewModel.setMapThemeAPI(viewModel.darkTheme.get(), false, viewModel.follow.get())
                viewModel.locationOnOF.set(false)
                Log.e("SDFSDF",viewModel.locationOnOF.get().toString())

            } else {
                viewModel.setMapThemeAPI(viewModel.darkTheme.get(), true, viewModel.follow.get())
                viewModel.locationOnOF.set(true)
                Log.e("SDFSDF",viewModel.locationOnOF.get().toString())

//                mMap.setMapStyle(null)
//                CommonMethods.showToast(requireContext(), "Map data feature data saved")
            }
        }

        /**Here on Switch button click enabled-disabled the follow hit MAp Featured API... ) **/
        binding?.bSheetAdvanceMap?.switchMapFollow?.setOnClickListener {
            if (viewModel.follow.get() == true) {

                viewModel.setMapThemeAPI(viewModel.darkTheme.get(),  viewModel.locationOnOF.get(), false)
                viewModel.follow.set(false)
                getLastLocation()
                val periodicWorkRequest = PeriodicWorkRequestBuilder<WorkManager>(24, TimeUnit.HOURS).build()


//                isDrag.set(false)
                Log.e("SDFSDF",viewModel.follow.get().toString())
            } else {

                viewModel.setMapThemeAPI(viewModel.darkTheme.get(), viewModel.locationOnOF.get(), true)
                viewModel.follow.set(true)
//                isDrag.set(true)

                Log.e("SDFSDF",viewModel.follow.get().toString())


//                mMap.setMapStyle(null)
//                CommonMethods.showToast(requireContext(), "Map data feature data saved")
            }
        }
    }



    override fun onPolylineClick(polyline: Polyline) {
        /**Flip Polyline solid to dotted..**/
        if (polyline.pattern == null || polyline.pattern != DOT) {
            polyline.pattern = PATTERN_POLYLINE_DOTTED
        } else {
            // The default pattern is a solid stroke.
            polyline.pattern = null
        }
    }

    private fun addPloyLine() {
        mMap.addPolyline(
            PolylineOptions().add(
                LatLng(currentLocation.latitude, currentLocation.longitude),
                LatLng(30.741482, 76.768066),
                LatLng(-34.747, 145.592),
                LatLng(-34.364, 147.891),
            )
                .width(10f)
                .color(Color.BLUE)
        ).startCap = ButtCap()
    }

    override fun onMapClick(latLng: LatLng) {
//        marker = MarkerOptions().position(latLng).title("Hey There ?")
//        if (markerList.size > 0) {
//            val markerToRemove = markerList[0]
//            markerList.remove(markerToRemove)
//            //remove marker from position (current) selected
//            markerToRemove.remove()
//        }
//        var currentMarker = mMap.addMarker(marker)
//        markerList.add(currentMarker!!)
    }

    override fun onLocationChanged(location: Location) {
        mMap.clear()
    }

}