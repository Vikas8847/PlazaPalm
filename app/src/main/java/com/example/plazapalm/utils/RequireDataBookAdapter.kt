package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.databinding.RequireDataListBinding
import com.example.plazapalm.models.Joined
import com.example.plazapalm.utils.Constants.TAG

class RequireDataBookAdapter(
    var requireActivity: Context,
    var dataList: ArrayList<Joined>,
    var Type: Int,
) : RecyclerView.Adapter<RequireDataBookAdapter.ViewHolder>() {

//    var dataList = ArrayList<Joined>()
//    var Type = 0

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder = ViewHolder(RequireDataListBinding.inflate(layInflater, parent, false))
        return viewHolder

    }

//    @SuppressLint("NotifyDataSetChanged")
//    fun addItems(items: ArrayList<Joined>, type: Int) {
//        this.dataList.clear()
//        this.dataList.addAll(items)
//        this.Type = type
//        notifyDataSetChanged()
//
//        Log.e("dataList", dataList.toString())
//
//    }

    override fun getItemCount(): Int = dataList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("lkgkj", dataList.toString())
        holder.setDAta(dataList, position)
    }

    inner class ViewHolder(var bindining: RequireDataListBinding) :
        RecyclerView.ViewHolder(bindining.root) {
        @SuppressLint("ResourceAsColor")
        fun setDAta(
            list: ArrayList<Joined>,
            position: Int,
        ) {
            if (Type == 1) {

                Log.e("ADiopfiop", list.toString())

                bindining.tvConfirmBookQuestionOne.text = (position + 1).toString()
                bindining.tvConfirmBookQuestionHair.text = list.get(position).question_text
                bindining.etConfirmBookQuestionAns.addTextChangedListener(object : TextWatcher {

                    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                        Log.e(TAG, "kjk")
                    }

                    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                        Log.e(TAG, "kjk")
                        //  if (bindining.etConfirmBookQuestionAns.text.toString().isNotEmpty()) {

                        list[position].save_ans = bindining.etConfirmBookQuestionAns.text.toString()
                        Log.e("jefjk3fk3hf43f3===", list[position]._id.toString())
                        // notifyItemChanged(position)
                        //notifyDataSetChanged()
                        //  }

                    }

                    @SuppressLint("NotifyDataSetChanged")
                    override fun afterTextChanged(text: Editable?) {


                    }
                })


            } else if (Type == 2) {

                bindining.tvConfirmBookQuestionOne.text = (" " + position + 1).toString()
                bindining.tvConfirmBookQuestionHair.text = list.get(position).question_text
                bindining.etConfirmBookQuestionAns.setText(list.get(position)._id)

                bindining.etConfirmBookQuestionAns.setBackgroundResource(R.drawable.ans_bck)

                bindining.tvConfirmBookQuestionOne.setTextColor(R.color.light_gray)
                bindining.tvConfirmBookQuestionHair.setTextColor(R.color.light_gray)
                bindining.etConfirmBookQuestionAns.setTextColor(R.color.light_gray)


                bindining.etConfirmBookQuestionAns.isClickable = false
                bindining.etConfirmBookQuestionAns.isEnabled = false

            }

            Log.e("iouqwioeu", list.get(position).question_text.toString())
        }
    }
}