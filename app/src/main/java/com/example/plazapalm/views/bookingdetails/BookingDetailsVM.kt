package com.example.plazapalm.views.bookingdetails

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.BookingDetailsResponse
import com.example.plazapalm.models.BookingStatusInputResponse
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.utils.navigateWithId
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
    var booking_id = ObservableField("")
    var btnText = ObservableField("")



    fun onClicks(view: View) {
        when (view.id) {

            R.id.ivBookingDetailsBack -> {
                view.navigateBack()
            }

            R.id.btnBookingDetailsCancel -> {

                Log.e("ASCCZZ", "WORKINGg9")

                if (btnText.get()?.trim().equals("Cancel Booking")) {
                    getBookingStatus()
                    Log.e("ASCCZZ", "WORKINGg10")

                } else if (btnText.get()?.trim().equals("Delete Reminder")) {
                    Log.e("ASCCZZ", "WORKINGg11")
                } else if (btnText.get()?.trim().equals("cancelled")) {
                    Log.e("ASCCZZ", "WORKINGg22")

                }
                //Here Cancel Api will hit and navigate back to details page...

//                view.navigateWithId(R.id.thankYouFragment)
            }

            R.id.ivFavDetailsOptions -> {
                //Here Navigate to Chat Screen...

                Log.e(
                    "asfasfaa",
                    userIdForChat.get().toString() + "VCVX" +
                            userFLName.get().toString() +
                            imageUrl.get().toString() + " VVC "
                )

                var userImage = ""
                if (!imageUrl.get().toString().isNullOrEmpty()) {
                    userImage =imageUrl.get().toString()
                }else{
                    userImage = IMAGE_LOAD_URL + R.drawable.placeholder
                }

                val chatData = Bundle()
                chatData.putString("CommingFrom", "CalendarScreen")
                chatData.putString("user_Id",userIdForChat.get().toString())
                chatData.putString("user_name",userFLName.get().toString())
                chatData.putString("userImage", userImage)


                view.navigateWithId(R.id.action_bookingDetailsFragment_to_chatFragment,chatData)

            }

            R.id.tvBookingDetailViewProfile -> {
                //Here Navigate View profile Screen....
                val bundle = Bundle()
                bundle.putString("comingFrom", "isBookingDetailsFragment")
                bundle.putString("userPostProfileId", userPostProfileId.get())

                Log.e("SAASAqqwqwq", userPostProfileId.get().toString())
                view.navigateWithId(
                    R.id.action_bookingDetailsFragment_to_favDetailsFragment,
                    bundle
                )
                Log.e("SAASAqqwqwq",userPostProfileId.get().toString())
                view.navigateWithId(R.id.action_bookingDetailsFragment_to_favDetailsFragment,bundle)
            }

        }
    }

    private fun getBookingStatus() = viewModelScope.launch {

        Log.e(
            "FSDFSDFQ",
            preferenceFile.retrieveKey("token").toString() + "---iii---" +
                    booking_id.get().toString() + "---iii---" +
                    bookingStatus.get().toString()
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
                        /*bookingStatus.get().toString()*/
                    "cancelle"
                    )
                }

                override fun onResponse(res: Response<BookingStatusInputResponse>) {
                    Log.e("RESEER", res.body().toString())
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            CommonMethods.showToast(CommonMethods.context, res.message())
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.message())

                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }


            })

    }
}