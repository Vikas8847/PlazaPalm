package com.example.plazapalm.views.dashboard

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.util.Log
import android.view.*
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.POST_PROFILE_DATA
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.datastore.PROFILE_IMAGE
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.Constants.DeviceType
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateWithId
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class DashBoardVM @Inject constructor(
    private var repository: Repository,
    var dataStoreUtil: DataStoreUtil,
    var pref: PreferenceFile,
) : ViewModel(), clickItem {
    private var _id: String? = null
    var calulatedDistance = ObservableField("")

    //    var destinationLong: Double? = null
//    var destinationLat: Double? = null
    var destinationLat = ObservableDouble()
    var destinationLong = ObservableDouble()

    @SuppressLint("StaticFieldLeak")

    var recyclerSelectedEvents: RecyclerView? = null
    var idList = ArrayList<String>()
    var nameList = ArrayList<String>()
    var token = ObservableField("")
    var status = ObservableField("")
    var searchItems = ObservableField("")
    var lati = ObservableDouble()
    var longi = ObservableDouble()
    var userMiles = ObservableField("")
    var title = ObservableField("")
    var isDataVisible = ObservableBoolean(false)
    var isFav = ObservableBoolean(false)
    var isNodatafound = ObservableBoolean(false)
    var isNodatafoundqw = ObservableField("")
    var distanceCal = ObservableField("")
    var isClicked: ObservableBoolean = ObservableBoolean(false)
    val distance = ObservableField("")
    var idCategoriesData = ObservableArrayList<CategoriesData>()
    val adapter by lazy { RecyclerAdapter<ProfileCateData>(R.layout.dash_board_items) }


    var selectedCategoriesList = ArrayList<SelectedDataModelList>()
    var selectedCategoriesLists = ArrayList<SelectedDataModelList>()
    val dashSelectedAdapter by lazy { RecyclerAdapter<SelectedDataModelList>(R.layout.dash_board_events_items) }
    val list_Name by lazy { stringPreferencesKey("idsList") }
    val list_CateName by lazy { stringPreferencesKey("CateNameList") }
    var dialog: Dialog? = null
    var rvView: RecyclerView? = null
    var selectedCatId = ObservableField("")
    var searchValue = ObservableField("")
    var isRVScroll = ObservableBoolean(false)

    init {

        /*** 03-01-23
         *  Set Cate. Id and send API.. */

        dataStoreUtil.readData(list_Name) {
            idList.clear()
            if (it != null) {
                idList.addAll(arrayListOf(it))
                Log.e("KADJASDASDKL", idList.toString())

            }

        }
        if (pref.retrvieCateIdList() != null && !(pref.retrvieCateIdList().equals(""))) {

            Log.e("AAAZZZZ", pref.retrvieCateIdList().toString())

            val myType = object : TypeToken<ArrayList<String>>() {}.type
            val newList: ArrayList<String> =
                Gson().fromJson<ArrayList<String>>(pref.retrvieCateIdList(), myType)

            idList.clear()

            for (idx in 0 until newList.size) {
                idList.add(newList[idx].toString())
            }

            Log.e("asxsxsxsxsxa", newList.toString())
            Log.e("OASDASDWw-- ", idList.toString())

        }

        /*** 03-01-23
         *  Set Miles and send API.. */

        if (pref.retvieMiles() != null && !(pref.retvieMiles().equals(""))) {

            var miles = pref.retvieMiles()
            userMiles.set(miles.toString())

        } else {
            userMiles.set("25")
        }


        /*    adapter.setOnItemClick { view, _, type ->
                when (type) {
                    "dashItemClick" -> {
                        val isDashBoard = Bundle()
                        isDashBoard.putString("comingFrom", "isDashBoard")
                        view.navigateWithId(
                            R.id.action_dashBoardFragment_to_favDetailsFragment,
                            isDashBoard
                        )
                    }

                    "dashItemClick_fav"->{
                        //For Favourite click
                        Log.e("DFSDFA","WORKING GOOD")
                        Toast.makeText(CommonMethods.context,"WORKING GOOD",Toast.LENGTH_SHORT).show()
                    }
                }
            }*/

        /*** 03-01-23
         *  it can create prob.. */

        /*     dataStoreUtil.readData(list_CateName) {
                 if (it != null) {
                     selectedCategoriesList.clear()
                     val myType = object : TypeToken<ArrayList<SelectedDataModelList>>() {}.type
                     val newList: ArrayList<SelectedDataModelList> =
                         Gson().fromJson<ArrayList<SelectedDataModelList>>(it, myType)

                     for (idx in 0 until newList.size) {

                         selectedCategoriesList.add(
                             SelectedDataModelList(
                                 newList[idx].cateName, newList[idx].cate_ID,
                                 newList[idx].adapterPosition, newList[idx].istrue, newList[idx].count
                             )
                         )

                          }

                          Log.e("sad", it.toString())
                          Log.e("zxccx", selectedCategoriesList.toString())

                      }
                  }*/
    }

    fun onTextChange(editable: Editable) {
        if (editable.toString().length > 0) {
            Handler().postDelayed({
                searchValue.set(editable.toString())
                getProfileByCategory(editable.toString(), false, "")
            }, 1000)
        } else {
            searchValue.set("")
            Handler().postDelayed({
                getProfileByCategory("", false, "")
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }

    fun scrollListener(rvView: RecyclerView) {
        rvView.setOnScrollListener(object : RecyclerView.OnScrollListener() {
            var ydy = 0

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val offset = dy - ydy
                ydy = dy
                var manager = (rvView.layoutManager) as GridLayoutManager


                val currentFirstVisible: Int = manager.findFirstVisibleItemPosition()

                //   if (currentFirstVisible > firstVisibleInListview) Log.i("RecyclerView scrolled: ", "scroll up!") else Log.i("RecyclerView scrolled: ", "scroll down!")

                var firstVisibleInListview = currentFirstVisible


                //   title.set(adapter.getAllItems().get(firstVisibleInListview).category_name.toString())

                // swipeRefreshLayout.setRefreshing(false)
            }
        })
    }


    fun onClicks(view: View) {
        when (view.id) {

            R.id.clMainDashBoard -> {
                context.hideKeyboard()
            }

            R.id.ivDashBoardSelectedList -> {

                isClicked.set(true)
                if (isClicked.get()) {

                    if(selectedCategoriesList.size>0) {
                        showSelectedCatAlert()
                    }
                    isClicked.set(false)
                } else {
                    isClicked.set(true)
                }
                Log.e("ASDFASDFSFSDf", "status.get().toString()")

            }
            R.id.ivDashBoardFilter -> {
                view.navigateWithId(R.id.action_dashBoardFragment_to_filterFragment)
            }
            R.id.ivDashBackBtn -> {
                view.findNavController().navigateUp()
            }
        }
    }


    @SuppressLint("NotifyDataSetChanged")
    private fun showSelectedCatAlert() {
        dialog = Dialog(context)
        val window = dialog!!.window
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.attributes.gravity = Gravity.LEFT or Gravity.TOP
        window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

        dialog!!.setContentView(R.layout.dash_board_events_items)

        Log.e("SADAA", selectedCategoriesList.toString())

        recyclerSelectedEvents = dialog!!.findViewById(R.id.rvDashBoardSelectedEvents)
        recyclerSelectedEvents?.layoutManager = LinearLayoutManager(context)
        recyclerSelectedEvents?.adapter = DashboardItemsAdapter(context, selectedCategoriesList, this)


//        dashSelectedAdapter.addItems(selectedCategoriesList as ArrayList<SelectedDataModel>)
        recyclerSelectedEvents?.adapter?.notifyDataSetChanged()
        dialog?.setCancelable(true)

        if (!context.isFinishing) {
            dialog?.show()
        }

        /// localStorage....

    }

    fun getProfileByCategory(search: String, showLoader: Boolean, c_id: String) {

        Log.e("User_token====", pref.retrieveKey("token").toString())
        // lati.set(pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble())
        //    longi.set(pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble())

        Constants.TEMP_LATVALUE = pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble()
        Constants.TEMP_LONGVALUE = pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()

        var dataArray = ArrayList<String>()
        dataArray.clear()
        if (pref.retrvieCateIdList() != null && !(pref.retrvieCateIdList().equals(""))) {

            val myType = object : TypeToken<ArrayList<String>>() {}.type
            val newList: ArrayList<String> =
                Gson().fromJson<ArrayList<String>>(pref.retrvieCateIdList(), myType)

            idList.clear()
            for (idx in 0 until newList.size) {
                idList.add(newList[idx].toString())
            }
        }

        for (idx in 0 until idList.size) {
            dataArray.add(idList[idx].toString())
        }
        var singleList = ArrayList<String>()
        singleList.clear()
        var dataObject: DashBoardPostData? = null
        if (!(c_id.equals(""))) {
            singleList.add(c_id)
            dataObject = DashBoardPostData(singleList, lati.get().toString(),
                "500", longi.get().toString(), userMiles.get().toString(), "1", searchValue.get().toString())
        } else {
            dataObject = DashBoardPostData(dataArray, lati.get().toString(),
                "500", longi.get().toString(), userMiles.get().toString(), "1",  searchValue.get().toString())
        }

        Log.e("Dash_Board_Input===", dataObject.toString())
        Log.e("SDAMILES",
            userMiles.get().toString() + " LATI " + lati.get().toString()
                    + " LONG " + longi.get()
                .toString() + " CATEIDDD - " + idList.toString() + "search --- " + search)
Log.e("Token_Dataaaa===",pref.retrieveKey("token").toString())
        repository.makeCall(
            ApiEnums.GETPROFILE_BYCATE,
            loader = showLoader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileCateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileCateResponse> {
                    return retrofitApi.getProfileByCategory(
                        pref.retrieveKey("token").toString(),
                        "application/json",
                        dataObject
                        /* idList,
                         5,
                         500,
                         pref.retvieLatlong("longi").toDouble().toString(),
                         pref.retvieLatlong("lati").toDouble().toString(),
                         search,
                         userMiles.get().toString()*/
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetProfileCateResponse>) {

                    Log.d("WORKINGG_->>>---  ", res.body()!!.data.toString() + "DDDDDDDDS")

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.body()!!.status == 200) {

                                //lati.set(pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble())
                                // longi.set(pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble())


                                if (res.body()!!.data.size > 0 || adapter.getAllItems().size > 0) {

                                    isNodatafound.set(true)

                                    for (idx in 0 until adapter.getAllItems().size) {

                                        Log.e("Dashboard_itemsss===",
                                            adapter.getAllItems()[idx].category_name)
                                    }

                                    var profileList = ArrayList<ProfileCateData>()
                                    profileList.clear()
                                    /* if(adapter!=null && adapter.getAllItems()!=null && adapter.getAllItems().size>0)
                                     {
                                         profileList.addAll(adapter.getAllItems());
                                     }*/

                                    for (idx in 0 until res.body()?.data!!.size) {
                                        if (res.body()?.data!![idx].postProfile_picture != null && res.body()?.data!![idx].postProfile_picture.size > 0) {
                                          var data=res.body()?.data!![idx]
                                            data.lngValue=data.long

                                            if(data.postProfile_picture[0].contains(".png") ||
                                                data.postProfile_picture[0].contains(".jpg") || data.postProfile_picture[0].contains(".jpeg"))
                                            {
                                                data.mediaType=1
                                            }else
                                            {
                                                data.mediaType=2
                                                Log.e("rererererer===",data.postProfile_picture[0])
                                            }
                                            /*res.body()?.data!![idx].lngValue =
                                                res.body()?.data!![idx].long*/
                                            profileList.add(data)
                                        }
                                    }
                                    adapter.addItems(profileList)
                                    adapter.notifyDataSetChanged()

                                    Log.d("DashBoardResponse->", res.body()!!.data.toString())

                                    /* for (i in 0 until res.body()!!.data.size) {
                                         destinationLat.set(adapter.getAllItems()[i].lat!!)
                                         destinationLong.set(adapter.getAllItems()[i].lng!!)
                                     }*/
                                    Log.e("SDSDS",
                                        destinationLat.get()
                                            .toString() + "kjljlj;" + destinationLong.get()
                                            .toString())
                                    Log.d("adasWS",
                                        lati.toString() + "sdfdf" + longi)

                                    calculateLatLngToMiles()
                                    // distanceCal.set(distance.get().toString().split(".")[0])

                                    if (pref.retrieveKey("link_share_pid") != null && !(pref.retrieveKey("link_share_pid")
                                            .equals(""))
                                    ) {
                                        profileResponse.value = true
                                        Log.e("efefefefefefe====","efefefefefefef")
                                    }

                                    Log.d("viaksdance", distance.get().toString().split(".")[0])
                                    adapter.setOnItemClick { view, position, type ->

                                        when (type) {
                                            "dashItemClick" -> {
                                                Log.e("dvsvwsdvsr=",
                                                    idList.toString())
                                                val isDashBoard = Bundle()
                                                isDashBoard.putString("comingFrom", "isDashBoard")

                                                isDashBoard.putString(
                                                    "DashBoardPostId",
                                                    res.body()!!.data[position]._id
                                                )
                                                isDashBoard.putDouble(
                                                    "DashBoardPostLatitude",
                                                    lati.get()
                                                )
                                                isDashBoard.putDouble(
                                                    "DashBoardPostLongitude",
                                                    longi.get()
                                                )
                                                view.navigateWithId(
                                                    R.id.action_dashBoardFragment_to_favDetailsFragment,
                                                    isDashBoard)

                                                Log.d("DashBoardResponse->",
                                                    "Workingggg-----fine--")

                                            }
                                            "dashItemClick_fav" -> {
                                                //For Favourite click
                                                Log.e("DFSddddddddDFA",
                                                    adapter.getAllItems()[position].isFavourite!!.toString())

                                                AddtoFavAPI(!(adapter.getAllItems()[position].isFavourite!!),
                                                    adapter.getAllItems()[position]._id.toString(),
                                                    position)
                                            }
                                        }
                                    }

                                } else {
                                    isNodatafound.set(false)
                                    Log.e("ASDASQKHE", "NO Data Found ")


                                    val myType =
                                        object : TypeToken<ArrayList<SelCategory>>() {}.type
                                    val newList: ArrayList<SelCategory> =
                                        Gson().fromJson<ArrayList<SelCategory>>(pref.retrieveFilterResponse(),
                                            myType)

                                    if (newList.size > 0) {
                                        title.set(newList[0].cateName.toString())
                                    }
                                }
                            } else {
                                Log.d("DashBoardResponse->", res.body()?.message.toString())

                                if (showLoader) {
                                    CommonMethods.showToast(context, res.body()?.message.toString())
                                }
                            }
                        } else {
                            Log.d("DashBoardResponse->", res.body()?.message.toString())

                            if (showLoader) {
                                CommonMethods.showToast(context, res.body()?.message.toString())
                            }
                        }
                    } else {
                        Log.d("DashBoardResponse->", res.body()?.message.toString())

                        if (showLoader) {
                            CommonMethods.showToast(context, res.body()?.message.toString())
                        }
                    }


                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("sdsdsd3", message)
//                    CommonMethods.showToast(context, message)
                }

            }
        )
    }

    fun calculateLatLngToMiles() {
        val latLngA =
            LatLng(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble(),
                pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble())
        val latLngB = LatLng(destinationLat.get(), destinationLong.get())
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude

        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude
        distance.set(locationA.distanceTo(locationB).toDouble().toString())
        Log.d("distanceCal", distance.get().toString().split(".")[0])
        Log.d("distanceCalqwer", distanceCal.get().toString())
//        distanceCal.set(distance.get().toString())

        // userMiles.set(distance.get().toString().split(".")[0])


    }

    private fun showFavDetailsDialog(view: View, isfav: Boolean) {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.fav_details_choose_options)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
            /**choose options click(Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptionTitle)?.setOnClickListener {
                dialog?.dismiss()
            }

            /*** Cancel Button Clicks **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvFavDetailsCancel)
                ?.setOnClickListener {
                    dialog?.dismiss()
                }
        }
        dialog?.show()
    }

    override fun click(categoryName: String, position: Int, _id: String?, s: String, color: Int?) {
        dialog!!.dismiss()
        title.set(categoryName)
        Log.e("SDFSDFSdf", categoryName)
        selectedCatId.set(_id!!)
        isRVScroll.set(true)
        selectSpecificCategory(_id)
        //getProfileByCategory("", true,_id!!)
    }

    fun selectSpecificCategory(_id: String) {

        // var manager = (binding!!.rvDashBoard.layoutManager) as GridLayoutManager


        //val currentFirstVisible: Int = manager.findFirstVisibleItemPosition()

        //   if (currentFirstVisible > firstVisibleInListview) Log.i("RecyclerView scrolled: ", "scroll up!") else Log.i("RecyclerView scrolled: ", "scroll down!")

        //       var firstVisibleInListview = (adapter.layoutId).
        // Log.e("gdsmgksgsgsg===",firstVisibleInListview.toString())
        /*    if (adapter.getAllItems().size > 0) {
                title.set(adapter.getAllItems()
                    .get(firstVisibleInListview).category_name.toString())
            }*/

        var selectedPosition = -1
        for (idx in 0 until adapter.getAllItems().size) {
            if (adapter.getAllItems()[idx].c_id == _id) {
                selectedPosition = idx
                break
            }
        }
        Log.e("Selected_Position===", selectedPosition.toString())
        if (selectedPosition != -1) {
            (rvView!!.layoutManager as GridLayoutManager).scrollToPositionWithOffset(
                selectedPosition,
                0)

            /*    if (adapter.getAllItems().size > 0) {
                    title.set(adapter.getAllItems()
                        .get(selectedPosition).category_name.toString())
                }*/
        }
    }

    var profileResponse = MutableLiveData<Boolean>()

    /**call Get Profile Api..**/
    fun getProfile() = viewModelScope.launch {
        val body = JSONObject()
        body.put("Authorization", pref.retrieveKey("token"))
        repository.makeCall(
            apiKey = ApiEnums.GET_PROFILE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileResponseModel> {
                    return retrofitApi.getProfileApi(Authorization = pref.retrieveKey("token")
                        .toString())
                }

                override fun onResponse(res: Response<GetProfileResponseModel>) {

                    val responseData = res.body().toString()
                    Log.e("PIDDd", res.body().toString())


//                    user_id.set(res.body()!!.data.user_id)

//                    Log.e("sadddddw", user_id.get().toString())
//                    firstName.set(res.body()!!.data.first_name.toString() + " " + " " + res.body()!!.data.last_name.toString())

                    dataStoreUtil.saveObject(PROFILE_DATA, res.body())
                    dataStoreUtil.saveData(PROFILE_IMAGE,
                        res.body()?.data?.profile_picture.toString())
//                    storedImageUrl.set(res.body()?.data?.profile_picture)

//                    p_id.set(res.body()?.data?.p_id)


                    if (res.body()?.data?.p_id.isNullOrEmpty()) {
                        status.set("Post a Profile ")
//                        changestatus.set(false)
                    } else {
                        status.set("View Profile ")
//                        postStatus.set(res.body()?.data?.p_id)
//                        changestatus.set(true)

                    }

//                    setpostStatus()
                    // myProfileData()

                    /*   if (pref.retrieveKey("link_share_pid") != null && !(pref.retrieveKey("link_share_pid")
                               .equals(""))
                       ) {
                           profileResponse.value = true
                       }*/

//                    getPostprofile(res.body()!!.data.p_id.toString())
                }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, Constants.SOMETHING_WRONG)
                }
            }
        )
    }


    private fun AddtoFavAPI(
        isfav: Boolean, pIdValue: String,
        position: Int,
    ) {

        Log.e("SADFddddddddddddd==", pIdValue)

        repository.makeCall(
            apiKey = ApiEnums.ADD_TO_FAV,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddFavPostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddFavPostProfileResponse> {
                    return retrofitApi.addtoFav(
                        pref.retrieveKey("token").toString(),
                        pIdValue,
                        isfav
                    )
                }

                override fun onResponse(res: Response<AddFavPostProfileResponse>) {
                    Log.e("QWQQWWSSS", res.body().toString())

                    if (res.isSuccessful || res != null) {
                        if (res.body()!!.status == 200) {
                            dialog?.dismiss()
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                            context.runOnUiThread {
                                var catDataList =
                                    adapter.getAllItems() as ArrayList<ProfileCateData>
                                if (isfav) {
                                    adapter.getAllItems()[position].isFavourite = true
//                                    tvRemoveFav?.text="Remove from Favourites"
                                    // isFav.set(false)
                                    Log.e("check_valueee===", res.body().toString())
                                } else {
                                    adapter.getAllItems()[position].isFavourite = false
                                    //   isFav.set(true)
//                                    tvRemoveFav?.text="Add from Favourites"
                                    Log.e("check_valueee===", res.body().toString())
                                }
                                //  Toast.makeText(context,res.body()!!.message.toString(),Toast.LENGTH_LONG).show()
                                Log.e("ngwkngwngkwngwgg===",
                                    adapter.getAllItems()[position].isFavourite.toString())
                                //   adapter.notifyItemChanged(position)
                                adapter.notifyDataSetChanged()
                            }
                        } else {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }

                }

            }
        )
    }

    fun updateDeviceToken() {

        Log.e("SADFd--dKJEMD==", pref.retrieveFirebaseToken().toString() +  "USER-TOKEN - " +   pref.retrieveKey("token").toString())

        repository.makeCall(
            apiKey = ApiEnums.ADD_TO_FAV,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeviceTokenUpdateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeviceTokenUpdateResponse> {
                    return retrofitApi.deviceTokenUpdate(
                        pref.retrieveKey("token").toString(),
                        pref.retrieveFirebaseToken().toString(),
                        DeviceType
                    )
                }

                override fun onResponse(res: Response<DeviceTokenUpdateResponse>) {
                    Log.e("QWQQWWSSS", res.body().toString())

                    if (res.isSuccessful || res != null) {
                        if (res.body()!!.status == 200) {

                            Log.e("ASDSADWW", res.body()?.message.toString())


                        } else {
                            Log.e("ASDSADWW", res.body()?.message.toString())
                        }
                    }

                }

            }
        )
    }

     fun getPostprofile(p_Id: String) {

        Log.e(
            "POSSSDDD", p_Id + " PID " + pref.retvieLatlong("lati").toFloat() + " LAT  " + pref.retvieLatlong("longi").toFloat() + " LONG "
        )

        repository.makeCall(
            ApiEnums.GET_POST_PROFILE,
            loader = false,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetPostProfileResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetPostProfileResponse> {
                    return retrofitApi.getPostProfile(

                        pref.retrieveKey("token").toString(),
                        p_Id,
                        pref.retvieLatlong("lati").toFloat(),
                        pref.retvieLatlong("longi").toFloat()

                    )
                }

                override fun onResponse(res: Response<GetPostProfileResponse>) {
                    Log.e("AQQAAARESPONEEES", res.body().toString())

                    if (res.isSuccessful){
                        if (res.body()!=null && res.body()!!.status==200){

                            Log.e("QOWWWSQ",res.body().toString())
                            dataStoreUtil.saveObject(POST_PROFILE_DATA, res.body())

                        }
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("zxczxczxc", message)

                }

            }

        )
    }

}


