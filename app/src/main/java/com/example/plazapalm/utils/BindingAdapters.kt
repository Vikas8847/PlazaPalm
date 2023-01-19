package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.location.Location
import android.media.MediaPlayer
import android.os.Build
import android.os.Handler
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
import com.bumptech.glide.request.RequestOptions
import com.example.plazapalm.R
import com.example.plazapalm.models.GetProfileData
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.views.dashboard.DashBoardVM
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView
import me.relex.circleindicator.CircleIndicator
import javax.inject.Inject


/** Binding Adapters */
object BindingAdapters {
//    @Inject
//    lateinit var pref : PreferenceFile
    @BindingAdapter(value = ["setRecyclerAdapter"], requireAll = false)
    @JvmStatic
    fun setRecyclerAdapter(
        recyclerView: RecyclerView,
        adapter: RecyclerView.Adapter<*>
    ) {
        recyclerView.adapter = adapter
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
        circleDotIndicator: CircleIndicator
    ) {
        vp.adapter = adapter
        circleDotIndicator.setViewPager(vp)
    }

    @BindingAdapter(value = ["addScrollListener"], requireAll = false)
    @JvmStatic
    fun addScrollListener(
        recyclerView: RecyclerView,
        listener: RecyclerView.OnScrollListener
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
        listener: BottomNavigationView.OnNavigationItemSelectedListener
    ) {
        bottomNavigationView.setOnNavigationItemSelectedListener(listener)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setColorOfText"], requireAll = false)
    @JvmStatic
    fun setColorOfText(
        textView: TextView,
        color: Int
    ) {
        textView.setTextColor(textView.context.getColor(color))
    }
    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setText"], requireAll = false)
    @JvmStatic
    fun setText(
        textView: TextView,
        value : String
    ) {
        textView.text =value
    }
    @BindingAdapter(value = ["onCheckChange"], requireAll = false)
    @JvmStatic
    fun onCheckChange(
        compoundButton: CompoundButton,
        listener: CompoundButton.OnCheckedChangeListener
    ) {
        compoundButton.setOnCheckedChangeListener(listener)
    }

    @SuppressLint("CheckResult")
    @BindingAdapter(value = ["setCircleImage"], requireAll = false)
    @JvmStatic
    fun setCircleImage(
        circleImage: CircleImageView,
        imageUrl: String? ) {
        Log.e("VVVVV",IMAGE_LOAD_URL + imageUrl)
        if (imageUrl != null) {
            Glide.with(CommonMethods.context)
                .load(IMAGE_LOAD_URL + imageUrl)
                .error(R.drawable.ic_place_holder)
                .into(circleImage)
        } else {
            // circleImage.resources.getDrawable(R.drawable.ic_place_holder)
            //circleImage.setImageResource(R.drawable.ic_place_holder)
        }
    }

    @BindingAdapter(value = ["setDrawable"], requireAll = false)
    @JvmStatic
    fun setDrawable(
        imageView: ImageView,
        drawable: Int
    ) {
        imageView.setImageResource(drawable)
    }

    @BindingAdapter(value = ["setBackground"], requireAll = false)
    @JvmStatic
    fun setBackground(
        view: View,
        drawable: Int
    ) {
        view.background = ContextCompat.getDrawable(view.context, drawable)
    }

    @BindingAdapter(value = ["radioGroupListener"], requireAll = false)
    @JvmStatic

    fun radioGroupListener(
        view: RadioGroup,
        listener: RadioGroup.OnCheckedChangeListener
    ) {
        view.setOnCheckedChangeListener(listener)
    }

    @BindingAdapter(value = ["addTextWatcher"], requireAll = false)
    @JvmStatic
    fun addTextWatcher(
        view: EditText,
        listener: TextWatcher
    ) {
        view.addTextChangedListener(listener)
    }

    @BindingAdapter(value = ["setImage"], requireAll = false)
    @JvmStatic
    fun setImage(
        shapeableImageView: ImageView,
        imageUrl: String?
    ) {
        if (imageUrl!=null){
            Glide.with(CommonMethods.context)
                .load(IMAGE_LOAD_URL + imageUrl)
//                .apply( RequestOptions().override(700, 400))
                .into(shapeableImageView)

        }
        else
        {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }
    @BindingAdapter(value = ["setHeartImage"], requireAll = false)
    @JvmStatic
    fun setHeartImage(
        heartImage : AppCompatImageView, imageUrl: String? ) {

        if (imageUrl!=null){
            Glide.with(CommonMethods.context)
                .load(IMAGE_LOAD_URL + imageUrl)
                .override(100,100)
                .into(heartImage)

        }
        else
        {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }

    @BindingAdapter(value = ["setViewPager", "addTabLayout", "setIndicator"], requireAll = false)
    @JvmStatic
    fun setViewPager(
        viewPager: ViewPager,
        adapter: PagerAdapter?,
        tabLayout: TabLayout?,
        indicator: CircleIndicator?
    ) {
        if (adapter != null) {
            viewPager.adapter = adapter
            indicator?.setViewPager(viewPager)
            tabLayout?.setupWithViewPager(viewPager)
        }

    }

/*    @BindingAdapter(value = ["swipeRefresh"], requireAll = false)
    @JvmStatic
    fun swipeRefresh(
        swipeRefreshLayout: SwipeRefreshLayout,
        onRefreshListener: SwipeRefreshLayout.OnRefreshListener
    ) {
        swipeRefreshLayout.setOnRefreshListener(onRefreshListener)
        //swipeRefreshLayout.isRefreshing = false
    }*/



    @BindingAdapter(value = ["setVideoImage"], requireAll = false)
    @JvmStatic
    fun setVideoImage(
        videoView : VideoView, imageUrl: String? ) {
        var position=0
        if (imageUrl!=null){
         /*   Glide.with(CommonMethods.context)
                .load(IMAGE_LOAD_URL + imageUrl)
                .override(100,100)
                .into(videoView)*/
            videoView.setVideoPath(IMAGE_LOAD_URL+imageUrl)
          //  mediaController.setAnchorView(videoView)
         //   mediaController.setMediaPlayer(videoView)
           // videoView.setMediaController(mediaController)

            videoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f,0f)
                videoView.seekTo(position!!)

                if (position==0){
                    videoView.start()
                }
                else{
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
                if (mp.duration==videoView.duration){
                    CommonMethods.showToast(CommonMethods.context, "Video is Completed ..")
                }
            }
            videoView.requestFocus()
            videoView.start()
        }
        else
        {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }

    @BindingAdapter(value = ["calculateLatLngToMiles"], requireAll = false)
    @JvmStatic
    fun calculateLatLngToMiles(destinationTV : TextView, viewModel: DashBoardVM?) {
       // destinationTV.text = "ddsssss"
        var latValue1="30.7046"
        var lngValue1="76.7179"
        val latLngA = LatLng(latValue1.toDouble(), lngValue1.toDouble())
        val latLngB = LatLng(viewModel!!.destinationLat.get(), viewModel!!.destinationLong.get())
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude

        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude
        var distance= locationA.distanceTo(locationB).toDouble().toString()
        Handler().postDelayed(object : Runnable {
            override fun run() {
                destinationTV.text = distance+" Miles"
             //   destinationTV.text = "dddd"
                destinationTV.requestLayout()
            }
        },1000)

    //    distance.set(locationA.distanceTo(locationB).toDouble().toString())
     //   Log.d("distanceCal", distance.toString().split(".")[0])
        Log.d("distanceCalqwer", destinationTV.text.toString())
//        distanceCal.set(distance.get().toString())

      //  userMiles.set( distance.get().toString().split(".")[0])


    }


    @BindingAdapter(value = ["setMiles"], requireAll = false)
    @JvmStatic
    fun setMiles(
        textView: AppCompatTextView,
        value : String
    ) {
        textView.text =value.split(".")[0]+" Miles"
    }
}