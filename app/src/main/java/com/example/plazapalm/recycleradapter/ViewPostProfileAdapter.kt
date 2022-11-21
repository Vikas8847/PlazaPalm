package com.example.plazapalm.recycleradapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.databinding.ViewProfileImagesListBinding
import com.example.plazapalm.models.GetPostProfileResponse
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL


class ViewPostProfileAdapter(
    var requireActivity: FragmentActivity,
    var dataList: ArrayList<String>,
    var dsc2: String,
    var dsc3: String,
    dsc1: String
)

    : RecyclerView.Adapter<ViewPostProfileAdapter.ViewHolder>() {
    @SuppressLint("NotifyDataSetChanged")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder = ViewHolder(ViewProfileImagesListBinding.inflate(layInflater, parent, false))
        return viewHolder

    }

    override fun getItemCount(): Int = dataList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("SDSDSDSDSd", dsc2 + "CC    " + dataList.toString())

        holder.setDAta(requireActivity, dataList, position, dsc2, dsc3)
    }

    inner class ViewHolder(var bindining: ViewProfileImagesListBinding) :
        RecyclerView.ViewHolder(bindining.root) {
        fun setDAta(context: Context, photos: ArrayList<String>, position: Int, dsc2: String, dsc3: String) {
            if (photos.size <= 3) {
                when (position) {
                    1 -> {
                        Glide.with(context)
                            .load(IMAGE_LOAD_URL + photos[position])
                            .into(bindining.ivFavOfDesc1Img)
                        bindining.clVEditProDescription.visibility = View.VISIBLE
                        bindining.etVEditProDescription.text = dsc2
                    }
                    2 -> bindining.clVEditProDescription.visibility = View.GONE
                    3 -> bindining.clVEditProDescription.visibility = View.GONE
                    4 -> {
                        bindining.clVEditProDescription.visibility = View.VISIBLE
                        bindining.etVEditProDescription.text = dsc3
                    }
                }

            }else{
            }

        }
        /*fun setVideo(context: Context,dataList: ArrayList<String> ,position: Int*//* = java.util.ArrayList<kotlin.String> *//*){

            if (allDataList[position].data.pr)
        }*/
    }
}


