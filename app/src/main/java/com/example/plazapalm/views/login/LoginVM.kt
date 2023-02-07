package com.example.plazapalm.views.login

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.LoginDataModel
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.pref.business_profile_status
import com.example.plazapalm.pref.token
import com.example.plazapalm.utils.*
import com.example.plazapalm.validation.ValidatorUtils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class LoginVM @Inject constructor(
    private var repository: Repository,
    private var dataStore: DataStoreUtil,
    private var cacheUtil: CacheUtil,
    private var preferences: PreferenceFile
) : ViewModel() {
    var email = ObservableField("")
    var password = ObservableField("")


    var sendTypeLogin = ObservableField("Login")
    var sendFirebaseLoginToken = ObservableField("")
    // val firestore = FirebaseFirestore.getInstance()

      private var auth: FirebaseAuth = Firebase.auth

    fun clicks(view: View) {
        when (view.id) {
            R.id.clMainLogin -> {
                (MainActivity.context.get() as Activity).hideKeyboard()
            }

            R.id.btnLogin -> {
                if (CommonMethods.context.isNetworkAvailable()) {
                    if (loginValidation()) {
                        //call login Api Here..
                        CommonMethods.context.hideKeyboard()
                        loginApi(view)
                    }
                } else {
                    CommonMethods.showToast(CommonMethods.context, Constants.CHECK_INTERNET)
                }
            }
            R.id.btnLoginCategories -> {
                view.navigateWithId(R.id.categoriesListFragment)
            }
            R.id.tvLoginWantSignup -> {
                view.navigateWithId(R.id.action_loginFragment_to_signUpFragment)
            }
            R.id.tvLoginForgotPass -> {
                val bundle = Bundle()
                bundle.putString("comingFrom", sendTypeLogin.get())
                bundle.putString("email", email.get())
                view.navigateWithId(R.id.action_loginFragment_to_forgotPasswordFragment, bundle)
            }
            R.id.btnConfirmBooking -> {
                view.navigateWithId(R.id.thankYouFragment)
            }
        }
    }

    private fun loginApi(view: View) = viewModelScope.launch {

        val body = JSONObject()
        body.put(Constants.EMAIL, email.get())
        body.put(Constants.PASSWORD, password.get())
        body.put(Constants.DEVICE_TOKEN, sendFirebaseLoginToken.get())
        body.put(Constants.DEVICE_TYPE, Constants.DeviceType)

        Log.e(
            "LOGIN--REQUEST--",
            email.get() + "-- " + password.get() + " Local-->> " + preferences.retrieveFirebaseToken()
                    + "--->> " + sendFirebaseLoginToken.get()
                .toString() + "--" + Constants.DeviceType + "--"
        )

        repository.makeCall(
            apiKey = ApiEnums.LOGIN,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<LoginDataModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<LoginDataModel> {
                    return retrofitApi.loginApi(
                        email.get()?.trim().toString(),
                        password.get()?.trim().toString(),
                        /*Constants.DeviceToken*/
                        sendFirebaseLoginToken.get(),
                        Constants.DeviceType
                    )
                }

                override fun onResponse(res: Response<LoginDataModel>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()?.status == 200) {
                            // dataStore.saveObject(PROFILE_DATA, GetProfileData::class.java)
                            dataStore.saveObject(LOGIN_DATA, res.body())
                            preferences.storeKey(token, res.body()?.data?.token ?: "")
                            preferences.storeBoolKey(
                                business_profile_status,
                                res.body()?.data?.business_profile_status.toBoolean()
                            )

                            Log.e(
                                "===LOGINDATA===",
                                res.body()?.data.toString() + "===TOKKENN===" + res.body()?.data?.token.toString()
                            )

                            Log.e(
                                "QQAAWW2222!@112",
                                preferences.retrieveFilterResponse().toString()
                            )

                            if (preferences.retrieveFilterResponse().isNullOrEmpty()) {
                                val bundle = Bundle()
                                bundle.putString("comingFrom", "login")
                                view.navigateWithId(
                                    R.id.action_loginFragment_to_categoriesListFragment,
                                    bundle
                                )

                            } else {
                                view.navigateWithId(R.id.action_loginFragment_to_dashBoardFragment)
                            }

//                            view.navigateWithId(R.id.action_loginFragment_to_dashBoardFragment)
                            CommonMethods.context.hideKeyboard()
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )

                            FireStorechatVM().firestoreLogin(preferences)

                            /*  val users = HashMap<String, Any>()

                              users["fcmToken"] = sendFirebaseLoginToken.get().toString()
                              users["osType"] = "1"
                              users["notificationStatus"] = ""

                              //SetOptions.merge()

                              firestore.collection("Users").document()
                                  .set(users, SetOptions.merge())
                                  .addOnSuccessListener {
                                      Log.e("TAG--US", "sucess")
                                  }
                                  .addOnFailureListener {
                                      Log.e("TAG--US", "faild")

                                  }*/

                        } else {
                            val bundle = Bundle()
                            bundle.putString("comingFrom", "login")
                            //bundle.putString("login", email.get())
                            bundle.putString("email", email.get())
                            view.navigateWithId(R.id.verifyEmailFragment, bundle)
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )
                            CommonMethods.context.hideKeyboard()
                        }
                    } else {
                        CommonMethods.showToast(
                            CommonMethods.context,
                            res.body()?.message.toString()
                        )
                    }

                }
            }
        )
    }

    /*Validations for login..*/
    private fun loginValidation(): Boolean {
        when {
            email.get()?.trim()?.isEmpty()!! -> {
                CommonMethods.showToast(CommonMethods.context, Constants.EmailCantEmpty)
                return false
            }
            !ValidatorUtils.isEmailValid(email.get()!!.trim()) -> {
                CommonMethods.showToast(CommonMethods.context, Constants.ENTER_VALID_EMAIL)
                return false
            }
            password.get()?.trim()?.isEmpty()!! -> {
                CommonMethods.showToast(CommonMethods.context, Constants.PasswordCantEmpty)
                return false
            }
            else -> {
                return true
            }
        }
    }

    /** Here  signInAnonymously user sucess or failed **/
    fun anonymousUser() {
        auth.signInAnonymously()
            .addOnCompleteListener(CommonMethods.context) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG--FDD", "signInAnonymously:success")
                    val user = auth.currentUser
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG--CWKAKS", "signInAnonymously:failure", task.exception)
                    CommonMethods.showToast(CommonMethods.context, "Authentication failed.")
//                    updateUI(null)
                }
            }
    }

}