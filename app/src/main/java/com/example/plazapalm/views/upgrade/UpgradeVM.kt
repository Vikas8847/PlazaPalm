package com.example.plazapalm.views.upgrade

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.navigateBack
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class UpgradeVM @Inject constructor(
    var repository: Repository,
    var dataStoreUtil: DataStoreUtil,
    var pref: PreferenceFile

) : ViewModel() {

    fun onClicks(view: View) {
        when (view.id) {
            R.id.tvUpgradeNotNow -> {
                view.navigateBack()
            }
            R.id.btnUpgradeNow -> {

                upgradePlan(view)

            }
        }
    }

    /**call Get Profile Api..**/
    fun upgradePlan(view: View) = viewModelScope.launch {
        val body = JSONObject()
        body.put("Authorization", pref.retrieveKey("token"))
        repository.makeCall(
            apiKey = ApiEnums.GET_PROFILE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileResponseModel> {
                    return retrofitApi.getProfileApi(
                        Authorization = pref.retrieveKey("token")
                            .toString()
                    )
                }

                override fun onResponse(res: Response<GetProfileResponseModel>) {

                    Log.e("PIDDd", res.body().toString())

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!=null){
                            pref.savePurchaseUserId(res.body()!!.data.user_id.toString())
                            view.navigateBack()

                        }

                    }

//                    dataStoreUtil.saveObject(PROFILE_DATA, res.body())


                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("SFDsdkjxklcvm", message)
                }
            }
        )
    }

}