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
import com.example.plazapalm.datastore.IS_BLOCK
import com.example.plazapalm.models.BlockUserResponse
import com.example.plazapalm.models.ChatData
import com.example.plazapalm.models.MessageData
import com.example.plazapalm.models.StoreUserFireStore
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.views.chat.adapter.ChatAdapter
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.gson.JsonObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
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
    var reciverUserID = ObservableField("")
    var isUserBlocked = ObservableBoolean(true)
    var reciverUserImage = ObservableField("")
    var senderUserImage = ObservableField("")
    var reciverUserName = ObservableField("")
    var blockUserName = ObservableField("")
    var senderUserID = ObservableField("")
    var senderUserName = ObservableField("")
    var senderbusiness_profile_status = ObservableBoolean(false)
    var userTypeId = ObservableField("")
    val firestore = FirebaseFirestore.getInstance()
    var bothID: String? = ""
    var checkId = false
    var userType = false

    init {

        val bothID1 = senderUserID.get().toString() + "_" + reciverUserID.get().toString()
        getChatuid(bothID1)

    }

    val chatAdapter by lazy { ChatAdapter() }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivChat -> {
//                view.findNavController().navigateUp()
                view.navigateBack()
            }
            R.id.cLChatMain -> {
                isClicked.set(false)
                Log.e("ADADASRTRTR123", "asdaskjdaskljd")

            }
            R.id.rvChats -> {
                isClicked.set(false)
                Log.e("ADADASRTRTR123", "asdaskjdaskljd")

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

    @SuppressLint("SetTextI18n")
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
            val blockUser = dialog?.findViewById<AppCompatTextView>(R.id.tvBlockProfile)
            val blockUserText = dialog?.findViewById<AppCompatTextView>(R.id.tvDeleteDescription)

            /***choose options click(Button) */

            if (isUserBlocked.get()) {
                blockUser?.text = "Block"

            } else {
                blockUser?.text = "Unblock"
            }

            blockUserName.set(" Block " + reciverUserName.get().toString() + " ?")

            blockUserText?.text = blockUserName.get().toString()

            blockUser?.setOnClickListener {

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
        Log.e("ADADASRTRTR123", isUserBlocked.get().toString())
        Log.e("LKCMZz", reciverUserID.get().toString())

        val body = JsonObject()
        body.addProperty("u_id", reciverUserID.get().toString())
        body.addProperty("isBlocked", isUserBlocked.get())

        repository.makeCall(
            ApiEnums.BLOCK_USER,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<BlockUserResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<BlockUserResponse> {
                    return retrofitApi.addToBlocklists(
                        pref.retrieveKey("token").toString(), body
                    )
                }

                override fun onResponse(res: Response<BlockUserResponse>) {

                    if (res.isSuccessful && res.code() == 200) {

                        Log.e("ADADASRTRTR", res.body()!!.toString())

                        if (res.body() != null) {


                            if (isUserBlocked.get()) {
                                isUserBlocked.set(false)
                                Log.e("ADADASRTRTR456", isUserBlocked.get().toString())
                                pref.saveISblock(IS_BLOCK, isUserBlocked.get())
                            } else {
                                isUserBlocked.set(true)
                                pref.saveISblock(IS_BLOCK, isUserBlocked.get())
                                Log.e("ADADASRTRTR67", isUserBlocked.get().toString())

                            }

//                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

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
                    Log.e("MESSAGE", message)
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

                        val bothID2 =
                            reciverUserID.get().toString() + "_" + senderUserID.get().toString()
                        getChatuid(bothID2!!)
                        checkId = true
                    } else {
                        Log.e("ADASQQq12311====", bothID.toString())
                        bothID =
                            senderUserID.get().toString() + "_" + reciverUserID.get().toString()
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
                            data.get("readStatus").toString(),
                            data.get("milisecondTime").toString()
                        )
                    )

                    dataList.sortBy {
                        it.milisecondTime
                    }

                }

                chatAdapter.addItems(dataList, userTypeId.get().toString())
                chatAdapter.notifyDataSetChanged()
            }

    }

    fun startChatMethod() {
        sendUserDetails()
    }

    private fun sendUserDetails() {
        /** new code */

        val userDeatils = HashMap<String, StoreUserFireStore>()
        val senderDeatils = HashMap<String, StoreUserFireStore>()

        val dataStore = StoreUserFireStore(
            reciverUserID.get().toString(),
            reciverUserName.get().toString(),
            reciverUserImage.get().toString()
        )

        Log.e(
            "aEMPTYY- ",
            senderUserImage.get().toString() + " - " + senderUserID.get()
                .toString() + " - " + senderUserName.get().toString()
        )

        val senderdataStore = StoreUserFireStore(
            senderUserID.get().toString(),
            senderUserName.get().toString(),
            senderUserImage.get().toString()
        )


        /*    userDeatils.put("uId", reciverUserID.get().toString())
            userDeatils.put("name", reciverUserName.get().toString())
            userDeatils.put("image", reciverUserImage.get().toString())*/

        userDeatils.put(reciverUserID.get().toString(), dataStore)
        senderDeatils.put(senderUserID.get().toString(), senderdataStore)

        firestore.collection("Chats").document(bothID.toString())
            .set(userDeatils, SetOptions.merge())
        firestore.collection("Chats").document(bothID.toString())
            .set(senderDeatils, SetOptions.merge())


        sendChatMessage()

    }

    fun sendChatMessage() {

        val message = HashMap<String, Any>()
        val time = setTime()

        Log.e("ASAAAQQZ", bothID.toString() + "TIME --->> " + time.toString())

//       val messageData = MessageData(messageText.get().toString(),"1",time,false,senderUserID.get().toString(),
//           reciverUserID.get().toString(),System.currentTimeMillis())
//
//        message.put("Message",messageData)

        if (messageText.get().toString().trim().isNullOrEmpty()) {
            CommonMethods.showToast(CommonMethods.context, Constants.MessageNameCantEmpty)
        } else {
            message["message"] = messageText.get().toString()
            message["messageType"] = "1"
            message["messageTime"] = time
            message["readStatus"] = false
            message["senderuid"] = senderUserID.get().toString()
            message["reciveruid"] = reciverUserID.get().toString()
            message["milisecondTime"] = System.currentTimeMillis()





            firestore.collection("Chats").document(bothID.toString()).collection("Message")
                .add(message)
                .addOnSuccessListener {
                    messageText.set("")
                }
                .addOnFailureListener {

                    CommonMethods.showToast(CommonMethods.context, " failed.")

                }

            val lastSeenData = HashMap<String, MessageData>()
            val lastSeen = MessageData(
                messageText.get().toString(), "1", time, false, senderUserID.get().toString(),
                reciverUserID.get().toString(), System.currentTimeMillis()
            )

            lastSeenData.put("LastSeen", lastSeen)

            firestore.collection("Chats").document(bothID.toString())
                .set(lastSeenData, SetOptions.merge())


            val jsonObject1 = HashMap<String, Any>()
            val arrayList = ArrayList<String>()

            arrayList.clear()
            arrayList.add(senderUserID.get().toString())
            arrayList.add(reciverUserID.get().toString())

            /** for some */

            jsonObject1.put("members", arrayList)

            firestore.collection("Chats").document(bothID.toString())
                .set(jsonObject1, SetOptions.merge())


            val hashmap = HashMap<String, String>()
            hashmap.put("ChatID", bothID.toString())

            firestore.collection("Chats").document(bothID.toString())
                .set(hashmap, SetOptions.merge())


            /** new code */

            /*
             firestore.collection("Chats").document(bothID.toString()).collection("Members")
                 .add(jsonObject1)

            val bothid = HashMap<String, Any>()
            bothid.put("ChatID", bothID.toString())

            firestore.collection("Chats").document(bothID.toString()).collection("ChatID")
                .add(bothid)
    */

        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun setTime(): String {

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