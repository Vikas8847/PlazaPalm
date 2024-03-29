package com.example.plazapalm.views.advancesettings.questionaries

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apachat.swipereveallayout.core.SwipeLayout.DRAG_EDGE_RIGHT
import com.example.plazapalm.databinding.AddQuestionItemsBinding
import com.example.plazapalm.models.QueData
import com.example.plazapalm.models.QuestionsModel

 class SwipeToDeleteAdapter(var questionDataList: ArrayList<QueData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder =
            SwipeToDeleteViewHolder(AddQuestionItemsBinding.inflate(layInflater, parent, false))
        return viewHolder
    }

    inner class SwipeToDeleteViewHolder(val binding: AddQuestionItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setData(position:Int) {
            binding.executePendingBindings()
            /// new khem
            binding.model = questionDataList[position]
            binding.slDeleteQuestions.dragEdge=DRAG_EDGE_RIGHT
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SwipeToDeleteViewHolder -> holder.setData(position)

        }
    }

    override fun getItemCount(): Int {
        return questionDataList.size
    }

    fun removeAt(position: Int) {
        questionDataList.removeAt(position)
        notifyItemRemoved(position)
    }
}