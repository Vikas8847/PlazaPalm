package com.example.plazapalm.utils

import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.example.plazapalm.models.UpdateLatlngResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Response
import javax.inject.Inject

class Update
@Inject constructor(
    private val repository: Repository,
    private val pref: PreferenceFile){



    init {
        updateLatlng()

    }
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        updateLatlng()
//
//    }

    fun updateLatlng() {

        Log.d("service_is", "running")

        repository.makeCall(
            apiKey = ApiEnums.GET_MAP_FEATURED,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<UpdateLatlngResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<UpdateLatlngResponse> {
                    return retrofitApi.updateLatlng(
                        pref.retrieveKey("token").toString(),
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
                        pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
                    )
                }

                override fun onResponse(res: Response<UpdateLatlngResponse>) {
                    Log.e("SDASDASWQ", res.body().toString())

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!!.data != null) {

                            Log.e("SDASDASWQ123", res.body()!!.data.toString())

                        } else {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()!!.data.toString()
                            )
                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }
        )
    }

}