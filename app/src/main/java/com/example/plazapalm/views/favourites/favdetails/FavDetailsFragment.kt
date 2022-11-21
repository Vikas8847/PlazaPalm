package com.example.plazapalm.views.favourites.favdetails

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FavDetailsFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.POST_PROFILE_DATA
import com.example.plazapalm.models.AddPhoto
import com.example.plazapalm.models.GetPostProfileResponse
import com.example.plazapalm.models.SavePostProfileResponse
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.ViewPostProfileAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.libraries.places.api.Places
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class FavDetailsFragment : Fragment(R.layout.fav_details_fragment), OnMapReadyCallback,
    LocationSource.OnLocationChangedListener {
    private var longi: Double? = null
    private var lati: Double? = null
    private var p_id: String? = null
    private lateinit var marker: MarkerOptions
    lateinit var mMap: GoogleMap
    lateinit var mapFragment: SupportMapFragment
    @Inject
    lateinit var dataStoreUtil: DataStoreUtil
    @Inject
    lateinit var repository: Repository
    @Inject
    lateinit var pref: PreferenceFile
    lateinit var dataList: ArrayList<String>
    private var binding: FavDetailsFragmentBinding? = null
    private val viewModel: FavDetailsVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FavDetailsFragmentBinding.inflate(layoutInflater)
        viewModel.isFavourites.set(true)
        CommonMethods.isAdvanceMap = true
        CommonMethods.statusBar(true)
        dataList = ArrayList()
        return binding?.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchApiKey()
        //  setImagesAdapter()
        setVideosAdapter()
        binding?.vm = viewModel
        getFavoriteData()
        getbundleData()
        //vikas ..
        //getViewProfileData()
//        viewModel.getViewProfileData(binding!!.rvImages)
    }

    private fun getbundleData() {
        val from = requireArguments().getString(Constants.FROM_MY_PROFILE)
        if (from.equals("ViewProfile")) {
            Log.e("SDSDSD", "Working")
            viewModel.isViewProfile.set(true)
            binding!!.btnBookingProfile.visibility = View.GONE
        }
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
        mapFragment =
            childFragmentManager.findFragmentById(R.id.mapFragmentViewProfile) as SupportMapFragment
        mapFragment.getMapAsync(this)
        /** Initializing fused location client **/
        CommonMethods.mFusedLocationClient =
            LocationServices.getFusedLocationProviderClient(requireContext())
    }


    /**This function used for Heart filled or Empty image if user coming from favorite screen then on next heart image will be filled else un-filled.**/
    private fun getFavoriteData() {
        if (arguments != null) {
            when (arguments?.get("comingFrom")) {
                "isFavorite" -> {
                    binding?.ivFavDetailsFilledHeart?.visibility = View.VISIBLE
                    binding?.ivFavDetailsEmptyHeart?.visibility = View.GONE
                }
                "isDashBoard" ->
                {
                    binding?.ivFavDetailsFilledHeart?.visibility = View.GONE
                    binding?.ivFavDetailsEmptyHeart?.visibility = View.VISIBLE
                    p_id = arguments?.getString("DashBoardPostId").toString()
                    lati = arguments?.getDouble("DashBoardPostLatitude")
                    longi = arguments?.getDouble("DashBoardPostLongitude")
                    getPostProfile(p_id!!, lati!!, longi!!)

                }

            }

        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        getLastLocation()

        if (CommonMethods.isAdvanceMap === true) {
            mMap.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    requireContext(),
                    R.raw.map_json_dark_mode
                )
            )
        } else {
            mMap.setMapStyle(null)
            CommonMethods.showToast(requireContext(), "Dark Mode is Disabled")
        }
    }

    // Get current location
    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                CommonMethods.mFusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        CommonMethods.requestNewLocationData()
                    } else {
                        CommonMethods.currentLocation =
                            LatLng(location.latitude, location.longitude)
                        mMap.clear()
                        val markerOptions = MarkerOptions().position(CommonMethods.currentLocation)
                            .title("I am here! On Your Current Location")
                        mMap.animateCamera(CameraUpdateFactory.newLatLng(CommonMethods.currentLocation))
                        mMap.animateCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                CommonMethods.currentLocation,
                                15F
                            )
                        )
                        /* mMap.addMarker(MarkerOptions().position(latLng)
                                 .title("Your Destination is Here ")
                                 .snippet("Destination Description")
                         )*/
                        // addPolyGon()
                        mMap.isMyLocationEnabled = true
                        mMap.addMarker(markerOptions)


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

    @Deprecated("Deprecated in Java")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        if (requestCode == CommonMethods.advanceMap_Permission_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
            }
        }
    }

    override fun onLocationChanged(p0: Location) {
        mMap.clear()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setVideosAdapter() {
        binding?.rvVideos?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvVideos?.adapter = viewModel.videosAdapter
        binding?.rvVideos?.adapter?.notifyDataSetChanged()
    }

    private fun getViewProfileData() {
        dataStoreUtil.readObject(POST_PROFILE_DATA, SavePostProfileResponse::class.java) {
            p_id = it?.data?._id
            lati = it?.data?.lat
            longi = it?.data?.long
            viewModel.p_id.set(p_id)
            if (lati != null || longi != null || p_id != null) {
                //  getPostProfile(p_id.toString(), lati!!, longi!!)
            }

        }
    }

    private fun getPostProfile(p_id: String, latitude: Double, longitude: Double) {
        repository.makeCall(
            ApiEnums.GET_POST_PROFILE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetPostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetPostProfileResponse> {
                    return retrofitApi.getPostProfile(
                        pref.retrieveKey("token").toString(),
                        p_id,
                        latitude,
                        longitude
                    )
                }
                @SuppressLint("SetTextI18n")
                override fun onResponse(res: Response<GetPostProfileResponse>) {
                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {
                                /**Here Set According to Types Using Arguments Data (Containing Types) **/
                                if (arguments != null) {
                                    when {
                                        arguments?.getString("comingFrom")?.contains("isDashBoard") != null -> {
                                            val dashBoardData = res.body()!!.data
                                            binding?.tvFavDetails?.text = dashBoardData.first_name +" "+ dashBoardData.last_name
                                            binding?.tvFavCityAddress?.text = dashBoardData.description_1.toString()
                                            binding?.tvFavDetailsAddress?.text = dashBoardData.location_text.toString()
                                            binding?.tvFavDetailsDistance?.text = dashBoardData.distance.toString().split(".")[0] + " " + "Miles"
                                            if (dashBoardData.isLiked == true) {
                                                Glide.with(CommonMethods.context)
                                                    .load(R.drawable.ic_heart_filled_icon)
                                                    .into(binding?.ivFavDetailsFilledHeart!!)
                                            }
                                            else
                                            {
                                                binding?.ivFavDetailsFilledHeart?.setBackgroundResource(R.drawable.ic_heart_icon)
                                            }
                                            /**Apply try catch for check any exception is come while loading the image **/
                                            try {
                                                val imageUrl = dashBoardData.postProfile_picture?.get(0)?.toString()
                                                if (imageUrl != null && imageUrl != "") {
                                                    Glide.with(CommonMethods.context)
                                                        .load(IMAGE_LOAD_URL + imageUrl)
                                                        .dontAnimate()
                                                        .into(binding?.ivFavDetails!!)
                                                }
                                                else
                                                {
                                                    binding?.ivFavDetails?.setBackgroundResource(R.drawable.dash_items_nurse_image)
                                                }


                                                dataList = res.body()!!.data.postProfile_picture as ArrayList<String> //* = java.util.ArrayList<kotlin.String> *//*
//                                             bundle.putStringArrayList("profile_Image",dataList)
                                                val newDataList = ArrayList<AddPhoto>()
                                                newDataList.clear()
                                                for (idx in 0 until dataList.size) {
                                                    newDataList.add(AddPhoto(dataList[idx], true))
                                                }
                                                viewModel.data_list = newDataList
                                                Log.e("QWQAAAZZZ", res.body().toString())
                                                val dsc1 = res.body()!!.data.description_1
                                                val dsc2 = res.body()!!.data.description_2
                                                val dsc3 = res.body()!!.data.description_3

                                                Glide.with(requireActivity())
                                                    .load(IMAGE_LOAD_URL + res.body()!!.data.postProfile_picture?.get(0))
                                                    .into(binding!!.ivFavDetails)
                                                Log.e("ASDASDASdasd", dataList.size.toString())
                                                setAdapter(dataList, dsc1!!, dsc2!!, dsc3!!)
                                                binding!!.ivFavDetails

                                            } catch (e: Exception) {
                                                Log.d("errorInLoading", "" + e.message.toString())
                                            }

                                            //old code..
                                            /*   if (viewModel.isFav.get()) {
                                                   Glide.with(CommonMethods.context)
                                                       .load(R.drawable.ic_heart_filled_icon)
                                                       .into(binding!!.ivFavDetailsFilledHeart)
                                               }
                                               else
                                               {
                                                   Glide.with(CommonMethods.context)
                                                       .load(R.drawable.ic_heart_icon)
                                                       .into(binding!!.ivFavDetailsFilledHeart)
                                               }
                                               dataList = res.body()!!.data.postProfile_picture as ArrayList<String> *//* = java.util.ArrayList<kotlin.String> *//*
//                                          bundle.putStringArrayList("profile_Image",dataList)
                                            val newDataList = ArrayList<AddPhoto>()
                                            newDataList.clear()
                                            for (idx in 0 until dataList.size) {
                                                newDataList.add(AddPhoto(dataList[idx].toString(), true))
                                            }
                                            viewModel.data_list = newDataList
                                            Log.e("QWQAAAZZZ", res.body().toString())
                                            val dsc1 = res.body()!!.data.description_1
                                            val dsc2 = res.body()!!.data.description_2
                                            val dsc3 = res.body()!!.data.description_3

                                            Glide.with(requireActivity())
                                                .load(IMAGE_LOAD_URL + res.body()!!.data.postProfile_picture?.get(0))
                                                .into(binding!!.ivFavDetails)
                                            Log.e("ASDASDASdasd", dataList.size.toString())
                                            setAdapter(dataList, dsc1!!, dsc2!!, dsc3!!)
                                            binding!!.ivFavDetails*/
                                        }
                                    }

                                }
                            } else {
                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                            }
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }

        )
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter(data: ArrayList<String>, dsc1: String, dsc2: String, dsc3: String) {
        binding?.rvImages?.layoutManager = LinearLayoutManager(requireContext())
        val addapter = ViewPostProfileAdapter(requireActivity(), data, dsc2, dsc3, dsc1,)
        binding?.rvImages?.adapter = addapter
        binding?.rvImages?.adapter?.notifyDataSetChanged()
    }
}