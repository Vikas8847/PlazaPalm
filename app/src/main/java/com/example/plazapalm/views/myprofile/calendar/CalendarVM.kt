package com.example.plazapalm.views.myprofile.calendar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.chat.ChatActivity
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.CalenderData
import com.example.plazapalm.models.DeleteBookingResponse
import com.example.plazapalm.models.GetCalanderResponseModel
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants.calendarBookingDetails
import com.example.plazapalm.utils.Constants.calendarBookingToChat
import com.example.plazapalm.utils.Constants.deleteConfirmBooking
import com.example.plazapalm.utils.navigateWithId
import com.google.gson.JsonObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CalendarVM @Inject constructor(
    private var repository: Repository,
    private var pref: PreferenceFile,
    private var dataStore: DataStoreUtil
) : ViewModel() {
    var calendars4: Calendar? = null
    var calendarBookingList = ArrayList<CalenderData>()
    val adapterCalendar by lazy { RecyclerAdapter<CalenderData>(R.layout.calendar_list_item) }
    val p_Id = ObservableField("")
    val booking_id = ObservableField("")
    val month = ObservableInt()
    val selectMonth = ObservableInt()
    val year = ObservableInt()
    val click = ObservableBoolean(false)
    val SeletedDate = MutableLiveData<List<String?>?>()
    var calendarList = ArrayList<Calendar>()
    var isBookingStatus = ObservableBoolean()
    val isBookStatus = MutableLiveData<Boolean>()

    init {

        adapterCalendar.addItems(calendarBookingList)
        adapterCalendar.notifyDataSetChanged()

        adapterCalendar.setOnItemClick { view, position, type ->
            when (type) {
                calendarBookingToChat -> {

                    Log.e(
                        "asfasfaa",
                        adapterCalendar.getAllItems()
                            .get(position).post_profile_user_id.toString() + "VCVX" +
                                adapterCalendar.getAllItems()
                                    .get(position).postProfile_first_name.toString() +
                                adapterCalendar.getAllItems()
                                    .get(position).postProfile_last_name.toString() + " VVC "
                    )
                    var userImage = ""

                    if (!adapterCalendar.getAllItems()
                            .get(position).postProfile_picture.isNullOrEmpty()
                    ) {
                        userImage = adapterCalendar.getAllItems()
                            .get(position).postProfile_picture[0].toString()
                    }else{
                        userImage = IMAGE_LOAD_URL+ R.drawable.placeholder
                    }

                    var intent = Intent(CommonMethods.context, ChatActivity::class.java)
                    intent.putExtra("CommingFrom", "CalendarScreen")
                    intent.putExtra("user_Id", adapterCalendar.getAllItems().get(position).post_profile_user_id.toString())
                    intent.putExtra("user_name", adapterCalendar.getAllItems().get(position).postProfile_first_name.toString() + " " + adapterCalendar.getAllItems().get(position).postProfile_last_name.toString())
                    intent.putExtra("userImage", userImage)
                    CommonMethods.context.startActivity(intent)

                   /* val chatData = Bundle()
                    chatData.putString("CommingFrom", "CalendarScreen")
                    chatData.putString("user_Id", adapterCalendar.getAllItems().get(position).post_profile_user_id.toString())
                    chatData.putString("user_name", adapterCalendar.getAllItems().get(position).postProfile_first_name.toString() + " " + adapterCalendar.getAllItems().get(position).postProfile_last_name.toString())
                    chatData.putString("userImage", userImage)
                    view.navigateWithId(R.id.action_calendarFragment_to_chatFragment, chatData)*/

                }

                calendarBookingDetails -> {
                    //navigate to Booking Details Fragment...

                    val bundle = Bundle()
                    bundle.putString("calendarScreen", "CalendarFrag")
                    bundle.putSerializable("userData", calendarBookingList)
                    bundle.putInt("position", position)

                    view.navigateWithId(
                        R.id.action_calendarFragment_to_bookingDetailsFragment,
                        bundle
                    )

                }
                deleteConfirmBooking ->{

                    deleteBooking(position)
                }

            }
        }
    }

    fun deleteBooking(position: Int) = viewModelScope.launch {

        Log.e(
            "CXVDD",
            pref.retrieveKey("token").toString() + "XXXZXZ " +

                   adapterCalendar.getAllItems()[position]._id
        )
        val bookingID = adapterCalendar.getAllItems()[position]._id

        val jsonobject = JsonObject()
        jsonobject.addProperty("booking_id",bookingID)

        repository.makeCall(ApiEnums.GETPROFILE_BYCATE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeleteBookingResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeleteBookingResponse> {
                    return retrofitApi.deleteBooking(
                        pref.retrieveKey("token").toString(),
                        jsonobject
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<DeleteBookingResponse>) {
                    Log.e("ZSSSS", res.body().toString())
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            Log.e("RESSS=====Done", res.body().toString())

                            adapterCalendar.getAllItems().removeAt(position)
                            adapterCalendar.notifyDataSetChanged()

                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                        } else {

                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("SZXCXC",message)

//                    CommonMethods.showToast(CommonMethods.context, message)
                }
            })
    }

    var calendarMutableResponse = MutableLiveData<ArrayList<Calendar>>()

    fun getCalanderDataMonthWise(month: Int, year: Int) {

        Log.e("PFDXCXs",  pref.retrieveKey("token").toString() +" v " + p_Id.get().toString()+"  -- " +selectMonth.get()!!.toString()+ "  -  "+year.toString())

        repository.makeCall(ApiEnums.GET_PREMIUM_STATUS, loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetCalanderResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetCalanderResponseModel> {
                    return retrofitApi.getCalendarBookingDateMonthWiseForBoth(
                        pref.retrieveKey("token").toString(), selectMonth.get()!!.toInt(), year, p_Id.get().toString()
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetCalanderResponseModel>) {
                    Log.e("CHECKQASWEA", res.body().toString())
                    if (res.isSuccessful && res.code() == 200) {

                        if (res.body()?.data != null) {

                            for (i in 0 until res.body()!!.data.size) {
                                SeletedDate.value = listOf(res.body()!!.data[i]!!.choose_date)

                            }

                            for (i in 0 until res.body()!!.data.size) {

                                calendars4 = Calendar.getInstance()
                                // SeletedDate.value = listOf(res.body()!!.data[i]!!.choose_date)
                                val day = res.body()!!.data[i]?.choose_date
                                val split = day!!.split("-")
                                val year = split[0]
                                val month = split[1].toInt() - 1
                                val daY = split[2]

                                val split2 = daY.split("T")
                                val fDay = split2[0]

                                calendars4!!.set(year.toInt(), month, fDay.toInt())

                                Log.e("FQWQWQQQ1", "$year C ")
                                Log.e("FQWQWQQQ2", "$month  F ")
                                Log.e("FQWQWQQQ3", "$fDay  B ")
                                calendarList.add(calendars4!!)

                                Log.e("bookinggIDD -- ",res.body()!!.data[i]?._id.toString())
                            }

                            calendarMutableResponse.value = calendarList

                            calendarBookingList = res.body()!!.data as ArrayList<CalenderData> /* = java.util.ArrayList<com.example.plazapalm.models.CalenderData> */
                            adapterCalendar.addItems(calendarBookingList)
                            adapterCalendar.notifyDataSetChanged()

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.message())
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("ZXCdiouqwe",message)
//                    CommonMethods.showToast(CommonMethods.context, message)
                }
            })
    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivCalendarBackBtn -> {
                view.findNavController().navigateUp()
            }
        }
    }

}