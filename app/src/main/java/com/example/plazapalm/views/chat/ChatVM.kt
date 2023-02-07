package com.example.plazapalm.views.chat

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
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
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.collections.HashMap

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
    var reciverUserID = ObservableField("")
    var senderUserID = ObservableField("")
    var userTypeId = ObservableField("")
    val firestore = FirebaseFirestore.getInstance()
    var bothID: String? = ""
    var checkId = false
    var userType = false

    init {
        var bothID1 = senderUserID.get().toString() + "_" + reciverUserID.get().toString()

        getChatuid(bothID1)

    }

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

                blockUser()
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
                        reciverUserID.get().toString(),
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

    fun getChatuid(bothID1: String) {

        val db = FirebaseFirestore.getInstance()

        db.collection("Chats").whereEqualTo("ChatID", bothID1.toString())
            .get()
            .addOnSuccessListener {
                Log.e("DFFDF", it.documents.toString())
                if (it.documents.size == 0) {
                    if (checkId == false) {
                        Log.e("ADASQQq123====", bothID.toString())

                        val bothID2 = reciverUserID.get().toString() + "_" + senderUserID.get().toString()
                        getChatuid(bothID2!!)
                        checkId = true
                    } else {
                        Log.e("ADASQQq12311====", bothID.toString())
                        bothID = senderUserID.get().toString() + "_" + reciverUserID.get().toString()
                    }

                } else {
                    Log.e("ADASQQq12322====", bothID.toString())
                    bothID = it.documents[0].data?.get("ChatID").toString()
                    Log.e("ADASQQq", bothID.toString())
                }

                if (!(bothID.equals(""))) {
                    fetchdata(bothID!!)
                }

                Log.e("Chat_Id===", bothID.toString())
            }

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun fetchdata(bothID: String) {
        var db = FirebaseFirestore.getInstance()
        db.collection("Chats").document(bothID).collection("Message").orderBy("milisecondTime")
            .addSnapshotListener { value, error ->
                dataList.clear()
                for (data in value!!.documents) {
//                    Log.e("All_Messages==", value!!.documentChanges.get(0).document.data.toString())

                    Log.e("All_Messages==", data.get("message").toString())

                    if (data.get("senderuid").toString().equals(senderUserID.get().toString())) {
                        userTypeId.set(senderUserID.get().toString())
                        Log.e("ADASD", senderUserID.get().toString())

                    } else {
                        userTypeId.set(data.get("reciveruid").toString())
                        Log.e("ADASD", data.get("reciveruid").toString())
                    }

                    dataList.add(
                        ChatData(
                            data.get("message").toString(),
                            data.get("messageTime").toString(),
                            data.get("messageType").toString(),
                            data.get("senderuid").toString(),
                            data.get("reciveruid").toString(),
                            data.get("readStatus").toString()
                        )
                    )

                    dataList.sortBy {
                        it.messageTime
                    }

                }

                chatAdapter.addItems(dataList, userTypeId.get().toString())
                chatAdapter.notifyDataSetChanged()
            }

    }

    fun startChatMethod() {
//        val chatId = HashMap<String, Any>()
//        chatId["chatId"] = bothID.toString()
//        firestore.collection("Chats").document("chatId").set(chatId!!).addOnSuccessListener {
//
//        }
        sendChatMessage()
    }

    fun sendChatMessage() {

        val message = HashMap<String, Any>()


//        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
//        val currentTime = sdf.format(Date())
//        System.out.println(" C DATE is  "+currentTime)

        val time = setTime()

        Log.e("ASAAAQQZ", bothID.toString() + "TIME --->> " + time.toString())

        message["message"] = messageText.get().toString()
        message["messageType"] = "1"
        message["messageTime"] = time
        message["readStatus"] = false
        message["senderuid"] = senderUserID.get().toString()
        message["reciveruid"] = reciverUserID.get().toString()
        message["milisecondTime"] =System.currentTimeMillis()

        //SetOptions.merge()

        firestore.collection("Chats").document(bothID.toString()).collection("Message")
            .add(message)
            .addOnSuccessListener {
                messageText.set("")
            }
            .addOnFailureListener {
                messageText.set("")

                CommonMethods.showToast(CommonMethods.context, " failed.")
            }


        var jsonObject1 = HashMap<String, Any>()
        var arrayList = ArrayList<String>()

        arrayList.clear()
        arrayList.add(senderUserID.get().toString())
        arrayList.add(reciverUserID.get().toString())

        jsonObject1.put("members", arrayList)

        firestore!!.collection("Chats").document(bothID.toString()).set(jsonObject1)

        var hashmap=HashMap<String,String>()
        hashmap.put("ChatID",bothID.toString())
        firestore!!.collection("Chats").document(bothID.toString()).set(hashmap)


       /* firestore.collection("Chats").document(bothID.toString()).collection("Members")
            .add(jsonObject1*//* SetOptions.merge()*//*)

        val bothid = HashMap<String, Any>()
        bothid.put("ChatID", bothID.toString())
        firestore.collection("Chats").document(bothID.toString()).collection("ChatID")
            .add(bothid *//*SetOptions.merge()*//*)*/

    }

    @SuppressLint("SimpleDateFormat")
    private fun setTime(): String {

//        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
//        val currentTime = sdf.format(Date())
//        System.out.println(" C DATE is  "+currentTime)


        val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
        val currentTime = sfd.format(Date())


        val separated = currentTime.split(" ").toTypedArray()
        val time = separated[1]

        val separated1 = time.split(":").toTypedArray()
        val actualTime = separated1[0] + ":" + separated1[1]

        Log.e("AAAAQ@@!@!1", separated1[0] + " : " + separated1[1])

        return actualTime

    }
}