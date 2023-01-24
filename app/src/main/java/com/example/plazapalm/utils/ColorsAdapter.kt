package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ChooseColorItemsBinding
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.ChooseColor


class ColorsAdapter(
    var requireActivity: Context,
    var dataList: ArrayList<ChooseColor>,
    var clickItem: clickItem
)

    : RecyclerView.Adapter<ColorsAdapter.ViewHolder>() {
    @SuppressLint("NotifyDataSetChanged")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder = ViewHolder(ChooseColorItemsBinding.inflate(layInflater, parent, false))
        return viewHolder

    }

    override fun getItemCount(): Int = dataList.size


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("SDSDSDSDSd", dataList.toString())

        holder.setDAta(requireActivity, dataList, position)
    }

    inner class ViewHolder(var bindining: ChooseColorItemsBinding) :
        RecyclerView.ViewHolder(bindining.root) {

        @RequiresApi(Build.VERSION_CODES.M)
        @SuppressLint("ResourceAsColor")
        fun setDAta(
            context: Context,
            photos: ArrayList<ChooseColor>,
            position: Int,  ) {

           /* when(position){
                0 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.goldYellow))
                1 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.gold))
                2 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.paleRed))
                3 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.brickRed))
                4 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.plumLight))
                5 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.purple))
                6 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.coolBlue))
                7 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.turfGreen))
                8 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.blueGray))
                9 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.sky))
                10 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.green))
                11 -> bindining.changeColors.setBackgroundColor(requireActivity.getColor(R.color.orange))
            }*/

            Log.e("SDFFFFF",photos[position].color.toString())
            bindining.changeColors.setBackgroundColor(requireActivity.getColor(photos[position].color!!))

           /* for (idx in 0 until photos.size){
                val color = photos[position].color

                if (color != null) {
                    bindining.changeColors.setBackgroundColor(color)
                }

            }*/


            bindining.changeClick.setOnClickListener {

                Log.e("DFSDSf",position.toString() +  "VVVVV---- "+ photos[position].color)

                clickItem.click("",position,"","",photos[position].color)
            }
        }
    }
}