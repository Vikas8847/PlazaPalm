package com.example.plazapalm.views.myprofile.calendar

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
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.CalenderData
import com.example.plazapalm.models.DeleteBookingResponse
import com.example.plazapalm.models.GetCalanderResponseModel
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
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
    val year = ObservableInt()
    val click = ObservableBoolean(false)
    val SeletedDate = MutableLiveData<List<String?>?>()
    var calendarList = ArrayList<Calendar>()
    val isBookingStatus = ObservableBoolean(false)

    init {
        calendarBookingList
        adapterCalendar.addItems(calendarBookingList)
        adapterCalendar.notifyDataSetChanged()

        adapterCalendar.setOnItemClick { view, _, type ->
            when (type) {
                Constants.calendarBookingToChat -> {
                    //navigate to Booking Details Fragment...
                    view.navigateWithId(R.id.action_calendarFragment_to_chatFragment)
                }

                Constants.calendarBookingDetails -> {
                    //navigate to Booking Details Fragment...
                    view.navigateWithId(R.id.action_calendarFragment_to_bookingDetailsFragment)

                }

            }
        }
    }

    fun deleteBooking() = viewModelScope.launch {
        repository.makeCall(ApiEnums.GETPROFILE_BYCATE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeleteBookingResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeleteBookingResponse> {
                    return retrofitApi.deleteBooking(pref.retrieveKey("token").toString(), booking_id = booking_id.get().toString())
                }
                override fun onResponse(res: Response<DeleteBookingResponse>) {
                    Log.e("ZSSSS", res.body().toString())
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            Log.e("RESSS=====Done", res.body().toString())
                        }
                        else
                        {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    }
                    else
                    {
                        CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                    }
                }
                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, message)
                }
            })
    }

    var calendarMutableResponse = MutableLiveData<ArrayList<Calendar>>()
    fun getCalanderDataMonthWise(month: Int, year: Int) {
        repository.makeCall(ApiEnums.GET_PREMIUM_STATUS, loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetCalanderResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetCalanderResponseModel> {
                    return retrofitApi.getCalendarBookingDateMonthWiseForBoth(
                        pref.retrieveKey("token").toString(), month, year, p_Id.get().toString()
                    )
                }
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
                            }
                            calendarMutableResponse.value = calendarList

                            calendarBookingList = res.body()!!.data as ArrayList<CalenderData> /* = java.util.ArrayList<com.example.plazapalm.models.CalenderData> */
                            adapterCalendar.addItems(calendarBookingList)
                            adapterCalendar.notifyDataSetChanged()
                            if (res.body()!!.data.isEmpty()) {
                                booking_id.set("")
                            } else {
                                booking_id.set(res.body()!!.data[0]?._id.toString())
                            }
                            adapterCalendar.setOnItemClick { view, postion, type ->

                                when (type) {
                                    "calendarBookingToChat" -> {
                                        view.navigateWithId(R.id.action_calendarFragment_to_chatFragment)
                                    }

                                    "calendarBookingDetails" -> {
                                        //navigate to Booking Details Fragment...
                                        val bundle = Bundle()
                                        bundle.putString("calendarScreen", "CalendarFrag")
                                        bundle.putSerializable("userData", calendarBookingList)
                                        bundle.putInt("position", postion)

                                        view.navigateWithId(
                                            R.id.action_calendarFragment_to_bookingDetailsFragment,
                                            bundle
                                        )

                                    }

                                    "deleteConfirmBooking" -> {
                                        /** Delete Booking */

                                        deleteBooking()
                                    }
                                }
                            }
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.message())
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, message)
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