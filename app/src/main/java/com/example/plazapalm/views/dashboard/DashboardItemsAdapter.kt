package com.example.plazapalm.views.dashboard

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.databinding.DashSelectedEventsBinding
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.SelectedDataModelList
class DashboardItemsAdapter(
    var requireActivity: Context,
    var dataList: ArrayList<SelectedDataModelList>,
    var clickItem: clickItem
)
    : RecyclerView.Adapter<DashboardItemsAdapter.ViewHolder>() {
    @SuppressLint("NotifyDataSetChanged")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder = ViewHolder(DashSelectedEventsBinding.inflate(layInflater, parent, false))
        return viewHolder

    }
    override fun getItemCount(): Int = dataList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("SDSDSDSDSd", dataList.toString())
        holder.setDAta(requireActivity, dataList, position)
    }

    inner class ViewHolder(var bindining: DashSelectedEventsBinding) :
        RecyclerView.ViewHolder(bindining.root) {
        fun setDAta(
            context: Context,
            photos: ArrayList<SelectedDataModelList>,
            position: Int,
        ) {
            Log.e("LFCSAAZZ", dataList.toString())

            bindining.tvDashBoardSelectedEvents.setText(photos[position].cateName)

            bindining.tvDashBoardSelectedEvents.setOnClickListener {
                clickItem.click("", 0, "", "", 0)
            }
        }
    }
}