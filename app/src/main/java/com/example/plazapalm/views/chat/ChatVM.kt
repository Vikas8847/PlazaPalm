package com.example.plazapalm.views.chat

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.BlockUserResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.views.chat.adapter.ChatAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ChatVM @Inject constructor(
    private var repository: Repository,
    private var dataStoreUtil: DataStoreUtil,
    private var pref : PreferenceFile
) : ViewModel() {
    var dialog: Dialog? = null
    var isClicked: ObservableBoolean = ObservableBoolean(false)
    val chatAdapter by lazy { ChatAdapter() }
    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivChat -> {
//                view.findNavController().navigateUp()
                view.navigateBack()
            }
            R.id.ivChatOpenBlock -> {
                if (isClicked.get()) {
                    isClicked.set(false)
                } else {
                    isClicked.set(true)
                }
            }
            R.id.tvBlockUserBtn -> {
                isClicked.set(false)
                showChooseOptionAccountDialog()
            }
        }
    }

    private fun showChooseOptionAccountDialog() {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.block_user_profile)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
            /**choose options click(Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvBlockProfile)?.setOnClickListener {

//                blockUser()
                dialog?.dismiss()

            }
            /**Edit Profile Click (Button)**/
            dialog?.findViewById<AppCompatTextView>(R.id.tvBlockCancelBtn)?.setOnClickListener {

                dialog?.dismiss()
            }

            dialog?.show()
        }
    }

    private fun blockUser()=viewModelScope.launch {
        repository.makeCall(ApiEnums.BLOCK_USER , loader = true ,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object :ApiProcessor<Response<BlockUserResponse>>{

            override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BlockUserResponse> {
                return retrofitApi.addToBlocklist(pref.retrieveKey("token").toString(),"6375f537b9e8587af3d013ca" , true)
            }

            override fun onResponse(res: Response<BlockUserResponse>) {

                if (res.isSuccessful && res.code()==200){

                    if (res.body()!=null){
                        CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                    }else{
                        CommonMethods.showToast(CommonMethods.context,res.body()!!.message!!)

                    }
                }else{
                    CommonMethods.showToast(CommonMethods.context,res.message())

                }
            }

                override fun onError(message: String) {
                    super.onError(message)
                    CommonMethods.showToast(CommonMethods.context,message)
                }
        })
    }
}