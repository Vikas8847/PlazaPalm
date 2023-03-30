package com.example.plazapalm.views.selectcategory.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.databinding.SlectCateItemsBinding
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.CategoriesData

class SelectCateAdapter(
    var requireActivity: FragmentActivity,
    var categortList: ArrayList<CategoriesData>,
    var clickItem: clickItem,
    var status: String
) :
    RecyclerView.Adapter<SelectCateAdapter.SelectCateViewHolder>() {

    fun addNewDataList(newphotosList: ArrayList<CategoriesData>) {
        categortList.clear()
        categortList.addAll(newphotosList)
        notifyDataSetChanged()
    }

    fun getNewList():ArrayList<CategoriesData>
    {
        return  categortList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectCateViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder =
            SelectCateViewHolder(SlectCateItemsBinding.inflate(layInflater, parent, false))
        return viewHolder
    }

    override fun onBindViewHolder(holder: SelectCateViewHolder, position: Int) {

        if (status.equals("selectcategeroy")) {
            holder.binding.tvSelectCategory.text =
                categortList[position].category_name + " (" + categortList[position].count + ")"

            holder.binding.tvSelectCategory.setOnClickListener {
                clickItem.click(
                    categortList[position].category_name,
                    position,
                    categortList[position]._id,
                    "postprofile",
                    0
                )
            }

        } else if (status.equals("OpenCategeroy")) {
            holder.binding.tvSelectCategory.text =
                categortList[position].category_name + " (" + categortList[position].count + ")"
            holder.binding.tvSelectCategory.setOnClickListener {
                clickItem.click(
                    categortList[position].category_name,
                    position,
                    categortList[position]._id,
                    "OpenCategeroy",
                    0
                )
            }

        }

    }

    override fun getItemCount(): Int {
        Log.d("MyAdapter", "getItemCount() called. Data size: ${categortList.size}")

        return categortList.size
    }

    class SelectCateViewHolder(var binding: SlectCateItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}