package com.example.plazapalm.views.advancesettings.map

import android.content.Context
import android.location.LocationManager
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.SAVE_MAP_FEATURE
import com.example.plazapalm.models.GetLatLongResponseModel
import com.example.plazapalm.models.GetMapFeature
import com.example.plazapalm.models.MapFeaturedDataRes
import com.example.plazapalm.models.UpdateLatlngResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class AdvanceMapVM @Inject constructor(

    var repository: Repository,
    var pref: PreferenceFile,
    var dataStoreUtil: DataStoreUtil,

    ) : ViewModel() {
    private var locationManager: LocationManager? = null
    var gpsStatus: Boolean = false
    var isDarkModeClicked: ObservableBoolean = ObservableBoolean(false)
    var isClicked = ObservableBoolean(false)
    var darkTheme = ObservableBoolean(false)
    var locationOnOF = ObservableBoolean(false)
    var follow = ObservableBoolean(false)

    var darkThemeLive = MutableLiveData<Boolean>()
    var locationOnOFLive = MutableLiveData<Boolean>()
    var followLive = MutableLiveData<Boolean>()


    init {
        //CheckGpsStatus()
    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivAdvanceMapBackBtn -> {
                view.findNavController().navigateUp()
            }
            /*  R.layout.advance_map_bottom_sheet.apply {R.id.switchAdvanceMap}->
              {
                  isDarkModeClicked.set(true)

              }*/
        }
    }

    fun CheckGpsStatus() {
        locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

        assert(locationManager != null)

        val GpsStatus = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (GpsStatus === true) {
            CommonMethods.showToast(context, "GPS Is Enabled")
        } else {
            CommonMethods.showToast(context, "GPS Is Disabled")
        }
    }

    fun setMapThemeAPI(isdark: Boolean, islocation: Boolean, isfollow: Boolean) =
        viewModelScope.launch {

            Log.e(
                "AAASA",
                isdark.toString() + "SD=-" + islocation + "DDD--- " + isfollow + "DDDD--- "
            )

            val body = JSONObject()
            body.put("Authorization", pref.retrieveKey("token").toString())
            body.put("darkTheme", true)
            body.put("locationOnOff", true)
            body.put("follow", false)

            repository.makeCall(
                apiKey = ApiEnums.MAP_FEATURED,
                loader = true,
                saveInCache = false,
                getFromCache = false,
                requestProcessor = object : ApiProcessor<Response<MapFeaturedDataRes>> {

                    override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<MapFeaturedDataRes> {
                        return retrofitApi.mapFeatreData(
                            pref.retrieveKey("token").toString(),
                            isdark,
                            islocation,
                            isfollow
                        )
                    }

                    override fun onResponse(res: Response<MapFeaturedDataRes>) {
                        Log.e("SDASDASWQ", res.body().toString())

                        if (res.isSuccessful && res.code() == 200) {
                            if (res.body()!!.data != null) {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    res.body()!!.message!!
                                )

                                darkTheme.set(res.body()!!.data!!.dark_theme!!)
                                locationOnOF.set(res.body()!!.data!!.location_OnOff!!)
                                follow.set(res.body()!!.data!!.dark_theme!!)

//                            darkThemeLive.value = res.body()!!.data!!.dark_theme!!
//                            locationOnOFLive.value = res.body()!!.data!!.location_OnOff!!
//                            followLive.value = res.body()!!.data!!.follow!!

                                dataStoreUtil.saveObject(SAVE_MAP_FEATURE, res.body()!!.data)
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

    fun mapFeatureGet() = viewModelScope.launch {

        repository.makeCall(
            apiKey = ApiEnums.GET_MAP_FEATURED,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetMapFeature>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetMapFeature> {
                    return retrofitApi.getMapFeatured(pref.retrieveKey("token").toString())
                }

                override fun onResponse(res: Response<GetMapFeature>) {
                    Log.e("SDASDASWQ", res.body().toString())

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!!.data != null) {

//                            CommonMethods.showToast(CommonMethods.context,res.body()!!.message!!)

                            darkTheme.set(res.body()!!.data.dark_theme)
                            locationOnOF.set(res.body()!!.data.location_OnOff)
                            follow.set(res.body()!!.data.follow)

                            darkThemeLive.value = res.body()!!.data.dark_theme
                            locationOnOFLive.value = res.body()!!.data.location_OnOff
                            followLive.value = res.body()!!.data.follow

                            dataStoreUtil.saveObject(SAVE_MAP_FEATURE, res.body()!!.data)

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

    fun updateLatlng() {

        Log.d(
            "service_is", pref.retrieveKey("token").toString() + " vbb " +
                    pref.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble() + " vcv " +
                    pref.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
        )

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

    fun getLatlngAPI() {

        repository.makeCall(
            ApiEnums.GET_LATLNG,
            loader = false,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetLatLongResponseModel>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetLatLongResponseModel> {
                    return retrofitApi.getLatlng(
                        pref.retrieveKey("token").toString(),
                        "640b176cecb33773e726e56d"
                    )
                }

                override fun onResponse(res: Response<GetLatLongResponseModel>) {
                    Log.e("AQQAAA", res.body().toString())

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {
                                Log.e("VVVVVVSS", res.body().toString())

                            } else {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    res.body()!!.message!!
                                )
                            }

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }

        )

    }


}