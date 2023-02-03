package com.example.plazapalm.views.chat

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.BlockUserResponse
import com.example.plazapalm.models.ChatData
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.views.chat.adapter.ChatAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ChatVM @Inject constructor(
    private var repository: Repository,
    private var dataStoreUtil: DataStoreUtil,
    private var pref: PreferenceFile
) : ViewModel() {

    var dialog: Dialog? = null
    var isClicked: ObservableBoolean = ObservableBoolean(false)
    var dataList = ArrayList<ChatData>()
    var messageText = ObservableField("")
    val firestore = FirebaseFirestore.getInstance()
    var bothID: String? = ""
    var checkId = false


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
            R.id.sendMessage_tv -> {
//           sendChatMessage()
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

    private fun blockUser() = viewModelScope.launch {
        repository.makeCall(ApiEnums.BLOCK_USER, loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<BlockUserResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BlockUserResponse> {
                    return retrofitApi.addToBlocklist(
                        pref.retrieveKey("token").toString(),
                        "6375f537b9e8587af3d013ca",
                        true
                    )
                }

                override fun onResponse(res: Response<BlockUserResponse>) {

                    if (res.isSuccessful && res.code() == 200) {

                        if (res.body() != null) {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

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

    private fun getChatuid(bothID1: String) {

        var db = FirebaseFirestore.getInstance()
        db.collection("Chats").whereEqualTo("ChatID", bothID1.toString())
            .get()
            .addOnSuccessListener {
                Log.e("DFFDF", it.documents.toString())
                if (it.documents.size == 0) {
                    if (checkId == false) {
//                        var bothID2 = (intent.extras!!.get("Uid").toString()) + "_" + FirebaseAuth.getInstance().uid
//                        getChatuid(bothID2!!)
                        checkId = true
                    } else {
//                        bothID = FirebaseAuth.getInstance().uid + "_" + (intent.extras!!.get("Uid").toString())
                    }

                } else {

                    bothID = it.documents[0].data?.get("ChatID").toString()
                }

                if (!(bothID.equals(""))) {
                    fetchdata(bothID!!)
                }
                Log.e("Chat_Id===", bothID.toString())
            }

    }

    private fun fetchdata(bothID: String) {
        var db = FirebaseFirestore.getInstance()
        db.collection("Chats").document(bothID).collection("Message")
            .addSnapshotListener { value , error ->
                dataList.clear()
                for (data in value!!.documents) {
//                    Log.e("All_Messages==", value!!.documentChanges.get(0).document.data.toString())

                    Log.e("All_Messages==", data.get("message").toString())

                    dataList.add(
                        ChatData(
                            data.get("message").toString(),
                            data.get("timestamp").toString(),
                            data.get("senderuid").toString(),
                            data.get("reciveruid").toString(),
                            data.get("Image").toString(),
                            data.get("messageType").toString()
                        )
                    )

                    dataList.sortBy {
                        it.timestamp
                    }

                }
//                setrecyclerdata(dataList)
                chatAdapter.addItems(dataList)
                chatAdapter.notifyDataSetChanged()
            }

    }

     fun sendChatMessage( ) {

        val message = HashMap<String, Any>()

        var currentTime = System.currentTimeMillis()

        message["message"] = messageText.get().toString()
        message["messageType"] = "1"
        message["messageTime"] = currentTime
        message["readStatus"] = false
//        message["senderuid"] = user!!.uid
//        message["reciveruid"] = intent.extras!!.get("Uid").toString()

        //SetOptions.merge()

        firestore.collection("Chats").document(bothID.toString()).collection("Message")
            .add(message)
            .addOnSuccessListener {
                messageText.set("")
            }
            .addOnFailureListener {
                messageText.set("")

                CommonMethods.showToast( CommonMethods.context," failed.")

            }


        var jsonObject1 = HashMap<String, Any>()
        var arrayList = ArrayList<String>()

        arrayList.clear()
//        arrayList.add(user!!.uid)
//        arrayList.add(intent.extras!!.get("Uid").toString())

        jsonObject1.put("members", arrayList)
        firestore.collection("Chats").document(bothID.toString()).set(jsonObject1, SetOptions.merge())
        val bothid = HashMap<String, Any>()
        bothid.put("ChatID", bothID.toString())
        firestore.collection("Chats").document(bothID.toString()).set(bothid, SetOptions.merge())

    }
}