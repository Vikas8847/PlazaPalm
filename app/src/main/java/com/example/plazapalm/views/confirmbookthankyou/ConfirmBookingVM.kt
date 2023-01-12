package com.example.plazapalm.views.confirmbookthankyou

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.CONFIRM_BOOKING_PROFILE
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.AddToCalendarResponseModel
import com.example.plazapalm.models.ConfirmBookingProfileResponse
import com.example.plazapalm.models.QuestionAnswer
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import java.util.*
import javax.inject.Inject

@HiltViewModel
class ConfirmBookingVM @Inject constructor(
    var repository: Repository,
    var preferenceFile: PreferenceFile ,
    var dataStoreUtil: DataStoreUtil
) : ViewModel() {


    @SuppressLint("StaticFieldLeak")
    private var timePicker: TimePickerDialog? = null

    var p_id = ObservableField("")
    var user_Name = ObservableField("")
    var commingFrom = ObservableField("")
    var user_location = ObservableField("")
    var user_miles = ObservableField("25 Miles")
    var user_image = ObservableField("")
    var bookingId = ObservableField("")
    var postProfileId = ObservableField("6226fde44442aea32a70d4d8")
    var chooseDate = ObservableField("")
    var chooseTime = ObservableField("")
    var description = ObservableField("")
    var categoryName = ObservableField("")
    var title = ObservableField("Confirm Booking")
    var addtoCalendar = ObservableField("Book")
    var questionAnswer = ArrayList<QuestionAnswer>()

    fun onClicks(view: View) {
        when (view.id) {
            R.id.clMainConfirmBooking -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.ivConfirmDetailsBackBtn -> {
                view.findNavController().navigateUp()
            }
            R.id.ivBookingDetailsChat -> {
                view.navigateWithId(R.id.action_confirmBookingFragment_to_chatFragment)
            }
            R.id.etConfirmBookDate -> {
                //open calendar picker alert..
                selectDate(chooseDate)
            }

            R.id.etConfirmBookTime -> {
                openTimePicker()
            }

            R.id.btnConfirmBook -> {
                if (!CommonMethods.context.isNetworkAvailable()) {
                    CommonMethods.showToast(CommonMethods.context, Constants.CHECK_INTERNET)
                } else {
                    if (validateFields()) {
                        if (commingFrom.get().equals("confirmBook")) {
                            confirmBooking(view)
                        } else if (commingFrom.get().equals("addToCalander")) {
                            addToCalendar(view)

                        }
                    }
                }
            }
        }
    }

    private fun confirmBooking(view: View) = viewModelScope.launch {

        repository.makeCall(ApiEnums.CONFIRM_BOOKING,
            loader = true, saveInCache = false, getFromCache = false,
            object : ApiProcessor<Response<ConfirmBookingProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<ConfirmBookingProfileResponse> {
                    return retrofitApi.conBookProfileSave(
                        preferenceFile.retrieveKey("token").toString(),
                        post_profile_id = p_id.get().toString(),
                        chooseDate.get().toString(),
                        chooseTime.get().toString(),
                        description.get().toString(),
                        categoryName.get().toString(),
                        questionAnswer
                    )
                }

                override fun onResponse(res: Response<ConfirmBookingProfileResponse>) {
                    Log.e("CONFIRMBOOKING", res.body().toString() + "RESS")

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {

                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                            dataStoreUtil.saveObject(CONFIRM_BOOKING_PROFILE, res.body())

                            view.navigateWithId(R.id.thankYouFragment)

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
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

    private fun openTimePicker() {
        val mcurrentTime = Calendar.getInstance()
        val hour = mcurrentTime[Calendar.HOUR_OF_DAY]
        val minute = mcurrentTime[Calendar.MINUTE]
        val mTimePicker = TimePickerDialog(
            CommonMethods.context,
            R.style.TimePickerTheme, { _, hourOfDay, minute ->
                var hour = hourOfDay
                var AM_PM = ""
                if (hourOfDay < 12) {
                    AM_PM = "AM"
                } else {
                    AM_PM = "PM"
                    hour -= 12
                }
                mcurrentTime.set(Calendar.HOUR_OF_DAY, hourOfDay)
                mcurrentTime.set(Calendar.MINUTE, minute + 1)
                if (minute < 10) {
                    chooseTime.set("$hour:0$minute $AM_PM")
                } else {
                    chooseTime.set("$hour:$minute $AM_PM")
                }
            }, hour, minute, false
        ) //Yes 12 hour time
        mTimePicker.setTitle("Select Time")
        mTimePicker.show()
    }

    private fun selectDate(observableField: ObservableField<String>) {
        val calender: Calendar = Calendar.getInstance()
        val datePicker = DatePickerDialog(
            CommonMethods.context,
            R.style.DatePickerDialogTheme, { view, year, month, dayOfMonth ->
                calender.set(Calendar.YEAR, year)
                calender.set(Calendar.MONTH, month)
                calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                observableField.set("$year-${month + 1}-$dayOfMonth")
            },
            calender.get(Calendar.YEAR), calender.get(Calendar.MONTH),
            calender.get(Calendar.DAY_OF_MONTH)
        )
        //datePicker.datePicker.maxDate = System.currentTimeMillis()
        datePicker.show()
    }

    private fun validateFields(): Boolean {

        when {
            chooseDate.get()?.trim().isNullOrEmpty() -> {
                CommonMethods.showToast(CommonMethods.context, "Please select date")
                return false
            }
            chooseTime.get()?.trim().isNullOrEmpty() -> {
                CommonMethods.showToast(CommonMethods.context, "Please choose time")
                return false
            }
            description.get()?.trim().isNullOrEmpty() -> {
                CommonMethods.showToast(CommonMethods.context, "Please enter description")
                return false
            }
            else -> {
                return true
            }
        }

    }

    /*Add to Calendar Api ...*/
    private fun addToCalendar(view: View) = viewModelScope.launch {
        val body = JSONObject()
        body.put("category_name", categoryName.get())
        body.put("choose_date", chooseDate.get())
        body.put("post_profile_id", postProfileId.get())
        body.put("choose_time", chooseTime.get())
        body.put("description", description.get())
        body.put("question_answer", questionAnswer)

        repository.makeCall(ApiEnums.ADD_TO_CALENDAR,
            true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddToCalendarResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddToCalendarResponseModel> {
                    return retrofitApi.addToCalendarBooking(
                        Authorization = preferenceFile.retrieveKey("token")!!,
                        Category_Name = categoryName.get()!!,
                        Choose_Date = chooseDate.get()!!,
                        Post_Profile_Id = postProfileId.get()!!,
                        Choose_Time = chooseTime.get()!!,
                        Description = description.get()!!,
                        Question_Answer = questionAnswer
                    )


                }

                override fun onResponse(res: Response<AddToCalendarResponseModel>) {
                    Log.e("BOOKING----RESSS", res.body().toString())

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()?.status == 200) {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                            view.navigateBack()

//                            view.navigateWithId(R.id.bookingDetailsFragment)

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }

                    } else {

                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }
            })
    }

    private fun removeFromCalendar(view: View) = viewModelScope.launch {
        val body = JSONObject()
        body.put("booking_id", bookingId.get())
        repository.makeCall(
            ApiEnums.REMOVE_FROM_CALENDAR,
            true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddToCalendarResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddToCalendarResponseModel> {
                    return retrofitApi.deleteFromCalendar(
                        Authorization = preferenceFile.retrieveKey("token")!!,
                        bookingId.get().toString()
                    )
                }

                override fun onResponse(res: Response<AddToCalendarResponseModel>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()?.status == 200) {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()!!.message.toString()
                            )
                        }
                    }
                }
            }
        )
    }
}