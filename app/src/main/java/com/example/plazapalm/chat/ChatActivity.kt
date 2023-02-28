package com.example.plazapalm.chat

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ActivityChatBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.IS_BLOCK
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.views.chat.ChatVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding

    val viewModel: ChatVM by viewModels()

    @Inject
    lateinit var dataStore: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ChatFragmentBinding.inflate(layoutInflater)
        binding = ActivityChatBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        viewModel.activity = this

        initUI()
        CommonMethods.statusBar(true)
        addObserverToBottom()
    }

    fun addObserverToBottom() {
        viewModel.scrollToBottomData.observe(this, Observer {
            binding.rvChats?.scrollToPosition(viewModel.chatAdapter.dataList.size - 1)
        })
    }

    fun initUI() {
        binding.vm = viewModel
        getLocal()
        setAdapter()
        sendClicks()
        sendClicks()
        fetchBlockObserver()
    }

    fun fetchBlockObserver()
    {
        viewModel.enableBlockMutableData.observe(this, Observer {
            var data=it as Boolean
            if(data)
            {
                viewModel.fetchBlockMethod(viewModel.bothID!!.toString())
            }
        })

    }

    private fun getLocal() {
        if (pref.retrieISblock(IS_BLOCK) != null) {
            viewModel.isUserBlocked.set(pref.retrieISblock(IS_BLOCK)!!)
            Log.e("khkws", pref.retrieISblock(IS_BLOCK).toString())
        }

        if (intent != null) {
            Log.e("chat_coming_screen===", intent?.getStringExtra("CommingFrom").toString())
            when (intent?.getStringExtra("CommingFrom")) {

                "MessageScreen", "FavDetailsScreen", "ConfirmBooking", "CalendarScreen","notification" -> {

                    Log.e("WOFMCKS", "MEsssage SCreen ")
                    viewModel.reciverUserID.set(intent?.getStringExtra("user_Id").toString())
                    viewModel.reciverUserName.set(intent?.getStringExtra("user_name").toString())
                    viewModel.reciverUserImage.set(intent?.getStringExtra("userImage").toString())
                    //  viewModel.bothID = intent?.getStringExtra?.get("chatID").toString()
                }
            }
        }

        dataStore.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            /** Sender Data */

            if (it != null) {
                viewModel.senderUserID.set(it.data.user_id.toString())
                viewModel.senderUserName.set(it.data.user_name.toString())
                viewModel.senderUserImage.set(it.data.profile_picture.toString())
            } else {
                viewModel.senderUserImage.set(R.drawable.placeholder.toString())
            }

//            viewModel.senderbusiness_profile_status.set(it?.data?.business_profile_status)

            Log.e("  sender_usderIID-->> ", it.toString())
            viewModel.fetchNotificationToken()
        }

   }

    @SuppressLint("ClickableViewAccessibility")
    private fun sendClicks() {
        binding.sendNewMessage?.setOnClickListener {
            if (binding.sendMessageTv.text.toString().trim().isNotEmpty()) {
                if (viewModel.chatAdapter.dataList.size == 0) {
                    viewModel.startChatMethod()
                    Log.e("ADACHASHA", " 0 ")
                } else {
                    viewModel.sendChatMessage()
                    Log.e("ADACHASHA", " 1 ")
                }
            } else {
                Toast.makeText(this, "Please enter message", Toast.LENGTH_SHORT).show()
            }
        }


        /* binding?.sendMessageTv?.setOnTouchListener(View.OnTouchListener { v, event ->
             val DRAWABLE_RIGHT = 2
             if (event.action == MotionEvent.ACTION_UP) {
                 if (event.rawX >= binding?.sendMessageTv!!.right - binding?.sendMessageTv!!.compoundDrawables
                         .get(DRAWABLE_RIGHT).bounds.width()
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
         })*/


        binding.rvChats.setOnClickListener {
            Log.e("ASDDs", "WORKING")
        }

        binding.fullScreen.setOnClickListener {
            Log.e("ASDDs", "WORKING")
        }

    }

    /** Here Set Chat Adapter in on Created method **/
    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {
        binding.rvChats?.layoutManager = LinearLayoutManager(this)
        binding.rvChats?.adapter = viewModel.chatAdapter
        binding.rvChats?.adapter?.notifyDataSetChanged()
    }

    private fun openUserBlockButton() {
        if (viewModel.isClicked.get()) {
            binding.tvBlockUserBtn?.visibility = View.VISIBLE
        } else {
            binding.tvBlockUserBtn?.visibility = View.GONE
        }

    }


    override fun onStop() {
        super.onStop()
        Constants.CURRENTCHATID = ""
    }


    override fun onDestroy() {
        super.onDestroy()
        Constants.CURRENTCHATID = ""
    }
}