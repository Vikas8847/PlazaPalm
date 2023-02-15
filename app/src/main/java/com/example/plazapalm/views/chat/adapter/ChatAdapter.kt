package com.example.plazapalm.views.chat.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.databinding.ChatReceiverBinding
import com.example.plazapalm.databinding.ChatSenderBinding
import com.example.plazapalm.models.ChatData
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class ChatAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val receiver = 0
    private val sender = 1
    private var senderId = ""
    var dataList = ArrayList<ChatData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        var viewHolder: RecyclerView.ViewHolder? = null


        when (viewType) {
            receiver -> {
                viewHolder = ReceiverVH(ChatReceiverBinding.inflate(layInflater, parent, false))
            }
            sender -> {
                viewHolder = SenderVH(ChatSenderBinding.inflate(layInflater, parent, false))
            }
        }

        return viewHolder!!
    }

    inner class SenderVH(val binding: ChatSenderBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SimpleDateFormat")
        fun setData() {

            binding.tvSender.text = dataList[position].message
           // binding.tvSenderTime.text = dataList[position].messageTime!!
            setTimeMethod(binding.tvSenderTime, dataList[position].milisecondTime!!.toLong())

            binding.executePendingBindings()

        }
    }

    inner class ReceiverVH(val binding: ChatReceiverBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SimpleDateFormat")
        fun setData() {

            binding.tvReceiver.text = dataList[position].message
            //binding.reciverTime.text = dataList[position].messageTime!!
            setTimeMethod(binding.reciverTime, dataList[position].milisecondTime!!.toLong())
            binding.executePendingBindings()
        }
    }


    @SuppressLint("SimpleDateFormat", "NotifyDataSetChanged")
//    private fun setTime(position: Int): String {
//
//        val fDate = dataList[position].messageTime!!
//
//        Log.e("aWORRK12sds", fDate)
//
////        val separated = fDate.split(":").toTypedArray()
////        val actualTime = separated[0] + " : " + separated[1]
////        Log.e("aWORRK12sds", actualTime)
//
//        return fDate
//
//    }

    fun addItems(items: ArrayList<ChatData>, userType: String) {
        this.dataList.clear()
        this.dataList.addAll(items)
        senderId = userType
        notifyDataSetChanged()
        Log.e("dataList", items.toString())
    }

    override fun getItemViewType(position: Int): Int {
        return if (dataList.get(position).senderuid.equals(senderId)) sender else receiver
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SenderVH -> holder.setData()
            is ReceiverVH -> holder.setData()
        }
    }

    override fun getItemCount(): Int = dataList.size

    fun setTimeMethod(textView:TextView,milisecondtime:Long)
    {
        var formatter =  SimpleDateFormat("hh:mm a");
    //    var newTime=milisecondtime as Long
        var dateString = formatter.format(Date(milisecondtime))
        textView.text = dateString
    }
}