package com.example.plazapalm.views.report

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.ReportResponse
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateBack
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ReportVM @Inject constructor(
    private var dataStoreUtil: DataStoreUtil,
    private var cacheUtil: CacheUtil,
    private var repository: Repository,
    private var pref: PreferenceFile
    ) : ViewModel() {

    var p_Id = ObservableField("")
    var reportNote = ObservableField("")
    var firstName = ObservableField("")

    fun clicks(view: View) {
        when (view.id) {
            R.id.ivReportBackButton -> {
//                view.findNavController().navigateUp()
                view.navigateBack()
            }

            R.id.clReportMain -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.btnReportSubmit -> {
                Log.e("dfzxczx","QWQAAWEW")
                if (validation()){
                    reportApi(view)
                }

            }

        }
    }

    private fun reportApi(view: View) {
        repository.makeCall(apiKey = ApiEnums.GET_PREMIUM_STATUS,
            loader = true, saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<ReportResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<ReportResponse> {
                    return retrofitApi.report(
                        pref.retrieveKey("token").toString(),
                        p_Id.get().toString(),
                        firstName.get().toString(),
                        reportNote.get().toString()
                    )
                }

                override fun onResponse(res: Response<ReportResponse>) {
                    if (res.isSuccessful || res.body() != null) {

                        if (res.code() == 200) {
                            Log.e("QWQAAAZZZ", res.body().toString())
                            res.body()!!.message?.let { CommonMethods.showToast(CommonMethods.context, it)
                            }
                            view.navigateBack()
                        } else {
                            res.body()!!.message?.let { CommonMethods.showToast(CommonMethods.context, it) }
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, message)

                }

            }
        )
    }
    fun validation(): Boolean {
        when {

            firstName.get()?.trim().toString().isEmpty() -> {
                CommonMethods.showToast(CommonMethods.context, Constants.reportTextCantEmpty)
                return false
            }
            reportNote.get()?.trim().toString().isEmpty() -> {
                CommonMethods.showToast(CommonMethods.context, Constants.reportNoteCantEmpty)
                return false
            }

            else -> {
                return true
            }
        }
    }

}