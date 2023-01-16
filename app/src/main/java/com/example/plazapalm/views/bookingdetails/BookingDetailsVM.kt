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
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
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
    var userFLName = ObservableField("")
    var usercustomerId = ObservableField("")
    var userLName = ObservableField("")
    var userPostProfileId = ObservableField("")
    var userType = ObservableField("")
    var categaryName = ObservableField("")
    var description = ObservableField("")
    var time = ObservableField("")
    var location = ObservableField("")
    var date = ObservableField("")
    var bookingStatus = ObservableField("")
    var booking_id = ObservableField("")


    fun getCustomerDetails() = viewModelScope.launch {

        repository.makeCall(apiKey = ApiEnums.GETPROFILE_BYCATE, loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<BookingDetailsResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BookingDetailsResponse> {
                    return retrofitApi.getBookingDetailsForCustomer(
                        preferenceFile.retrieveKey("token").toString(), booking_id.get().toString()
                    )
                }

                override fun onResponse(res: Response<BookingDetailsResponse>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!!.data != null) {

                            Log.e("QQPPPOOAAA", res.body().toString())
                            res.body()!!.message?.let {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    it
                                )
                            }

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

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

            R.id.ivBookingDetailsBack -> {
                view.navigateBack()
            }

            R.id.btnBookingDetailsCancel -> {
                //Here Cancel Api will hit and navigate back to details page...
//                getBookingStatus()
//                view.navigateWithId(R.id.thankYouFragment)
            }

            R.id.ivFavDetailsOptions -> {
                //Here Navigate to Chat Screen...

                view.navigateWithId(R.id.action_bookingDetailsFragment_to_chatFragment)
            }

            R.id.tvBookingDetailViewProfile -> {
                //Here Navigate View profile Screen....
                val bundle = Bundle()
                bundle.putString("comingFrom","isBookingDetailsFragment")
                bundle.putString("userPostProfileId",userPostProfileId.get())


                Log.e("SAASAqqwqwq",userPostProfileId.get().toString())
                view.navigateWithId(R.id.action_bookingDetailsFragment_to_favDetailsFragment,bundle)
            }

        }
    }

    private fun getBookingStatus()=viewModelScope.launch {

        repository.makeCall(
            ApiEnums.GETPROFILE_BYCATE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<BookingStatusInputResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BookingStatusInputResponse> {
                    return retrofitApi.bookingStatusInput(
                        preferenceFile.retrieveKey("token").toString(),
                        booking_id.get().toString(),
                        bookingStatus.get().toString()
                    )
                }

                override fun onResponse(res: Response<BookingStatusInputResponse>) {
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

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, message)
                }

            })

    }
}