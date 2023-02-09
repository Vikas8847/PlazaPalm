package com.example.plazapalm.views.messageslist

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.LastSeenData
import com.example.plazapalm.models.UserMessageModal
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.navigateWithId
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import javax.inject.Inject


@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class MessagesVM @Inject constructor(
    val pref: PreferenceFile,
    val dataStore: DataStoreUtil
) : ViewModel() {

    var isVisible = ObservableBoolean(false)
    var usersList = ArrayList<LastSeenData>()
    val messageUserAdapter by lazy { RecyclerAdapter<LastSeenData>(R.layout.messages_user_list) }
    val firestore = FirebaseFirestore.getInstance()
    var reciverUserID = ObservableField("")
    var isUserBlocked = ObservableBoolean(true)
    var reciverUserImage = ObservableField("")
    var senderUserImage = ObservableField("")
    var reciverUserName = ObservableField("")
    var blockUserName = ObservableField("")
    var senderUserID = ObservableField("")
    var senderUserName = ObservableField("")

    var userName = ObservableField("")
    var userImage = ObservableField("")
    var userMessage = ObservableField("")
    var userTime = ObservableField("")



    /**Implemented clicks Here**/
    fun onClicks(view: View) {
        when (view.id) {
        }
    }

    init {

//        messageUserAdapter.addItems(usersList)
//        messageUserAdapter.notifyDataSetChanged()

//        messageUserAdapter.setOnItemClick { view, position, type ->
//            when (type) {
//                "userChatDetails" -> {
//                    view.navigateWithId(R.id.action_messagesFragment_to_chatFragment)
//                }
//            }
//        }

    }

    fun getColoredSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }

//    fun fetchUser() {
//        Log.e("SDSDAA",senderUserID.get().toString())
//
//        firestore!!.collection("Chats").whereArrayContains("members", senderUserID.get().toString())
//            .addSnapshotListener { snapshot, error ->
//                Log.e("SSSXXXXs", snapshot?.toString()!!)
//            }
//
//    }

}