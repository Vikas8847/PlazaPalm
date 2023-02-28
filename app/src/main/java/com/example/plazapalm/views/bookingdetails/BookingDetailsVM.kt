package com.example.plazapalm.views.bookingdetails

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.AddToCalendarResponseModel
import com.example.plazapalm.models.BookingDataForCustomer
import com.example.plazapalm.models.BookingStatusInputResponse
import com.example.plazapalm.models.QuestionAnswerForBook
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.utils.navigateWithId
import com.google.gson.JsonObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class BookingDetailsVM @Inject constructor(
    private var repository: Repository,
    private var dataStoreUtil: DataStoreUtil,
    private var preferenceFile: PreferenceFile,

    ) : ViewModel() {
    var userFName = ObservableField("")
    var userIdForChat = ObservableField("")
    var userFLName = ObservableField("")
    var usercustomerId = ObservableField("")
    var userLName = ObservableField("")
    var userPostProfileId = ObservableField("")
    var userType = ObservableField("")
    var categaryName = ObservableField("")
    var imageUrl = ObservableField("")
    var description = ObservableField("")
    var time = ObservableField("")
    var location = ObservableField("")
    var date = ObservableField("")
    var bookingStatus = ObservableField("")
    var bookingStatusCan = ObservableField("")
    var booking_id = ObservableField("")
    var btnText = ObservableField("")


    fun onClicks(view: View) {
        when (view.id) {

            R.id.ivBookingDetailsBack -> {
                view.navigateBack()
   //             view.findNavController().navigateUp()

            }

            R.id.btnBookingDetailsCancel -> {

                if (btnText.get()?.trim().equals("Cancel Booking")) {
                    getBookingStatus("cancelled")

                } else if (btnText.get()?.trim().equals("Delete Reminder")) {
                    removeFromCalendar(view)
                }
            }

            R.id.btnBookingDetailsAccept -> {
                if (!(bookingStatusCan.get().equals("accepted"))) {
                    getBookingStatus("accepted")
                }
            }

            R.id.btnBookingDetailsDecline -> {
                if (!(bookingStatusCan.get().equals("declined"))) {
                    getBookingStatus("declined")
                }
            }

            R.id.ivFavDetailsOptions -> {
                /** Here Navigate to Chat Screen...*/

                Log.e(
                    "asfasfaa",
                    userIdForChat.get().toString() + "VCVX" +
                            userFLName.get().toString() +
                            imageUrl.get().toString() + " VVC "
                )

                var userImage = ""
                if (!imageUrl.get().toString().isNullOrEmpty()) {
                    userImage = imageUrl.get().toString()
                } else {
                    userImage = IMAGE_LOAD_URL + R.drawable.placeholder
                }

                val chatData = Bundle()
                chatData.putString("CommingFrom", "CalendarScreen")
                chatData.putString("user_Id", userIdForChat.get().toString())
                chatData.putString("user_name", userFLName.get().toString())
                chatData.putString("userImage", userImage)

                view.navigateWithId(R.id.action_bookingDetailsFragment_to_chatFragment, chatData)

            }

            R.id.tvBookingDetailViewProfile -> {
                /** Here Navigate View profile Screen....*/
                val bundle = Bundle()
                bundle.putString("comingFrom", "isBookingDetailsFragment")
                bundle.putString("userPostProfileId", userPostProfileId.get())

                Log.e("SAASAqqwqwq", userPostProfileId.get().toString())
                view.navigateWithId(
                    R.id.action_bookingDetailsFragment_to_favDetailsFragment,
                    bundle
                )
                Log.e("SAASAqqwqwq", userPostProfileId.get().toString())
                view.navigateWithId(
                    R.id.action_bookingDetailsFragment_to_favDetailsFragment,
                    bundle
                )
            }

        }
    }

    private fun getBookingStatus(BookingStatus: String) = viewModelScope.launch {

        Log.e(
            "FSDFSDFQ",
            preferenceFile.retrieveKey("token").toString() + "---iii---" +
                    booking_id.get().toString() + "---iii---" +
                    BookingStatus
        )

        repository.makeCall(
            ApiEnums.GET_STATUS_INPUT,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<BookingStatusInputResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BookingStatusInputResponse> {
                    return retrofitApi.bookingStatusInput(
                        preferenceFile.retrieveKey("token").toString(),
                        booking_id.get().toString(),
                        BookingStatus
                    )
                }

                override fun onResponse(res: Response<BookingStatusInputResponse>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {

                            Log.e("RESEER", res.body().toString())

                            if (userType.get().toString().equals("provider")) {

                                if (res.body()!!.message.equals("accepted")) {

                                    bookingStatus.set("Booking Status : " + "ACCEPTED")
                                    bookingStatusCan.set("accepted")

                                } else if (res.body()!!.message.equals("cancelled")) {
                                    bookingStatus.set("Booking Status : " + "CANCELLED")
                                    bookingStatusCan.set("cancelled")
                                } else if (res.body()!!.message.equals("declined")) {
                                    bookingStatus.set("Booking Status : " + "DECLINED")
                                    bookingStatusCan.set("declined")
                                }
                            } else if (userType.get().toString().equals("customer")) {

                                if (res.body()!!.message.equals("accepted")) {

                                    bookingStatus.set("Booking Status : " + "ACCEPTED")
                                    bookingStatusCan.set("accepted")

                                } else if (res.body()!!.message.equals("cancelled")) {
                                    bookingStatus.set("Booking Status : " + "CANCELLED")
                                    bookingStatusCan.set("cancelled")
                                } else if (res.body()!!.message.equals("declined")) {
                                    bookingStatus.set("Booking Status : " + "DECLINED")
                                    bookingStatusCan.set("declined")
                                }
                            }

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.message())
                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            })

    }

    fun removeFromCalendar(view: View) = viewModelScope.launch {

        Log.e("ASDSDZXZSWw", booking_id.get().toString())

        val body = JsonObject()
        body.addProperty("booking_id", booking_id.get().toString())

        repository.makeCall(
            ApiEnums.REMOVE_FROM_CALENDAR,
            loader =true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddToCalendarResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddToCalendarResponseModel> {
                    return retrofitApi.deleteFromCalendar(
                        Authorization = preferenceFile.retrieveKey("token")!!,
                        body
                    )
                }

                override fun onResponse(res: Response<AddToCalendarResponseModel>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()?.status == 200) {

                            Log.e("DAAZFErf", res.body().toString())

                            view.navigateBack()

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