package com.example.plazapalm.views.chat

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ChatFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 * Use the [ChatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

@AndroidEntryPoint
class ChatFragment : Fragment(R.layout.chat_fragment) {
    private var binding: ChatFragmentBinding? = null
    val viewModel: ChatVM by viewModels()

    @Inject
    lateinit var dataStore: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ChatFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Initialize Firebase Auth

        binding?.vm = viewModel
        getLocal()
        // openUserBlockButton()
        setAdapter()
        sendClicks()
        viewModel.getPostImages()
    }

    private fun getLocal() {

/*
        if (arguments != null) {
            */
        /** Commimg From Message Screen *//*


            when (arguments?.get("comingFrom")) {
                "MessageScreen" -> {

                    viewModel.reciverUserID.set(arguments?.getString("UserID").toString())
                    viewModel.reciverUserName.set(arguments?.getString("UserName").toString())
                    viewModel.reciverUserImage.set(arguments?.getString("userImage").toString())
                    viewModel.bothID = arguments?.get("chatID").toString()

                    Log.e(
                        "ASDFASDFa", arguments?.getString("UserName").toString() + " -- "
                                + arguments?.getString("chatID").toString() + " -- "
                                + arguments?.getString("UserID").toString() + " -- "
                                + arguments?.getString("userImage").toString()
                    )

                }

                "FavDetailsScreen" -> {
                    */
        /** Commimg From FavDeatils  Screen *//*


                    viewModel.reciverUserID.set(arguments?.get("user_Id").toString())
                    viewModel.reciverUserName.set(arguments?.get("user_name").toString())
                    viewModel.reciverUserImage.set(arguments?.get("userImage").toString())

                    Log.e(
                        "reciver_usderIID--->> ",
                        arguments?.get("user_Id")
                            .toString() + "USERNAMEEE---.." + arguments?.get("user_name").toString()
                    )

                }
            }
        }

*/

        if (arguments != null) {
            when (arguments?.get("CommingFrom")) {

                "MessageScreen" -> {
                    Log.e("WOFMCKS", "MEsssage SCreen ")
                    viewModel.reciverUserID.set(arguments?.getString("UserID").toString())
                    viewModel.reciverUserName.set(arguments?.getString("UserName").toString())
                    viewModel.reciverUserImage.set(arguments?.getString("userImage").toString())
                    viewModel.bothID = arguments?.get("chatID").toString()

                    Log.e(
                        "ASDFASDFa", arguments?.getString("UserName").toString() + " -- "
                                + arguments?.getString("chatID").toString() + " -- "
                                + arguments?.getString("UserID").toString() + " -- "
                                + arguments?.getString("userImage").toString()
                    )
                }

                "FavDetailsScreen" -> {
                    /** Commimg From FavDeatils  Screen */
                    Log.e("WOFMCKS", "FAVdetals  SCreen ")
                    viewModel.reciverUserID.set(arguments?.get("user_Id").toString())
                    viewModel.reciverUserName.set(arguments?.get("user_name").toString())
                    viewModel.reciverUserImage.set(arguments?.get("userImage").toString())

                    Log.e(
                        "reciver_usderIID--->> ",
                        arguments?.get("user_Id")
                            .toString() + "USERNAMEEE---.." + arguments?.get("user_name").toString()
                    )

                }
            }
        }



        dataStore.readObject(LOGIN_DATA, GetProfileResponseModel::class.java) {

            /** Sender Data */

            if (it != null) {
                viewModel.senderUserID.set(it?.data?.user_id.toString())
                viewModel.senderUserName.set(it?.data?.user_name.toString())
                viewModel.senderUserImage.set(it?.data?.profile_picture.toString())
            } else {
                viewModel.senderUserImage.set(R.drawable.placeholder.toString())
            }

//            viewModel.senderbusiness_profile_status.set(it?.data?.business_profile_status)

            Log.e("  sender_usderIID-->> ", it.toString())

        }


        // old code ...

//        dataStore.readObject(LOGIN_DATA, LoginDataModel::class.java) {
//
//            /** Sender Data */
//
//            viewModel.senderUserID.set(it?.data?.user_id.toString())
//            viewModel.senderUserName.set(it?.data?.user_name.toString())
////            viewModel.senderbusiness_profile_status.set(it?.data?.business_profile_status)
//
//            Log.e("  sender_usderIID-->> ", it.toString())
//
//        }
//
//        dataStore.readObject(POST_PROFILE_DATA, SavePostProfileResponse::class.java) {
//            val SenderImage = it?.data?.postProfile_picture!![0]
//            viewModel.senderUserImage.set(SenderImage)
//            Log.e("oiIMAHEE", it.toString())
//        }

    }

    @SuppressLint("ClickableViewAccessibility")
    private fun sendClicks() {

        binding?.sendMessageTv?.setOnTouchListener(OnTouchListener { v, event ->
            val DRAWABLE_RIGHT = 2
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= binding?.sendMessageTv!!.getRight() - binding?.sendMessageTv!!.getCompoundDrawables()
                        .get(DRAWABLE_RIGHT).getBounds().width()
                ) {
                    Log.e("ADACHASHA", "WORKINGFINEE")

                    if (viewModel.chatAdapter.dataList.size == 0) {
                        viewModel.startChatMethod()
                        Log.e("ADACHASHA", " 0 ")

                    } else {
                        viewModel.sendChatMessage()
                        Log.e("ADACHASHA", " 1 ")

                    }


                    return@OnTouchListener true
                }
            }
            false
        })
    }


    /** Here Set Chat Adapter in on Created method **/
    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {
        binding?.rvChats?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvChats?.adapter = viewModel.chatAdapter
        binding?.rvChats?.adapter?.notifyDataSetChanged()
    }

    private fun openUserBlockButton() {
        if (viewModel.isClicked.get()) {
            binding?.tvBlockUserBtn?.visibility = View.VISIBLE
        } else {
            binding?.tvBlockUserBtn?.visibility = View.GONE

        }

    }
}