package com.example.plazapalm.views.confirmbookthankyou

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.chat.ChatActivity
import com.example.plazapalm.datastore.CONFIRM_BOOKING_PROFILE
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.*
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
    var preferenceFile: PreferenceFile,
    var dataStoreUtil: DataStoreUtil,

    ) : ViewModel() {

    @SuppressLint("StaticFieldLeak")
    private var timePicker: TimePickerDialog? = null

//    @Inject
//    lateinit var adapter: RequireDataBookAdapter

    var adapter: RequireDataBookAdapter? = null

    var p_id = ObservableField("")
    var user_Name = ObservableField("")
    var userIdForChat = ObservableField("")
    var commingFrom = ObservableField("")
    var user_location = ObservableField("")
    var user_miles = ObservableField("25 Miles")
    var user_image = ObservableField("")
    var bookingId = ObservableField("")
    var postProfileId = ObservableField("")

    var chooseDate = ObservableField("")
    var chooseTime = ObservableField("")
    var description = ObservableField("")
    var categoryName = ObservableField("")
    var title = ObservableField("Confirm Booking")
    var addtoCalendar = ObservableField("Book")
    var questionAnswer = ArrayList<QuestionAnswer>()
    var isConfiirm = ObservableBoolean(false)
    var counter = 0


    fun onClicks(view: View) {
        when (view.id) {
            R.id.clMainConfirmBooking -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.ivConfirmDetailsBackBtn -> {
                view.findNavController().navigateUp()
            }
            R.id.ivBookingDetailsChat -> {

                var intent = Intent(CommonMethods.context, ChatActivity::class.java)
                intent.putExtra("CommingFrom", "ConfirmBooking")
                intent.putExtra("user_Id", userIdForChat.get().toString())
                intent.putExtra("user_name", user_Name.get().toString())
                intent.putExtra("userImage", user_image.get().toString())
                CommonMethods.context.startActivity(intent)

                //For Fragment
                /*val chatData = Bundle()
                chatData.putString("CommingFrom","ConfirmBooking")
                chatData.putString("user_Id",userIdForChat.get().toString())
                chatData.putString("user_name", user_Name.get().toString())
                chatData.putString("userImage", user_image.get().toString())
                view.navigateWithId(R.id.action_confirmBookingFragment_to_chatFragment,chatData)*/

                Log.e("asfasfaa",
                    userIdForChat.get().toString() + "VCVX" + user_Name.get()
                        .toString() + " VVC " + user_image + "ZXZz ")

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
                            isConfiirm.set(true)
                            confirmBooking(view)
                        } else if (commingFrom.get().equals("addToCalander")) {
                            addToCalendar(view)
                            isConfiirm.set(false)
                        }
                    }
                }
            }
        }
    }

    private fun confirmBooking(view: View) = viewModelScope.launch {

        Log.e(
            "allData -> + 1 ",
            preferenceFile.retrieveKey("token").toString() + " --V--" +
                    p_id.get().toString() + " --V--" +
                    chooseDate.get().toString() + " --V--" +
                    chooseTime.get().toString() + " --V--" +
                    description.get().toString() + " --V--" +
                    categoryName.get().toString() + " --V--" +
                    adapter!!.dataList + "RESS"

        )


        var questionListarray = ArrayList<QuestionAnswer11>()
        questionListarray.clear()
        for (idx in 0 until adapter!!.dataList.size) {
            questionListarray.add(
                QuestionAnswer11(
                    adapter!!.dataList[idx].save_ans!!,
                    adapter!!.dataList[idx]._id!!,
                    adapter!!.dataList[idx].question_text!!
                )
            )
        }

        var request = RequestBookProfile(
            categoryName.get().toString(),
            chooseDate.get().toString(),
            chooseTime.get().toString(),
            description.get().toString(),
            p_id.get().toString(),
            questionListarray
        )

        Log.e("SDSAXZXz", questionListarray.toString())

        repository.makeCall(ApiEnums.CONFIRM_BOOKING,
            loader = true, saveInCache = false, getFromCache = false,
            object : ApiProcessor<Response<ConfirmBookingProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<ConfirmBookingProfileResponse> {
                    return retrofitApi.conBookProfileSave(
                        preferenceFile.retrieveKey("token").toString(),
                        request

                        /*    post_profile_id = p_id.get().toString(),
                            chooseDate.get().toString(),
                            chooseTime.get().toString(),
                            description.get().toString(),
                            categoryName.get().toString(),
                            newQuestionList*/
                    )
                }

                override fun onResponse(res: Response<ConfirmBookingProfileResponse>) {

                    Log.e("jkhslkASDKSAD", res.body().toString() + "RESS")

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
                    Log.e("DFSFSD", message)
                }

            })

    }

    private fun openTimePicker() {
        val mcurrentTime = Calendar.getInstance()
        var hour = 0
        var minute = 0
        if (chooseTime.get().toString() == "") {
            hour = mcurrentTime[Calendar.HOUR_OF_DAY]
            minute = mcurrentTime[Calendar.MINUTE]
        } else {
            var afterSplitSpace = chooseTime.get().toString().split(" ")
            if (afterSplitSpace[1].toString() == "AM" || afterSplitSpace[1].toString() == "am") {
                hour = afterSplitSpace[0].toString().split(":")[0].toInt()
                minute = afterSplitSpace[0].toString().split(":")[1].toInt()
            } else {
                hour = afterSplitSpace[0].toString().split(":")[0].toInt()
                hour += 12
                minute = afterSplitSpace[0].toString().split(":")[1].toInt()
            }
        }

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
                Log.e("time =+1", chooseTime.get().toString())

            }, hour, minute, false
        ) //Yes 12 hour time


        mTimePicker.setTitle("Select Time")
        mTimePicker.show()

    }

    private fun selectDate(observableField: ObservableField<String>) {
        val calender: Calendar = Calendar.getInstance()

        var year = 0
        var month = 0
        var day = 0
        if (observableField.get().toString() == "") {
            year = calender.get(Calendar.YEAR)
            month = calender.get(Calendar.MONTH)
            day = calender.get(Calendar.DAY_OF_MONTH)
        } else {
            var splitArray = observableField.get().toString().split("-")
            year = splitArray[0].toInt()
            month = splitArray[1].toInt() - 1
            day = splitArray[2].toInt()
        }

        val datePicker = DatePickerDialog(
            CommonMethods.context,
            R.style.DatePickerDialogTheme, { view, year, month, dayOfMonth ->

                var monthofYear = 0
                if (month < 10) {
                    monthofYear = month + 1
                    calender.set(Calendar.YEAR, year)
                    calender.set(Calendar.MONTH, monthofYear)
                    calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    observableField.set("$year-${"0" + monthofYear}-$dayOfMonth")
                    chooseDate.set("$year-${"0" + monthofYear}-${"0"+dayOfMonth}")
                } else {
                    monthofYear = month + 1
                    calender.set(Calendar.YEAR, year)
                    calender.set(Calendar.MONTH, monthofYear)
                    calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    observableField.set("$year-${monthofYear}-$dayOfMonth")
                    chooseDate.set("$year-${monthofYear}-$dayOfMonth")

                }

//                calender.set(Calendar.YEAR, year)
//                calender.set(Calendar.MONTH, monthofYear)
//                calender.set(Calendar.DAY_OF_MONTH, dayOfMonth)
//                observableField.set("$year-${monthofYear + 1}-$dayOfMonth")

            },
            year, month, day

        )
        Log.e("apoiqw", observableField.get().toString())




        datePicker.datePicker.minDate = System.currentTimeMillis() - 1000

        //datePicker.datePicker.maxDate = System.currentTimeMillis()
        datePicker.show()

    }

    private fun validateFields(): Boolean {
        counter = 0
        var textValue = ""
        if ((adapter?.dataList?.isNotEmpty() == true)) {
            Log.e("SASASww2", adapter!!.dataList.toString())
            if (adapter!!.dataList.size > 0) {
                for (i in 0 until adapter!!.dataList.size) {
                    if (adapter!!.dataList[i].save_ans != "") {
                        counter++
                        textValue = textValue + ",  " + adapter!!.dataList[i].save_ans
                    }
                }
            }

        } else {
            adapter?.dataList?.toString()?.let { Log.e("SASASww1", it) }
        }

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

            adapter?.dataList?.size != counter -> {
                if (commingFrom.get().equals("confirmBook")) {
                    CommonMethods.showToast(CommonMethods.context, "Answer is Mandatory")
                } else if (commingFrom.get().equals("addToCalander")) {
                    return true
                }
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

        Log.e("CHOOSE-- ",
            chooseDate.get().toString() +
                    categoryName.get() + " " +
                    chooseDate.get() + " " +
                    postProfileId.get() + " " +
                    chooseTime.get() + " " +
                    description.get() + " " +
                    description.get() + " " +
                    questionAnswer
        )

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

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }

                    } else {

                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }
            })
    }

}