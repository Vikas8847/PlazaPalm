package com.example.plazapalm.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Typeface
import android.media.MediaPlayer
import android.util.Base64
import android.util.DisplayMetrics
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceShowViewProfileBinding
import com.example.plazapalm.models.FontsListModelResponse
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.math.BigDecimal
import java.math.RoundingMode
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.text.DecimalFormat
import java.text.NumberFormat

fun Activity.hideKeyboard() {
    val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    // Check if no view has focus
    val currentFocusedView = currentFocus
    currentFocusedView?.let {
        inputMethodManager.hideSoftInputFromWindow(
            currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
        )
    }
}

fun Activity.getViewHeightFromBottom(view: View): Int {
    val dm = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(dm)
    val loc = IntArray(2)
    view.getLocationOnScreen(loc)
    val distance = dm.heightPixels - loc[1]
    return distance - 1000
}


fun Activity.printHashKey() {
    try {
        // Get key hash of local SHA1 key
        val info = packageManager.getPackageInfo(
            applicationContext.packageName,
            PackageManager.GET_SIGNATURES
        )
        for (signature in info.signatures) {
            val md = MessageDigest.getInstance("SHA")
            md.update(signature.toByteArray())
            Log.e("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
        }
    } catch (e: PackageManager.NameNotFoundException) {

    } catch (e: NoSuchAlgorithmException) {
        e.printStackTrace()
    }
    // Get key hash of play store SHA1 key
/*    val sha1 = "C4:67:EB:34:87:8E:84:80:72:64:0F:3E:6A:A2:D5:5C:44:A4:D3:2F"
    val arr: List<String> = sha1.split(":")
    val byteArr = ByteArray(arr.size)

    for (i in arr.indices) {
        byteArr[i] = Integer.decode("0x" + arr[i]).toByte()
    }

    Log.e("hash : ", Base64.encodeToString(byteArr, Base64.NO_WRAP))*/
}
fun BottomNavigationView.onNavDestinationSelected(
    itemId: Int,
    navController: NavController
): Boolean {
    val builder = NavOptions.Builder()
        .setLaunchSingleTop(true)

    if (navController.currentDestination!!.parent!!.findNode(itemId) is ActivityNavigator.Destination) {
//        builder.setEnterAnim(R.anim.fade_in)
//            .setExitAnim(R.anim.fade_out)
//            .setPopEnterAnim(R.anim.fade_in)
//            .setPopExitAnim(R.anim.fade_out)
    } else {
//        builder.setEnterAnim(R.anim.fade_in)
//            .setExitAnim(R.anim.fade_out)
//            .setPopEnterAnim(R.anim.fade_in)
//            .setPopExitAnim(R.anim.fade_out)
    }
    //if (itemId == getChildAt(0).id) {
    //builder.setPopUpTo(findStartDestination(navController.graph)!!.id, true)
    // }
    builder.setPopUpTo(itemId, true)
    val options = builder.build()
    return try {
        //TODO provide proper API instead of using Exceptions as Control-Flow.
        navController.navigate(itemId, null, options)
        true
    } catch (e: IllegalArgumentException) {
        false
    }

}
var profileBinding:AdvanceShowViewProfileBinding?=null
fun Activity.setVideoPlayMethod(
    videoView: VideoView, imageUrl: String?, ivVideoIcon : ProgressBar /*ivVideoIcon: ImageView*/
) {
    val position = 0
    if (imageUrl != null) {
        videoView.setVideoPath(imageUrl)
        videoView.setOnPreparedListener { mp ->
            profileBinding?.ivVideoIconDetails?.visibility=View.GONE
            mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT)
            mp.setVolume(0f, 0f)
            videoView.seekTo(position)
            ivVideoIcon.visibility = View.GONE
            if (position == 0) {

                videoView.start()
            } else
            {
                videoView.pause()
            }
            mp.isLooping = true
            // CommonMethods.showToast(requireContext(), "Video is Preparing")
            Log.d("VideoPreparing", "video is preparing " + videoView.duration)
        }

        videoView.setOnErrorListener { mediaPlayer, _, _ ->

            /* Log.d("VideoError", "$mediaPlayer")
             CommonMethods.showToast(CommonMethods.context, "Error in Video Playing..")*/
            true

        }

        videoView.setOnCompletionListener { mp ->
            // videoView.start()
            /* if (mp.duration == videoView.duration) {
                 CommonMethods.showToast(CommonMethods.context, "Video is Completed ..")
             }*/
        }
        videoView.requestFocus()
        videoView.start()
    } else {

    }
}

fun scrollContentInEditText(editText: EditText) {
    editText.setOnTouchListener(View.OnTouchListener { v, event ->
        if (v.id == R.id.etContactUsMessage) {
            v.parent.requestDisallowInterceptTouchEvent(true)
            when (event.action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_UP -> v.parent.requestDisallowInterceptTouchEvent(false)
            }
        }
        false
    })

}
/*fun Activity.getFontsInList():ArrayList<FontsListModelResponse> {
    var advanceEditLookFontsNameList = ArrayList<FontsListModelResponse>()

    var appCompatTxtFont: AppCompatTextView? = null
    *//*Academy_Engraved*//*
    val academyEngravedLetPlain =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.academyEngravedLetPlain
        )
    appCompatTxtFont?.typeface = academyEngravedLetPlain

    *//*AbrilFatFace_Regular*//*
    val abrilFatFaceRegular =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.abrilFatFaceRegular
        )
    appCompatTxtFont?.typeface = abrilFatFaceRegular

    *//*AlexBrush_Regular*//*
    val alexBrushRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.alexBrushRegular)
    appCompatTxtFont?.typeface = alexBrushRegular

    val allerBD = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerBD)
    appCompatTxtFont?.typeface = allerBD

    val allerBDLT =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerBDLT)
    appCompatTxtFont?.typeface = allerBDLT

    val allerDisplay =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerDisplay)
    appCompatTxtFont?.typeface = allerDisplay


    val allerIt = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerIt)
    appCompatTxtFont?.typeface = allerIt

    val allerRG = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerRG)
    appCompatTxtFont?.typeface = allerRG


    val amaticBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.amaticBold)
    appCompatTxtFont?.typeface = amaticBold

    val amaticSCRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.amaticSCRegular)
    appCompatTxtFont?.typeface = amaticSCRegular

    val antinoBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioBold)
    appCompatTxtFont?.typeface = antinoBold

    val antonioLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioLight)
    appCompatTxtFont?.typeface = antonioLight

    val antonioRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioRegular)
    appCompatTxtFont?.typeface = antonioRegular

    val BebasRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.bebasRegular)
    appCompatTxtFont?.typeface = BebasRegular


    //C
    val caviarDreams =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.caviarDreams)
    appCompatTxtFont?.typeface = caviarDreams

    val caviarDreamsItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.caviarDreamsItalic)
    appCompatTxtFont?.typeface = caviarDreamsItalic

    val chunkFivePrint =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.chunkFivePrint)
    appCompatTxtFont?.typeface = chunkFivePrint

    val chunkFiveRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.chunkFiveRegular)
    appCompatTxtFont?.typeface = chunkFiveRegular

    val cooperHewittBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittBold)
    appCompatTxtFont?.typeface = cooperHewittBold

    val cooperHewittBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.cooperHewittBoldItalic
        )
    appCompatTxtFont?.typeface = cooperHewittBoldItalic

    val cooperHewittBook =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittBook)
    appCompatTxtFont?.typeface = cooperHewittBook

    val cooperHewittHeavy =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittHeavy)
    appCompatTxtFont?.typeface = cooperHewittHeavy

    val dancingScriptRegular =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.dancingScriptRegular
        )
    appCompatTxtFont?.typeface = dancingScriptRegular

    val fTus = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.fTusj)
    appCompatTxtFont?.typeface = fTus

    val firaSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBold)
    appCompatTxtFont?.typeface = firaSansBold


    val firaSansBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBoldItalic)
    appCompatTxtFont?.typeface = firaSansBoldItalic

    val firaSansBook =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBook)
    appCompatTxtFont?.typeface = firaSansBook


    val firaSansEight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansEight)
    appCompatTxtFont?.typeface = firaSansEight


    val greatVibesRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.greatVibesRegular)
    appCompatTxtFont?.typeface = greatVibesRegular


    val helloValentina =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.helloValentina)
    appCompatTxtFont?.typeface = helloValentina


    val interBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBlack)
    appCompatTxtFont?.typeface = interBlack

    val interBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBold)
    appCompatTxtFont?.typeface = interBold


    val interBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBoldItalic)
    appCompatTxtFont?.typeface = interBoldItalic

    val interExtraBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interExtraBold)
    appCompatTxtFont?.typeface = interExtraBold


    val josefinBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinBold)
    appCompatTxtFont?.typeface = josefinBold

    val josefinBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinBoldItalic)
    appCompatTxtFont?.typeface = josefinBoldItalic

    val josefinLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinLight)
    appCompatTxtFont?.typeface = josefinLight

    val josefinRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinRegular)
    appCompatTxtFont?.typeface = josefinRegular

    val josefiThin =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefiThin)
    appCompatTxtFont?.typeface = josefiThin

    val latoBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBlack)
    appCompatTxtFont?.typeface = latoBlack


    val latoBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBlackItalic)
    appCompatTxtFont?.typeface = latoBlackItalic

    val latoBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBold)
    appCompatTxtFont?.typeface = latoBold

    val latoBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBoldItalic)
    appCompatTxtFont?.typeface = latoBoldItalic

    val latoHairLIneItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoHairLIneItalic)
    appCompatTxtFont?.typeface = latoHairLIneItalic

    val montSerratAlternatesBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBlack
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBlack

    val montSerratAlternatesBlackItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBlackItalic
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBlackItalic


    val montSerratAlternatesBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBold
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBold
    //O

    val openSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansBold)
    appCompatTxtFont?.typeface = openSansBold

    val openSansBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansBoldItalic)
    appCompatTxtFont?.typeface = openSansBoldItalic


    val openSansExtraBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.openSansExtraBoldItalic
        )
    appCompatTxtFont?.typeface = openSansExtraBoldItalic

    val openSansItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansItalic)
    appCompatTxtFont?.typeface = openSansItalic

    val openSansLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansLight)
    appCompatTxtFont?.typeface = openSansLight

    val openSansRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansRegular)
    appCompatTxtFont?.typeface = openSansRegular

    val openSansSemiBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansSemiBold)
    appCompatTxtFont?.typeface = openSansSemiBold


    val openSansSemiBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.openSansSemiBoldItalic
        )
    appCompatTxtFont?.typeface = openSansSemiBoldItalic

    val ostrichRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichRegular)
    appCompatTxtFont?.typeface = ostrichRegular

    val ostrichSansBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansBlack)
    appCompatTxtFont?.typeface = ostrichSansBlack

    val ostrichSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansBold)
    appCompatTxtFont?.typeface = ostrichSansBold


    val ostrichSansHeavy =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansHeavy)
    appCompatTxtFont?.typeface = ostrichSansHeavy

    val ostrichSansLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansLight)
    appCompatTxtFont?.typeface = ostrichSansLight

    val ostrichSansMedium =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansMedium)
    appCompatTxtFont?.typeface = ostrichSansMedium


    val ostrichSansRoundedMedium =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.ostrichSansRoundedMedium
        )
    appCompatTxtFont?.typeface = ostrichSansRoundedMedium

    val osWaldBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.osWaldBold)
    appCompatTxtFont?.typeface = osWaldBold


    val osWaldBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.osWaldBoldItalic)
    appCompatTxtFont?.typeface = osWaldBoldItalic

    val osWaldSemiBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.osWaldSemiBoldItalic
        )
    appCompatTxtFont?.typeface = osWaldSemiBoldItalic

    val playfairDisplayBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBlack
        )
    appCompatTxtFont?.typeface = playfairDisplayBlack

    val playfairDisplayBlackItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBlackItalic
        )
    appCompatTxtFont?.typeface = playfairDisplayBlackItalic

    val playfairDisplayBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBold
        )
    appCompatTxtFont?.typeface = playfairDisplayBold

    val poppinBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBlackItalic)
    appCompatTxtFont?.typeface = poppinBlackItalic

    val poppinBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBlack)
    appCompatTxtFont?.typeface = poppinBlack

    val poppinBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBold)
    appCompatTxtFont?.typeface = poppinBold


    val poppinBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBoldItalic)
    appCompatTxtFont?.typeface = poppinBoldItalic

    val poppinExtraBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinExtraBold)
    appCompatTxtFont?.typeface = poppinExtraBold

    val ptc55 = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ptc55)
    appCompatTxtFont?.typeface = ptc55

    val ptc75F = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ptc75F)
    appCompatTxtFont?.typeface = ptc75F
    //Q

    val quicksAndBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndBold)
    appCompatTxtFont?.typeface = quicksAndBold


    val quicksAndBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.quicksAndBoldItalic
        )
    appCompatTxtFont?.typeface = quicksAndBoldItalic

    val quicksDash =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksDash)
    appCompatTxtFont?.typeface = quicksDash

    val quicksAndItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndItalic)
    appCompatTxtFont?.typeface = quicksAndItalic

    val quicksAndLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndLight)
    appCompatTxtFont?.typeface = quicksAndLight

    //R

    val raleWayBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBlack)
    appCompatTxtFont?.typeface = raleWayBlack


    val raleWayBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBlackItalic)
    appCompatTxtFont?.typeface = raleWayBlackItalic


    val raleWayBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBold)
    appCompatTxtFont?.typeface = raleWayBold

    val raleWayBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBoldItalic)
    appCompatTxtFont?.typeface = raleWayBoldItalic

    val raleWayItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayItalic)
    appCompatTxtFont?.typeface = raleWayItalic

    val raleWayMedium =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayMedium)
    appCompatTxtFont?.typeface = raleWayMedium


    val seasRn = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.seasRn)
    appCompatTxtFont?.typeface = seasRn

    val sofiaRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sofiaRegular)
    appCompatTxtFont?.typeface = sofiaRegular

    val sourceSansProBlackIt =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.sourceSansProBlackIt
        )
    appCompatTxtFont?.typeface = sourceSansProBlackIt


    val sourceSansProBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sourceSansProBold)
    appCompatTxtFont?.typeface = sourceSansProBold

    val sourceSansProExtraLight =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.sourceSansProExtraLight
        )
    appCompatTxtFont?.typeface = sourceSansProExtraLight


    val sourceSansProBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sourceSansProBlack)
    appCompatTxtFont?.typeface = sourceSansProBlack


    val titiliumBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumBold)
    appCompatTxtFont?.typeface = titiliumBold

    val titiliumLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumLight)
    appCompatTxtFont?.typeface = titiliumLight


    val titiliumRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumRegular)
    appCompatTxtFont?.typeface = titiliumRegular


    val titiliumRegularItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.titiliumRegularItalic
        )
    appCompatTxtFont?.typeface = titiliumRegularItalic

    val titiliumSemiBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumSemiBold)
    appCompatTxtFont?.typeface = titiliumSemiBold


    val windSong =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.windSong)
    appCompatTxtFont?.typeface = windSong

    val walkwayBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayBlack)
    appCompatTxtFont?.typeface = walkwayBlack

    val walkwayBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayBold)
    appCompatTxtFont?.typeface = walkwayBold

    val walkwayOblique =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayOblique)
    appCompatTxtFont?.typeface = walkwayOblique

    val walkwayObliqueBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.walkwayObliqueBlack
        )
    appCompatTxtFont?.typeface = walkwayObliqueBlack

    val walkwayObliqueBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayObliqueBold)
    appCompatTxtFont?.typeface = walkwayObliqueBold

    val walkwayObliqueSemiBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.walkwayObliqueSemiBold
        )
    appCompatTxtFont?.typeface = walkwayObliqueSemiBold

    *//*Adding data in font list *//*
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            academyEngravedLetPlain!!,
            CommonMethods.acadeMyLetFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            abrilFatFaceRegular,
            CommonMethods.abrilFatFaceFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            alexBrushRegular,
            CommonMethods.alexBrushFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerBD,
            CommonMethods.allerBDFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerBDLT,
            CommonMethods.allerBDItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerIt,
            CommonMethods.allerItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerDisplay,
            CommonMethods.AllerDisplayFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerRG,
            CommonMethods.AllerRGFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antinoBold,
            CommonMethods.AntonioBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antonioLight,
            CommonMethods.AntonioLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antonioRegular,
            CommonMethods.AntonioRegularFontName
        )
    )
    //B
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            BebasRegular,
            CommonMethods.bebasRegularFontName
        )
    )
    //ontsNameList.add(FontsListModelResponse(blackJack, "Black Jack"))
    //C
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            caviarDreams,
            CommonMethods.caviarDreamsFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            caviarDreamsItalic,
            CommonMethods.caviarDreamsItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            chunkFivePrint,
            CommonMethods.chunkFivePrintFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            chunkFiveRegular,
            CommonMethods.chunkFiveRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            cooperHewittBold,
            CommonMethods.cooperHewittBoldFontName
        )
    )
    //D
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            dancingScriptRegular,
            CommonMethods.dancingRegularFontName
        )
    )
    //F
    advanceEditLookFontsNameList.add(FontsListModelResponse(fTus, CommonMethods.ftusFontName))
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBold,
            CommonMethods.firaSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBoldItalic,
            CommonMethods.firaSansBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBook,
            CommonMethods.firaSansBookFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansEight,
            CommonMethods.firaSansEightFontName
        )
    )
    //G
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            greatVibesRegular,
            CommonMethods.greatVibesRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            helloValentina,
            CommonMethods.helloValentinaFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBlack,
            CommonMethods.interBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBold,
            CommonMethods.interBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBoldItalic,
            CommonMethods.interBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interExtraBold,
            CommonMethods.interExtraBoldFontName
        )
    )

    //J
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinBold,
            CommonMethods.josefinBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinBoldItalic,
            CommonMethods.josefinBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinLight,
            CommonMethods.josefinLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinRegular,
            CommonMethods.josefinRegularFontName
        )
    )
    //L
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBlack,
            CommonMethods.latoBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBlackItalic,
            CommonMethods.latoBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBold,
            CommonMethods.latoBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBoldItalic,
            CommonMethods.latoBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoHairLIneItalic,
            CommonMethods.latoHairItalicFontName
        )
    )

    //M
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBlack,
            CommonMethods.montSerratAlternatesBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBlackItalic,
            CommonMethods.montSerratAlternatesBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBold,
            CommonMethods.montSerratAlternatesBoldFontName
        )
    )

    //O
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansBold,
            CommonMethods.openSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansBoldItalic,
            CommonMethods.openSansBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansExtraBoldItalic,
            CommonMethods.openSansExtraBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansItalic,
            CommonMethods.openSansItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansLight,
            CommonMethods.openSansLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansRegular,
            CommonMethods.openSansRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansSemiBold,
            CommonMethods.openSansSemiBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansSemiBoldItalic,
            CommonMethods.openSansSemiBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichRegular,
            CommonMethods.ostrichRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansBlack,
            CommonMethods.ostrichSansBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansBold,
            CommonMethods.ostrichSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansHeavy,
            CommonMethods.ostrichSansHeavyFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansLight,
            CommonMethods.ostrichSansLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansMedium,
            CommonMethods.ostrichSansMediumFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansRoundedMedium,
            CommonMethods.ostrichSansRoundedFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldBold,
            CommonMethods.oswaldBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldBoldItalic,
            CommonMethods.oswaldBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldSemiBoldItalic,
            CommonMethods.oswaldSemiBoldItalicFontName
        )
    )

    //P
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBlack,
            CommonMethods.playFairDisplayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBlackItalic,
            CommonMethods.playFairDisplayBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBold,
            CommonMethods.playFairDisplayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBlackItalic,
            CommonMethods.poppinBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBlack,
            CommonMethods.poppinBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBold,
            CommonMethods.poppinBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBoldItalic,
            CommonMethods.poppinBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinExtraBold,
            CommonMethods.poppinExtraBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(FontsListModelResponse(ptc55, CommonMethods.ptc55FontName))
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ptc75F,
            CommonMethods.ptc75FontName
        )
    )

    //Q
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndBold,
            CommonMethods.quicksAndBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndBoldItalic,
            CommonMethods.quicksAndBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksDash,
            CommonMethods.quicksDashFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndItalic,
            CommonMethods.quickAndItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndLight,
            CommonMethods.quickAndLightFontName
        )
    )
    //R
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBlack,
            CommonMethods.raleWayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBlackItalic,
            CommonMethods.raleWayBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBold,
            CommonMethods.raleWayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBoldItalic,
            CommonMethods.raleWayBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayItalic,
            CommonMethods.raleWayItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayMedium,
            CommonMethods.raleWayMediumFontName
        )
    )

    //S
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            seasRn,
            CommonMethods.seasRnFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sofiaRegular,
            CommonMethods.sofiaRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBlackIt,
            CommonMethods.sourceSansProBlackItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBold,
            CommonMethods.sourceSansProBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProExtraLight,
            CommonMethods.sourceSansProExtraLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBlack,
            CommonMethods.sourceSansProBlackFontName
        )
    )


    //T
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumLight,
            CommonMethods.titiliumLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumRegular,
            CommonMethods.titiliumRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumRegularItalic,
            CommonMethods.titiliumRegularItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumSemiBold,
            CommonMethods.titiliumSemiBoldFontName
        )
    )

    //W
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            windSong,
            CommonMethods.windSongFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayBlack,
            CommonMethods.walkWayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayBold,
            CommonMethods.walkWayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayOblique,
            CommonMethods.walkWayObliqueFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayObliqueBlack,
            CommonMethods.walkWayObliqueBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayObliqueBold,
            CommonMethods.walkWayObliqueBoldFontName
        )
    )

    return advanceEditLookFontsNameList
}*/


fun getNewFontsInList():ArrayList<FontsListModelResponse> {
    var advanceEditLookFontsNameList = ArrayList<FontsListModelResponse>()

    var appCompatTxtFont: AppCompatTextView? = null
    /*Academy_Engraved*/
    val academyEngravedLetPlain =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.academyEngravedLetPlain
        )
    appCompatTxtFont?.typeface = academyEngravedLetPlain

    /*AbrilFatFace_Regular*/
    val abrilFatFaceRegular =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.abrilFatFaceRegular
        )
    appCompatTxtFont?.typeface = abrilFatFaceRegular

    /*AlexBrush_Regular*/
    val alexBrushRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.alexBrushRegular)
    appCompatTxtFont?.typeface = alexBrushRegular

    val allerBD = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerBD)
    appCompatTxtFont?.typeface = allerBD

    val allerBDLT =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerBDLT)
    appCompatTxtFont?.typeface = allerBDLT

    val allerDisplay =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerDisplay)
    appCompatTxtFont?.typeface = allerDisplay


    val allerIt = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerIt)
    appCompatTxtFont?.typeface = allerIt

    val allerRG = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.allerRG)
    appCompatTxtFont?.typeface = allerRG


    val amaticBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.amaticBold)
    appCompatTxtFont?.typeface = amaticBold

    val amaticSCRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.amaticSCRegular)
    appCompatTxtFont?.typeface = amaticSCRegular

    val antinoBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioBold)
    appCompatTxtFont?.typeface = antinoBold

    val antonioLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioLight)
    appCompatTxtFont?.typeface = antonioLight

    val antonioRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.antonioRegular)
    appCompatTxtFont?.typeface = antonioRegular

    val BebasRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.bebasRegular)
    appCompatTxtFont?.typeface = BebasRegular


    //C
    val caviarDreams =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.caviarDreams)
    appCompatTxtFont?.typeface = caviarDreams

    val caviarDreamsItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.caviarDreamsItalic)
    appCompatTxtFont?.typeface = caviarDreamsItalic

    val chunkFivePrint =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.chunkFivePrint)
    appCompatTxtFont?.typeface = chunkFivePrint

    val chunkFiveRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.chunkFiveRegular)
    appCompatTxtFont?.typeface = chunkFiveRegular

    val cooperHewittBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittBold)
    appCompatTxtFont?.typeface = cooperHewittBold

    val cooperHewittBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.cooperHewittBoldItalic
        )
    appCompatTxtFont?.typeface = cooperHewittBoldItalic

    val cooperHewittBook =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittBook)
    appCompatTxtFont?.typeface = cooperHewittBook

    val cooperHewittHeavy =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.cooperHewittHeavy)
    appCompatTxtFont?.typeface = cooperHewittHeavy

    val dancingScriptRegular =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.dancingScriptRegular
        )
    appCompatTxtFont?.typeface = dancingScriptRegular

    val fTus = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.fTusj)
    appCompatTxtFont?.typeface = fTus

    val firaSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBold)
    appCompatTxtFont?.typeface = firaSansBold


    val firaSansBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBoldItalic)
    appCompatTxtFont?.typeface = firaSansBoldItalic

    val firaSansBook =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansBook)
    appCompatTxtFont?.typeface = firaSansBook


    val firaSansEight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.firaSansEight)
    appCompatTxtFont?.typeface = firaSansEight


    val greatVibesRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.greatVibesRegular)
    appCompatTxtFont?.typeface = greatVibesRegular


    val helloValentina =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.helloValentina)
    appCompatTxtFont?.typeface = helloValentina


    val interBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBlack)
    appCompatTxtFont?.typeface = interBlack

    val interBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBold)
    appCompatTxtFont?.typeface = interBold


    val interBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interBoldItalic)
    appCompatTxtFont?.typeface = interBoldItalic

    val interExtraBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.interExtraBold)
    appCompatTxtFont?.typeface = interExtraBold


    val josefinBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinBold)
    appCompatTxtFont?.typeface = josefinBold

    val josefinBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinBoldItalic)
    appCompatTxtFont?.typeface = josefinBoldItalic

    val josefinLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinLight)
    appCompatTxtFont?.typeface = josefinLight

    val josefinRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefinRegular)
    appCompatTxtFont?.typeface = josefinRegular

    val josefiThin =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.josefiThin)
    appCompatTxtFont?.typeface = josefiThin

    val latoBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBlack)
    appCompatTxtFont?.typeface = latoBlack


    val latoBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBlackItalic)
    appCompatTxtFont?.typeface = latoBlackItalic

    val latoBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBold)
    appCompatTxtFont?.typeface = latoBold

    val latoBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoBoldItalic)
    appCompatTxtFont?.typeface = latoBoldItalic

    val latoHairLIneItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.latoHairLIneItalic)
    appCompatTxtFont?.typeface = latoHairLIneItalic

    val montSerratAlternatesBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBlack
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBlack

    val montSerratAlternatesBlackItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBlackItalic
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBlackItalic


    val montSerratAlternatesBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.montSerratAlternatesBold
        )
    appCompatTxtFont?.typeface = montSerratAlternatesBold
    //O

    val openSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansBold)
    appCompatTxtFont?.typeface = openSansBold

    val openSansBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansBoldItalic)
    appCompatTxtFont?.typeface = openSansBoldItalic


    val openSansExtraBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.openSansExtraBoldItalic
        )
    appCompatTxtFont?.typeface = openSansExtraBoldItalic

    val openSansItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansItalic)
    appCompatTxtFont?.typeface = openSansItalic

    val openSansLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansLight)
    appCompatTxtFont?.typeface = openSansLight

    val openSansRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansRegular)
    appCompatTxtFont?.typeface = openSansRegular

    val openSansSemiBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.openSansSemiBold)
    appCompatTxtFont?.typeface = openSansSemiBold


    val openSansSemiBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.openSansSemiBoldItalic
        )
    appCompatTxtFont?.typeface = openSansSemiBoldItalic

    val ostrichRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichRegular)
    appCompatTxtFont?.typeface = ostrichRegular

    val ostrichSansBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansBlack)
    appCompatTxtFont?.typeface = ostrichSansBlack

    val ostrichSansBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansBold)
    appCompatTxtFont?.typeface = ostrichSansBold


    val ostrichSansHeavy =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansHeavy)
    appCompatTxtFont?.typeface = ostrichSansHeavy

    val ostrichSansLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansLight)
    appCompatTxtFont?.typeface = ostrichSansLight

    val ostrichSansMedium =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ostrichSansMedium)
    appCompatTxtFont?.typeface = ostrichSansMedium


    val ostrichSansRoundedMedium =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.ostrichSansRoundedMedium
        )
    appCompatTxtFont?.typeface = ostrichSansRoundedMedium

    val osWaldBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.osWaldBold)
    appCompatTxtFont?.typeface = osWaldBold


    val osWaldBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.osWaldBoldItalic)
    appCompatTxtFont?.typeface = osWaldBoldItalic

    val osWaldSemiBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.osWaldSemiBoldItalic
        )
    appCompatTxtFont?.typeface = osWaldSemiBoldItalic

    val playfairDisplayBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBlack
        )
    appCompatTxtFont?.typeface = playfairDisplayBlack

    val playfairDisplayBlackItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBlackItalic
        )
    appCompatTxtFont?.typeface = playfairDisplayBlackItalic

    val playfairDisplayBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.playfairDisplayBold
        )
    appCompatTxtFont?.typeface = playfairDisplayBold

    val poppinBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBlackItalic)
    appCompatTxtFont?.typeface = poppinBlackItalic

    val poppinBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBlack)
    appCompatTxtFont?.typeface = poppinBlack

    val poppinBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBold)
    appCompatTxtFont?.typeface = poppinBold


    val poppinBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinBoldItalic)
    appCompatTxtFont?.typeface = poppinBoldItalic

    val poppinExtraBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.poppinExtraBold)
    appCompatTxtFont?.typeface = poppinExtraBold

    val ptc55 = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ptc55)
    appCompatTxtFont?.typeface = ptc55

    val ptc75F = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.ptc75F)
    appCompatTxtFont?.typeface = ptc75F
    //Q

    val quicksAndBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndBold)
    appCompatTxtFont?.typeface = quicksAndBold


    val quicksAndBoldItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.quicksAndBoldItalic
        )
    appCompatTxtFont?.typeface = quicksAndBoldItalic

    val quicksDash =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksDash)
    appCompatTxtFont?.typeface = quicksDash

    val quicksAndItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndItalic)
    appCompatTxtFont?.typeface = quicksAndItalic

    val quicksAndLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.quicksAndLight)
    appCompatTxtFont?.typeface = quicksAndLight

    //R

    val raleWayBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBlack)
    appCompatTxtFont?.typeface = raleWayBlack


    val raleWayBlackItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBlackItalic)
    appCompatTxtFont?.typeface = raleWayBlackItalic


    val raleWayBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBold)
    appCompatTxtFont?.typeface = raleWayBold

    val raleWayBoldItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayBoldItalic)
    appCompatTxtFont?.typeface = raleWayBoldItalic

    val raleWayItalic =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayItalic)
    appCompatTxtFont?.typeface = raleWayItalic

    val raleWayMedium =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.raleWayMedium)
    appCompatTxtFont?.typeface = raleWayMedium


    val seasRn = Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.seasRn)
    appCompatTxtFont?.typeface = seasRn

    val sofiaRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sofiaRegular)
    appCompatTxtFont?.typeface = sofiaRegular

    val sourceSansProBlackIt =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.sourceSansProBlackIt
        )
    appCompatTxtFont?.typeface = sourceSansProBlackIt


    val sourceSansProBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sourceSansProBold)
    appCompatTxtFont?.typeface = sourceSansProBold

    val sourceSansProExtraLight =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.sourceSansProExtraLight
        )
    appCompatTxtFont?.typeface = sourceSansProExtraLight


    val sourceSansProBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.sourceSansProBlack)
    appCompatTxtFont?.typeface = sourceSansProBlack


    val titiliumBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumBold)
    appCompatTxtFont?.typeface = titiliumBold

    val titiliumLight =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumLight)
    appCompatTxtFont?.typeface = titiliumLight


    val titiliumRegular =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumRegular)
    appCompatTxtFont?.typeface = titiliumRegular


    val titiliumRegularItalic =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.titiliumRegularItalic
        )
    appCompatTxtFont?.typeface = titiliumRegularItalic

    val titiliumSemiBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.titiliumSemiBold)
    appCompatTxtFont?.typeface = titiliumSemiBold


    val windSong =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.windSong)
    appCompatTxtFont?.typeface = windSong

    val walkwayBlack =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayBlack)
    appCompatTxtFont?.typeface = walkwayBlack

    val walkwayBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayBold)
    appCompatTxtFont?.typeface = walkwayBold

    val walkwayOblique =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayOblique)
    appCompatTxtFont?.typeface = walkwayOblique

    val walkwayObliqueBlack =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.walkwayObliqueBlack
        )
    appCompatTxtFont?.typeface = walkwayObliqueBlack

    val walkwayObliqueBold =
        Typeface.createFromAsset(CommonMethods.context.assets, CommonMethods.walkwayObliqueBold)
    appCompatTxtFont?.typeface = walkwayObliqueBold

    val walkwayObliqueSemiBold =
        Typeface.createFromAsset(
            CommonMethods.context.assets,
            CommonMethods.walkwayObliqueSemiBold
        )
    appCompatTxtFont?.typeface = walkwayObliqueSemiBold

    /*Adding data in font list */
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            academyEngravedLetPlain!!,
            CommonMethods.acadeMyLetFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            abrilFatFaceRegular,
            CommonMethods.abrilFatFaceFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            alexBrushRegular,
            CommonMethods.alexBrushFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerBD,
            CommonMethods.allerBDFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerBDLT,
            CommonMethods.allerBDItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerIt,
            CommonMethods.allerItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerDisplay,
            CommonMethods.AllerDisplayFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            allerRG,
            CommonMethods.AllerRGFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antinoBold,
            CommonMethods.AntonioBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antonioLight,
            CommonMethods.AntonioLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            antonioRegular,
            CommonMethods.AntonioRegularFontName
        )
    )
    //B
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            BebasRegular,
            CommonMethods.bebasRegularFontName
        )
    )
    //ontsNameList.add(FontsListModelResponse(blackJack, "Black Jack"))
    //C
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            caviarDreams,
            CommonMethods.caviarDreamsFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            caviarDreamsItalic,
            CommonMethods.caviarDreamsItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            chunkFivePrint,
            CommonMethods.chunkFivePrintFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            chunkFiveRegular,
            CommonMethods.chunkFiveRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            cooperHewittBold,
            CommonMethods.cooperHewittBoldFontName
        )
    )
    //D
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            dancingScriptRegular,
            CommonMethods.dancingRegularFontName
        )
    )
    //F
    advanceEditLookFontsNameList.add(FontsListModelResponse(fTus, CommonMethods.ftusFontName))
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBold,
            CommonMethods.firaSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBoldItalic,
            CommonMethods.firaSansBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansBook,
            CommonMethods.firaSansBookFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            firaSansEight,
            CommonMethods.firaSansEightFontName
        )
    )
    //G
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            greatVibesRegular,
            CommonMethods.greatVibesRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            helloValentina,
            CommonMethods.helloValentinaFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBlack,
            CommonMethods.interBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBold,
            CommonMethods.interBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interBoldItalic,
            CommonMethods.interBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            interExtraBold,
            CommonMethods.interExtraBoldFontName
        )
    )

    //J
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinBold,
            CommonMethods.josefinBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinBoldItalic,
            CommonMethods.josefinBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinLight,
            CommonMethods.josefinLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            josefinRegular,
            CommonMethods.josefinRegularFontName
        )
    )
    //L
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBlack,
            CommonMethods.latoBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBlackItalic,
            CommonMethods.latoBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBold,
            CommonMethods.latoBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoBoldItalic,
            CommonMethods.latoBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            latoHairLIneItalic,
            CommonMethods.latoHairItalicFontName
        )
    )

    //M
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBlack,
            CommonMethods.montSerratAlternatesBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBlackItalic,
            CommonMethods.montSerratAlternatesBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            montSerratAlternatesBold,
            CommonMethods.montSerratAlternatesBoldFontName
        )
    )

    //O
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansBold,
            CommonMethods.openSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansBoldItalic,
            CommonMethods.openSansBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansExtraBoldItalic,
            CommonMethods.openSansExtraBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansItalic,
            CommonMethods.openSansItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansLight,
            CommonMethods.openSansLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansRegular,
            CommonMethods.openSansRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansSemiBold,
            CommonMethods.openSansSemiBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            openSansSemiBoldItalic,
            CommonMethods.openSansSemiBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichRegular,
            CommonMethods.ostrichRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansBlack,
            CommonMethods.ostrichSansBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansBold,
            CommonMethods.ostrichSansBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansHeavy,
            CommonMethods.ostrichSansHeavyFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansLight,
            CommonMethods.ostrichSansLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansMedium,
            CommonMethods.ostrichSansMediumFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ostrichSansRoundedMedium,
            CommonMethods.ostrichSansRoundedFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldBold,
            CommonMethods.oswaldBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldBoldItalic,
            CommonMethods.oswaldBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            osWaldSemiBoldItalic,
            CommonMethods.oswaldSemiBoldItalicFontName
        )
    )

    //P
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBlack,
            CommonMethods.playFairDisplayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBlackItalic,
            CommonMethods.playFairDisplayBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            playfairDisplayBold,
            CommonMethods.playFairDisplayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBlackItalic,
            CommonMethods.poppinBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBlack,
            CommonMethods.poppinBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBold,
            CommonMethods.poppinBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinBoldItalic,
            CommonMethods.poppinBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            poppinExtraBold,
            CommonMethods.poppinExtraBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(FontsListModelResponse(ptc55, CommonMethods.ptc55FontName))
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            ptc75F,
            CommonMethods.ptc75FontName
        )
    )

    //Q
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndBold,
            CommonMethods.quicksAndBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndBoldItalic,
            CommonMethods.quicksAndBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksDash,
            CommonMethods.quicksDashFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndItalic,
            CommonMethods.quickAndItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            quicksAndLight,
            CommonMethods.quickAndLightFontName
        )
    )
    //R
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBlack,
            CommonMethods.raleWayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBlackItalic,
            CommonMethods.raleWayBlackItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBold,
            CommonMethods.raleWayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayBoldItalic,
            CommonMethods.raleWayBoldItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayItalic,
            CommonMethods.raleWayItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            raleWayMedium,
            CommonMethods.raleWayMediumFontName
        )
    )

    //S
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            seasRn,
            CommonMethods.seasRnFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sofiaRegular,
            CommonMethods.sofiaRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBlackIt,
            CommonMethods.sourceSansProBlackItFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBold,
            CommonMethods.sourceSansProBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProExtraLight,
            CommonMethods.sourceSansProExtraLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            sourceSansProBlack,
            CommonMethods.sourceSansProBlackFontName
        )
    )


    //T
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumLight,
            CommonMethods.titiliumLightFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumRegular,
            CommonMethods.titiliumRegularFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumRegularItalic,
            CommonMethods.titiliumRegularItalicFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            titiliumSemiBold,
            CommonMethods.titiliumSemiBoldFontName
        )
    )

    //W
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            windSong,
            CommonMethods.windSongFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayBlack,
            CommonMethods.walkWayBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayBold,
            CommonMethods.walkWayBoldFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayOblique,
            CommonMethods.walkWayObliqueFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayObliqueBlack,
            CommonMethods.walkWayObliqueBlackFontName
        )
    )
    advanceEditLookFontsNameList.add(
        FontsListModelResponse(
            walkwayObliqueBold,
            CommonMethods.walkWayObliqueBoldFontName
        )
    )

    return advanceEditLookFontsNameList
}


fun getTextSizeValue(value:Double):Double
{
    //  var value=27.50
    var bd: BigDecimal = BigDecimal.valueOf(value)
    bd= bd.setScale(0, RoundingMode.HALF_UP)
    return bd.toDouble()
}

fun convertFromPerceneategtoText(value:Double):Double
{
    //  var value=27.50
    val formatter: NumberFormat = DecimalFormat("##.00")
    System.out.println(formatter.format(value))
    return formatter.format(value).toDouble()
}

fun getExactValue(value:Double):Int
{
    //  var value=27.50
    var bd: BigDecimal = BigDecimal.valueOf(value)
    bd= bd.setScale(0, RoundingMode.HALF_UP)
    return bd.toInt()
}




