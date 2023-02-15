package com.example.plazapalm.views.myprofile

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.datastore.PROFILE_IMAGE
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateWithId
import com.example.plazapalm.views.myprofile.qrcodescanner.QrCodeScannerFragment
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class MyProfileVM @Inject constructor(
    private var dataStoreUtil: DataStoreUtil,
    private var repository: Repository,
    private var cacheUtil: CacheUtil,
    private var pref: PreferenceFile

) : ViewModel() {

    var premium: Int? = null
    var user_id = ObservableField("")
    var postStatus = ObservableField("")
    var firstName = ObservableField("first name")
    var storedImageUrl = ObservableField("")
    val qrCodeScanner: QrCodeScannerFragment by lazy { qrCodeScanner }
    var token = ObservableField("")
    var p_id = ObservableField("")
    var status = ObservableField("")
    var changestatus = ObservableBoolean(false)
    var istrue = ObservableBoolean(false)

    init {

        token.set(pref.retrieveKey("token"))
        Log.e("Application_token====",token.get().toString())
        getProfileImageUrl()

    }


    /**Click Implementing Here **/
    fun onClick(view: View) {
        when (view.id) {
            R.id.clMain -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.tvAccount -> {
                view.navigateWithId(R.id.action_myProfileFragment_to_editProfileFragment)
            }
            R.id.tvViewMyProfile -> {
                val bundle = Bundle()

                if (changestatus.get()) {

                    bundle.putString("comingFrom", "isViewProfile")
                    bundle.putString("P_ID", postStatus.get())

                    status.set("View Profile ")
                    view.navigateWithId(R.id.action_myProfileFragment_to_favDetailsFragment, bundle)

                } else {

                    status.set("Post a Profile ")
                    bundle.putString(Constants.FROM_MY_PROFILE, "PostProfile")
                    view.navigateWithId(R.id.action_myProfileFragment_to_viewProfileFragment)

                }
            }

            R.id.tvCalendar -> {
                val bundle = Bundle()
                bundle.putString("comingFromm", "Calendar")
                bundle.putString("p_id", p_id.get())
                Log.e("FSDFsd",p_id.get().toString())
                view.navigateWithId(R.id.action_myProfileFragment_to_calendarFragment, bundle)
            }

            R.id.tvFavourite -> {
                view.navigateWithId(R.id.action_myProfileFragment_to_favouritesFragment)
            }

            R.id.tvUpgrade -> {
                view.navigateWithId(R.id.action_myProfileFragment_to_upgradeProFragment)
            }
            R.id.tvAdvanceSetting -> {
                view.navigateWithId(R.id.action_myProfileFragment_to_advanceSettingFragment)
            }

            R.id.tvQRCode -> {
                view.navigateWithId(R.id.action_myProfileFragment_to_QRCodeGenerateFragment)
                istrue.set(true)
            }

            //for scanner
            /*  R.id.ivMyProfileScanner -> {
                  view.findViewById(R.id.action_myProfileFragment_to_qrCodeScannerFragment)
              }*/
        }
    }


    /**call Get Profile Api..**/
    fun getProfile() = viewModelScope.launch {
        val body = JSONObject()
        body.put("Authorization", token.get())
        repository.makeCall(
            apiKey = ApiEnums.GET_PROFILE,
            loader = false,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileResponseModel> {
                    return retrofitApi.getProfileApi(Authorization = token.get().toString())
                }

                override fun onResponse(res: Response<GetProfileResponseModel>) {

                    val responseData = res.body()

                    user_id.set(res.body()!!.data.user_id)

                    Log.e("sadddddw", user_id.get().toString())
//                    firstName.set(res.body()!!.data.first_name.toString() + " " + " " + res.body()!!.data.last_name.toString())

                    dataStoreUtil.saveObject(PROFILE_DATA, res.body())
                    dataStoreUtil.saveData(PROFILE_IMAGE, res.body()?.data?.profile_picture.toString())
                    storedImageUrl.set(res.body()?.data?.profile_picture)

                    p_id.set(res.body()?.data?.p_id)
                    Log.e("FSDFsd","ujj"+ res.body()?.data?.p_id.toString())

                    Log.e("QWQWQWQW", responseData.toString())

                    if (res.body()?.data?.p_id.isNullOrEmpty()) {
                        status.set("Post a Profile ")
                        changestatus.set(false)
                    } else {
                        status.set("View Profile ")
                        postStatus.set(res.body()?.data?.p_id)
                        changestatus.set(true)

                    }

//                    setpostStatus()
                     myProfileData()

                }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context, Constants.SOMETHING_WRONG)
                }
            }
        )
    }


    private fun getProfileImageUrl() {
        dataStoreUtil.readData(PROFILE_IMAGE) {
            storedImageUrl.set(it)
        }
    }

    fun myProfileData() {
        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {
            firstName.set(it?.data?.first_name.toString() + " " + " " + it?.data?.last_name.toString())

            val p_Id = it?.data?.p_id
            p_id.set(p_Id)
            Log.e("SssQAWS--", p_Id.toString())
            storedImageUrl.set(it?.data?.profile_picture)

            if (p_Id.isNullOrEmpty()) {
                changestatus.set(false)
                status.set("Post a Profile ")

            } else {
                postStatus.set(p_Id)
                changestatus.set(true)
                status.set("View Profile ")
            }


/** 04-01-23
 *  Change status for change profile
 * */
            /*   if (pref.retrieveBoolKey(Constants.POSTSTATUS)!!.equals(true)) {
                   changestatus.set(true)
               } else {
                   changestatus.set(false)
               }
   */

            /* if (it?.data?.profile_picture != null) {
                storedImageUrl.set(it.data.profile_picture)
             }*/

        }
    }
}


