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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
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
    var pref: PreferenceFile
) : ViewModel(), clickItem {
    private var _id: String? = null
    var calulatedDistance = ObservableField("")
//    var destinationLong: Double? = null
//    var destinationLat: Double? = null
    var destinationLat =ObservableDouble()
    var destinationLong =ObservableDouble()

    @SuppressLint("StaticFieldLeak")
    var recyclerSelectedEvents: RecyclerView? = null
    var idList = ArrayList<String>()
    var nameList = ArrayList<String>()
    var token = ObservableField("")
    var status = ObservableField("")
    var searchItems = ObservableField("")
    var lati = ObservableDouble()
    var longi = ObservableDouble()
    var userMiles = ObservableField("25 miles")
    var isDataVisible = ObservableBoolean(false)
    var distanceCal = ObservableField("")
    var isClicked: ObservableBoolean = ObservableBoolean(false)
    val distance = ObservableField("")
    var idCategoriesData = ObservableArrayList<CategoriesData>()
    val adapter by lazy { RecyclerAdapter<ProfileCateData>(R.layout.dash_board_items) }

    var selectedCategoriesList = ArrayList<SelectedDataModelList>()
    var selectedCategoriesLists = ArrayList<SelectedDataModelList>()
    val dashSelectedAdapter by lazy { RecyclerAdapter<SelectedDataModelList>(R.layout.dash_board_events_items) }
    val list_Name by lazy { stringPreferencesKey("idsList") }
    val list_CateName by lazy { stringPreferencesKey("idsList") }
    var dialog: Dialog? = null

    init {

        /*** 03-01-23
         *  Set Cate. Id and send API.. */

        dataStoreUtil.readData(list_Name) {
            if (it != null) {
                idList.addAll(arrayListOf(it))
            }
            Log.e("dads", idList.toString())
            Log.e("asdas", it.toString())

        }

        /*** 03-01-23
         *  Set Miles and send API.. */

        if (pref.retvieMiles()!=null && !(pref.retvieMiles().equals(""))){

            var miles = pref.retvieMiles()
            userMiles.set(miles.toString())

        }else{
            userMiles.set("25")
        }

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
                getProfileByCategory(editable.toString(), false)
            }, 1000)
        } else {
            Handler().postDelayed({
                getProfileByCategory("a", false)
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }

    fun onClicks(view: View) {
        when (view.id) {

            R.id.clMainDashBoard -> {
                context.hideKeyboard()
            }

            R.id.ivDashBoardSelectedList -> {

                isClicked.set(true)
                if (isClicked.get()) {

                    showSelectedCatAlert()
                    isClicked.set(false)
                } else {
                    isClicked.set(true)
                }
                Log.e("ASDFASDFSFSDf", "status.get().toString()")

            }
            R.id.ivDashBoardFilter -> {
                view.navigateWithId(R.id.action_dashBoardFragment_to_filterFragment)
            }
        }
    }

    init {
        Log.e("ASDFASDFSFSDf", status.get().toString())
        // getProfileByCategory()
        token.set(pref.retrieveKey("token"))
        //Get data from shared preference..

        adapter.setOnItemClick { view, _, type ->
            when (type) {
                "dashItemClick" -> {
                    val isDashBoard = Bundle()
                    isDashBoard.putString("comingFrom", "isDashBoard")
                    view.navigateWithId(
                        R.id.action_dashBoardFragment_to_favDetailsFragment,
                        isDashBoard
                    )
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun showSelectedCatAlert() {

        dialog = Dialog(context)
        val window = dialog!!.getWindow()
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.getWindow()!!.getAttributes().gravity = Gravity.LEFT or Gravity.TOP
        window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

        dialog!!.setContentView(R.layout.dash_board_events_items)

        Log.e("SADAA",selectedCategoriesList.toString())

        recyclerSelectedEvents = dialog!!.findViewById(R.id.rvDashBoardSelectedEvents)
        recyclerSelectedEvents?.layoutManager = LinearLayoutManager(context)
        recyclerSelectedEvents?.adapter = DashboardItemsAdapter(CommonMethods.context, selectedCategoriesList, this)


//        dashSelectedAdapter.addItems(selectedCategoriesList as ArrayList<SelectedDataModel>)
        recyclerSelectedEvents?.adapter?.notifyDataSetChanged()
        dialog?.setCancelable(true)

        if (!context.isFinishing) {
            dialog?.show()
        }

        /// localStorage....

    }

    fun getProfileByCategory(search: String, showLoader: Boolean) {

        val body = JSONObject()
        body.put("c_id", idList)
        body.put("offset", 1)
        body.put("lat", lati.get())
        body.put("lng", longi.get())
        body.put("search", search)


//                idList.add("61d3f7356441e05580a169a7")
//                idList.add("61d3f7e26441e05580a17e98")
//                idList.add("61dfff4a5fc0f8aff4cf2a78")
//                idList.add("61d3f87d6441e05580a191d5")



        Log.e("SDAMILES" , userMiles.get().toString() +" LATI "+ pref.retvieLatlong("lati").toDouble()
                +" LONG "+ pref.retvieLatlong("longi").toDouble() + "" +idList.toString()
        )

        repository.makeCall(
            ApiEnums.GETPROFILE_BYCATE,
            loader = showLoader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileCateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileCateResponse> {
                    return retrofitApi.getProfileByCategory(
                        token.get().toString(),
                        idList,
                        1,
                        500,
                        pref.retvieLatlong("lati").toDouble(),
                        pref.retvieLatlong("longi").toDouble(),
                        search,
                        userMiles.get().toString()
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetProfileCateResponse>) {

                    Log.d("WORKINGG->>>>>---  ", res.body()!!.data.toString() + "DDDDDDDDS")

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.body()!!.status == 200) {

                                adapter.addItems(res.body()?.data!!)
                                adapter.notifyDataSetChanged()
                                Log.d("DashBoardResponse->", res.body()!!.data.toString())

                                for(i in 0 until res.body()!!.data.size){
                                    destinationLat.set(adapter.getAllItems()[i].lat!!)
                                    destinationLong.set(adapter.getAllItems()[i].long!!)
                                }

                                Log.e("SDSDS",destinationLat.get().toString() + "kjljlj;"+ destinationLong.get().toString())
                                Log.d("adasWS", pref.retvieLatlong("lati").toDouble().toString()+"sdfdf"+ pref.retvieLatlong("longi").toDouble().toString() )

                                calculateLatLngToMiles()
                               // distanceCal.set(distance.get().toString().split(".")[0])


                                Log.d("viaksdistance",distance.get().toString().split(".")[0])
                                adapter.setOnItemClick { view, position, type ->

                                    when (type) {
                                        "dashItemClick" -> {

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
                                                R.id.action_dashBoardFragment_to_favDetailsFragment, isDashBoard )

                                            Log.d("DashBoardResponse->", "Workingggg-----fine--")

                                        }

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
        val latLngA = LatLng(pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble() ,)
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

        userMiles.set( distance.get().toString().split(".")[0])


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
    }
    /**call Get Profile Api..**/
    fun getProfile() = viewModelScope.launch {
        val body = JSONObject()
        body.put("Authorization", token.get())
        repository.makeCall(
            apiKey = ApiEnums.GET_PROFILE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileResponseModel> {
                    return retrofitApi.getProfileApi(Authorization = token.get().toString())
                }

                override fun onResponse(res: Response<GetProfileResponseModel>) {

                    val responseData = res.body()

//                    user_id.set(res.body()!!.data.user_id)

//                    Log.e("sadddddw", user_id.get().toString())
//                    firstName.set(res.body()!!.data.first_name.toString() + " " + " " + res.body()!!.data.last_name.toString())

                    dataStoreUtil.saveObject(PROFILE_DATA, res.body())
                    dataStoreUtil.saveData(PROFILE_IMAGE, res.body()?.data?.profile_picture.toString())
//                    storedImageUrl.set(res.body()?.data?.profile_picture)

//                    p_id.set(res.body()?.data?.p_id)

                    Log.e("QWQWQWQW", responseData.toString())

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

                }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, Constants.SOMETHING_WRONG)
                }
            }
        )
    }
}


