package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.location.Location
import android.media.MediaPlayer
import android.os.Build
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.apachat.swipereveallayout.core.SwipeLayout
import com.bumptech.glide.Glide
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.VideoShowLayoutBinding
import com.example.plazapalm.models.FavData
import com.example.plazapalm.models.GetProfileData
import com.example.plazapalm.models.ProfileCateData
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.CommonMethods.context
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView
import me.relex.circleindicator.CircleIndicator
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.SimpleDateFormat
import java.util.*


/** Binding Adapters */
object BindingAdapters {
    @BindingAdapter(value = ["setRecyclerAdapter"], requireAll = false)
    @JvmStatic
    fun setRecyclerAdapter(
        recyclerView: RecyclerView,
        adapter: RecyclerView.Adapter<*>,
    ) {
        recyclerView.adapter = adapter
    }


    @BindingAdapter(value = ["setBold"])
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
    @BindingAdapter(
        value = ["setPostPsrofileName", "setCustomerName", "userType"],
        requireAll = false
    )
    @JvmStatic
    fun setPostPsrofileName(
        textView: TextView,
        porviderName: String,
        CustomerName: String,
        userType: String,
    ) {
        if (userType.equals("customer")) {
            textView.text = porviderName
            Log.e("QOWIEWww", porviderName)
        } else if (userType.equals("provider")) {
            textView.text = CustomerName
            Log.e("QOWIEWww", porviderName)
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["noDataFound"], requireAll = false)
    @JvmStatic
    fun noDataFound(
        textview: AppCompatTextView,
        value: Boolean,
    ) {
        Log.e("SFdsas", value.toString() + "  xsd  ")

        if (value.equals(true)) {
            textview.visibility = View.VISIBLE
        } else {
            textview.visibility = View.GONE
        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["setTextVisibilty"], requireAll = false)
    @JvmStatic
    fun setTextVisibilty(
        layout: ConstraintLayout,
        value: Boolean,
    ) {

        if (value.equals(true)) {
            layout.visibility = View.GONE
        } else {
            layout.visibility = View.VISIBLE
        }

    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter("btnVisi", "userType")
    @JvmStatic
    fun btnVisi(imageView: AppCompatButton, value: String, userType: String) {

        if (userType.equals("customer")) {
            Log.e("ZSDZXC", userType.toString() + "1")

            if (value.equals("reminderBooking")) {
                imageView.visibility = View.VISIBLE
                Log.e("lkds", value.toString())

            } else if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds", value.toString())

            } else if (value.equals("pending")) {
//            imageView.text= "Accepted"
                imageView.visibility = View.VISIBLE
                Log.e("lkds", value.toString())

            } else if (value.equals("accepted")) {
                imageView.visibility = View.VISIBLE
                imageView.text = "Cancel Booking"
                Log.e("lkds", value.toString())

            } else {
                imageView.visibility = View.VISIBLE
            }

        } else if (userType.equals("provider")) {
            Log.e("ZSDZXC", userType.toString() + "2")

            if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("pending")) {
//            imageView.text= "Accepted"
                imageView.visibility = View.GONE
                Log.e("lkds2", value.toString())

            } else if (value.equals("accepted")) {
                imageView.visibility = View.VISIBLE
                imageView.text = "Cancel Booking"
                Log.e("lkds3", value.toString())

            } else if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())


            } else {
                imageView.visibility = View.VISIBLE
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter("accpeted", "userTypeA")
    @JvmStatic
    fun accpeted(imageView: AppCompatButton, value: String, userTypeA: String) {

        Log.e("ZSDZXC", value.toString())

        if (userTypeA.equals("customer")) {
//            declined
            if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("pending")) {
//            imageView.text= "Accepted"
                imageView.visibility = View.GONE
                Log.e("lkds2", value.toString())

            } else if (value.equals("reminderBooking")) {
                imageView.visibility = View.GONE
                Log.e("lkds3", value.toString())

            } else if (value.equals("accepted")) {
                imageView.text = "Accepted"
                Log.e("lkds3", value.toString())

            } else {
                Log.e("lkds4", value.toString())
                imageView.visibility = View.VISIBLE
            }
        } else {
            if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("pending")) {
//            imageView.text= "Accepted"
                imageView.visibility = View.VISIBLE
                Log.e("lkds2", value.toString())

            } else if (value.equals("accepted")) {
                imageView.text = "Accepted"
                Log.e("lkds3", value.toString())

            } else {
                Log.e("lkds4", value.toString())
                imageView.visibility = View.VISIBLE
            }
        }


    }


    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter("Decline", "userTypeDec")
    @JvmStatic
    fun Decline(imageView: AppCompatButton, value: String, userTypeDec: String) {

        Log.e("ZSDZXC", value.toString())
        Log.e("ZSDZXC-- >> ", userTypeDec.toString())

        if (userTypeDec.equals("customer")) {
//            declined
            if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("pending")) {
                imageView.text = "Accepted"
                imageView.visibility = View.GONE
                Log.e("lkds2", value.toString())

            } else if (value.equals("reminderBooking")) {
                imageView.visibility = View.GONE
                Log.e("lkds3", value.toString())

            } else if (value.equals("accepted")) {
//                imageView.text = "Accepted"
                Log.e("lkds3", value.toString())

            } else {
                Log.e("lkds4", value.toString())
                imageView.visibility = View.VISIBLE
            }
        } else {
            if (value.equals("cancelled")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())

            } else if (value.equals("pending")) {
//            imageView.text= "Accepted"
                imageView.visibility = View.VISIBLE
                Log.e("lkds2", value.toString())

            } else if (value.equals("accepted")) {
                imageView.visibility = View.GONE
                Log.e("lkds3", value.toString())

            } else if (value.equals("declined")) {
                imageView.visibility = View.VISIBLE
                Log.e("lkds1", value.toString())

            } else {
                Log.e("lkds4", value.toString())
                imageView.visibility = View.VISIBLE
            }
        }

    }


    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter("setImageVisibilty")
    @JvmStatic
    fun setImageVisibilty(
        imageView: ImageView,
        value: String,
    ) {
        imageView.setImageDrawable(ContextCompat.getDrawable(context, android.R.color.transparent))

        if (value.equals("cancelled") || value.equals("declined")) {
//            imageView.visibility = View.VISIBLE
            imageView.setImageResource(R.drawable.ic_delete_icon)
            Log.e("lkds", value.toString())

        } else {

            imageView.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    android.R.color.transparent
                )
            )

            Log.e("sdsdk", value.toString())

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
                .load(IMAGE_LOAD_URL + imageUrl).placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(circleImage)
        } else {
            circleImage.setImageResource(R.drawable.placeholder)
        }
    }

    @BindingAdapter(value = ["setDrawable"], requireAll = false)
    @JvmStatic
    fun setDrawable(
        imageView: CircleImageView,
        drawable: Int,
    ) {
        imageView.setImageResource(drawable)
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    @BindingAdapter(value = ["setCalndarBackground", "setCalndarUserType"], requireAll = false)
    @JvmStatic
    fun setCalndarBackground(
        view: androidx.constraintlayout.widget.ConstraintLayout,
        bookingStatus: String,
        setCalndarUserType: String,
    ) {
        if (setCalndarUserType.equals("provider")) {
            if (bookingStatus.equals("pending") || bookingStatus.equals("cancelled") ||
                bookingStatus.equals("accepted") || bookingStatus.equals("declined")
            ) {
                Log.e("SDSD", "sdwwwwwwa")

                view.background = (ContextCompat.getDrawable(
                    MainActivity.context.get()!!,
                    R.drawable.bookanother_back
                ))

            } else {
//                view.background = (ContextCompat.getDrawable(MainActivity.context.get()!!, R.drawable.add_calander_back))
//            view.background = ContextCompat.getDrawable(view.context, )
                Log.e("SDSD", "1231321324563")

            }

        } else if (setCalndarUserType.equals("customer")) {
            if (bookingStatus.equals("pending") || bookingStatus.equals("cancelled") ||
                bookingStatus.equals("accepted") || bookingStatus.equals("declined")
            ) {

                Log.e("SDSD", "sdwwwwwwa")

                view.background =
                    (ContextCompat.getDrawable(
                        MainActivity.context.get()!!,
                        R.drawable.booking_caalnar_back
                    ))

            } else if (bookingStatus.equals("reminderBooking")) {

                view.background = (ContextCompat.getDrawable(
                    MainActivity.context.get()!!,
                    R.drawable.add_calander_back
                ))
                Log.e("SDSD", "1231321324563")

            }
        }
    }

    @BindingAdapter(value = ["radioGroupListener"], requireAll = false)
    @JvmStatic

    fun radioGroupListener(
        view: RadioGroup,
        listener: RadioGroup.OnCheckedChangeListener,
    ) {
        view.setOnCheckedChangeListener(listener)
    }

    @BindingAdapter(value = ["addTextWatcher"], requireAll = false)
    @JvmStatic
    fun addTextWatcher(
        view: EditText,
        listener: TextWatcher,
    ) {
        view.addTextChangedListener(listener)
    }

    @BindingAdapter(value = ["setImage"], requireAll = false)
    @JvmStatic
    fun setImage(
        shapeableImageView: ImageView,
        imageUrl: String?,
    ) {
        if (imageUrl != null) {
            Glide.with(context)
                .load(IMAGE_LOAD_URL + imageUrl).placeholder(R.drawable.placeholder).error(R.drawable.placeholder)
//                .apply( RequestOptions().override(700, 400))
                .into(shapeableImageView)
        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    @BindingAdapter(value = ["setHeartImage"], requireAll = false)
    @JvmStatic
    fun setHeartImage(
        heartImage: AppCompatImageView, imageUrl: String?,
    ) {

        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl)
                .override(100, 100).placeholder(R.drawable.placeholder).error(R.drawable.placeholder)
                .into(heartImage)

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    val METERS_IN_MILE = 1609.344

    fun metersToMiles(meters: Double): Double {
        return meters / METERS_IN_MILE
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
        Log.e("efmgmlwgge===", "dffff")
        if (imageUrl != null) {

            /*    var view=LayoutInflater.from(MainActivity.context.get()).inflate(R.layout.empty_video_layout,null)
                var  ivVideoIcon= view.findViewById<AppCompatImageView>(R.id.ivVideoIcon)*/
            // ivVideoIcon.visibility=View.VISIBLE
            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            var videoLink = IMAGE_LOAD_URL + imageUrl

            Log.e("efmgmlwgge===", videoLink)
            videoView.setVideoPath(videoLink)
            //  mediaController.setAnchorView(videoView)
            //   mediaController.setMediaPlayer(videoView)
            // videoView.setMediaController(mediaController)
            /*  var imageIcon=ImageView(contextValue)
              imageIcon.layoutParams.height=20
              imageIcon.layoutParams.width=20
              imageIcon.setImageResource(R.drawable.ic_play_icon)
              imageIcon.visibility=View.VISIBLE*/

            videoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                videoView.seekTo(position)
                // ivVideoIcon.visibility=View.GONE
                // imageIcon.visibility=View.GONE
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


/*    @SuppressLint("SetTextI18n")
    @BindingAdapter(value = ["calculateLatLngToMiles"], requireAll = false)
    @JvmStatic
    fun calculateLatLngToMiles(
        destinationTV: TextView, distacneValue: Double,
    ) {
        destinationTV.text = distacneValue.toString().split(".")[0] + " " + Constants.MILES_TEXT
        Log.e("dmfledmfdf===", distacneValue.toString())
    }*/

    @BindingAdapter(value = ["setImage"], requireAll = false)
    @JvmStatic
    fun setImage(
        appCompatImageView: AppCompatImageView,
        imageUrl: String?,
    ) {
        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl).placeholder(R.drawable.placeholder).error(R.drawable.placeholder)
                .into(appCompatImageView)
        } else {
        }
    }


    @BindingAdapter(value = ["setEditCoverImage"], requireAll = false)
    fun setEditCoverImage(
        appCompatImageView: AppCompatImageView,
        imageUrl: String?,
    ) {
        if (imageUrl != null) {
            Glide.with(MainActivity.context.get()!!)
                .load(IMAGE_LOAD_URL + imageUrl).placeholder(R.drawable.placeholder).error(R.drawable.placeholder)
                .into(appCompatImageView)

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    @BindingAdapter(value = ["calculateLatLngToMiles"], requireAll = false)
    @JvmStatic
    fun calculateLatLngToMiles(
        destinationTV: TextView,
        distacneValue: Double,
    ) {
        destinationTV.text = ""
        destinationTV.text = distacneValue.toString().split(".")[0] + " " + Constants.MILES_TEXT
        Log.e("dmfledmfdf===", distacneValue.toString())
    }


    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(
        value = ["calculateDistance", "destinationLat", "destinationLong", "currentLat", "currentLong","textData","toptext"],
        requireAll = false
    )
    @JvmStatic
    fun calculateDistance(
        destinationTV: TextView,
        preferenceFile11: String,
        destinationLat: Double,
        destinationLong: Double,
        currentLat: Double,
        currentLong: Double, profileData: ProfileCateData, toptext: Int,
    ) {

        /*  var currentLat=preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble()
          var currentLong=preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()*/

        //currentLat= Constants.TEMP_LATVALUE!!
        //currentLong= Constants.TEMP_LONGVALUE!!


        //var currentLat="30.7046".toDouble()
        //var currentLong="76.7179".toDouble()
        Log.e("egmhamgasg===", Constants.TEMP_LATVALUE!!.toString())
        Log.e("egmhamgasg111===", Constants.TEMP_LONGVALUE!!.toString())
        val latLngA =
            LatLng(Constants.TEMP_LATVALUE!!.toDouble(), Constants.TEMP_LONGVALUE!!.toDouble())
        // val latLngB = LatLng(destLat, destLong)
        val latLngB = LatLng(destinationLat, destinationLong)
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude

        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude

        Log.e("ABCDDDDDDD==", locationA.toString())
        Log.e("ABCDDDDDDD1111==", locationB.toString())
        var distance = locationA.distanceTo(locationB).toDouble().toString()

        var milesValues = metersToMiles(distance.toDouble())
        if (milesValues.toString().contains(".")) {
            destinationTV.text = milesValues.toString().split(".")[0] + " " + Constants.MILES_TEXT
        } else {
            destinationTV.text = milesValues.toString() + " " + Constants.MILES_TEXT
        }

        Log.e("ABCDDDDDDD2222==", milesValues.toString())

        if(toptext==3){
            if (profileData.is_bottom_selected!! ) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                } else {
                    var newColor=""
                    if(profileData.frontpage_font_color!!.contains("#")){
                        newColor=profileData.frontpage_font_color!!
                    }else
                    {
                        newColor="#"+profileData.frontpage_font_color!!
                    }
                    destinationTV.setTextColor(Color.parseColor(newColor))
                }

                if (profileData.frontpage_font_size.toString().toInt() == 0) {
                    destinationTV.textSize = 12f
                } else {
                    // destinationTV.textSize = profileData.frontpage_font_size.toFloat()
                    var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                    finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE
                    destinationTV.textSize = finalTextSize.toFloat()
                }

                if (profileData.frontpage_font_opacity==null || profileData.frontpage_font_opacity.toString().toInt() == 0) {
                    destinationTV.alpha = 1f
                } else {
                    var finalOpacity =((profileData.frontpage_font_opacity!!.toString().toFloat())/100f).toFloat()
                    destinationTV.alpha = finalOpacity
                }

                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        destinationTV.setTypeface(fontList1[0].fontTypeface)
                    }
                }
            }else
            {
                destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                destinationTV.textSize=12f
                destinationTV.alpha=1f
                var fontList= getNewFontsInList()
                destinationTV.setTypeface(fontList[1].fontTypeface)
            }
        }else
        {
            destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
            destinationTV.textSize=12f
            destinationTV.alpha=1f
            var fontList= getNewFontsInList()
            destinationTV.setTypeface(fontList[1].fontTypeface)
        }
    }


    @BindingAdapter(value = ["setMiles"], requireAll = false)
    @JvmStatic
    fun setMiles(
        textView: AppCompatTextView,
        value: String,
    ) {
        textView.text = value.split(".")[0] + " " + Constants.MILES_TEXT
    }


    @BindingAdapter(value = ["setSwipeMode"], requireAll = false)
    @JvmStatic
    fun setSwipeMode(
        swipeLayout: SwipeLayout,
        value: Boolean,
    ) {
        if (value) {
            Log.e("Value_Check===", "true")
            swipeLayout.layoutMode = SwipeLayout.MODE_SAME_LEVEL
            swipeLayout.open(true)
        } else {
            Log.e("Value_Check===", "false")
            swipeLayout.close(true)
            swipeLayout.layoutMode = SwipeLayout.MODE_NORMAL
        }
    }

    @BindingAdapter(value = ["setTime"], requireAll = false)
    @JvmStatic
    fun setTime(textView: TextView, milisecondtime: Any) {
        //02:30 PM
        var formatter = SimpleDateFormat("hh:mm a");
        var newTime = milisecondtime as Long
        var dateString = formatter.format(Date(newTime))
        textView.text = dateString
    }


    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter("SetSelectionColor")
    @JvmStatic
    fun SetSelectionColor(
        calendarView: com.applandeo.materialcalendarview.CalendarView,
        value: String?,
    ) {

        Log.e("ZSDZXC", value.toString() + " cxv ")
        for (i in 0..10) {
            if (i % 2 == 0) {
                calendarView.setSelectionBackground(R.drawable.accepet_back)
                Log.e("lkds1", i.toString())

            } else {

                calendarView.setSelectionBackground(R.drawable.splash_icon)
                Log.e("lkds2", i.toString())
            }
        }

//        if ("pending"!=null && "pending".equals("pending")) {
//            calendarView.setSelectionBackground(R.drawable.bookanother_back)
//            Log.e("lkds1", value.toString())
//
//        } else {
//            calendarView.setSelectionBackground(R.drawable.tick_white_image)
//            Log.e("lkds2", value.toString())
//        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["textproperties","toptext","nameValue"])
    @JvmStatic
    fun textproperties(
        textView: AppCompatTextView,
        profileData: ProfileCateData, toptext: Int, nameValue: String,
    ) {
        textView.setText(nameValue)
        if(toptext==1) {
            if (profileData.is_top_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                } else {
                    if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                        textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                    } else {
                        var newColor=""
                        if(profileData.frontpage_font_color!!.contains("#")){
                            newColor=profileData.frontpage_font_color!!
                        }else
                        {
                            newColor="#"+profileData.frontpage_font_color!!
                        }
                        textView.setTextColor(Color.parseColor(newColor))
                    }
                    //  textView.setTextColor(Color.parseColor(profileData.frontpage_font_color))
                }

                if (profileData.frontpage_font_size.toString().toInt() == 0) {
                    textView.textSize = 12f
                } else {

                    var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                    finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                    textView.textSize = finalTextSize.toFloat()
                }

                if (profileData.frontpage_font_opacity==null || profileData.frontpage_font_opacity.toString().toInt() == 0) {
                    textView.alpha = 1f
                } else {
                    //var finalOpacity = (getExactValue(profileData.frontpage_font_opacity * 2.55)).toFloat()
                    var finalOpacity =((profileData.frontpage_font_opacity!!.toString().toFloat())/100f).toFloat()
                    textView.alpha = finalOpacity
                    Log.e("dfwfwfwf=w==",finalOpacity.toString())
                }

                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }

            }else
            {
                textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                textView.textSize = 12f
                textView.alpha=1f
                var fontList= getNewFontsInList()
                textView.setTypeface(fontList[1].fontTypeface)
            }
        }
        else
        {
            if (profileData.is_bottom_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                } else {

                    if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                        textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                    } else {
                        var newColor=""
                        if(profileData.frontpage_font_color!!.contains("#")){
                            newColor=profileData.frontpage_font_color!!
                        }else
                        {
                            newColor="#"+profileData.frontpage_font_color!!
                        }
                        textView.setTextColor(Color.parseColor(newColor))
                    }



                    //textView.setTextColor(Color.parseColor(profileData.frontpage_font_color))
                }

                if (profileData.frontpage_font_size.toString().toInt() == 0) {
                    textView.textSize = 12f
                } else {
                    var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                    finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                    textView.textSize = finalTextSize.toFloat()
                }
                if (profileData.frontpage_font_opacity == null || profileData.frontpage_font_opacity.toString().toInt() == 0) {
                    textView.alpha = 1f
                } else {
                    var finalOpacity =((profileData.frontpage_font_opacity!!.toString().toFloat())/100f).toFloat()
                    textView.alpha = finalOpacity
                }

                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }
            }else
            {
                textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                textView.textSize=12f
                textView.alpha=1f
                var fontList= getNewFontsInList()
                textView.setTypeface(fontList[1].fontTypeface)
            }
        }

        // }

    }


    fun getExactValue(value:Double):Int
    {
        //  var value=27.50
        var bd: BigDecimal = BigDecimal.valueOf(value)
        bd= bd.setScale(0, RoundingMode.HALF_UP)
        return bd.toInt()
    }


    //for Favourite screen
    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(
        value = ["calculateDistanceForFavourite", "destinationLat", "destinationLong", "currentLat", "currentLong","textData","toptext"],
        requireAll = false
    )
    @JvmStatic
    fun calculateDistanceForFavourite(
        destinationTV: TextView,
        preferenceFile11: String,
        destinationLat: Double,
        destinationLong: Double,
        currentLat: Double,
        currentLong: Double, textData: FavData, toptext: Int,
    ) {

        /*  var currentLat=preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble()
          var currentLong=preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()*/

        //currentLat= Constants.TEMP_LATVALUE!!
        //currentLong= Constants.TEMP_LONGVALUE!!


        //var currentLat="30.7046".toDouble()
        //var currentLong="76.7179".toDouble()
        Log.e("egmhamgasg===", Constants.TEMP_LATVALUE!!.toString())
        Log.e("egmhamgasg111===", Constants.TEMP_LONGVALUE!!.toString())
        val latLngA =
            LatLng(Constants.TEMP_LATVALUE!!.toDouble(), Constants.TEMP_LONGVALUE!!.toDouble())
        // val latLngB = LatLng(destLat, destLong)
        val latLngB = LatLng(destinationLat, destinationLong)
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude

        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude

        Log.e("ABCDDDDDDD==", locationA.toString())
        Log.e("ABCDDDDDDD1111==", locationB.toString())
        var distance = locationA.distanceTo(locationB).toDouble().toString()

        var milesValues = metersToMiles(distance.toDouble())
        if (milesValues.toString().contains(".")) {
            destinationTV.text = milesValues.toString().split(".")[0] + " " + Constants.MILES_TEXT
        } else {
            destinationTV.text = milesValues.toString() + " " + Constants.MILES_TEXT
        }

        Log.e("ABCDDDDDDD2222==", milesValues.toString())
        /*    if(toptext==3){
                if (textData.is_bottom_selected!!) {
                    if (textData.frontpage_font_color == "" || textData.frontpage_font_color == "null") {
                        destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                    } else {


                        if (textData.frontpage_font_color == "" || textData.frontpage_font_color == "null") {
                            destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                        } else {
                            var newColor=""
                            if(textData.frontpage_font_color!!.contains("#")){
                                newColor=textData.frontpage_font_color!!
                            }else
                            {
                                newColor="#"+textData.frontpage_font_color!!
                            }
                            destinationTV.setTextColor(Color.parseColor(newColor))
                        }


                        // destinationTV.setTextColor(Color.parseColor(textData.frontpage_font_color))
                    }

                    if (textData.frontpage_font_size.toString().toInt() == 0) {
                        destinationTV.textSize =12f
                    } else {

                        var finalTextSize = (getTextSizeValue((textData.frontpage_font_size!!.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                        finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                        destinationTV.textSize = finalTextSize.toFloat()

                        // destinationTV.textSize = textData.frontpage_font_size!!.toFloat()
                    }
                    if (textData.frontpage_font_opacity == 0) {
                        destinationTV.alpha = 1f
                    } else {
                        var finalOpacity =((textData.frontpage_font_opacity!!.toFloat())/100f).toFloat()
                        destinationTV.alpha = finalOpacity
                    }

                    if (textData.frontpage_bottom_text.toString() == "") {
                    } else {
                        var fontList= getNewFontsInList()
                        var fontList1 = fontList!!.filter { it.name == textData.frontpage_bottom_text.toString() }
                        if(fontList1.size>0){
                            destinationTV.setTypeface(fontList1[0].fontTypeface)
                        }
                    }
                }else
                {
                    destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                    destinationTV.textSize=12f
                    destinationTV.alpha=1f
                    var fontList= getNewFontsInList()
                    destinationTV.setTypeface(fontList[1].fontTypeface)
                }
            }else
            {
                destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                destinationTV.textSize=12f
                destinationTV.alpha=1f
                var fontList= getNewFontsInList()
                destinationTV.setTypeface(fontList[1].fontTypeface)
            }*/
        /*  if(toptext==3){
              if (profileData.is_bottom_selected ) {
                  if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                      destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                  } else {
                      destinationTV.setTextColor(Color.parseColor(profileData.frontpage_font_color))
                  }

                  if (profileData.frontpage_font_size == 0) {
                      destinationTV.textSize =
                          MainActivity.context.get()!!.resources.getDimension(com.intuit.ssp.R.dimen._10ssp)
                  } else {
                      destinationTV.textSize = profileData.frontpage_font_size.toFloat()
                  }
                  if (profileData.frontpage_font_opacity == 0) {
                      destinationTV.alpha = 1f
                  } else {
                      var finalOpacity =((profileData.frontpage_font_opacity.toFloat())/100f).toFloat()
                      destinationTV.alpha = finalOpacity
                  }

                  if (profileData.frontpage_bottom_text.toString() == "") {
                  } else {
                      var fontList= getNewFontsInList()
                      var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                      if(fontList1.size>0){
                          destinationTV.setTypeface(fontList1[0].fontTypeface)
                      }
                  }
              }else
              {
                  //destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                  // textView.textSize=MainActivity.context.get()!!.resources.getDimension(com.intuit.ssp.R.dimen._5ssp)
                  // textView.alpha=1f
              }
          }else
          {
              destinationTV.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
          }*/
    }

    //for Favourite screen
    @RequiresApi(Build.VERSION_CODES.M)
    @BindingAdapter(value = ["textpropertiesForFavourite","toptext"])
    @JvmStatic
    fun textpropertiesForFavourite(
        textView: AppCompatTextView,
        profileData: FavData, toptext: Int,
    ) {
        if(toptext==1) {
            if (profileData.is_top_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                } else {

                    if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                        textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                    } else {
                        var newColor=""
                        if(profileData.frontpage_font_color!!.contains("#")){
                            newColor=profileData.frontpage_font_color!!
                        }else
                        {
                            newColor="#"+profileData.frontpage_font_color!!
                        }
                        textView.setTextColor(Color.parseColor(newColor))
                    }


                    // textView.setTextColor(Color.parseColor(profileData.frontpage_font_color))
                }

                if (profileData.frontpage_font_size.toString().toInt() == 0) {
                    textView.textSize = 12f
                } else {
                    var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                    finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE
                    textView.textSize = finalTextSize.toFloat()
                }

                if (profileData.frontpage_font_opacity == 0) {
                    textView.alpha = 1f
                } else {
                    //var finalOpacity = (getExactValue(profileData.frontpage_font_opacity * 2.55)).toFloat()
                    var finalOpacity =((profileData.frontpage_font_opacity!!.toFloat())/100f).toFloat()
                    textView.alpha = finalOpacity
                    Log.e("dfwfwfwf=w==",finalOpacity.toString())
                }

                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }

            }else
            {
                textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                textView.textSize=12f
                textView.alpha=1f
                var fontList= getNewFontsInList()
                textView.setTypeface(fontList[1].fontTypeface)
            }
        }
        else
        {
            if (profileData.is_bottom_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                } else {
                    var newColor=""
                    if(profileData.frontpage_font_color!!.contains("#")){
                        newColor=profileData.frontpage_font_color!!
                    }else
                    {
                        newColor="#"+profileData.frontpage_font_color!!
                    }
                    textView.setTextColor(Color.parseColor(newColor))
                }

                if (profileData.frontpage_font_size.toString().toInt() == 0) {
                    textView.textSize = 12f
                } else {
                    var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                    finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE
                    textView.textSize = finalTextSize.toFloat()
                }

                if (profileData.frontpage_font_opacity == 0) {
                    textView.alpha = 1f
                } else {
                    var finalOpacity =((profileData.frontpage_font_opacity!!.toFloat())/100f).toFloat()
                    textView.alpha = finalOpacity
                }

                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }
            }else
            {
                textView.setTextColor(MainActivity.context.get()!!.getColor(R.color.white))
                textView.textSize=12f
                textView.alpha=1f
                var fontList= getNewFontsInList()
                textView.setTypeface(fontList[1].fontTypeface)
            }
        }

        // }

    }


    @BindingAdapter(value = ["ViewProfile"], requireAll = false)
    @JvmStatic
    fun ViewProfile(
        textview: AppCompatTextView,
        value: String,
    ) {
        Log.e("Value_Check===", value)

        if (value.equals("provider")) {
            textview.visibility = View.GONE
        } else {
            textview.visibility = View.VISIBLE
        }
    }


    @JvmStatic
    @BindingAdapter("app:setIncludeLayoutImage", requireAll = false)
    fun setIncludeLayoutImage(
        videoView: View, imageUrl: String?,
    ) {
        var position = 0
        Log.e("efmgmlwgge===", "dffff")
        if (imageUrl != null) {

            val binding: VideoShowLayoutBinding =
                VideoShowLayoutBinding.inflate(LayoutInflater.from(MainActivity.context.get()))
            // binding.includedLayout.textView.setText("text")


            /* var view=LayoutInflater.from(MainActivity.context.get()).inflate(R.layout.video_show_layout,null)
             var  ivVideoIcon= view.findViewById<AppCompatImageView>(R.id.ivVideoIcon)
             var  videoView= view.findViewById<FullScreenVideoView>(R.id.newVideoView)*/
            // ivVideoIcon.visibility=View.VISIBLE
            /*   Glide.with(CommonMethods.context)
                   .load(IMAGE_LOAD_URL + imageUrl)
                   .override(100,100)
                   .into(videoView)*/
            var videoLink = IMAGE_LOAD_URL + imageUrl

            Log.e("efmgmlwgge===", videoLink)
            binding.newVideoView.setVideoPath(videoLink)
            //  mediaController.setAnchorView(videoView)
            //   mediaController.setMediaPlayer(videoView)
            // videoView.setMediaController(mediaController)
            /*  var imageIcon=ImageView(contextValue)
              imageIcon.layoutParams.height=20
              imageIcon.layoutParams.width=20
              imageIcon.setImageResource(R.drawable.ic_play_icon)
              imageIcon.visibility=View.VISIBLE*/

            binding.newVideoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                binding.newVideoView.seekTo(position)
                binding.ivVideoIcon.visibility=View.GONE
                // imageIcon.visibility=View.GONE
                if (position == 0) {
                    binding.newVideoView.start()
                } else {
                    binding.newVideoView.pause()
                }

                mp.isLooping = true
                // CommonMethods.showToast(requireContext(), "Video is Preparing")
                Log.d("VideoPreparing", "video is preparing " + binding.newVideoView.duration)
            }
            binding.newVideoView.setOnErrorListener { _, code1, _ ->
                Log.e("Video_ErrorCode===", code1.toString())
                //  Log.d("VideoError", "$mediaPlayer")
                //  CommonMethods.showToast(MainActivity.context.get()!!, "Error in Video Playing..")
                true
            }
            binding.newVideoView.setOnCompletionListener { mp ->
                // videoView.start()
                /* if (mp.duration == videoView.duration) {
 \                }*/
            }
            binding.newVideoView.requestFocus()
            binding.newVideoView.start()
        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


}