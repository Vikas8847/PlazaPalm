package com.example.plazapalm.views.favourites.favdetails

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.net.Uri
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
import com.bumptech.glide.request.RequestOptions
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FavDetailsFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.models.*
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
        binding?.mainConslayout?.visibility=View.VISIBLE
//        premiumAccount()
        dataList = ArrayList()
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchApiKey()
        getSharedata()
        binding?.vm = viewModel
        getFavoriteData()
        viewModel.getEditLookColor()
        setbackground()
        getlocalData()
        Log.e("TOKKEN", pref.retrieveKey("token").toString())

    }

    private fun setbackground() {

        viewModel.backgroundColor.observe(viewLifecycleOwner) {
            if (!(it.equals("")) && it != null) {

                if (it is String){
                    val data = it as String
                    binding!!.mainConslayout.setBackgroundColor(Color.parseColor(data.toString()))
                    binding!!.mainToolBar.setBackgroundColor(Color.parseColor(data.toString()))
                }
            }
        }

        viewModel.textColor.observe(viewLifecycleOwner) {
            if (!(it.equals("")) && it != null) {

                if (it is String){

                    val data = it as String

                    viewModel.fontViewColor.set(data!!)

//                    binding!!.tvFavDetails.setTextColor(Color.parseColor(data.toString()))
//                    binding!!.tvFavDetailsDistance.setTextColor(Color.parseColor(data.toString()))
//                    binding!!.tvFavCityAddress.setTextColor(Color.parseColor(data.toString()))
//                    binding!!.tvFavDetailsAddress.setTextColor(Color.parseColor(data.toString()))

                    binding?.tvFavCityAddress?.setTextColor(Color.parseColor(data.toString())!!)
                    binding?.tvFavDetailsAddress?.setTextColor(Color.parseColor(data.toString())!!)
                    binding?.tvFavDetailsDistance?.setTextColor(Color.parseColor(data.toString())!! )
                    binding?.tvFavDetails?.setTextColor(Color.parseColor(data.toString())!!)
                    binding?.tvFavDetailsLikeCounts?.setTextColor(Color.parseColor(data.toString()))
                    binding?.tvFavDetailsDisLikeCount?.setTextColor(Color.parseColor(data.toString())!!)
                    binding?.tvFavDetailsName?.setTextColor(Color.parseColor(data.toString())!!)
                    binding?.ivFavDetailsBackBtn?.setColorFilter(Color.parseColor(data.toString())!!)
                    binding?.ivFavDetailsOptions?.setColorFilter(Color.parseColor(data.toString())!!)
                    binding?.ivFavDetailsChats?.setColorFilter(Color.parseColor(data.toString())!!)
                    binding?.ivFavDetailsLike?.setColorFilter(Color.parseColor(data.toString())!!)
                    binding?.ivFavDetailsDislike?.setColorFilter(Color.parseColor(data.toString())!!)
                    binding?.ivFavTotalLikedCounts?.setColorFilter(Color.parseColor(data.toString())!!)

                }

            }
        }

    }

    private fun getlocalData() {
        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {
            viewModel.u_ID.set(it?.data?.user_id)

            val p_id = it?.data?.p_id
//            if (arguments?.get("comingFrom")!=null && arguments?.get("comingFrom").toString().equals("isEditLook")){
//                getPostprofile(p_id!!,   pref.retvieLatlong("lati").toDouble(),  pref.retvieLatlong("longi").toDouble())
//            }


            Log.e("SDASDASDASDASdas", it.toString())
        }
    }

    private fun getSharedata() {
        val data: Uri? = CommonMethods.context.intent?.data

        if ( data !=null) {
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

                    val data = requireArguments().getSerializable("ResBody") as ArrayList<FavData>
                    val pos = requireArguments().getInt("pos")
                    val image: ArrayList<String> = data.get(pos).postProfile_picture as ArrayList<String>
                    setFavdata(pos, data, image)

                    Log.e(
                        "VVBBBB",
                        image.toString() + "  ---pos---  " + pos.toString() + data.toString() + "  ---pos---  "
                    )

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

                    val _p_id = arguments?.getString("P_ID")
                    viewModel.CommingFrom.set("isViewProfile")
                    binding!!.btnBookingProfile.visibility = View.GONE
                    getPostprofile(_p_id!!, pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble())
                    viewModel.p_id.set(_p_id)

//                    getViewProfileData()

                }
                "isEditLook" -> {
                    /** isEditLook and isViewProfile is same no difference... */

                    viewModel.CommingFrom.set("isViewProfile")
                    binding!!.btnBookingProfile.visibility = View.GONE
                    premiumAccount()
                    viewEditLook()


                  /*  viewModel.backgroundColor.observe(viewLifecycleOwner) {
                        if (!(it.equals("")) && it != null) {

                            if (it is String){
                                val data = it as String
                                binding!!.mainConslayout.setBackgroundColor(Color.parseColor(data.toString()))
                                binding!!.mainToolBar.setBackgroundColor(Color.parseColor(data.toString()))
                            }

                        }
                    }*/

                }

            }

        }

    }


    /** only call when coming from Favouirte screen **/
    private fun setFavdata(pos: Int, data: ArrayList<FavData>, image: ArrayList<String>) {

        binding?.displayBack?.visibility =View.VISIBLE

        val dscList = ArrayList<String>()
        dscList.add(data.get(pos).description_1.toString())
        dscList.add(data.get(pos).description_2.toString())
        dscList.add(data.get(pos).description_3.toString())

        viewModel.tvFavDetailsAddress.set(data.get(pos).address)
        viewModel.tvFavCityAddress.set(data.get(pos).location_text)
//        viewModel.fav_title.set(data.get(pos).user_name)
        viewModel.username.set(data.get(pos).user_name)
        viewModel.p_id.set(data.get(pos).p_id)

        viewModel.userId.set(data.get(pos)._id)

        val imageList = ArrayList<AddPhoto>()

        for (idx in 0 until image.size) {
            imageList.add(AddPhoto(image[idx].toString(), true))
        }

        Log.e("KJHEMMDADDAS", imageList.toString())
        viewModel.data_list = imageList
        Glide.with(requireActivity()).load(IMAGE_LOAD_URL + image.get(0))
            .into(binding!!.ivFavDetails)

        setAdapter(image, dscList)

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

    private fun setVideosAdapter() {
        binding?.rvVideos?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvVideos?.adapter = viewModel.videosAdapter
        binding?.rvVideos?.adapter?.notifyDataSetChanged()
    }


    /** GET POST PROFILE  API **/

    private fun getPostprofile(p_id: String, lati: Double, longi: Double) {

        Log.e("KKKKAAALLLL", p_id + " PID " + lati + " LAT  " + longi + " LONG ")

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
                    Log.e("AQQAAARESPONEEES", res.body().toString())

                    if (res.isSuccessful) {
                        binding?.mainConslayout?.visibility =View.VISIBLE

                        if (res.body() != null) {
                            if (res.code() == 200) {

                                binding?.displayBack?.visibility =View.VISIBLE
                                Log.e("QWQAAAZZZ", res.body().toString())

                                viewModel.userdata.set(res.body()!!.data)
                                viewModel.isFav.set(res.body()!!.data.isFavourite!!)
                                viewModel.isLike.set(res.body()!!.data.isLiked!!)
                                viewModel.isDisLike.set(res.body()!!.data.isDisliked!!)
                                viewModel.LikesCount.set(res.body()!!.data.likeCount.toString())
                                viewModel.DisLikesCount.set(res.body()!!.data.dislikeCount.toString())
                                viewModel.tvFavCityAddress.set(res.body()!!.data.location_text)


                                if (viewModel.isFav.get()) {
                                    Glide.with(CommonMethods.context)
                                        .load(R.drawable.ic_heart_filled_icon)
                                        .into(binding!!.ivFavDetailsFilledHeart)
                                    viewModel.isFav.set(false)
                                } else {
                                    Glide.with(CommonMethods.context)
                                        .load(R.drawable.ic_heart_icon)
                                        .into(binding!!.ivFavDetailsFilledHeart)
                                    viewModel.isFav.set(true)

                                }

                                dataList = res.body()!!.data.postProfile_picture as ArrayList<String> /* = java.util.ArrayList<kotlin.String> */

                                var newDataList = ArrayList<AddPhoto>()
                                newDataList.clear()

                                for (idx in 0 until dataList.size) {
                                    newDataList.add(AddPhoto(dataList[idx].toString(), true))
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

                                if (res.body()!!.data.postProfile_picture != null && !(res.body()!!.data.postProfile_picture!!.isEmpty())) {
                                    Glide.with(requireActivity())
                                        .load(IMAGE_LOAD_URL + res.body()!!.data.postProfile_picture!!.get(0))
//                                        .apply(RequestOptions().override(1200,1200))
                                        .into(binding!!.ivFavDetails)
                                } else {

                                    Glide.with(requireActivity())
                                        .load(R.drawable.dash_board_items_bg)
                                        .into(binding!!.ivFavDetails)
                                }


                                Log.e(
                                    "ASDASDASdasd",
                                    res.body()!!.data.postProfile_picture.toString()
                                )

                                setAdapter(dataList, dscList)

                                binding!!.ivFavDetails

//                                }

                            } else {
                                binding?.displayBack?.visibility =View.GONE
                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                            }
                        } else {
                            binding?.displayBack?.visibility =View.GONE
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                        }
                    } else {
                        binding?.displayBack?.visibility =View.GONE
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    binding?.displayBack?.visibility =View.GONE
                    Log.e("zxczxczxc", message)

                }

            }

        )
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

    private fun setAdapter(data: ArrayList<String>, dscList: ArrayList<String>) {

        var dataList = ArrayList<AddImageDescriptionPOJO>()


        for (item in 1 until data.size) {
            var nameDes = ""
            if (item == 1) {
                nameDes = dscList[0]
            } else
                if (item == 2) {
                    nameDes = dscList[1]
                } else
                    if (item == data.size - 1) {
                        nameDes = dscList[2]
                    } else {
                        nameDes = ""
                    }

            dataList.add(AddImageDescriptionPOJO(data[item].toString(), nameDes, "",
                viewModel.fontViewColor.get().toString(),0,0,viewModel.columnViewColor.get().toString(),
                0,viewModel.borderViewColor.get().toString()))

            Log.e("ADASDAEWQEWE",viewModel.fontViewColor.get().toString())
        }

        binding?.rvImages?.layoutManager = LinearLayoutManager(requireContext())

        val addapter = ViewPostProfileAdapter(requireActivity(), dataList)
        binding?.rvImages?.adapter = addapter
        binding?.rvImages?.adapter?.notifyDataSetChanged()

    }

    override fun onResume() {
        super.onResume()
//        binding?.mainConslayout?.visibility =View.VISIBLE
        Log.e("asdasdasdasdasdas", "WORKINGGFINE--1111")

//        getFavoriteData()
    }

    override fun onStart() {
        super.onStart()
//        binding?.mainConslayout?.visibility =View.VISIBLE
        Log.e("asdasdasdasdasdas", "WORKINGGFINE--")

//        getFavoriteData()
    }

    private fun premiumAccount() {

        dataStoreUtil?.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            val p_Id = it?.data?.p_id
            val user_id = it?.data?.user_id

            viewModel.p_id.set(p_Id)

            Log.e("asdasdasdasdasdas", p_Id + "VVVC=== USERIDD=--" + user_id)

            if (p_Id != "" && p_Id != null && user_id != "" && user_id != null) {

                if (user_id.equals("63b69f871545b79696c25166")) {
                    Log.e("XVCCCXXXX", p_Id + "VVVC=== USERIDD=--" + user_id)

                    getPostprofile(p_Id!!,   pref.retvieLatlong("lati").toDouble(),  pref.retvieLatlong("longi").toDouble())

                }

            }

        }



//        dataStoreUtil.readObject(LOGIN_DATA, LoginDataModel::class.java) {
//
//
//
////            binding?.tvMyProfileName?.text = it?.data?.first_name + " " + it?.data?.last_name
////            username.set(it?.data?.user_name)
////            var  user_id = it?.data?.user_id.toString()
////            var  p_id = it?.data?.
////
////            Log.e("SDSFSDf",it?.data?.user_name + "DFDFDDg   " + user_id.toString())
////
////            /*** Get  premium */
////            //        if (viewModel.premium == 1) {
////
////            if (user_id.equals("637b5f650f380e10b6ec0ff0")) {
/////*
////
////                binding?.tvAdvanceSetting?.visibility = View.VISIBLE
////                binding?.viewAdvanceSettings?.visibility = View.VISIBLE
////
////                binding?.tvQRCode?.visibility = View.VISIBLE
////                binding?.viewQRCode?.visibility = View.VISIBLE
////
////                binding?.tvViewMyProfile?.visibility = View.VISIBLE
////                binding?.viewProfile?.visibility = View.VISIBLE
////
////                binding?.tvUpgrade?.visibility = View.GONE
////                binding?.viewUpgrade?.visibility = View.GONE
////*/
////
////            } else {
////
////                /* binding?.tvAdvanceSetting?.visibility = View.GONE
////                 binding?.viewAdvanceSettings?.visibility = View.GONE
////
////                 binding?.tvUpgrade?.visibility = View.VISIBLE
////                 binding?.viewUpgrade?.visibility = View.VISIBLE*/
////
////                Log.e("SAAHAEED","WORKINGGGGGG")
////
////            }
//
//        }

    }

    /** View Edit Look Data **/

    fun viewEditLook() {
        if (pref.retviecolorString(Constants.BACKGROUND_COLOR)!=null){
            var backgroundColor = pref.retviecolorString(Constants.BACKGROUND_COLOR)
            var data = backgroundColor as java.lang.String

            binding?.mainToolBar?.setBackgroundColor(Color.parseColor(data.toString()))
            binding?.mainConslayout?.setBackgroundColor(Color.parseColor(data.toString()))
//            viewModel.columnViewColor.set(backgroundColor!!)

            Log.e("SSSSSSSSSqw1",backgroundColor.toString())

        }
        if (pref.retviecolorString(Constants.COLUMN_COLOR)!=null){
            var columnColor = pref.retviecolorString(Constants.COLUMN_COLOR)
            viewModel.columnViewColor.set(columnColor!!)
        }
        if (pref.retviecolorString(Constants.BORDER_COLOR)!=null){
            var borderColor = pref.retviecolorString(Constants.BORDER_COLOR)
            viewModel.borderViewColor.set(borderColor!!)

//            binding?.viewBoxBorderColor?.setBackgroundColor(borderColor!!)
        }

        if (pref.retviecolorString(Constants.FONT_COLOR)!=null){
            var fontColor = pref.retviecolorString(Constants.FONT_COLOR)
            viewModel.fontViewColor.set(fontColor!!)
            var data = fontColor as java.lang.String

            binding?.tvFavCityAddress?.setTextColor(Color.parseColor(data.toString())!!)
            binding?.tvFavDetailsAddress?.setTextColor(Color.parseColor(data.toString())!!)
            binding?.tvFavDetailsDistance?.setTextColor(Color.parseColor(data.toString())!! )
            binding?.tvFavDetails?.setTextColor(Color.parseColor(data.toString())!!)
            binding?.tvFavDetailsLikeCounts?.setTextColor(Color.parseColor(data.toString()))
            binding?.tvFavDetailsDisLikeCount?.setTextColor(Color.parseColor(data.toString())!!)
            binding?.tvFavDetailsName?.setTextColor(Color.parseColor(data.toString())!!)
            binding?.ivFavDetailsBackBtn?.setColorFilter(Color.parseColor(data.toString())!!)
            binding?.ivFavDetailsOptions?.setColorFilter(Color.parseColor(data.toString())!!)
            binding?.ivFavDetailsChats?.setColorFilter(Color.parseColor(data.toString())!!)
            binding?.ivFavDetailsLike?.setColorFilter(Color.parseColor(data.toString())!!)
            binding?.ivFavDetailsDislike?.setColorFilter(Color.parseColor(data.toString())!!)
            binding?.ivFavTotalLikedCounts?.setColorFilter(Color.parseColor(data.toString())!!)


            Log.e("SSSSSSSSSqw4",fontColor.toString())
        }

//        if (pref.retviesize(Constants.BORDER_WIDTH)!=null){
//            viewModel.bor.set(fontColor!!)
//            Log.e("SSSSSSSSSqw4",fontColor.toString())
//
//
//            }

        }

}
