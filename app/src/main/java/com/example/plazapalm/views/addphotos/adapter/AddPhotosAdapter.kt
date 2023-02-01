package com.example.plazapalm.views.addphotos.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AddPhotosItemListBinding
import com.example.plazapalm.interfaces.ItemClickListener
import com.example.plazapalm.models.AddPhoto
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.CommonMethods
import java.io.File

class AddPhotosAdapter(
    val activity: FragmentActivity,
    var photos: ArrayList<AddPhoto>,
    var itemClickListener: ItemClickListener,var screenWidth:Int
) : RecyclerView.Adapter<AddPhotosAdapter.ViewHolder>() {
    var poss: Int? = null

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(picturesList: ArrayList<AddPhoto>, pos: Int) {
        poss = pos
        photos = picturesList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        val viewHolder: RecyclerView.ViewHolder?
        viewHolder = ViewHolder(AddPhotosItemListBinding.inflate(layInflater, parent, false))
        return viewHolder

    }

//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//       val adapterPhotos=holder.itemView.findViewById<ConstraintLayout>(R.id.clAddPhoto)
//        adapterPhotos.setOnClickListener {
//            itemClickListener.onClick(it,"addPhotos",position)
//        }
//        holder.apply {
//
//            if (photos[position].Image!=null){
//                Glide.with(activity)
//                    .load(photos[position].Image)
//                    .into(dataBinding.setimageView)
//            }

//
//        }
//    }

    override fun getItemCount(): Int {
        return if (photos.size < 6) {
            photos.size
        } else {
            6
        }
    }

    inner class ViewHolder(var bindining: AddPhotosItemListBinding) :
        RecyclerView.ViewHolder(bindining.root) {

        fun setImage(
            context: Context, photos: ArrayList<AddPhoto>, position: Int,
        ) {

            bindining.videoView.visibility=View.GONE
            bindining.videoIcon.visibility=View.GONE

            if (photos[position].Image == "") {
                bindining.plusIcon.visibility = View.VISIBLE
            } else {
                if (photos[position].mediaType == 2) {
                    bindining.videoIcon.visibility = View.VISIBLE
                }
                bindining.plusIcon.visibility = View.GONE
            }

          //  if (photos[position].mediaType != 2) {
                Log.e("fmkwewwfwf=wf=efw==",photos[position].mediaType.toString())
                //bindining.videoIcon.visibility=View.GONE
                bindining.setimageView.visibility=View.VISIBLE
                if (photos[position].isValid == true) {
                    Log.e("Value_IS_Adapter===", "True")
                    Glide
                        .with(context)
                        .load(IMAGE_LOAD_URL + photos[position].Image)
                        .centerCrop()
                        .into(bindining.setimageView)
                } else {
                    Log.e("Value_IS_Adapter===", "False")
                    Glide
                        .with(context)
                        .load(File(photos[position].Image))
                        .centerCrop()
                        .into(bindining.setimageView)
                }
        /*    } else {
                Log.e("fmkwewwfwf=wf=efw==",photos[position].mediaType.toString())
                bindining.videoView.visibility=View.VISIBLE
                bindining.videoIcon.visibility=View.VISIBLE
                bindining.setimageView.visibility=View.GONE
                if (photos[position].isValid == true) {
                    Log.e("Value_IS_Adapter===", IMAGE_LOAD_URL + photos[position].Image)
                    *//*Glide
                        .with(context)
                        .load(IMAGE_LOAD_URL + photos[position].Image)
                        .centerCrop()
                        .into(bindining.setimageView)*//*

                    setVideoImage(bindining.videoView,
                        IMAGE_LOAD_URL + photos[position].Image,
                        true,
                        bindining.videoIcon)
                } else {
                    Log.e("Value_IS_Adapter===", "False")
                    *//*     Glide
                             .with(context)
                             .load(File(photos[position].Image))
                             .centerCrop()
                             .into(bindining.setimageView)*//*
                    setVideoImage(bindining.videoView,
                        photos[position].Image,
                        false,
                        bindining.videoIcon)
                }
            }
*/

        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val adapterPhotos=holder.itemView.findViewById<ConstraintLayout>(R.id.clAddPhoto)
        holder.bindining.clAddPhoto.setOnClickListener {
            itemClickListener.onClick(it, "addPhotos", position)
        }


      //  ConstraintLayout.LayoutParams()
     var height=  activity.resources.getDimension(com.intuit.sdp.R.dimen._90sdp).toInt()
       var finalWidth=screenWidth/3-activity.resources.getDimension(com.intuit.sdp.R.dimen._7sdp).toInt()
        val params = ConstraintLayout.LayoutParams(
            finalWidth,
            height
        )
        holder.bindining.clAddPhoto.layoutParams = params
        holder.setImage(activity, photos, position)
    }

    fun setVideoImage(
        videoView: VideoView, imageUrl: String?, videoType: Boolean,
        videoIcon: AppCompatImageView,
    ) {
        var position = 0
        if (imageUrl != null) {
            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            if (videoType) {
                videoView.setVideoPath(imageUrl)
            } else {
                videoView.setVideoURI(Uri.fromFile(File(imageUrl)))
            }
            videoView.start()
            videoView.setOnPreparedListener { mp ->
                //mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                videoView.seekTo(position)
                videoIcon.visibility = View.INVISIBLE
                if (position == 0) {
                    videoView.start()
                } else {
                    videoView.pause()
                }

                mp.isLooping = true
                // CommonMethods.showToast(requireContext(), "Video is Preparing")
                Log.d("VideoPreparing", "video is preparing " + videoView.duration)
            }
            videoView.setOnErrorListener { mediaPlayer, _, _ ->

                Log.d("VideoError", "$mediaPlayer")
                CommonMethods.showToast(CommonMethods.context, "Error in Video Playing..")
                false
            }

            videoView.setOnCompletionListener { mp ->
                // videoView.start()
                if (mp.duration == videoView.duration) {
                    CommonMethods.showToast(CommonMethods.context, "Video is Completed ..")
                }
            }
            videoView.requestFocus()

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }
}


/*
class AddPhotosVH(var binding: AddPhotosItemListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun setData(position: Int) {
        binding.executePendingBindings()
    }

    fun setImaage() {
//        Glide.with(activity)
//            .load(photos[position].Image)
//            .placeholder(R.drawable.advance_map)
//            .into(binding.setimageView)
    }

}*/
