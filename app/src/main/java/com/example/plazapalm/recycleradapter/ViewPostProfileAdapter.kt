package com.example.plazapalm.recycleradapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.media.MediaPlayer
import android.os.Build
import android.util.DisplayMetrics
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.VideoView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.databinding.ViewProfileImagesListBinding
import com.example.plazapalm.models.AddImageDescriptionPOJO
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.FullScreenVideoView


class ViewPostProfileAdapter(
    var requireActivity: FragmentActivity,
    var dataList: ArrayList<AddImageDescriptionPOJO>,
    var widthPixels: Int,
    var fontListModel: FontsListModelResponse,
) : RecyclerView.Adapter<ViewPostProfileAdapter.MyViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layInflater = LayoutInflater.from(parent.context)
        var view=ViewProfileImagesListBinding.inflate(layInflater, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = dataList.size

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.e("SDSDSDSDSd", dataList.toString())

        holder.setDAta(requireActivity, dataList, position)
    }

    inner class MyViewHolder(var bindining: ViewProfileImagesListBinding) : RecyclerView.ViewHolder(bindining.root) {

        @RequiresApi(Build.VERSION_CODES.M)
        fun setDAta(
            context: Context,
            photos: ArrayList<AddImageDescriptionPOJO>,
            position: Int,
        ) {

            var fontColor = "#000000"
            var borderColor = "#C3C3C3"
            var columnColor = "#FFFFFFFF"
            var borSiz = 2

            bindining.etVEditProDescription.text = photos[position].Desc.toString().trim()

            if (!(photos[position].fontColor.equals("null")) && !(photos[position].fontColor.equals(""))) {
                fontColor = photos[position].fontColor as String
                bindining.etVEditProDescription.setTextColor(Color.parseColor(fontColor.toString()))

            } else {
                bindining.etVEditProDescription.setTextColor(Color.parseColor(fontColor.toString()))
            }

            if(fontListModel.name!="temp") {
                if (!(photos[position].font_name.equals("null")) && !(photos[position].font_name.equals(
                        ""))
                ) {
                    bindining.etVEditProDescription.setTypeface(fontListModel.fontTypeface)

                } else {
//                bindining.etVEditProDescription.setTextColor(Color.parseColor(fontColor.toString()))
                }
            }

            if (!(photos[position].borderColor.equals("null")) && !(photos[position].borderColor.equals(""))) {
                borderColor = photos[position].borderColor as String
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            } else {
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            }





            if (!(photos[position].columnColor.equals("null")) && !(photos[position].columnColor.equals(""))) {

                Log.e("SFDDDDWEEW",
                    photos[position].columnColor as String + "DVDVCC  " + photos[position].borderColor as String)
                columnColor = photos[position].columnColor as String
                borderColor = photos[position].borderColor as String
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)

            } else {
                setbackground(bindining.clVEditProDescription, columnColor, borSiz, borderColor)
            }

            if(!(photos[position].Image.equals("null")) && !(photos.get(position).Image!!.equals(""))) {
                if (photos.get(position).Image!!.contains(".png") || photos.get(position).Image!!.contains(
                        ".jpg") || photos.get(position).Image!!.contains(".jpeg")
                ) {
                    Log.e("Media_Valueeeeee===", photos.get(position).Image!!)
                    Glide.with(context).load(IMAGE_LOAD_URL + photos.get(position).Image)
                        .into(bindining.ivFavOfDesc1Img)
                    bindining.videoViewDetailView.visibility = View.GONE
                    bindining.ivVideoIcon.visibility = View.GONE
                    bindining.vPlayer1.visibility = View.GONE

                    bindining.ivFavOfDesc1Img.visibility = View.VISIBLE
                    bindining.ivFavOfDesc1.visibility = View.VISIBLE

                } else {
                    bindining.videoViewDetailView.visibility = View.VISIBLE
                    bindining.ivVideoIcon.visibility = View.VISIBLE
                    bindining.vPlayer1.visibility = View.VISIBLE

                    bindining.ivFavOfDesc1Img.visibility = View.GONE
                    bindining.ivFavOfDesc1.visibility = View.GONE
                    Log.e("gkdegmgeggswg====",
                        IMAGE_LOAD_URL + photos.get(position).Image.toString())
                    /*      try {
                          setVideoPlayerMethod(bindining.videoViewDetail,
                              IMAGE_LOAD_URL + photos.get(position).Image,
                              bindining.ivVideoIcon,
                              widthPixels,
                              bindining.vPlayer1)
                      }catch (e:Exception)
                      {

                      }*/
                    setVideoImage(bindining.videoViewDetailView,IMAGE_LOAD_URL + photos.get(position).Image,bindining.ivVideoIcon)
                }
            }else
            {
                bindining.ivFavOfDesc1Img.visibility = View.GONE
                bindining.ivFavOfDesc1.visibility = View.GONE

                bindining.videoViewDetailView.visibility = View.GONE
                bindining.ivVideoIcon.visibility = View.GONE
                bindining.vPlayer1.visibility = View.GONE
            }
            if (!(photos[position].Desc.toString().trim().equals(""))) {
                bindining.clVEditProDescription.visibility = View.VISIBLE
            } else {
                bindining.clVEditProDescription.visibility = View.GONE
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setbackground(layout: View, color: String, borSiz: Int, borColor: String) {
        Log.e("wdwdwdwd===",borColor)
        Log.e("wdwdwdwd1111===",color)
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.RECTANGLE
        shape.cornerRadii = floatArrayOf(22f, 22f, 22f, 22f, 22f, 22f, 22f, 22f)

        if(color=="" || color=="null" || color==null){
            shape.setColor(Color.parseColor("#ffffff"))
        }else
        {
            shape.setColor(Color.parseColor(color))
        }

        if(borColor=="" || borColor=="null" || borColor==null){
            shape.setStroke(borSiz, Color.parseColor("#000000"))
        }else
        {
            shape.setStroke(borSiz, Color.parseColor(borColor))
        }

        //  shape.setStroke(borSiz, Color.parseColor(borColor))
        layout.background = shape
    }

    //For set Video Player Method
    fun setVideoPlayerMethod(
        videoView: FullScreenVideoView, imageUrl: String?, ivVideoIcon: ImageView,
        widthPixels: Int, parentLayout: ConstraintLayout,
    ) {
        var position = 0
        val metrics = DisplayMetrics()
        //   context.getWindowManager().getDefaultDisplay().getMetrics(metrics)
        //  val videoView = FullScreenVideoView(getActivity())
        try {
            if (imageUrl != null && imageUrl != "") {
                videoView.setVideoPath(imageUrl)
                videoView.setOnPreparedListener { mp ->
                    mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING)
                    parentLayout.removeAllViews()
                    parentLayout.addView(videoView,
                        ConstraintLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.MATCH_PARENT))
                    val params = videoView.layoutParams as ConstraintLayout.LayoutParams
                    params.width = widthPixels
                    //params.height = metrics.heightPixels
                    params.leftMargin = 0
                    videoView.layoutParams = params
                    mp.setVolume(0f, 0f)
                    videoView.seekTo(position)
                    ivVideoIcon.visibility = View.GONE
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
                videoView.start()
            } else {
            }
        }
        catch (e:Exception){
            Log.d("ErrorInViewPostProfile","Error coming in player ${e.message.toString()}")
        }

    }


    fun setVideoImage(
        videoView: VideoView, imageUrl: String?,videoIcon:ImageView
    ) {
        var position = 0
        if (imageUrl != null) {

            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            videoView.setVideoPath(imageUrl)
            //  mediaController.setAnchorView(videoView)
            //   mediaController.setMediaPlayer(videoView)
            // videoView.setMediaController(mediaController)

            videoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                videoView.seekTo(position)
                videoIcon.visibility=View.GONE
                if (position == 0) {
                    videoView.start()
                } else {
                    videoView.pause()
                }

                mp.isLooping = true
                // CommonMethods.showToast(requireContext(), "Video is Preparing")
                Log.d("VideoPreparing", "video is preparing " + videoView.duration)
            }
            videoView.setOnErrorListener { _, code1, _ ->
                Log.e("Video_ErrorCode===", code1.toString())
                //  Log.d("VideoError", "$mediaPlayer")
                //  CommonMethods.showToast(MainActivity.context.get()!!, "Error in Video Playing..")
                true
            }
            videoView.setOnCompletionListener { mp ->
                // videoView.start()
                /* if (mp.duration == videoView.duration) {
 \                }*/
            }
            videoView.requestFocus()
            videoView.start()
        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }
}
