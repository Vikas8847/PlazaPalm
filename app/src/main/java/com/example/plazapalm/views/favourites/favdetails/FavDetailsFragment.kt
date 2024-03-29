package com.example.plazapalm.views.favourites.favdetails

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FavDetailsFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.datastore.SAVE_MAP_FEATURE_FROM_FAV_DEATILS
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.ViewPostProfileAdapter
import com.example.plazapalm.utils.*
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

    private var loginUserPId: String? = ""
    private var loginUserId: String? = ""
    private var longi: Double? = null
    private var lati: Double? = null
    private var p_id: String? = null
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.checkScreenType=""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FavDetailsFragmentBinding.inflate(layoutInflater)
        viewModel.isFavourites.set(true)
        CommonMethods.isAdvanceMap = true
        CommonMethods.statusBar(true)
        var fontTypeFaceList=getNewFontsInList()
        viewModel.fontList=fontTypeFaceList
        binding?.mainConslayout?.visibility = View.VISIBLE
        getlocalData()
        dataList = ArrayList()

        return binding?.root

    }

//    private fun premiumAccount(pId: String?, userId: String?) {
//
//        Log.e("test  =+ 2 ", pId + "VVVC =+ 2=--" + userId)
//
//        if (userId.equals("63ec7742793d8dd0d5cc3761")){
//            Log.e("XVCCCXXXX", pId + "VVVC=== USERIDD=--" + loginUserId)
//            viewModel.getEditLookColor()
//            mapFeatureGet()
//
//            //getPostprofile(pId!!, pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble())
//
//        }
//
///*
//        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {
//
//            val p_Id = it?.data?.p_id
//            loginUserId = it?.data?.user_id
//            viewModel.p_id.set(p_Id)
//
//            Log.e("test  =+ 1 ", p_Id + "VVVC+ 1=--" + loginUserId)
//
//            if (userId.equals("63ec7742793d8dd0d5cc3761")){
//                Log.e("XVCCCXXXX", p_Id + "VVVC=== USERIDD=--" + loginUserId)
//                getPostprofile(p_Id!!, pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble())
//                viewModel.getEditLookColor()
//                mapFeatureGet()
//            }
//
//        }
//*/
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
//        getlocalData()
        Log.e("application_token===", pref.retrieveKey("token").toString())
    }

    private fun setbackground() {

        viewModel.backgroundColor.observe(viewLifecycleOwner) {
            if ( it != null && !(it.equals(""))) {

                if (it is String) {
                    val data = it
                    var newColor=""
                    if(data!=""){
                        newColor=data
                    }else{
                        newColor="#ffffff"
                    }
                    binding!!.mainConslayout.setBackgroundColor(Color.parseColor(newColor.toString()))
                    binding!!.mainToolBar.setBackgroundColor(Color.parseColor(newColor.toString()))
                }
            }
        }

        viewModel.textColor.observe(viewLifecycleOwner) {
            if (it != null && !(it.equals(""))) {
                Log.e("mfdlfdfdsff===",it.toString())
                Log.e("fwefwefwefwefwef===",viewModel.font_typeface.get().toString())
                if (it is String) {
                    val data = it
                    viewModel.fontViewColor.set(data)
                    binding?.tvFavCityAddress?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetailsAddress?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetailsDistance?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetails?.setTextColor(Color.parseColor(data.toString()))

                    binding?.tvFavDetailsLikeCounts?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetailsDisLikeCount?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetailsName?.setTextColor(Color.parseColor(data.toString()))
                    binding?.ivFavDetailsBackBtn?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.ivFavDetailsOptions?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.ivFavDetailsChats?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.ivFavDetailsLike?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.ivFavDetailsDislike?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.ivFavTotalLikedCounts?.setColorFilter(Color.parseColor(data.toString()))
                    binding?.tvFavHeartFilledCounts?.setTextColor(Color.parseColor(data.toString()))

                }
            }

            setTypeFaceMethod(binding?.tvFavCityAddress!!)
            setTypeFaceMethod(binding?.tvFavDetailsAddress!!)
            setTypeFaceMethod(binding?.tvFavDetailsDistance!!)
            setTypeFaceMethod(binding?.tvFavDetails!!)
            setTypeFaceMethod(binding?.tvFavDetailsLikeCounts!!)
            setTypeFaceMethod(binding?.tvFavDetailsDisLikeCount!!)
            setTypeFaceMethod(binding?.tvFavDetailsName!!)
            setTypeFaceMethod(binding?.tvFavHeartFilledCounts!!)

        }

    }

    private fun setTypeFaceMethod(appTextView: AppCompatTextView?) {
        Log.e("fwefwefwefwefwef===",viewModel.font_typeface.get().toString())
        if(viewModel.font_typeface.get()!="" && viewModel.font_typeface.get()!="null" && viewModel.font_typeface.get()!=null) {
            var fontList1 = viewModel.fontList!!.filter { it.name == viewModel.font_typeface.get() }
            if(fontList1.size==0){
                appTextView!!.setTypeface(viewModel.fontList!![1].fontTypeface)
            }else
            {
                appTextView!!.setTypeface(fontList1[0].fontTypeface)
            }
        }else
        {
            //  appTextView!!.setTypeface(viewModel.fontList!![1].fontTypeface)
        }

        var newFontSize=0.0f
        if(viewModel.font_size.get().toString()=="0.0" || viewModel.font_size.get().toString()=="0"){
            newFontSize=Constants.DEFAULT_FONT_SIZE.toFloat()
        }else
        {
            newFontSize=viewModel.font_size.get().toFloat()
        }
        appTextView!!.textSize = newFontSize

    }


    private fun getlocalData() {
        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            viewModel.u_ID.set(it?.data?.user_id)
            loginUserPId = it?.data?.p_id
            viewModel.loginUserPId.set(loginUserPId)
            Log.e("SDASDASDASDASdas", it.toString())

            fetchApiKey()
            getSharedata()
            getFavoriteData()
            setbackground()

//            premiumAccount(it?.data?.p_id,it?.data?.user_id)


//            if (loginUserPId != null && !loginUserPId.equals("")) {
//                viewModel.getEditLookColor()
//                mapFeatureGet()
//                Log.e("SDASDASDASDASdas", loginUserId.toString())
//            }
        }
    }

    private fun getSharedata() {
        val data: Uri? = CommonMethods.context.intent?.data
        if (data != null) {
            val param: List<String> = data.pathSegments
            val shareData = param[param.size - 1]

            Log.e("WorkInProgress", shareData)
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
                    viewModel.CommingFrom.set("isFavorite")

                    binding?.ivFavDetailsFilledHeart?.visibility = View.VISIBLE
                    /** GET DATA FROM FAVOURITES // BY SERIALIZABLE */

                    val data = requireArguments().getSerializable("ResBody") as ArrayList<ProfileCateData>
                    val pos = requireArguments().getInt("pos")
                    val image: ArrayList<String> =
                        data[pos].postProfile_picture as ArrayList<String>


                    p_id = data[pos].p_id
                    lati = data[pos].lat
                    longi = data[pos].long
                    viewModel.p_id.set(p_id)

                    // setFavdata(pos, data, image)

                    Log.e("kgvnsngsgggg===", loginUserPId.toString())
                    Log.e("kgvnsngsgggg11===", data[pos].p_id.toString())
                    if (loginUserPId.toString() != data[pos].p_id) {
                        if (data[pos].booking_status!!) {
                            binding!!.btnBookingProfile.visibility = View.VISIBLE
                            Log.e("kgvnsngsgggg22===", viewModel.u_ID.get().toString())
                        } else {
                            Log.e("kgvnsngsgggg33===", viewModel.u_ID.get().toString())
                            binding!!.btnBookingProfile.visibility = View.GONE
                        }
                    } else {
                        Log.e("kgvnsngsgggg44===", viewModel.u_ID.get().toString())
                        binding!!.btnBookingProfile.visibility = View.GONE
                    }
                    getPostprofile(data[pos].p_id!!, data[pos].lat!!, data[pos].long!!)
                    Log.e("VVBBBB", "$image  ---pos---  $pos$data  ---pos---  ")

                }

                "isDashBoard" -> {
                    viewModel.CommingFrom.set("isDashBoard")
                    p_id = arguments?.getString("DashBoardPostId").toString()
                    lati = arguments?.getDouble("DashBoardPostLatitude")
                    longi = arguments?.getDouble("DashBoardPostLongitude")
                    viewModel.p_id.set(p_id)
                    getPostprofile(p_id!!, lati!!, longi!!)

                }

                "isViewProfile" -> {
                    viewModel.p_id.set(arguments?.getString("P_ID"))
                    viewModel.CommingFrom.set("isViewProfile")
                    binding!!.btnBookingProfile.visibility = View.GONE
                    //  viewModel.tvAllowBooking.set(false)
                    getPostprofile(
                        viewModel.p_id.get().toString(),
                       // "3",
                        pref.retvieLatlong("lati").toDouble(),
                        pref.retvieLatlong("longi").toDouble()
                    )

                }
                "isEditLook" -> {
                    /** isEditLook and isViewProfile is same no difference... */
                    viewModel.CommingFrom.set("isViewProfile")
                    binding!!.btnBookingProfile.visibility = View.GONE

                    viewModel.backgroundColor.value = arguments?.getString("background_color")
                    viewModel.textColor.value = arguments?.getString("font_color")
                    viewModel.fontViewColor.set(arguments?.getString("font_color"))
                    viewModel.columnViewColor.set(arguments?.getString("column_color"))
                    viewModel.borderViewColor.set(arguments?.getString("border_color"))
                    viewModel.font_typeface.set(arguments?.getString("font_typeface"))
                    viewModel.checkScreenType="edit"
                    colorLookView()
                }
                "isBookingDetailsFragment" -> {
                    /** isBookingDetailsFragment and isViewProfile is same no difference... */
                    Log.e("ZCZXCZXCZXCZXC", requireArguments().get("userPostProfileId").toString())
                    viewModel.CommingFrom.set("isViewProfile")
                    viewModel.p_id.set(requireArguments().get("userPostProfileId").toString())

                    Log.e(
                        "ASDASQWEQWe", viewModel.p_id.get().toString() + "xdfdf   " +
                                pref.retvieLatlong("lati").toDouble() + " sdfsdf  " +
                                pref.retvieLatlong("longi").toDouble().toString().toString()
                    )

                    getPostprofile(
                        viewModel.p_id.get().toString(),
                        pref.retvieLatlong("lati").toDouble(),
                        pref.retvieLatlong("longi").toDouble(),
                    )

                }

            }

        }

    }


    /** only call when coming from Favouirte screen **/
    private fun setFavdata(pos: Int, data: ArrayList<ProfileCateData>, image: ArrayList<String>) {

        binding?.displayBack?.visibility = View.VISIBLE
        binding?.mainConslayout?.visibility = View.VISIBLE

        val dscList = ArrayList<String>()
        dscList.add(data[pos].description_1.toString())
        dscList.add(data[pos].description_2.toString())
        dscList.add(data[pos].description_3.toString())

        viewModel.tvFavDetailsAddress.set(data[pos].address)
        viewModel.tvFavCityAddress.set(data[pos].location_text)
//      viewModel.fav_title.set(data.get(pos).user_name)
        viewModel.username.set(data[pos].user_name)
        viewModel.p_id.set(data[pos].p_id)
        viewModel.userId.set(data[pos]._id)
        viewModel.userIdForChat.set(data[pos]._id.toString())

        viewModel.font_opacity.set(data[pos].frontpage_font_opacity.toString().toInt())
        viewModel.font_size.set(data[pos].frontpage_font_size.toString().toInt())
        viewModel.fontViewColor.set(data[pos].frontpage_font_color.toString())
        viewModel.font_typeface.set(data[pos].frontpage_bottom_text.toString())

        checkForMiles(data[pos]._id.toString())
        val imageList = ArrayList<AddPhoto>()

        for (idx in 0 until image.size) {
            imageList.add(AddPhoto(image[idx], true))
        }

        Log.e("KJHEMMDADDAS", imageList.toString())
        viewModel.data_list = imageList
        val postData = postData(
            data[pos].p_id,
            data[pos].address,
            data[pos].booking_status,
            data[pos].c_id,
            data[pos].category_name,
            dark_theme = false,
            data[pos].description_1,
            data[pos].description_2,
            data[pos].description_3, 0,
            data[pos].distance,
            data[pos].expiry_date,
            data[pos].favouriteCount,
            data[pos].first_name,
            false,
            0,
            isAddedToProfile = false,
            isDisliked = false,
            isFavourite = false,
            isLiked = false,
            isPremium = data[pos].isPremium,
            last_name = data[pos].last_name,
            lat = data[pos].lat,
            likeCount = data[pos].favouriteCount,
            location = null, location_OnOff = false,
            location_text = data[pos].location_text,
            long = data[pos].long,
            postProfile_picture = data[pos].postProfile_picture,
            profile_title = data[pos].profile_title,
            tags = data[pos].tags,
            user_id = data[pos]._id,
            user_name = data[pos].user_name
        )

        viewModel.userdata.set(postData)

        setFirstMediaMethod(image[0])

        var fontListModel:FontsListModelResponse?=null
        if(viewModel.font_typeface.get()!="") {
            var fontList1 = viewModel.fontList!!.filter { it.name == viewModel.font_typeface.get() }

            if(fontList1!!.size>0)
            {
                fontListModel=fontList1[0]
            }else
            {
                fontListModel= viewModel.fontList!![0]
            }
        }else
        {
            fontListModel= viewModel.fontList!![0]
        }

        setAdapter(image, dscList,fontListModel!!)

        Log.e("fkqwfrkwqkfqwff===", data.get(pos)._id.toString())

        calculateDistance(
            binding!!.tvFavDetailsDistance,
            data.get(pos).lat,
            data.get(pos).long!!,
            Constants.TEMP_LATVALUE!!,
            Constants.TEMP_LONGVALUE!!
        )

    }

    //Calculate distance between two location
    fun calculateDistance(
        destinationTV: TextView,
        destinationLat: Double,
        destinationLong: Double,
        currentLat: Double,
        currentLong: Double,
    ) {
        Log.e("egmhamgasg===", Constants.TEMP_LATVALUE!!.toString())
        Log.e("egmhamgasg111===", Constants.TEMP_LONGVALUE!!.toString())
        val latLngA =
            LatLng(Constants.TEMP_LATVALUE!!.toDouble(), Constants.TEMP_LONGVALUE!!.toDouble())
        // val latLngB = LatLng(destLat, destLong)
        val latLngB = LatLng(destinationLat, destinationLong)
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude

        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude

        Log.e("ABCDDDDDDD==", locationA.toString())
        Log.e("ABCDDDDDDD1111==", locationB.toString())
        val distance = locationA.distanceTo(locationB).toDouble().toString()

        val milesValues = BindingAdapters.metersToMiles(distance.toDouble())
        var finalMilesDiatance = ""
        when {
            milesValues.toString().contains(".") -> {
                finalMilesDiatance = milesValues.toString().split(".")[0] + " miles"
            }
            else -> {
                finalMilesDiatance = "$milesValues miles"
            }
        }
        Log.e("ABCDDDDDDD444==", finalMilesDiatance)
        viewModel.distanceValue.set(finalMilesDiatance)
    }

    fun setFirstMediaMethod(imageValue: String) {
        if (imageValue.contains(".png") || imageValue.contains(".jpg") || imageValue.contains(".jpeg")) {
            Glide.with(requireActivity()).load(IMAGE_LOAD_URL + imageValue).
                //  apply(RequestOptions().override(1200,1200)).placeholder(R.drawable.dash_board_items_bg).error(R.drawable.dash_board_items_bg)
            placeholder(R.drawable.dash_board_items_bg).error(R.drawable.dash_board_items_bg)
                .into(binding!!.ivFavDetails)
            binding!!.ivFavDetails!!.visibility = View.VISIBLE
            binding!!.videoViewDetail.visibility = View.GONE
            binding!!.ivVideoIconDetails.visibility = View.GONE
        } else {
            binding!!.ivFavDetails.visibility = View.GONE
            binding!!.videoViewDetail.visibility = View.VISIBLE
            binding!!.ivVideoIconDetails.visibility = View.VISIBLE
            var activity = requireActivity() as Activity
            activity.setVideoPlayMethod(
                binding!!.videoViewDetail,
                IMAGE_LOAD_URL + imageValue,
                binding!!.ivVideoIconDetails
            )
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        getLastLocation()

        /* if (CommonMethods.isAdvanceMap === true) {
             mMap.setMapStyle(
                 MapStyleOptions.loadRawResourceStyle(
                     requireContext(),
                     R.raw.map_json_dark_mode
                 )
             )
         } else {
             mMap.setMapStyle(null)
             CommonMethods.showToast(requireContext(), "Dark Mode is Disabled")
         }*/
    }

    /** Get current location of user  */

    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                CommonMethods.mFusedLocationClient.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        CommonMethods.requestNewLocationData()
                    } else {
                        CommonMethods.currentLocation = LatLng(location.latitude, location.longitude)
                        mMap.clear()
                        val markerOptions = MarkerOptions().position(CommonMethods.currentLocation).title("I am here! On Your Current Location")
                        mMap.animateCamera(CameraUpdateFactory.newLatLng(CommonMethods.currentLocation))
                        mMap.animateCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                CommonMethods.currentLocation,
                                15F
                            )
                        )

                        //for current lat long
                        pref.storeLatlong("lati", location.latitude.toFloat())
                        pref.storeLatlong("longi", location.longitude.toFloat())

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
        grantResults: IntArray,
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

    private fun setVideosAdapter() {
        binding?.rvVideos?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvVideos?.adapter = viewModel.videosAdapter
        binding?.rvVideos?.adapter?.notifyDataSetChanged()
    }


    /** GET POST PROFILE  API **/

    private fun getPostprofile(p_id: String, lati: Double, longi: Double) {

        Log.e(
            "KKKKAAALLLL",pref.retrieveKey("token").toString() +" dfdf "+
                    p_id + " PID " +
                    pref.retvieLatlong("lati")
                        .toFloat() + " LAT  " +
                    pref.retvieLatlong("longi").toFloat() + " LONG "
        )

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
                        pref.retvieLatlong("lati").toFloat(),
                        pref.retvieLatlong("longi").toFloat()

                    )
                }

                override fun onResponse(res: Response<GetPostProfileResponse>) {
                    Log.e("getPosofileRes + 1 ", res.body().toString())

                    if (res.isSuccessful) {
                        binding?.mainConslayout?.visibility = View.VISIBLE

                        if (res.body() != null) {
                            if (res.code() == 200) {

                                binding?.displayBack?.visibility = View.VISIBLE
                                Log.e("QWQAAAZZZ", res.body().toString())
                                Log.e("QWQAAAZZZ1233", res.body()!!.data.toString())

                                viewModel.userdata.set(res.body()!!.data)
                                viewModel.userIdForChat.set(res.body()?.data?.user_id.toString())
                                viewModel.userId.set(res.body()?.data?.user_id.toString())
                                viewModel.isFav.set(res.body()!!.data.isFavourite!!)
                                viewModel.isLike.set(res.body()!!.data.isLiked!!)
                                viewModel.isDisLike.set(res.body()!!.data.isDisliked!!)
                                viewModel.LikesCount.set(res.body()!!.data.likeCount.toString())
                                viewModel.DisLikesCount.set(res.body()!!.data.dislikeCount.toString())
                                viewModel.tvFavCityAddress.set(res.body()!!.data.location_text)
                                viewModel.tvFavouriteCountValue.set(res.body()!!.data.favouriteCount.toString())
                                viewModel.tvAllowBooking.set(res.body()!!.data.booking_status!!)
                                viewModel.tvAllowBooking.set(res.body()!!.data.booking_status!!)
                                viewModel.tvAllowBooking.set(res.body()!!.data.booking_status!!)
                                viewModel.categoryName.set(res.body()!!.data.category_name!!)
                                viewModel.font_typeface.set(res.body()?.data?.font_name)

                                // viewModel.checkScreenType
                                if(viewModel.checkScreenType=="") {
                                    Log.e("Profile_Show===","Yes")

                                    var hashValue="#"

                                    if(res.body()?.data?.background_color!=null && res.body()?.data?.background_color!=""
                                        && !(res.body()?.data?.background_color.equals("null"))) {
                                        if (res.body()?.data?.background_color!!.contains("#")) {
                                            viewModel.backgroundColor.value =
                                                res.body()?.data?.background_color
                                        } else {
                                            viewModel.backgroundColor.value =
                                                "$hashValue" + res.body()?.data?.background_color
                                        }
                                    }else
                                    {
                                        viewModel.backgroundColor.value ="#ffffff"
                                    }
                                    // }
                                    if(res.body()?.data?.font_color!=null && res.body()?.data?.font_color!=""
                                        && !(res.body()?.data?.font_color.equals("null"))) {
                                        if (res.body()?.data?.font_color!!.contains("#")) {
                                            viewModel.textColor.value =
                                                res.body()?.data?.font_color
                                        } else {
                                            viewModel.textColor.value =
                                                "$hashValue" + res.body()?.data?.font_color
                                        }
                                    }else
                                    {
                                        viewModel.textColor.value ="#000000"
                                    }


                                    if(res.body()?.data?.background_color!=null && res.body()?.data?.background_color!=""
                                        && !(res.body()?.data?.background_color.equals("null"))) {
                                        if (res.body()?.data?.background_color!!.contains("#")) {
                                            viewModel.backgrColor.set(res.body()?.data?.background_color)
                                        } else {
                                            viewModel.backgrColor.set(
                                                "$hashValue" + res.body()?.data?.background_color
                                            )
                                        }
                                    }else
                                    {
                                        viewModel.backgrColor.set("#ffffff")
                                    }

                                    // viewModel.textColor.value = res.body()?.data?.font_color
                                    // viewModel.backgrColor.set(res.body()?.data?.background_color)





                                    if(res.body()?.data?.font_color!=null && res.body()?.data?.font_color!=""
                                        && !(res.body()?.data?.font_color.equals("null"))) {
                                        if (res.body()?.data?.font_color!!.contains("#")) {
                                            viewModel.fontViewColor.set(res.body()?.data?.font_color)
                                        } else {
                                            viewModel.fontViewColor.set(
                                                "$hashValue" + res.body()?.data?.font_color
                                            )
                                        }
                                    }else
                                    {
                                        viewModel.fontViewColor.set("#000000")
                                    }

                                    if(res.body()?.data?.column_color!=null && res.body()?.data?.column_color!=""
                                        && !(res.body()?.data?.column_color.equals("null"))) {
                                        if(res.body()?.data?.column_color!!.contains("#")){
                                            viewModel.columnViewColor.set(res.body()?.data?.column_color)
                                        }else
                                        {
                                            viewModel.columnViewColor.set(
                                                "$hashValue" +res.body()?.data?.column_color)
                                        }}else
                                    {
                                        viewModel.columnViewColor.set("#00000000")
                                    }

                                    // viewModel.fontViewColor.set(res.body()?.data?.font_color)
                                    // viewModel.columnViewColor.set(res.body()?.data?.column_color.toString())

                                    if(res.body()?.data?.border_color!=null && res.body()?.data?.border_color!=""
                                        && !(res.body()?.data?.border_color.equals("null"))) {
                                        if (res.body()?.data?.border_color!!.contains("#")) {
                                            viewModel.borderViewColor.set(res.body()?.data?.border_color)
                                        } else {
                                            viewModel.borderViewColor.set(
                                                "$hashValue" + res.body()?.data?.border_color
                                            )
                                        }
                                    }else
                                    {
                                        viewModel.borderViewColor.set("#000000")
                                    }


                                    //  viewModel.borderViewColor.set(res.body()?.data?.border_color)


                                    res.body()?.data?.border_opacity?.let {
                                        viewModel.border_opacity.set(it.toString())
                                    }
                                    res.body()?.data?.font_opacity?.let {
                                        viewModel.font_opacity.set(it)
                                    }
                                    res.body()?.data?.font_size?.let { viewModel.font_opacity.set(it) }
                                    res.body()?.data?.border_width?.let {
                                        viewModel.font_opacity.set(it)
                                    }

                                    res.body()?.data?.column_opacity?.let {
                                        viewModel.column_opacity.set(it)
                                    }
                                }

                                /** Here map implemention  */

                                if (res.body()!!.data.location_OnOff == true) {
                                    binding!!.cvFavDetails.visibility = View.VISIBLE
                                    getLatlngAPI()
                                } else {
                                    binding!!.cvFavDetails.visibility = View.GONE
                                }

                                if (res.body()!!.data.dark_theme == true) {
                                    Log.e("sadsad" , res.body()!!.data.dark_theme.toString())
                                    mMap.setMapStyle(
                                        MapStyleOptions.loadRawResourceStyle(
                                            requireContext(),
                                            R.raw.map_json_dark_mode
                                        )
                                    )

                                } else {
                                    Log.e("iouwer" , res.body()!!.data.dark_theme.toString())
                                    mMap.setMapStyle(null)
                                }

                                if (res.body()!!.data.follow == true) {
//                                    binding!!.cvFavDetails.visibility = View.VISIBLE
                                } else {
//                                    binding!!.cvFavDetails.visibility = View.GONE
                                }

                                Log.e("userIddddd====", viewModel.userdata.get().toString())
                                Log.e(
                                    "userIddddd111====",
                                    viewModel.userdata.get()?.postProfile_picture!![0].toString()
                                )

                                /** p_id not null */

                                /*   if (res.body()!!.data.p_id.equals(loginUserPId)) {

                                       if(viewModel.fontViewColor.get().toString().trim()=="") {
                                           viewModel.getEditLookColor()
                                           Log.e("ZCXCX" , "WORKING1")
                                       }
                                   }else{
                                       Log.e("ZCXCX" , "WORKING2")

                                   }*/

                               /*** 14 march */

//                                mapFeatureGet()

                                if (!(loginUserPId.toString().equals(res.body()!!.data._id))) {
                                    viewModel.checkFavouriteShow.set(0)

                                    if (res.body()!!.data.booking_status!!) {
                                        binding!!.btnBookingProfile.visibility = View.VISIBLE
                                    } else {
                                        binding!!.btnBookingProfile.visibility = View.GONE
                                    }
                                } else {
                                    viewModel.checkFavouriteShow.set(1)
                                    binding!!.btnBookingProfile.visibility = View.GONE
                                }

                                if (viewModel.isFav.get()) {
                                    Glide.with(requireActivity())
                                        .load(R.drawable.ic_heart_filled_icon)
                                        .into(binding!!.ivFavDetailsFilledHeart)
                                    viewModel.isFav.set(false)
                                } else {
                                    Glide.with(requireActivity())
                                        .load(R.drawable.ic_heart_icon)
                                        .into(binding!!.ivFavDetailsFilledHeart)
                                    viewModel.isFav.set(true)

                                }

                                Log.e(
                                    "mfkwefmfewfwfwwfwef====",
                                    viewModel.checkFavouriteShow.get().toString()
                                )

                                dataList =
                                    res.body()!!.data.postProfile_picture as ArrayList<String> /* = java.util.ArrayList<kotlin.String> */

                                var newDataList = ArrayList<AddPhoto>()
                                newDataList.clear()

                                for (idx in 0 until dataList.size) {

                                    if (dataList[idx].toString().contains(".jpg")
                                        || dataList[idx].toString().contains(".jpeg")
                                        || dataList[idx].toString().contains(".png")
                                    ) {
                                        newDataList.add(AddPhoto(dataList[idx].toString(), true, 1))
                                    } else {
                                        newDataList.add(AddPhoto(dataList[idx].toString(), true, 2))
                                    }
                                }

                                viewModel.data_list = newDataList

                                val dsc1 = res.body()!!.data.description_1
//                                    val dsc2 = res.body()!!.data.description_2
//                                    val dsc3 = res.body()!!.data.description_3

                                val dscList = ArrayList<String>()
                                dscList.add(res.body()!!.data.description_1.toString())
                                dscList.add(res.body()!!.data.description_2.toString())
                                dscList.add(res.body()!!.data.description_3.toString())

                                /// set data

                                binding!!.etVEditProDescription.text = dsc1
                                binding!!.tvFavDetailsAddress.text = res.body()!!.data.address
                                binding!!.tvFavDetails.text = res.body()!!.data.user_name
                                viewModel.username.set(res.body()!!.data.user_name)



                                setFirstMediaMethod(
                                    res.body()!!.data.postProfile_picture!!.get(0)
                                        .toString()
                                )

                                calculateDistance(
                                    binding!!.tvFavDetailsDistance,
                                    res.body()!!.data.lat!!,
                                    res.body()!!.data.long!!,
                                    Constants.TEMP_LATVALUE!!,
                                    Constants.TEMP_LONGVALUE!!
                                )


                                /*   if (res.body()!!.data.postProfile_picture != null && !(res.body()!!.data.postProfile_picture!!.isEmpty())) {
                                       Glide.with(requireActivity())
                                           .load(
                                               IMAGE_LOAD_URL + res.body()!!.data.postProfile_picture!!.get(
                                                   0
                                               )
                                           ).placeholder(R.drawable.dash_board_items_bg)
   //                                        .apply(RequestOptions().override(1200,1200))
                                           .into(binding!!.ivFavDetails)
                                   } else {

                                       Glide.with(requireActivity())
                                           .load(R.drawable.dash_board_items_bg)
                                           .into(binding!!.ivFavDetails)
                                   }
   */


                                checkForMiles(res.body()!!.data.user_id!!)

                                Log.e(
                                    "ASDASDASdasd",
                                    res.body()!!.data.postProfile_picture.toString()
                                )


                                var fontListModel:FontsListModelResponse?=null
                                if(viewModel.font_typeface.get().toString()!="null" && viewModel.font_typeface.get()!="") {
                                    var fontList1 = viewModel.fontList!!.filter { it.name == viewModel.font_typeface.get() }
                                    if(fontList1.size>0){
                                        fontListModel=fontList1[0]
                                    }else
                                    {
                                        fontListModel=viewModel.fontList!![0]
                                    }
                                }else {
                                    // fontListModel= viewModel.fontList!![0]
                                    fontListModel=FontsListModelResponse(viewModel.fontList!![0].fontTypeface,"temp")
                                }


                                setAdapter(dataList, dscList, fontListModel!!)

                            } else {
                                binding?.displayBack?.visibility = View.GONE
                                CommonMethods.showToast(requireActivity(), res.body()!!.message)
                            }
                        } else {
                            binding?.displayBack?.visibility = View.GONE
                            CommonMethods.showToast(requireActivity(), res.body()!!.message)
                        }
                    } else {
                        binding?.displayBack?.visibility = View.GONE
                        CommonMethods.showToast(requireActivity(), res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    binding?.displayBack?.visibility = View.GONE
//                    binding?.constraintsDetailEmpty?.visibility = View.VISIBLE
                    binding?.ivFavDetailsOptions?.visibility = View.INVISIBLE
                    Log.e("zxczxczxc", message)

                }

            }

        )
    }

    fun checkForMiles(otherUserId: String) {
        if (otherUserId.equals(viewModel.u_ID.get().toString())) {
            binding!!.tvFavDetailsDistance.visibility = View.GONE
        } else {
            binding!!.tvFavDetailsDistance.visibility = View.VISIBLE
        }
    }
/*
    @SuppressLint("NotifyDataSetChanged")
    private fun setDashAdapter(data: ArrayList<String>, dsc1: String, dsc2: String, dsc3: String) {
        binding?.rvImages?.layoutManager = LinearLayoutManager(requireContext())
        val addapter = ViewPostProfileAdapter(requireActivity(), data, dsc2, dsc3, dsc1,)
        binding?.rvImages?.adapter = addapter
        binding?.rvImages?.adapter?.notifyDataSetChanged()
    }
*/

    private fun setAdapter(
        data: ArrayList<String>,
        dscList: ArrayList<String>,
        fontListModel: FontsListModelResponse
    ) {

        var dataList = ArrayList<AddImageDescriptionPOJO>()
        dataList.clear()
        var listSize = 0
        if (data.size - 1 >= dscList.size) {
            listSize = data.size
        } else {
            listSize = dscList.size + 1
        }

        Log.e("Size_Of_List====", listSize.toString())
        for (item in 1 until listSize) {
            var nameDes = ""
            if (item == 1) {
                if (dscList[0] != null) {
                    nameDes = dscList[0]
                } else {
                    nameDes = ""
                }
            } else
                if (item == 2) {
                    nameDes = dscList[1]
                } else
                    if (item == listSize - 1) {
                        nameDes = dscList[2]
                    } else {
                        nameDes = ""
                    }

            var photoUrl = ""
            try {
                if (data[item] != null) {
                    photoUrl = data[item].toString()
                } else {
                    photoUrl = ""
                }
            } catch (e: Exception) {
                photoUrl = ""
            }
            dataList.add(
                AddImageDescriptionPOJO(
                    photoUrl,
                    nameDes,
                    "",
                    viewModel.fontViewColor.get().toString(),
                    viewModel.font_size.get(),
                    viewModel.font_opacity.get(),
                    viewModel.columnViewColor.get().toString(),
                    viewModel.border_size.get(),
                    viewModel.borderViewColor.get().toString(),
                    viewModel.backgrColor.get().toString(),
                    ""
                    ,viewModel.border_opacity.get().toString(),
                    viewModel.border_size.get(),viewModel.column_opacity.get(),
                    viewModel.font_typeface.get().toString()
                )
            )

            Log.e("ADASDAEWQEWE", viewModel.fontViewColor.get().toString())
        }

        binding?.rvImages?.layoutManager = LinearLayoutManager(requireContext())
        val layoutManager = LinearLayoutManager(requireActivity())
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true

        val metrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(metrics)
        //val params = videoView.layoutParams as LinearLayout.LayoutParams
        //params.width = metrics.widthPixels
        Log.e("Updated_List_Size===", dataList.size.toString())
        val addapter = ViewPostProfileAdapter(requireActivity(), dataList, metrics.widthPixels,fontListModel)
        binding?.rvImages?.adapter = addapter
        binding?.rvImages?.adapter?.notifyDataSetChanged()

    }

    override fun onResume() {
        super.onResume()
//        binding?.mainConslayout?.visibility =View.VISIBLE
        Log.e("asdasdasdasdasdas", "WORKINGGFINE--1111")
    }

    override fun onStart() {
        super.onStart()
        Log.e("asdasdasdasdasdas", "WORKINGGFINE--")
    }

    private fun colorLookView() {
        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            val p_Id = it?.data?.p_id
            loginUserId = it?.data?.user_id

            viewModel.p_id.set(p_Id)

            Log.e("asdasdasdasdasdas", p_Id + "VVVC=== USERIDD=--" + loginUserId)

            if (p_Id != "" && p_Id != null && loginUserId != "" && loginUserId != null) {

                Log.e("XVCCCXXXX", p_Id + "VVVC=== USERIDD=--" + loginUserId)

                getPostprofile(
                    p_Id!!,
                    pref.retvieLatlong("lati").toDouble(),
                    pref.retvieLatlong("longi").toDouble()
                )

            }

        }

    }

/*
    private fun premiumAccount1() {

        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            val p_Id = it?.data?.p_id
            loginUserId = it?.data?.user_id

            viewModel.p_id.set(p_Id)

            Log.e("asdasdasdasdasdas", p_Id + "VVVC=== USERIDD=--" + loginUserId)

            if (p_Id != "" && p_Id != null && loginUserId != "" && loginUserId != null) {

                if (loginUserId.equals("63ec7742793d8dd0d5cc3761")){
                    Log.e("XVCCCXXXX", p_Id + "VVVC=== USERIDD=--" + loginUserId)

                    getPostprofile(p_Id, pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble())

                }

            }

        }

    }
*/

    /** View Edit Look Data **/

    fun viewEditLook() {
        if (pref.retviecolorString(Constants.BACKGROUND_COLOR) != null) {
            var backgroundColor = pref.retviecolorString(Constants.BACKGROUND_COLOR)
            var data = backgroundColor as java.lang.String

            binding?.mainToolBar?.setBackgroundColor(Color.parseColor(data.toString()))
            binding?.mainConslayout?.setBackgroundColor(Color.parseColor(data.toString()))
//            viewModel.columnViewColor.set(backgroundColor!!)

            Log.e("SSSSSSSSSqw1", backgroundColor.toString())

        }
        if (pref.retviecolorString(Constants.COLUMN_COLOR) != null) {
            var columnColor = pref.retviecolorString(Constants.COLUMN_COLOR)
            viewModel.columnViewColor.set(columnColor!!)
        }
        if (pref.retviecolorString(Constants.BORDER_COLOR) != null) {
            var borderColor = pref.retviecolorString(Constants.BORDER_COLOR)
            viewModel.borderViewColor.set(borderColor!!)

//            binding?.viewBoxBorderColor?.setBackgroundColor(borderColor!!)
        }

        if (pref.retviecolorString(Constants.FONT_COLOR) != null) {
            var fontColor = pref.retviecolorString(Constants.FONT_COLOR)
            viewModel.fontViewColor.set(fontColor!!)
            var data = fontColor as java.lang.String

            binding?.tvFavCityAddress?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsAddress?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsDistance?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetails?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsLikeCounts?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsDisLikeCount?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsName?.setTextColor(Color.parseColor(data.toString()))
            binding?.ivFavDetailsBackBtn?.setColorFilter(Color.parseColor(data.toString()))
            binding?.ivFavDetailsOptions?.setColorFilter(Color.parseColor(data.toString()))
            binding?.ivFavDetailsChats?.setColorFilter(Color.parseColor(data.toString()))
            binding?.ivFavDetailsLike?.setColorFilter(Color.parseColor(data.toString()))
            binding?.ivFavDetailsDislike?.setColorFilter(Color.parseColor(data.toString()))
            binding?.ivFavTotalLikedCounts?.setColorFilter(Color.parseColor(data.toString()))
            binding?.tvFavHeartFilledCounts?.setTextColor(Color.parseColor(data.toString()))




            Log.e("SSSSSSSSSqw4", fontColor.toString())
        }

//        if (pref.retviesize(Constants.BORDER_WIDTH)!=null){
//            viewModel.bor.set(fontColor!!)
//            Log.e("SSSSSSSSSqw4",fontColor.toString())
//
//
//            }

    }

    fun mapFeatureGet() {

        repository.makeCall(
            apiKey = ApiEnums.GET_MAP_FEATURED,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetMapFeature>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetMapFeature> {
                    return retrofitApi.getMapFeatured(pref.retrieveKey("token").toString())
                }

                override fun onResponse(res: Response<GetMapFeature>) {
                    Log.e("SDASDASWQ", res.body().toString())

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!!.data != null) {

                            if (res.body()!!.data.location_OnOff == true) {
                                binding!!.cvFavDetails.visibility = View.VISIBLE
                            }

                            if (res.body()!!.data.dark_theme == true) {
                                mMap.setMapStyle(
                                    MapStyleOptions.loadRawResourceStyle(
                                        requireContext(),
                                        R.raw.map_json_dark_mode
                                    )
                                )
                            } else {
                                mMap.setMapStyle(null)
                            }

                            dataStoreUtil.saveObject(
                                SAVE_MAP_FEATURE_FROM_FAV_DEATILS,
                                res.body()!!.data
                            )

                            Log.e("SDASDASWQ123", res.body()!!.data.toString())

                        } else {
                            CommonMethods.showToast(
                                requireActivity(),
                                res.body()!!.data.toString()
                            )
                        }

                    } else {
                        CommonMethods.showToast(requireActivity(), res.message())
                    }

                }

            }
        )
    }

    fun getLatlngAPI() {

        Log.e("zfsio" ,    pref.retrieveKey("token").toString()+ "    " +
            viewModel.userIdForChat.get().toString()
        )

        repository.makeCall(
            ApiEnums.GET_LATLNG,
            loader = false,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetLatLongResponseModel>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetLatLongResponseModel> {
                    return retrofitApi.getLatlng(
                        pref.retrieveKey("token").toString(),
                        viewModel.userIdForChat.get().toString()
                    )
                }

                override fun onResponse(res: Response<GetLatLongResponseModel>) {
                    Log.e("AQQAAA", res.body().toString())

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {
                                Log.e("getLatLngResponse-->> ", res.body().toString())

                                val lat = res.body()!!.data.user_lat
                                val lng = res.body()!!.data.user_long
                               val latLng = LatLng(lat, lng)
                                mMap.clear()
                                val markerOptions = MarkerOptions().position(latLng)/*.title("I am here! On Your Current Location")*/
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
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }

        )

    }

}
