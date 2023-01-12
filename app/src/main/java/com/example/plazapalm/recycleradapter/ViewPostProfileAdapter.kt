package com.example.plazapalm.recycleradapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.databinding.ViewProfileImagesListBinding
import com.example.plazapalm.models.AddImageDescriptionPOJO
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.Constants


class ViewPostProfileAdapter(
    var requireActivity: FragmentActivity,
    var dataList: ArrayList<AddImageDescriptionPOJO>
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


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("SDSDSDSDSd", dataList.toString())

        holder.setDAta(requireActivity, dataList, position)
    }

    inner class ViewHolder(var bindining: ViewProfileImagesListBinding) :
        RecyclerView.ViewHolder(bindining.root) {

        @RequiresApi(Build.VERSION_CODES.M)
        fun setDAta(
            context: Context,
            photos: ArrayList<AddImageDescriptionPOJO>,
            position: Int,
        ) {

            if (!(photos[position].Desc.toString().trim().equals(""))) {
                bindining.clVEditProDescription.visibility = View.VISIBLE
            } else {
                bindining.clVEditProDescription.visibility = View.GONE
            }

            var fontColor = "#000000"
            var borderColor = "#FFFFFFFF"
            var columnColor = "#FFFFFFFF"
            var borSiz = 8

            bindining.etVEditProDescription.text = photos[position].Desc.toString().trim()


            if (!(photos[position].fontColor.equals(""))) {
                fontColor = photos[position].fontColor as String
                bindining.etVEditProDescription.setTextColor(Color.parseColor(fontColor.toString()))

            } else {
                bindining.etVEditProDescription.setTextColor(Color.parseColor(fontColor.toString()))
            }

            if (!(photos[position].borderColor.equals(""))) {
                borderColor = photos[position].borderColor as String
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            } else {
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            }

            if (photos[position].columnColor.equals("") && !(photos[position].columnColor.equals("")) ) {

                Log.e("SFDDDDWEEW",photos[position].columnColor as String + "DVDVCC  " +photos[position].borderColor as String )
                columnColor = photos[position].columnColor as String
                borderColor = photos[position].borderColor as String
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)

            } else {
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            }

//            if ((photos[position].borderSiz!=0)) {
//                borSiz = photos[position].borderSiz!!
//                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
//            } else {
//                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
//            }


//            bindining.etVEditProDescription.setTextSize(photos[position].fontSize)

            Glide.with(context)
                .load(IMAGE_LOAD_URL + photos.get(position).Image)
                .into(bindining!!.ivFavOfDesc1Img)

        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setbackground(layout: View, color: String, borSiz: Int, borColor: String) {

        val shape = GradientDrawable()
        shape.setShape(GradientDrawable.RECTANGLE)
        shape.cornerRadii = floatArrayOf(22f, 22f, 22f, 22f, 22f, 22f, 22f, 22f)
        shape.setColor(Color.parseColor(color))
        shape.setStroke(borSiz, Color.parseColor(borColor))
        layout?.setBackground(shape)
    }

}
