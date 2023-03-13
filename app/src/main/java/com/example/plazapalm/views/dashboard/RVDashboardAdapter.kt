package com.example.plazapalm.views.dashboard

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.location.Location
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.R
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.models.ProfileCateData
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.*
import com.google.android.gms.maps.model.LatLng
import com.squareup.picasso.Picasso

class RVDashboardAdapter(
    private var context: Context,
    private var profileList: ArrayList<ProfileCateData>,
    private var itemClick: DashboardInterface,private var fontList:ArrayList<FontsListModelResponse>,var screenType:String
) :
    RecyclerView.Adapter<RVDashboardAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvDashBoardItemName: AppCompatTextView = itemView.findViewById<AppCompatTextView>(R.id.tvDashBoardItemName)
        var tvDashBoardItemLastName: AppCompatTextView = itemView.findViewById<AppCompatTextView>(R.id.tvDashBoardItemLastName)
        var tvDashBoardItemDescription: AppCompatTextView =
            itemView.findViewById<AppCompatTextView>(R.id.tvDashBoardItemDescription)
        var tvDashBoardItemLocation: AppCompatTextView = itemView.findViewById<AppCompatTextView>(R.id.tvDashBoardItemLocation)
        var tvDashBoardItemDistance: AppCompatTextView = itemView.findViewById<AppCompatTextView>(R.id.tvDashBoardItemDistance)
        var ivDashBoardCat: AppCompatImageView = itemView.findViewById<AppCompatImageView>(R.id.ivDashBoardCat)
        var videoFullScreen: FullScreenVideoView = itemView.findViewById<FullScreenVideoView>(R.id.videoFullScreen)
        var ivVideoIcon: ImageView = itemView.findViewById<ImageView>(R.id.ivVideoIcon)
        var ivFavourite: ImageView = itemView.findViewById<ImageView>(R.id.ivFavourite)
        var player_layout: CardView = itemView.findViewById<CardView>(R.id.player_layout)
    }

    fun getProfileList(): ArrayList<ProfileCateData> {
        return profileList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.dash_board_items, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.tvDashBoardItemName.text = profileList[position].first_name
        holder.tvDashBoardItemLastName.text = profileList[position].last_name
        holder.tvDashBoardItemDescription.text = profileList[position].user_name
        holder.tvDashBoardItemLocation.text = profileList[position].address

        if(screenType.equals("dash")) {
            if (profileList[position].isFavourite!!) {
                holder.ivFavourite.setImageResource(R.drawable.ic_heart_filled_icon)
            } else {
                holder.ivFavourite.setImageResource(R.drawable.ic_heart_icon)
            }
        }else
        {
            holder.ivFavourite.setImageResource(R.drawable.ic_heart_filled_icon)
        }

        holder.ivFavourite.setOnClickListener {
            itemClick.onFavouriteClick(position)
        }

        holder.player_layout.setOnClickListener {
            itemClick.onItemClick(position, holder.player_layout)
        }

        textproperties(holder.tvDashBoardItemName,profileList[position],1,fontList)
        textproperties(holder.tvDashBoardItemLastName,profileList[position],1,fontList)
        textproperties(holder.tvDashBoardItemDescription,profileList[position],2,fontList)
        textproperties(holder.tvDashBoardItemLocation,profileList[position],2,fontList)

        calculateDistance(holder.tvDashBoardItemDistance,
            profileList[position].lat,
            profileList[position].lngValue!!,
            profileList[position],
            3)

        if (profileList[position].postProfile_picture[0].contains(".png") || profileList[position].postProfile_picture[0].contains(
                ".jpg") ||
            profileList[position].postProfile_picture[0].contains(".jpeg")
        ) {

            if (profileList[position].postProfile_picture[0] != null && profileList[position].postProfile_picture[0] != "null" && profileList[position].postProfile_picture[0] != "") {
                /*  Glide.with(context)
                      .load(IMAGE_LOAD_URL + profileList[position].postProfile_picture[0])
                      .placeholder(R.drawable.placeholder)
                      .error(R.drawable.placeholder)
                      .into(holder.ivDashBoardCat)*/

                Picasso.get().load(IMAGE_LOAD_URL + profileList[position].postProfile_picture[0]).fit().centerCrop()
                    .placeholder(R.drawable.placeholder)
                    .into(holder.ivDashBoardCat);

            } else {
                holder.ivDashBoardCat.setImageResource(R.drawable.placeholder)
            }
            holder.videoFullScreen.visibility = View.GONE
            holder.ivVideoIcon.visibility = View.GONE
            holder.ivDashBoardCat.visibility = View.VISIBLE
        } else {
            setVideoImage(holder.videoFullScreen,
                profileList[position].postProfile_picture[0],
                holder.ivVideoIcon)

            Picasso.get().load(IMAGE_LOAD_URL + profileList[position].postProfile_picture[0]).fit().centerCrop()
                .placeholder(R.drawable.placeholder)
                .into(holder.ivDashBoardCat);

            Glide.with(context)
                .load(IMAGE_LOAD_URL + profileList[position].postProfile_picture[0])
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holder.ivDashBoardCat)
            /*holder.videoFullScreen.visibility = View.GONE
            holder.ivVideoIcon.visibility = View.GONE
            holder.ivDashBoardCat.visibility = View.VISIBLE*/
            holder.videoFullScreen.visibility = View.VISIBLE
            holder.ivVideoIcon.visibility = View.VISIBLE
            holder.ivDashBoardCat.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    fun calculateDistance(
        destinationTV: TextView,
        destinationLat: Double,
        destinationLong: Double,
        profileData: ProfileCateData, toptext: Int,
    ) {
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

        if (toptext == 3) {
            if (profileData.is_bottom_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    destinationTV.setTextColor(context.resources.getColor(R.color.white))
                } else {
                    var newColor = ""
                    if (profileData.frontpage_font_color!!.contains("#")) {
                        newColor = profileData.frontpage_font_color!!
                    } else {
                        newColor = "#" + profileData.frontpage_font_color!!
                    }
                    destinationTV.setTextColor(Color.parseColor(newColor))
                }

                if(profileData.frontpage_font_size is Int){
                    if (profileData.frontpage_font_size.toString().toInt() == 0) {
                        destinationTV.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {
                        var finalTextSize =
                            (getTextSizeValue((profileData.frontpage_font_size.toString()
                                .toInt() * (Constants.MAX_FONT_SIZE - Constants.MIN_FONT_SIZE)) / 100.toDouble()))
                        finalTextSize = finalTextSize + Constants.MIN_FONT_SIZE
                        destinationTV.textSize = finalTextSize.toFloat()
                    }
                }else
                {
                    if (profileData.frontpage_font_size.toString().toDouble() == 0.0) {
                        destinationTV.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {
                        var finalTextSize =
                            (getTextSizeValue((profileData.frontpage_font_size.toString().toDouble() * (Constants.MAX_FONT_SIZE - Constants.MIN_FONT_SIZE)) / 100.toDouble()))
                        finalTextSize = finalTextSize + Constants.MIN_FONT_SIZE
                        destinationTV.textSize = finalTextSize.toFloat()
                    }
                }


                /*   if (profileData.frontpage_font_opacity == 0) {
                       destinationTV.alpha = 1f
                   } else {
                       var finalOpacity =
                           ((profileData.frontpage_font_opacity!!.toFloat()) / 100f).toFloat()
                       destinationTV.alpha = finalOpacity
                   }
   */
                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    //  var fontList = getNewFontsInList()
                    var fontList1 =
                        fontList.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if (fontList1.size > 0) {
                        destinationTV.typeface = fontList1[0].fontTypeface
                    }
                }
            } else {
                destinationTV.setTextColor(context.resources.getColor(R.color.white))
                destinationTV.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                destinationTV.alpha = 1f
                // var fontList = getNewFontsInList()
                //  destinationTV.typeface = fontList[1].fontTypeface
                destinationTV.setTypeface(Typeface.SANS_SERIF)
            }
        } else {
            destinationTV.setTextColor(context.resources.getColor(R.color.white))
            destinationTV.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
            destinationTV.alpha = 1f
            //  var fontList = getNewFontsInList()
            // destinationTV.typeface = fontList[1].fontTypeface
            destinationTV.setTypeface(Typeface.SANS_SERIF)
        }
    }

    fun metersToMiles(meters: Double): Double {
        return meters / METERS_IN_MILE
    }
    val METERS_IN_MILE = 1609.344

    fun setVideoImage(
        videoView: VideoView, imageUrl: String?, ivVideoIcon: ImageView,
    ) {
        var position = 0
        Log.e("efmgmlwgge===", "dffff")
        if (imageUrl != null) {

            var videoLink = IMAGE_LOAD_URL + imageUrl
            Log.e("efmgmlwgge===", videoLink)
            videoView.setVideoPath(videoLink)

            videoView.setOnPreparedListener { mp ->
                mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                mp.setVolume(0f, 0f)
                videoView.seekTo(position)
                ivVideoIcon.visibility = View.GONE
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
                true
            }
            videoView.setOnCompletionListener { mp ->
            }
            videoView.requestFocus()
            videoView.start()
        } else {
        }
    }

    fun textproperties(
        textView: AppCompatTextView,
        profileData: ProfileCateData, toptext: Int, fontList: ArrayList<FontsListModelResponse>
    ) {
        // textView.setText(nameValue)
        if(toptext==1) {
            if (profileData.is_top_selected!!) {
                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(context.resources.getColor(R.color.white))
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
                // }

                if(profileData.frontpage_font_size is Int){
                    if (profileData.frontpage_font_size.toString().toInt() == 0) {
                        textView.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {

                        var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                        finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                        textView.textSize = finalTextSize.toFloat()
                    }
                }else
                {
                    if (profileData.frontpage_font_size.toString().toDouble() == 0.0) {
                        textView.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {

                        var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toDouble() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                        finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE
                        Log.e("rfejfjefefef===",profileData.first_name+"=="+finalTextSize.toString())
                        textView.textSize = finalTextSize.toFloat()
                    }
                }

                /*  if (profileData.frontpage_font_opacity == 0) {
                      textView.alpha = 1f
                  } else {
                      //var finalOpacity = (getExactValue(profileData.frontpage_font_opacity * 2.55)).toFloat()
                      var finalOpacity =((profileData.frontpage_font_opacity!!.toFloat())/100f).toFloat()
                      textView.alpha = finalOpacity
                      Log.e("dfwfwfwf=w==",finalOpacity.toString())
                  }*/
                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    //  var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }

            }else
            {
                textView.setTextColor(context.resources.getColor(R.color.white))
                textView.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                textView.alpha=1f
                textView.setTypeface(Typeface.SANS_SERIF)
                //  var fontList= getNewFontsInList()
                //  textView.setTypeface(fontList[1].fontTypeface)
            }
        }
        else
        {
            if (profileData.is_bottom_selected!!) {

                if (profileData.frontpage_font_color == "" || profileData.frontpage_font_color == "null") {
                    textView.setTextColor(context.resources.getColor(R.color.white))
                } else  {
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
                //   }

                if(profileData.frontpage_font_size is Int){
                    if (profileData.frontpage_font_size.toString().toInt() == 0) {
                        textView.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {
                        var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toInt() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                        finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                        textView.textSize = finalTextSize.toFloat()
                    }
                }else
                {
                    if (profileData.frontpage_font_size.toString().toDouble() == 0.0) {
                        textView.textSize = Constants.DEFAULT_FONT_SIZE.toFloat()
                    } else {
                        var finalTextSize = (getTextSizeValue((profileData.frontpage_font_size.toString().toDouble() *(Constants.MAX_FONT_SIZE-Constants.MIN_FONT_SIZE))/100.toDouble()))
                        finalTextSize=finalTextSize+Constants.MIN_FONT_SIZE

                        textView.textSize = finalTextSize.toFloat()
                    }
                }

                /* if (profileData.frontpage_font_opacity == 0) {
                        textView.alpha = 1f
                    } else {
                        var finalOpacity =((profileData.frontpage_font_opacity!!.toFloat())/100f).toFloat()
                        textView.alpha = finalOpacity
                    }*/
                if (profileData.frontpage_bottom_text.toString() == "") {
                } else {
                    //var fontList= getNewFontsInList()
                    var fontList1 = fontList!!.filter { it.name == profileData.frontpage_bottom_text.toString() }
                    if(fontList1.size>0){
                        textView.setTypeface(fontList1[0].fontTypeface)
                    }
                }
            }else
            {
                textView.setTextColor(context.resources.getColor(R.color.white))
                textView.textSize=Constants.DEFAULT_FONT_SIZE.toFloat()
                textView.alpha=1f
                textView.setTypeface(Typeface.SANS_SERIF)
                //  var fontList= getNewFontsInList()
                //  textView.setTypeface(fontList[1].fontTypeface)
            }
        }
        textView.invalidate()
        // }

    }
}

interface DashboardInterface {
    fun onFavouriteClick(position: Int)
    fun onItemClick(position: Int, view: View)
}