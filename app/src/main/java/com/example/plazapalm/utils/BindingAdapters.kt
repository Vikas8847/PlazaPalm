package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.media.MediaPlayer
import android.os.Build
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.models.GetProfileData
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView
import me.relex.circleindicator.CircleIndicator


/** Binding Adapters */
object BindingAdapters {
    //    @Inject
//    lateinit var pref: PreferenceFile

    //    @Inject
//    lateinit var pref : PreferenceFile

    @BindingAdapter(value = ["setBackground"], requireAll = false)
    @JvmStatic
    fun setBackground(
        view: View,
        drawable: Int,
    ) {

        view.background = ContextCompat.getDrawable(MainActivity.context.get()!!, drawable)
    }

    @BindingAdapter(value = ["setRecyclerAdapter"], requireAll = false)
    @JvmStatic
    fun setRecyclerAdapter(
        recyclerView: RecyclerView,
        adapter: RecyclerView.Adapter<*>,
    ) {
        recyclerView.adapter = adapter
    }


    @BindingAdapter(value = ["setBold"])
    @JvmStatic
    fun setBold(view: AppCompatTextView, isPosition: Int) {
        when (isPosition) {
            0 -> {
                view.setTypeface(null, Typeface.BOLD)
            }
            1 -> {
                view.setTypeface(null, Typeface.NORMAL)
            }
            2 -> {
                view.setTypeface(null, Typeface.ITALIC)
            }
            else -> {
                view.setTypeface(null, Typeface.NORMAL)
            }
        }
    }


    @BindingAdapter(value = ["setProfilePicture"], requireAll = false)
    @JvmStatic
    fun setProfilePicture(circleImageView: CircleImageView, imgUrl: GetProfileData?) {
        Glide.with(circleImageView).load(imgUrl).into(circleImageView)
    }


    @BindingAdapter(value = ["setViewPagerAdapter", "setDots"], requireAll = false)
    @JvmStatic
    fun setViewPagerAdapter(
        vp: ViewPager,
        adapter: PagerAdapter,
        circleDotIndicator: CircleIndicator,
    ) {
        vp.adapter = adapter
        circleDotIndicator.setViewPager(vp)
    }

    @BindingAdapter(value = ["addScrollListener"], requireAll = false)
    @JvmStatic
    fun addScrollListener(
        recyclerView: RecyclerView,
        listener: RecyclerView.OnScrollListener,
    ) {
        recyclerView.addOnScrollListener(listener)
    }

    /* @BindingAdapter(value = ["otpListener"], requireAll = false)
     @JvmStatic
     fun otpListener(
         otpView: MukeshOtpView,
         listener: MukeshOtpCompleteListener
     ) {
         otpView.setOtpCompletionListener(listener)
     }*/

    @BindingAdapter(value = ["bottomNavigationListener"], requireAll = false)
    @JvmStatic
    fun bottomNavigationListener(
        bottomNavigationView: BottomNavigationView,
        listener: BottomNavigationView.OnNavigationItemSelectedListener,
    ) {
        bottomNavigationView.setOnNavigationItemSelectedListener(listener)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setColorOfText"], requireAll = false)
    @JvmStatic
    fun setColorOfText(
        textView: TextView,
        color: Int,
    ) {
        textView.setTextColor(textView.context.getColor(color))
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setText"], requireAll = false)
    @JvmStatic
    fun setText(
        textView: TextView,
        value: String,
    ) {
        val split = value.split("T")
        val date = split.get(0)
        textView.text = date
        Log.e("QOWIEWww", date.toString())
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setTextVisibilty"], requireAll = false)
    @JvmStatic
    fun setTextVisibilty(
        textView: TextView,
        value: String,
    ) {

        if (value.equals(true)) {
            textView.text = " "
            textView.visibility = View.VISIBLE
        } else {
            textView.text = "No Data Found"
            textView.visibility = View.VISIBLE
        }

    }

    @BindingAdapter(value = ["onCheckChange"], requireAll = false)
    @JvmStatic
    fun onCheckChange(
        compoundButton: CompoundButton,
        listener: CompoundButton.OnCheckedChangeListener,
    ) {
        compoundButton.setOnCheckedChangeListener(listener)
    }

    @BindingAdapter(value = ["setCircleImage"], requireAll = false)
    @JvmStatic
    fun setCircleImage(
        circleImage: CircleImageView,
        imageUrl: String?,
    ) {
        Log.e("VVVVV", IMAGE_LOAD_URL + imageUrl)
        if (imageUrl != null && imageUrl != "null" && imageUrl != "") {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl)
                .error(R.drawable.placeholder)
                .into(circleImage)
        }
    }

    @BindingAdapter(value = ["setDrawable"], requireAll = false)
    @JvmStatic
    fun setDrawable(
        imageView: ImageView,
        drawable: Int,
    ) {
        imageView.setImageResource(drawable)
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    @BindingAdapter(value = ["setCalndarBackground"], requireAll = false)
    fun setCalndarBackground(
        view: androidx.constraintlayout.widget.ConstraintLayout,
        bookingStatus: String,
    ) {
        if (bookingStatus.equals("pending")) {
            Log.e("SDSD", "sdwwwwwwa")
//            view.background = ContextCompat.getDrawable(view.context.resources.getDrawable(R.drawable.placeholder))
            view.background =
                (ContextCompat.getDrawable(
                    MainActivity.context.get()!!,
                    R.drawable.booking_caalnar_back
                ))

        } else {
            view.background = (ContextCompat.getDrawable(
                MainActivity.context.get()!!,
                R.drawable.add_calander_back
            ))
//            view.background = ContextCompat.getDrawable(view.context, )
            Log.e("SDSD", "1231321324563")

        }
    }

    @BindingAdapter(value = ["radioGroupListener"], requireAll = false)
    fun radioGroupListener(
        view: RadioGroup,
        listener: RadioGroup.OnCheckedChangeListener,
    ) {
        view.setOnCheckedChangeListener(listener)
    }

    @BindingAdapter(value = ["addTextWatcher"], requireAll = false)
    fun addTextWatcher(
        view: EditText,
        listener: TextWatcher,
    ) {
        view.addTextChangedListener(listener)
    }


    @BindingAdapter(value = ["setHeartImage"], requireAll = false)
    fun setHeartImage(
        heartImage: AppCompatImageView, imageUrl: String?,
    ) {

        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl)
                .override(100, 100)
                .into(heartImage)

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    val METERS_IN_MILE = 1609.344

    fun metersToMiles(meters: Double): Double {
        return meters / METERS_IN_MILE
    }
    fun milesToMeters(miles: Double): Double {
        return miles * METERS_IN_MILE
    }

    @JvmStatic
    @BindingAdapter(
        value = ["setViewPager", "addTabLayout", "setIndicator"],
        requireAll = false
    )
    fun setViewPager(
        viewPager: ViewPager,
        adapter: PagerAdapter?,
        tabLayout: TabLayout?,
        indicator: CircleIndicator?,
    ) {
        if (adapter != null) {
            viewPager.adapter = adapter
            indicator?.setViewPager(viewPager)
            tabLayout?.setupWithViewPager(viewPager)
        }

    }


    @JvmStatic
    @BindingAdapter("setVideoImage", requireAll = false)
    fun setVideoImage(
        videoView: VideoView, imageUrl: String?,
    ) {
        var position = 0
        if (imageUrl != null) {

            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            videoView.setVideoPath(IMAGE_LOAD_URL + imageUrl)
            //  mediaController.setAnchorView(videoView)
            //   mediaController.setMediaPlayer(videoView)
            // videoView.setMediaController(mediaController)

            videoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                videoView.seekTo(position)

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
                CommonMethods.showToast(MainActivity.context.get()!!, "Error in Video Playing..")
                false
            }
            videoView.setOnCompletionListener { mp ->
                // videoView.start()
                if (mp.duration == videoView.duration) {
                    CommonMethods.showToast(MainActivity.context.get()!!, "Video is Completed ..")
                }
            }
            videoView.requestFocus()
            videoView.start()
        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }

    /***for full screen video view */

    @JvmStatic
    @BindingAdapter("setFullScreenVideo", requireAll = false)
    fun setFullScreenVideo(
        fullScreenVideoView: VideoView, imageUrl: String?,
    ) {
        var position = 0
        if (imageUrl != null) {
            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            fullScreenVideoView.setVideoPath(IMAGE_LOAD_URL + imageUrl)
            //  mediaController.setAnchorView(videoView)
            //   mediaController.setMediaPlayer(videoView)
            // videoView.setMediaController(mediaController)

            fullScreenVideoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                fullScreenVideoView.seekTo(position)

                if (position == 0) {
                    fullScreenVideoView.start()
                } else {
                    fullScreenVideoView.pause()
                }

                mp.isLooping = true
                // CommonMethods.showToast(requireContext(), "Video is Preparing")
                Log.d("VideoPreparing", "video is preparing " + fullScreenVideoView.duration)
            }
            fullScreenVideoView.setOnErrorListener { mediaPlayer, _, _ ->

                Log.d("VideoError", "$mediaPlayer")
                CommonMethods.showToast(MainActivity.context.get()!!, "Error in Video Playing..")
                false
            }
            fullScreenVideoView.setOnCompletionListener { mp ->
                // videoView.start()
                if (mp.duration == fullScreenVideoView.duration) {
                    CommonMethods.showToast(MainActivity.context.get()!!, "Video is Completed ..")
                }
            }
            fullScreenVideoView.requestFocus()
            fullScreenVideoView.start()
        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    @SuppressLint("SetTextI18n")
    @BindingAdapter(value = ["calculateLatLngToMiles"], requireAll = false)
    @JvmStatic
    fun calculateLatLngToMiles(
        destinationTV: TextView, distacneValue: Double,
    ) {
        destinationTV.text = distacneValue.toString().split(".")[0] + " " + Constants.MILES_TEXT
        Log.e("dmfledmfdf===", distacneValue.toString())
    }

    @BindingAdapter(value = ["setImage"], requireAll = false)
    @JvmStatic
    fun setImage(
        appCompatImageView: AppCompatImageView,
        imageUrl: String?,
    ) {
        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl)
                .into(appCompatImageView)
        } else {
        }
    }


    @BindingAdapter(value = ["setEditCoverImage"], requireAll = false)
    fun setEditCoverImage(
        appCompatImageView: AppCompatImageView,
        imageUrl: String?
    ) {
        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl)
                .into(appCompatImageView)

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }

}