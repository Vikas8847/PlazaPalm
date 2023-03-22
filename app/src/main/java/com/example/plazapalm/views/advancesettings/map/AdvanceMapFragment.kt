package com.example.plazapalm.views.advancesettings.map

import android.Manifest
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
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager.getInstance
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceMapFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.advanceMap_Permission_ID
import com.example.plazapalm.utils.CommonMethods.checkPermissions
import com.example.plazapalm.utils.CommonMethods.currentLocation
import com.example.plazapalm.utils.CommonMethods.isLocationEnabled
import com.example.plazapalm.utils.CommonMethods.mFusedLocationClient
import com.example.plazapalm.utils.CommonMethods.requestNewLocationData
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.workmanager.WorkManagerForLocation
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.*
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
import com.google.android.gms.maps.model.*
import com.google.android.libraries.places.api.Places
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.concurrent.schedule

@AndroidEntryPoint
class AdvanceMapFragment : Fragment(R.layout.advance_map_fragment), OnMapReadyCallback,
    GoogleMap.OnPolylineClickListener, GoogleMap.OnMapClickListener,
    LocationSource.OnLocationChangedListener {
    private val PATTERN_GAP_LENGTH_PX = 20
    private val DOT: PatternItem = Dot()
    private val GAP: PatternItem = Gap(PATTERN_GAP_LENGTH_PX.toFloat())

    // Create a stroke pattern of a gap followed by a dot.
    private val PATTERN_POLYLINE_DOTTED = listOf(GAP, DOT)
    private var imadiateType = 0

    lateinit var mMap: GoogleMap

    @Inject
    lateinit var pref: PreferenceFile

    @Inject
    lateinit var repository: Repository

    lateinit var mapFragment: SupportMapFragment
    private var binding: AdvanceMapFragmentBinding? = null
    private val viewModel: AdvanceMapVM by viewModels()

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AdvanceMapFragmentBinding.inflate(layoutInflater)
        mapFragment = SupportMapFragment()
        CommonMethods.statusBar(true)
        setApiData()
        onClicks()
        workmanager()
        getLatlngAPI()

//        requireContext().startService(Intent(requireContext(),ServiceClass::class.java))
//        update.updateLatlng()

        return binding?.root

    }


    private fun setApiData() {
        viewModel.darkThemeLive.observe(viewLifecycleOwner) {
            if (it != null) {
                if (it.equals(true)) {
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setChecked(true)
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnCheckedChangeListener(null)
                    mMap.setMapStyle(
                        MapStyleOptions.loadRawResourceStyle(
                            requireContext(),
                            R.raw.map_json_dark_mode
                        )
                    )

                } else {
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnCheckedChangeListener(null)
                    binding?.bSheetAdvanceMap?.switchAdvanceMap?.setChecked(false)
                    Log.e("ASDQWQQqq", "SADASD")
                }
            }
        }

        viewModel.locationOnOFLive.observe(viewLifecycleOwner) {
            if (it != null) {
                if (it.equals(true)) {
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnCheckedChangeListener(
                        null
                    )
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setChecked(true)

                } else {
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnCheckedChangeListener(
                        null
                    )
                    binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setChecked(false)
                    Log.e("ASDQWQQqq", "SADASD")
                }
            }
        }

        viewModel.followLive.observe(viewLifecycleOwner) {
            if (it != null) {
                if (it.equals(true)) {
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setOnCheckedChangeListener(null)
                    binding?.bSheetAdvanceMap?.switchMapFollow?.isChecked = true

                } else {
                    binding?.bSheetAdvanceMap?.switchMapFollow?.setOnCheckedChangeListener(null)
                    binding?.bSheetAdvanceMap?.switchMapFollow?.isChecked = false
                    Log.e("ASDQWQQqq", "SADASD")
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
    @SuppressLint("PotentialBehaviorOverride")
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        this.mMap.setOnMapClickListener(this)
        getLastLocation(false)

        this.mMap.setOnMarkerDragListener(@SuppressLint("PotentialBehaviorOverride")
        object : OnMarkerDragListener {
            @SuppressLint("PotentialBehaviorOverride")
            override fun onMarkerDragStart(marker: Marker) {
                // TODO Auto-generated method stub
            }

            @SuppressLint("PotentialBehaviorOverride")
            override fun onMarkerDragEnd(marker: Marker) {
                // TODO Auto-generated method stub
//                lat = marker.position.latitude
//                lng = marker.position.longitude
            }

            @SuppressLint("PotentialBehaviorOverride")
            override fun onMarkerDrag(@SuppressLint("PotentialBehaviorOverride") marker: Marker) {
                // TODO Auto-generated method stub
            }
        })

    }

    // Get current location
    @SuppressLint("MissingPermission")
    private fun getLastLocation(isValue: Boolean) {
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        requestNewLocationData()
                    } else {

                        currentLocation = LatLng(location.latitude, location.longitude)

                        viewModel.locationUpdateLiveData.value = currentLocation

                        mMap.clear()

                        var markerOptions = MarkerOptions()

                        if (isValue == true) {
                            markerOptions = MarkerOptions().position(currentLocation)
                                .title("I am here!")
                                .draggable(true)
                            Log.e("sdcko ", "WE dlas")
                        } else {
                            Log.e("sdcko ", "WE dlas" + "31212")

                            markerOptions = MarkerOptions().position(currentLocation)
                                .title("I am here!")
                                .draggable(false)
                        }

//                        viewModel.dragLat.set(location.latitude)
//                        viewModel.dragLng.set(location.longitude)

                        mMap.animateCamera(CameraUpdateFactory.newLatLng(currentLocation))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 15F))
                        mMap.isMyLocationEnabled = true
                        mMap.addMarker(markerOptions)

                        Log.e("ASDQWXCSD", "$currentLocation  -- DDDDDD0")


                        /**Poly lines clicks ***/
                        mMap.setOnPolylineClickListener(this@AdvanceMapFragment)
                        mMap.setOnPolylineClickListener(this@AdvanceMapFragment)

                        mMap.setOnMarkerDragListener(@SuppressLint("PotentialBehaviorOverride")
                        object : OnMarkerDragListener {
                            @SuppressLint("PotentialBehaviorOverride")
                            override fun onMarkerDragStart(marker: Marker) {
                                // TODO Auto-generated method stub
                            }

                            override fun onMarkerDragEnd(marker: Marker) {
                                // TODO Auto-generated method stub
                                var lat =
                                    LatLng(
                                        marker.position.latitude,
                                        marker.position.longitude
                                    )

                                viewModel.dragLat.set(marker.position.latitude)
                                viewModel.dragLng.set(marker.position.longitude)

                                updateLatlng(
                                    marker.position.latitude,
                                    marker.position.longitude
                                )

                                currentLocation = lat

//                                isDrag.set(true)

                                Log.e("DFFoppop", lat.toString())
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


    // What must happen when permission is granted
    @Deprecated("Deprecated in Java")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == advanceMap_Permission_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation(false)
            }
        }
    }

    @SuppressLint("InvalidPeriodicWorkRequestInterval", "SuspiciousIndentation")
    private fun onClicks() {
        binding?.btCurrentLocation?.setOnClickListener {
            /****Here get Last location latlng */
            getLastLocation(false)
        }

        /**Here on Switch button click dark mode and light mode handled (Dark Mode enabled-disabled)**/
        binding?.bSheetAdvanceMap?.switchAdvanceMap?.setOnClickListener {

            if (viewModel.darkTheme.get()) {
                viewModel.setMapThemeAPI(
                    false,
                    viewModel.locationOnOF.get(),
                    viewModel.follow.get()
                )
                Log.e("SDFSDF2", viewModel.darkTheme.get().toString())
                mMap.setMapStyle(null)
                viewModel.darkTheme.set(false)
            } else {
                viewModel.setMapThemeAPI(true, viewModel.locationOnOF.get(), viewModel.follow.get())
                viewModel.darkTheme.set(true)
                mMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                        requireContext(),
                        R.raw.map_json_dark_mode
                    )
                )

                Log.e("SDFSDF1", viewModel.darkTheme.get().toString())


            }

        }

        /**Here on Switch button click enabled-disabled the GPS Location and hit MAp Featured API... ) **/
        binding?.bSheetAdvanceMap?.switchMapLocationOnOff?.setOnClickListener {
            if (viewModel.locationOnOF.get()) {
                viewModel.setMapThemeAPI(viewModel.darkTheme.get(), false, viewModel.follow.get())
                viewModel.locationOnOF.set(false)
                Log.e("SDFSDF", viewModel.locationOnOF.get().toString())

            } else {
                viewModel.setMapThemeAPI(viewModel.darkTheme.get(), true, viewModel.follow.get())
                viewModel.locationOnOF.set(true)
                Log.e("SDFSDF", viewModel.locationOnOF.get().toString())

            }
        }

        /**Here on Switch button click enabled-disabled the follow hit MAp Featured API... ) **/
        binding?.bSheetAdvanceMap?.switchMapFollow?.setOnClickListener {
//            binding?.bSheetAdvanceMap?.switchMapFollow?.isChecked = binding?.bSheetAdvanceMap?.switchMapFollow?.isChecked != true


//            if (viewModel.follow.get()) {
//                mMap.clear()
//
//                viewModel.setMapThemeAPI(
//                    viewModel.darkTheme.get(),
//                    viewModel.locationOnOF.get(),
//                    false
//                )

            if (binding?.bSheetAdvanceMap?.switchMapFollow?.isChecked == true) {
                getLastLocation(false)
                viewModel.setMapThemeAPI(
                    viewModel.darkTheme.get(),
                    viewModel.locationOnOF.get(),
                    true
                )

                /*Timer().schedule(8000) {
                    Log.e("dssd", "WorkingFine ")
                    updateLatlng(
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
                    )

                }*/

//                Handler().postDelayed({
//                    Log.e("dssd", "WorkingFine ")
//
//                    updateLatlng(
//                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
//                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
//                    )
//
//                }, 5000)

                viewModel.locationUpdateLiveData.observe(requireActivity(), androidx.lifecycle.Observer {

                    updateLatlng(
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
                    )
                })

                updateLatlng(
                    pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
                    pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
                )

                viewModel.follow.set(false)

            } else {

                mMap.clear()
                getLastLocation(true)
                viewModel.setMapThemeAPI(
                    viewModel.darkTheme.get(),
                    viewModel.locationOnOF.get(),
                    false
                )

                viewModel.follow.set(false)

//                updateLatlng(
//                    viewModel.dragLat.get(),
//                    viewModel.dragLng.get()
//                )

            }

//                getLastLocation(false)
//
//                updateLatlng(
//                    viewModel.dragLat.get(),
//                    viewModel.dragLng.get()
//                )
//
//                viewModel.follow.set(false)

            Log.e("SDFSDF", viewModel.follow.get().toString())

//            } else {
//                mMap.clear()
//                getLastLocation(true)
//                viewModel.setMapThemeAPI(
//                    viewModel.darkTheme.get(),
//                    viewModel.locationOnOF.get(),
//                    true
//                )
//
//                viewModel.follow.set(true)

//                Log.e("SDFSDF", viewModel.follow.get().toString())
//
//            }
        }
    }

    fun updateTime() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                CoroutineScope(Dispatchers.Main).launch {
                    imadiateType++
                }
            }, 2000
        )
    }

    @SuppressLint("InvalidPeriodicWorkRequestInterval")
    private fun workmanager() {
        if (imadiateType >= 0) {

            val constraints: Constraints =
                Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()
            val periodicWorkRequest = OneTimeWorkRequest.Builder(WorkManagerForLocation::class.java)
                .setInitialDelay(3, TimeUnit.SECONDS)
                .setConstraints(constraints).build()
            getInstance(requireContext()).enqueue(periodicWorkRequest)

            Log.e("ASDDASWW", "DONEE --- ")
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
        // mMap.clear()
    }

    fun getLatlngAPI() {

        dataStoreUtil.readObject(LOGIN_DATA, LoginDataModel::class.java) {

            if (it != null) {

                val user_ID = it?.data?.user_id.toString()
                Log.e("zfsio", "    " + user_ID)
                repository.makeCall(
                    ApiEnums.GET_LATLNG,
                    loader = false,
                    saveInCache = false,
                    getFromCache = false,
                    requestProcessor = object : ApiProcessor<Response<GetLatLongResponseModel>> {

                        override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetLatLongResponseModel> {
                            return retrofitApi.getLatlng(
                                pref.retrieveKey("token").toString(),
                                user_ID.toString()
                            )
                        }

                        override fun onResponse(res: Response<GetLatLongResponseModel>) {
                            Log.e("AQQAAA", res.body().toString())

                            if (res.isSuccessful) {
                                if (res.body() != null) {
                                    if (res.code() == 200) {
                                        Log.e("VVVVVVSS", res.body().toString())

                                        val lat = res.body()!!.data.user_lat
                                        val lng = res.body()!!.data.user_long
                                        val latLng = LatLng(lat, lng)
                                        mMap.clear()
                                        val markerOptions = MarkerOptions().position(latLng)
                                            .title("I am here!")

                                        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng))
                                        mMap.animateCamera(
                                            CameraUpdateFactory.newLatLngZoom(
                                                latLng,
                                                15F
                                            )
                                        )

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
                                        mMap.isMyLocationEnabled = true
                                        mMap.addMarker(markerOptions)

                                    } else {
                                        CommonMethods.showToast(
                                            CommonMethods.context,
                                            res.body()!!.message!!
                                        )
                                    }

                                } else {
                                    CommonMethods.showToast(
                                        CommonMethods.context,
                                        res.body()!!.message!!
                                    )
                                }
                            } else {
                                CommonMethods.showToast(CommonMethods.context, res.message())
                            }
                        }

                    }

                )
            }

        }


    }

    fun updateLatlng(lat: Double, lng: Double) {

        Log.d(
            "service_is", pref.retrieveKey("token").toString() + " vbb " +
                    lat + " vcv " +
                    lng
        )

        repository.makeCall(
            apiKey = ApiEnums.GET_MAP_FEATURED,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<UpdateLatlngResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<UpdateLatlngResponse> {
                    return retrofitApi.updateLatlng(
                        pref.retrieveKey("token").toString(),
                        lat, lng
                    )
                }

                override fun onResponse(res: Response<UpdateLatlngResponse>) {
                    Log.e("adasd", res.body().toString())

//                    CommonMethods.showToast(CommonMethods.context,res.body()!!.message)

                    if (res.isSuccessful && res.code() == 200) {

/*
                        if (res.body()!!.data != null) {

                            Log.e("oipqwe", res.body()!!.data.toString())

                            val lat = res.body()!!.data.user_lat
                            val lng = res.body()!!.data.user_long
                            val latLng = LatLng(lat, lng)

                            mMap.clear()
                            val markerOptions = MarkerOptions().position(latLng)
                             .title("I am here!")

                            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng))
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15F))

                            if (ActivityCompat.checkSelfPermission(
                                    requireActivity(),
                                    Manifest.permission.ACCESS_FINE_LOCATION
                                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                                    requireActivity(),
                                    Manifest.permission.ACCESS_COARSE_LOCATION
                                ) != PackageManager.PERMISSION_GRANTED
                            ) {
                                return
                            }
                            mMap.isMyLocationEnabled = true
                            mMap.addMarker(markerOptions)

                        } else {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()!!.data.toString()
                            )
                        }
*/


                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }
        )
    }

}