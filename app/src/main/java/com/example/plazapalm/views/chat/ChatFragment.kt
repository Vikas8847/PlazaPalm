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
import com.example.plazapalm.models.LoginDataModel
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.pref.preferenceName
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
    lateinit var dataStore : DataStoreUtil

    @Inject
    lateinit var pref : PreferenceFile

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

        binding?.vm=viewModel
        getLocal()
       // openUserBlockButton()
        setAdapter()
        sendClicks()
    }

    private fun getLocal() {
        dataStore.readObject(LOGIN_DATA, LoginDataModel::class.java) {

            //PROFILE_DATA

            val user_id = it?.data?.user_id.toString()

            Log.e("getLocalUSerName--->> ", it?.data?.user_name + "  getLocal--UserID-->> " + user_id)

        }

    }

    @SuppressLint("ClickableViewAccessibility")
    private fun sendClicks() {

        binding?.sendMessageTv?.setOnTouchListener(OnTouchListener { v, event ->
            val DRAWABLE_RIGHT = 2
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= binding?.sendMessageTv!!.getRight() - binding?.sendMessageTv!!.getCompoundDrawables()
                        .get(DRAWABLE_RIGHT).getBounds().width()
                ) {
                    Log.e("ADACHASHA" , "WORKINGFINEE")
                    viewModel.sendChatMessage()
                    return@OnTouchListener true
                }
            }
            false
        })
    }


    /** Here Set Chat Adapter in on Created method **/
    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter(){
        binding?.rvChats?.layoutManager=LinearLayoutManager(requireContext())
        binding?.rvChats?.adapter=viewModel.chatAdapter
        binding?.rvChats?.adapter?.notifyDataSetChanged()
    }

    private fun openUserBlockButton(){
        if (viewModel.isClicked.get())
        {
            binding?.tvBlockUserBtn?.visibility=View.VISIBLE
        }
        else
        {
            binding?.tvBlockUserBtn?.visibility=View.GONE

        }

    }

}