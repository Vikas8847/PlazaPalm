package com.example.plazapalm.views.messageslist

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.MessagesFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.models.LastSeenData
import com.example.plazapalm.models.LoginDataModel
import com.example.plazapalm.networkcalls.BASE_URL
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MessagesFragment : Fragment(R.layout.messages_fragment) {
    private var binding: MessagesFragmentBinding? = null
    private val viewModel: MessagesVM by viewModels()

    @Inject
    lateinit var dataStore: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile
    lateinit var LastMesageList: ArrayList<LastSeenData>
    val bundle = Bundle()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MessagesFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        (activity as MainActivity?)!!.setTabMethod(3)
        LastMesageList = ArrayList()
        setAdapter()
        getLocal()

//        viewModel.fetchUser()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {
        binding?.rvMessages?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvMessages?.adapter = viewModel.messageUserAdapter
        binding?.rvMessages?.adapter?.notifyDataSetChanged()
    }

    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(true)
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getLocal() {

/*
        viewModel.reciverUserID.set(arguments?.get("user_Id").toString())
        viewModel.reciverUserName.set(arguments?.get("user_name").toString())
        viewModel.reciverUserImage.set(arguments?.get("userImage").toString())

        Log.e(
            "reciver_usderIID--->> ",
            arguments?.get("user_Id").toString() + "USERNAMEEE---.." + arguments?.get("user_name")
                .toString()
        )
*/

        dataStore.readObject(LOGIN_DATA, LoginDataModel::class.java) {

            //PROFILE_DATA

            viewModel.senderUserID.set(it?.data?.user_id.toString())
            viewModel.senderUserName.set(it?.data?.user_name.toString())
//            viewModel.senderbusiness_profile_status.set(it?.data?.business_profile_status)

            Log.e("  sender_usderIID-->> ", viewModel.senderUserID.get().toString())

            viewModel.firestore!!.collection("Chats")
                .whereArrayContains("members", viewModel.senderUserID.get().toString())
                .addSnapshotListener { snapshot, error ->

                    Log.e("SSSXXXXs", snapshot?.documents.toString())

                    LastMesageList.clear()
                    var usderName = ""
                    var chatID = ""
                    var otherUserId = ""
                    var loginUserId = ""
                    var userImage = ""
                    if(snapshot!!.documents!!.size>0){
                    for (dataSnapshot in snapshot!!.documents) {

                        val lastSeenMap = dataSnapshot["LastSeen"] as HashMap<String, Any>?
                        if (!lastSeenMap.isNullOrEmpty()) {

                            val message = lastSeenMap?.get("message")
                            val milisecondTime = lastSeenMap?.get("milisecondTime")

                            if (dataSnapshot["ChatID"]!=null && !(dataSnapshot["ChatID"] as String).isNullOrEmpty()) {
                                chatID = (dataSnapshot["ChatID"] as String)

                                val splitData = chatID.split("_")

                                if (splitData[0] == viewModel.senderUserID.get().toString()) {
                                    loginUserId = splitData[0]
                                    otherUserId = splitData[1]
                                } else {
                                    loginUserId = splitData[1]
                                    otherUserId = splitData[0]
                                }

                                val otherUserData =
                                    dataSnapshot[otherUserId] as HashMap<String, String>
                                var uid = otherUserData["uid"] as String
                                usderName = otherUserData["usderName"] as String
                                userImage = otherUserData["userImage"] as String

//                        viewModel.usersList.add(LastSeenData(usderName,message as String?,userImage,milisecondTime))
                                LastMesageList.add(
                                    LastSeenData(
                                        usderName,
                                        message as String?,
                                        userImage,
                                        milisecondTime,
                                        chatID,
                                        otherUserId
                                    )
                                )

                                Log.e("dasdasdasdww  ", LastMesageList.toString())

                            }
                        }

                        LastMesageList.sortByDescending {
                            it.milisecondTime.toString()
                        }

                        viewModel.messageUserAdapter.addItems(LastMesageList)
                        viewModel.messageUserAdapter.notifyDataSetChanged()

                        viewModel.messageUserAdapter.setOnItemClick { view, position, type ->
                            when (type) {
                                "userChatDetails" -> {

                                    Log.e("daaa", chatID)

                                    bundle.putString("CommingFrom", "MessageScreen")
                                    bundle.putString(
                                        "UserName",
                                        viewModel.messageUserAdapter.getAllItems()[position].name
                                    )
                                    bundle.putString(
                                        "UserID",
                                        viewModel.messageUserAdapter.getAllItems()[position].userId
                                    )
                                    bundle.putString(
                                        "chatID",
                                        viewModel.messageUserAdapter.getAllItems()[position].chatId
                                    )
                                    bundle.putString(
                                        "userImage",
                                        viewModel.messageUserAdapter.getAllItems()[position].userImage
                                    )

                                    Log.e(
                                        "USERDETALS  ",
                                        viewModel.messageUserAdapter.getAllItems()[position].name + " - " +
                                                viewModel.messageUserAdapter.getAllItems()[position].milisecondTime + " - " + " - " +
                                                viewModel.messageUserAdapter.getAllItems()[position].userImage + " - " +
                                                viewModel.messageUserAdapter.getAllItems()[position].userId + " - " +
                                                viewModel.messageUserAdapter.getAllItems()[position].chatId + " - " +
                                                viewModel.messageUserAdapter.getAllItems()[position].message
                                    )

                                    view.navigateWithId(
                                        R.id.action_messagesFragment_to_chatFragment,
                                        bundle
                                    )

                                }
                            }
                        }

                    }
                }

                }

            dataStore.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

                /** Sender Data */

                if (it != null) {
                    Log.e("  sender_usderIID-->> ", it.data?.profile_picture.toString())

                    viewModel.senderUserImage.set(IMAGE_LOAD_URL + it?.data?.profile_picture)

                } else {
                    viewModel.senderUserImage.set(R.drawable.placeholder.toString())
                }

                //viewModel.senderUserID.set(it?.data?.user_id.toString())
                //viewModel.senderUserName.set(it?.data?.user_name.toString())
                //viewModel.senderbusiness_profile_status.set(it?.data?.business_profile_status)


            }

            /// old code...

/*
        dataStore.readObject(POST_PROFILE_DATA, SavePostProfileResponse::class.java) {

            Log.e("oiIMAHEE",it.toString())

            val SenderImage = it?.data?.postProfile_picture!![0]
            viewModel.senderUserImage.set(SenderImage)
        }
*/

        }

    }
}