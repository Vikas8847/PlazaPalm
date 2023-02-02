package com.example.plazapalm.views.catergorylist.addcities

import android.Manifest
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AddCitiesFragmentBinding
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.google.android.gms.common.api.Status
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class AddCitiesFragment : Fragment(R.layout.add_cities_fragment), OnMapReadyCallback {
    var addressLocation: String? = null

    @Inject
    lateinit var pref: PreferenceFile

    /**Initialized FusedLocation Client provider **/
    lateinit var mFusedLocationClient: FusedLocationProviderClient

    /**Initialized Google Map **/
    lateinit var mMap: GoogleMap

    /**Current location is set to India, this will be of no use**/

    lateinit var currentLocation: LatLng
    lateinit var mapFragment: SupportMapFragment
    private var originLatng: LatLng? = null
    var currentaddress = ""
    var Currentlati: Double? = null
    var Currentlongi: Double? = null
    private var destinationLatng: LatLng? = null
    private var binding: AddCitiesFragmentBinding? = null
    private val viewModel: AddCitiesVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = AddCitiesFragmentBinding.inflate(layoutInflater)
        mapFragment = SupportMapFragment()
        val apiKey = getString(R.string.google_places_api)

        if (!Places.isInitialized()) {
            Places.initialize(requireActivity(), apiKey)
        }

        fetchApiKey()
        searchLocation()
        CommonMethods.statusBar(true)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel

    }

    private fun fetchApiKey() {
        /**Fetching API_KEY which we wrapped**/
        val ai: ApplicationInfo =
            requireContext().applicationContext?.packageManager!!.getApplicationInfo(
                requireContext().applicationContext.packageName,
                PackageManager.GET_META_DATA
            )
        val value = ai.metaData[getString(R.string.google_map_api_key)]
        val apiKey = value.toString()
        /** Initialized Places Api key with the help of API -KEY **/
        if (!Places.isInitialized()) {
            Places.initialize(context?.applicationContext!!, apiKey)
        }
        /** Initializing Map..**/
        mapFragment = childFragmentManager.findFragmentById(R.id.mapFragment1) as SupportMapFragment
        mapFragment.getMapAsync(this)
        /** Initializing fused location client **/
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity())
        /**Adding Functionality on Map -location button **/
        binding?.btCurrentLocation?.setOnClickListener {
            getLastLocation()
        }
    }

    // Services such as getLastLocation()
    // will only run once map is ready
    override fun onMapReady(map: GoogleMap) {
        mMap = map
        mMap.clear()
//        getLastLocation()

        if (arguments?.getString("PostProfile") != null
            && (arguments?.getString("PostProfile").equals("postProfile")
            || arguments?.getString("PostProfile").equals("open_cat_screen"))
        ) {

            var lat = requireArguments().getString("lat")
            var long = requireArguments().getString("long")
            var location_txt = requireArguments().getString("location_txt")
            //bundle.putString("lat",lat.get().toString())

            if (lat.equals("")) {
                lat = "0.0"
                long = "0.0"
                location_txt = ""
            }

            if (lat!!.toDouble() != 0.0 && long!!.toDouble() != 0.0
            ) {
                viewModel.address.set(location_txt.toString())
                Log.e("dsdsdsdsdSsfsaa", lat + "===" + long + "===" + location_txt)
                var address = ""
                if (!(location_txt.isNullOrEmpty())) {
                    address = location_txt.toString()
                }
                originLatng = LatLng(lat.toDouble(), long.toDouble())
                addressLocation = location_txt
                Currentlongi = originLatng?.longitude!!
                Currentlati = originLatng?.latitude!!
                currentaddress = addressLocation!!

                Log.e("Ssfsaa", "AWOQPWOKSD")

                // val location =  LatLng(30.713163375854492, 76.70951843261719)
                val location = LatLng(lat.toDouble(),
                    long.toDouble())

                mMap.clear()
                val markerOptions = MarkerOptions().position(location).title(address)
                mMap.animateCamera(CameraUpdateFactory.newLatLng(location))
                mMap.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        location,
                        16F
                    )
                )

                mMap.addMarker(markerOptions)

                Log.e(
                    "ASDASWWERWR00ss",
                    lat.toDouble().toString() + "XVXCV-- " +
                            long.toDouble().toString()
                )
            } else {
                getLastLocation()
                Log.e("ASDASWWERWR00ss", "DONE DSD GOOOD -- ")
                Log.e("SDFSDf", "SFSDF")
            }
        } else if (arguments?.getString("PostProfile") != null && arguments?.getString("PostProfile")
                .equals("filter_screen")
        ) {
            if (pref.retvieLatlong(Constants.FILTER_SCREEN_LONG)
                    .toDouble() != 0.0 && pref.retvieLatlong(Constants.FILTER_SCREEN_LAT)
                    .toDouble() != 0.0
            ) {
                var address = ""
                if (!(pref.retrieveFilterLocation().toString().isNullOrEmpty())) {
                    address = pref.retrieveFilterLocation().toString()
                }

                originLatng = LatLng(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble(), pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble())
                addressLocation = address
                Currentlongi = originLatng?.longitude!!
                Currentlati = originLatng?.latitude!!
                currentaddress = addressLocation!!

                viewModel.address.set(address)
                Log.e("Ssfsaa", "AWOQPWOKSD")

                // val location =  LatLng(30.713163375854492, 76.70951843261719)
                val location = LatLng(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble(),
                    pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble())

                mMap.clear()
                val markerOptions = MarkerOptions().position(location).title(address)
                mMap.animateCamera(CameraUpdateFactory.newLatLng(location))
                mMap.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        location,
                        16F
                    )
                )

                mMap.addMarker(markerOptions)

                Log.e(
                    "ASDASWWERWR00ss",
                    pref.retvieLatlong("lati").toDouble().toString() + "XVXCV-- " +
                            pref.retvieLatlong("longi").toDouble().toString()
                )

            } else {
                getLastLocation()
                Log.e("ASDASWWERWR00ss", "DONE DSD GOOOD -- ")
                Log.e("SDFSDf", "SFSDF")
            }

        } else {

            //var location_txt = requireArguments().getString("location_txt")

            //for category location
            if (pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT)
                    .toDouble() != 0.0 && pref.retvieLatlong(Constants.CATEGORY_SCREEN_LONG)
                    .toDouble() != 0.0
            ) {
                var address = ""
                if (!(pref.retrieveCategoryLocation().toString().isNullOrEmpty())) {
                    address = pref.retrieveCategoryLocation().toString()
                }

                originLatng = LatLng(pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT).toDouble(), pref.retvieLatlong(Constants.CATEGORY_SCREEN_LONG).toDouble())
                addressLocation = address
                Currentlongi = originLatng?.longitude!!
                Currentlati = originLatng?.latitude!!
                currentaddress = addressLocation!!

                Log.e("Ssfsaa", "AWOQPWOKSD")
                viewModel.address.set(address)
                // val location =  LatLng(30.713163375854492, 76.70951843261719)
                val location = LatLng(pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT).toDouble(),
                    pref.retvieLatlong(Constants.CATEGORY_SCREEN_LONG).toDouble())

                mMap.clear()
                val markerOptions = MarkerOptions().position(location).title(address)
                mMap.animateCamera(CameraUpdateFactory.newLatLng(location))
                mMap.animateCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        location,
                        16F
                    )
                )

                mMap.addMarker(markerOptions)

                Log.e(
                    "ASDASWWERWR00ss",
                    pref.retvieLatlong(Constants.CATEGORY_SCREEN_LAT).toDouble()
                        .toString() + "XVXCV-- " +
                            pref.retvieLatlong(Constants.CATEGORY_SCREEN_LONG).toDouble().toString()
                )

            } else {
                getLastLocation()
                Log.e("ASDASWWERWR00ss", "DONE DSD GOOOD -- ")
                Log.e("SDFSDf", "SFSDF")
            }

        }

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
                mFusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        CommonMethods.requestNewLocationData()
                    } else {
                        currentLocation = LatLng(location.latitude, location.longitude)

                        if (currentLocation != null) {

                            val geocoder: Geocoder
                            val addresses: List<Address>
                            geocoder = Geocoder(requireActivity(), Locale.getDefault())

                            addresses =
                                geocoder.getFromLocation(
                                    location.latitude,
                                    location.longitude,
                                    1
                                ) as List<Address> // Here 1 represent max location result to returned, by documents it recommended 1 to 5
//                            val address = addresses[0].getAddressLine(0) // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
                            val city = addresses[0].locality
                            val state = addresses[0].adminArea
//                            val address = city + " " + state
                            val address = city

                            currentaddress = address
                            Currentlati = location.latitude
                            Currentlongi = location.longitude

                            originLatng =
                                LatLng(Currentlongi!!.toDouble(), Currentlongi!!.toDouble())
                            addressLocation = currentaddress
                            Currentlongi = Currentlongi
                            Currentlati = Currentlati
                            currentaddress = addressLocation!!

                            //for current lat long
                            pref.storeLatlong("lati",location.latitude.toFloat())
                            pref.storeLatlong("longi",location.longitude.toFloat())

                            Log.e(
                                "ADASDASWQEWQE",
                                address.toString() + "assad" + Currentlati + "XCXC" + Currentlongi
                            )

                            mMap.clear()
                            val markerOptions =
                                MarkerOptions().position(currentLocation).title(address.toString())
                            //.icon(BitmapDescriptorFactory.fromResource(R.drawable.pin))
                            //  .icon(BitmapDescriptorFactory.defaultMarker(HUE_AZURE))
                            mMap.animateCamera(CameraUpdateFactory.newLatLng(currentLocation))
                            mMap.animateCamera(
                                CameraUpdateFactory.newLatLngZoom(
                                    currentLocation,
                                    16F
                                )
                            )
                            mMap.addMarker(markerOptions)

                        }

                    }
                }

            } else {
                CommonMethods.showToast(requireContext(), "Turn on Location")
                val intent = Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS)
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
        grantResults: IntArray,
    ) {
        if (requestCode == CommonMethods.pERMISSION_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
                Log.e("SFSDSds", "WPROFFsdf")
            }
        }
    }

    private fun searchLocation() {
        binding!!.etSearchLocation.setOnClickListener {
            val field = listOf(
                Place.Field.ID,
                Place.Field.ADDRESS,
                Place.Field.LAT_LNG,
                Place.Field.NAME,
                Place.Field.ICON_URL
            )

            val intent = Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, field)
                .build(requireActivity())
            //start activity result
            startActivityForResult(intent, 101)

        }

        binding?.btAdd?.setOnClickListener {
            if (arguments?.getString("PostProfile") != null
                && (arguments?.getString("PostProfile").equals("postProfile")
                || arguments?.getString("PostProfile").equals("open_cat_screen"))
            ) {
                Currentlongi = originLatng?.longitude!!
                Currentlati = originLatng?.latitude!!
                currentaddress = addressLocation!!

                if(arguments?.getString("PostProfile").equals("open_cat_screen"))
                {
                    pref.storeLatlong(Constants.FILTER_SCREEN_LONG,
                        originLatng?.longitude!!.toFloat())
                    pref.storeLatlong(Constants.FILTER_SCREEN_LAT,
                        originLatng?.latitude!!.toFloat())
                    pref.storeFilterLocation(currentaddress)
                }else
                {
                  /*  pref.storeLatlong(Constants.CURRENT_LOCATION_LONG,
                        originLatng?.longitude!!.toFloat())
                    pref.storeLatlong(Constants.CURRENT_LOCATION_LAT,
                        originLatng?.latitude!!.toFloat())*/
                }
            } else {
                if (originLatng != null) {
                    Currentlongi = originLatng?.longitude!!
                    Currentlati = originLatng?.latitude!!
                    currentaddress = addressLocation!!

                    if (arguments?.getString("PostProfile") != null && arguments?.getString("PostProfile")
                            .equals("filter_screen")
                    ) {
                        //For filter screen
                        pref.storeLatlong(Constants.FILTER_SCREEN_LONG,
                            originLatng?.longitude!!.toFloat())
                        pref.storeLatlong(Constants.FILTER_SCREEN_LAT,
                            originLatng?.latitude!!.toFloat())
                        pref.storeFilterLocation(currentaddress)
                        Log.e("asdSDWA",
                            originLatng?.longitude!!.toFloat()
                                .toString() + "VVC" + originLatng?.latitude!!.toFloat().toString())
                    } else {
                        pref.storeLatlong(Constants.CATEGORY_SCREEN_LONG,
                            originLatng?.longitude!!.toFloat())
                        pref.storeLatlong(Constants.CATEGORY_SCREEN_LAT,
                            originLatng?.latitude!!.toFloat())
                        pref.storeCategoryLocation(currentaddress)
                        Log.e("asdSDWA",
                            originLatng?.longitude!!.toFloat()
                                .toString() + "VVC" + originLatng?.latitude!!.toFloat().toString())

                        // pref.storeLocation(currentaddress)
                    }


                }
                //pref.storeLocation(currentaddress)
            }

            if (arguments?.getString("PostProfile") != null && arguments?.getString("PostProfile")
                    .equals("postProfile")
            ) {

                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    "bundle",
                    Currentlati.toString() + "/" + Currentlongi.toString() + "/" + currentaddress
                )
                findNavController().popBackStack()

                Log.e("SDSDSD", "DONEE")
            } else {

                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    "bundle",
                    Currentlati.toString() + "/" + Currentlongi.toString() + "/" + currentaddress
                )
                findNavController().popBackStack()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101) {
            if (resultCode == FragmentActivity.RESULT_OK) {
                //When success initialize place
                val place = Autocomplete.getPlaceFromIntent(data!!)

                val split = place.address?.split(",")

                val adresss = split?.get(0) // First element
                Log.e("SSSAAAA", place.address.toString())

                addressLocation = place.address
                //set address on edittext

                viewModel.address.set(adresss)

                if (place.latLng != null) {
                    originLatng = place.latLng

                    if (originLatng != null) {
                        mMap.clear()
                        mMap.addMarker(MarkerOptions().position(originLatng!!))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(originLatng!!, 18F))
                    }

                    Log.e("TAGMMMMMMMMMV", place.latLng.toString())

                } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                    // TODO: Handle the error.
                    val status: Status = Autocomplete.getStatusFromIntent(data)
                    //Log.i(TAG, status.getStatusMessage());
                } else if (resultCode == FragmentActivity.RESULT_CANCELED) {
                    // The user canceled the operation.
                }
            }
        }
    }


    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(false)
    }
}



