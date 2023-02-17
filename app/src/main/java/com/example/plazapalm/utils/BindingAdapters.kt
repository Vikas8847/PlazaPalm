package com.example.plazapalm.utils

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.location.Location
import android.media.MediaPlayer
import android.os.Build
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.apachat.swipereveallayout.core.SwipeLayout
import com.bumptech.glide.Glide
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.models.GetProfileData
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.CommonMethods.context
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView
import me.relex.circleindicator.CircleIndicator
import java.text.SimpleDateFormat
import java.util.*


/** Binding Adapters */
object BindingAdapters {
    //    @Inject
//    lateinit var pref: PreferenceFile

    //    @Inject
//    lateinit var pref : PreferenceFile
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

            }  else if (value.equals("declined")) {
                imageView.visibility = View.GONE
                Log.e("lkds1", value.toString())


            }else {
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

            }else if (value.equals("cancelled")) {
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
            imageView.text= "Accepted"
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
                imageView.visibility=View.GONE
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
    @BindingAdapter("setImageVisibilty" )
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
                .load(IMAGE_LOAD_URL + imageUrl)
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
        setCalndarUserType: String
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
                .load(IMAGE_LOAD_URL + imageUrl)
//                .apply( RequestOptions().override(700, 400))
                .into(shapeableImageView)

        } else {
            //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
        }
    }


    /*   @BindingAdapter(value = ["setEditCoverImage"], requireAll = false)
       @JvmStatic
       fun setEditCoverImage(
           appCompatImageView: AppCompatImageView,
           imageUrl: String?
       ) {
           if (imageUrl != null) {
               Glide.with(context)
                   .load(IMAGE_LOAD_URL + imageUrl)
   //                .apply( RequestOptions().override(700, 400))
                   .into(appCompatImageView)

           } else {
               //shapeableImageView.setImageResource(R.drawable.dash_items_nurse_image)
           }
       }*/

    @BindingAdapter(value = ["setHeartImage"], requireAll = false)
    @JvmStatic
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


    @BindingAdapter(value = ["calculateLatLngToMiles"], requireAll = false)
    @JvmStatic
    fun calculateLatLngToMiles(
        destinationTV: TextView,
        distacneValue: Double,
    ) {
        destinationTV.text = distacneValue.toString().split(".")[0] + " " + Constants.MILES_TEXT
        Log.e("dmfledmfdf===", distacneValue.toString())
    }


    @BindingAdapter(
        value = ["calculateDistance", "destinationLat", "destinationLong", "currentLat", "currentLong"],
        requireAll = false
    )
    @JvmStatic
    fun calculateDistance(
        destinationTV: TextView,
        preferenceFile11: String,
        destinationLat: Double,
        destinationLong: Double,
        currentLat: Double,
        currentLong: Double
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
}