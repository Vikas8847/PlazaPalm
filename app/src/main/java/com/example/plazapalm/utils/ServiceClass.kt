/*
package com.example.plazapalm.utils

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.util.Log
import androidx.fragment.app.viewModels
import com.example.plazapalm.MainActivity
import com.example.plazapalm.models.UpdateLatlngResponse
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.views.login.LoginVM
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Response
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class ServiceClass : Service() {
    private val mHandler: Handler = Handler() //run on another Thread to avoid crash
    private var mTimer: Timer? = null //timer handling
//    private val viewModel: LoginVM by viewModels()
    @Inject
    lateinit var repository: TwmpRepo

    @Inject
    lateinit var  pref: PreferenceFile



    override fun onBind(intent: Intent?): IBinder? {
       return null
    }

    override fun onCreate() {

        Log.d("service_is", "creATE")

//        val update =Update()
//        update.updateLatlng()
//        update.updateLatlng()
        updateLatlng()

    }

    fun updateLatlng() {

        Log.d("service_is", "running")

        repository.makeCall(
            loader = true,
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

   */
/* fun updateLatlng() {

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
    }*//*


//class TimeDisplay for handling task

}
*/
