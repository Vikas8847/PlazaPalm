package com.example.plazapalm.utils

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.location.Location
import android.location.LocationManager
import android.os.Build
import android.os.Looper
import android.util.Log
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.ObservableField
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.models.VerifyData
import com.google.android.gms.location.*
import com.google.android.gms.maps.model.LatLng
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.OutputStream


@SuppressLint("StaticFieldLeak")
object CommonMethods {
    /*This Permission Id for AddCitiesFragment[42]*/
    var pERMISSION_ID = 42

    /***This id is use for AdvanceMap Fragment*/
    var advanceMap_Permission_ID = 45

    /**status bar change according to screen requirement (primary color and white color) */
    fun statusBar(isWhite: Boolean? = false) {
        if (isWhite == true) {
            (MainActivity.context.get() as Activity).setStatusBarColor(R.color.white)
        } else {
            (MainActivity.context.get() as Activity).setStatusBarColor(R.color.app_bar_light)
        }
    }

    var isAdvanceMap: Boolean = false

    /** Common Toast Bar You can use every where in the application using context **/
    fun showToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
//        val toast = Toast.makeText(context, text, Toast.LENGTH_SHORT)
//        toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
//        toast.show()
    }

    var context = (MainActivity.context.get() as Activity)
    private fun getColoredSpanned(text: String, color: String): String? {
        return "<font color=$color>$text</font>"
    }

    /***Delete Alert For Swipe to Delete class ...***/
    var dialog: Dialog? = null
    fun showSwipeDeleteAccountDialog() {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
            dialog = null
        } else {
            dialog = Dialog(context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.delete_swipe_alert)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
            dialog?.findViewById<AppCompatTextView>(R.id.tvSwipeDeleteBtn)?.setOnClickListener {
                dialog?.dismiss()
            }
            dialog?.findViewById<AppCompatTextView>(R.id.tvDeleteSwipeCancelBtn)
                ?.setOnClickListener {

                    dialog?.dismiss()
                }
        }

        if (context is AppCompatActivity && !(context as AppCompatActivity).isFinishing && !dialog!!.isShowing) {
            dialog!!.show()
        }
        // dialog?.show()
    }
/*
    */
    /**Open Add question Alert ...***/
/*
    fun openAddQuestionDialog(p_id: String, repository: Repository, token: String) {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
            dialog = null
        } else {
            dialog = Dialog(context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.add_questions)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)

            var addques = dialog?.findViewById<AppCompatEditText>(R.id.etAddQuestions)
            var btnSave = dialog?.findViewById<AppCompatButton>(R.id.btnAddedQuesSave)

            */
    /**choose options click(Button) **/
/*
            btnSave?.setOnClickListener {
                if (addques?.text.isNullOrEmpty()) {
                    val toast =
                        Toast.makeText(context, "Please enter question.", Toast.LENGTH_SHORT)
                    toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
                    toast.show()

                } else {
                    addQuesApi(p_id, addques?.text.toString(), repository, token)
                    dialog?.dismiss()

                }
            }
            dialog?.findViewById<AppCompatImageView>(R.id.ivAddQuestionCross)?.setOnClickListener {

                dialog?.dismiss()
            }

            dialog?.findViewById<ConstraintLayout>(R.id.clAddQuestion)?.setOnClickListener {

                context.hideKeyboard()
            }
        }
        if (context is AppCompatActivity && !(context as AppCompatActivity).isFinishing && !dialog!!.isShowing) {
            dialog!!.show()
        }

        // dialog?.show()
    }

    private fun addQuesApi(p_id: String, addQues: String, repository: Repository, token: String) {

        Log.e("PIDDD", p_id + "XCC  -- " + addQues)

        repository.makeCall(
            apiKey = ApiEnums.ADD_QUESTIONS,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddQuestionResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddQuestionResponseModel> {
                    return retrofitApi.addQuestion(
                        token,
                        p_id,
                        addQues
                    )
                }

                override fun onResponse(res: Response<AddQuestionResponseModel>) {
                    if (res.isSuccessful || res.body() != null) {
                        Log.e("QUESTIONS____RESPONSEE", res.body().toString())

                        if (res.code() == 200) {

                            CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)


                        } else {

                            CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }
        )


    }
*/

    fun checkPermissions(activity: Activity, permission: Array<String>): Int {
        var permissionNeeded = 0
        if (Build.VERSION.SDK_INT >= 25) {
            for (i in permission.indices) {
                val result = ContextCompat.checkSelfPermission(activity, permission[i])
                if (result != PackageManager.PERMISSION_GRANTED) {
                    permissionNeeded++
                }
            }
        }
        return permissionNeeded
    }

    // function to check if GPS is on
    fun isLocationEnabled(): Boolean {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )
    }

    lateinit var mFusedLocationClient: FusedLocationProviderClient

    // Get current location, if shifted
    // from previous location
    @SuppressLint("MissingPermission")
    fun requestNewLocationData() {
        val mLocationRequest = LocationRequest()
        mLocationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        mLocationRequest.interval = 0
        mLocationRequest.fastestInterval = 0
        mLocationRequest.numUpdates = 1
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
        mFusedLocationClient.requestLocationUpdates(
            mLocationRequest,
            mLocationCallback,
            Looper.myLooper()
        )
    }

    lateinit var currentLocation: LatLng

    // If current location could not be located, use last location
    private val mLocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            val mLastLocation: Location = locationResult.lastLocation
            currentLocation = LatLng(mLastLocation.latitude, mLastLocation.longitude)
        }
    }


    // Check if location permissions are
    // granted to the application
    fun checkPermissions(): Boolean {
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        ) {
            return true
        }
        return false
    }

    // Request permissions if not granted before
    fun requestPermissions() {
        ActivityCompat.requestPermissions(
            context,
            arrayOf(
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
            ),
            pERMISSION_ID
        )
    }

    /*Check camera permission */
    /*   private fun openCamera() {
           val permission = arrayOf(
               android.Manifest.permission.READ_EXTERNAL_STORAGE,
               android.Manifest.permission.WRITE_EXTERNAL_STORAGE
           )
           if (CommonMethods.checkPermissions(context, permission) > 0) {
               ActivityCompat.requestPermissions(context, arrayOf(permission[0], permission[1]), 101)
           } else {
               imageOnClicks.value = true
           }
       }*/

    //  var deviceToken="test55"
    fun saveBitmapToFile(file: File): File? {
        return try {
            // BitmapFactory options to downsize the image
            val o = BitmapFactory.Options()
            o.inJustDecodeBounds = true
            o.inSampleSize = 6
            // factor of downsizing the image
            var inputStream = FileInputStream(file)
            //Bitmap selectedBitmap = null;
            BitmapFactory.decodeStream(inputStream, null, o)
            inputStream.close()

            // The new size we want to scale to
            val REQUIRED_SIZE = 75

            // Find the correct scale value. It should be the power of 2.
            var scale = 1
            while (o.outWidth / scale / 2 >= REQUIRED_SIZE &&
                o.outHeight / scale / 2 >= REQUIRED_SIZE
            ) {
                scale *= 2
            }
            val o2 = BitmapFactory.Options()
            o2.inSampleSize = scale
            inputStream = FileInputStream(file)
            val selectedBitmap = BitmapFactory.decodeStream(inputStream, null, o2)
            inputStream.close()

            // here i override the original image file
            file.createNewFile()
            val outputStream = FileOutputStream(file)
            selectedBitmap!!.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
            file
        } catch (e: Exception) {
            null
        }
    }

    fun persistImage(bitmap: Bitmap, name: String) {
        val filesDir: File = context.filesDir
        val imageFile = File(filesDir, "$name.jpg")
        val os: OutputStream
        try {
            os = FileOutputStream(imageFile)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, os)
            os.flush()
            os.close()
        } catch (e: java.lang.Exception) {
            Log.e(javaClass.simpleName, "Error writing bitmap", e)
        }
    }

    var deviceToken = ObservableField("test55")
    var email = VerifyData().email.toString()

    /***Fonts A to z**/
    var abrilFatFaceRegular = "fonts/abril_fatface_regular.otf"
    var academyEngravedLetPlain = "fonts/academy_engraved_letplain.ttf"
    var alexBrushRegular = "fonts/alex_brush_regular.ttf"
    var allerBD = "fonts/aller_bd.ttf"
    var allerBDLT = "fonts/aller_bdIt.ttf"
    var allerDisplay = "fonts/aller_display.ttf"
    var allerIt = "fonts/aller_It.ttf"
    var allerItIt = "fonts/aller_ItIt.ttf"
    var allerRG = "fonts/aller_rg.ttf"
    var amaticBold = "fonts/amatic_bold.ttf"
    var amaticSCRegular = "fonts/amatic_sc_regular.ttf"
    var antonioBold = "fonts/antonio_bold.ttf"
    var antonioLight = "fonts/antonio_light.ttf"
    var antonioRegular = "fonts/antonio_regular.ttf"

    /*B Type fonts*/
    var BebasRegular = "fonts/bebas_regular.ttf"
    var blackJack = "fonts/blackjack.ttf"

    //C
    var caviarDreams = "fonts/caviar_dreams.ttf"
    var caviarDreamsItalic = "fonts/caviar_dreams_italic.ttf"
    var chunkFivePrint = "fonts/chunk_five_print.otf"
    var chunkFiveRegular = "fonts/chunk_five_regular.otf"
    var cooperHewittBold = "fonts/cooper_hewitt_bold.otf"
    var cooperHewittBoldItalic = "fonts/cooper_hewitt_bolditalic.otf"
    var cooperHewittBook = "fonts/cooper_hewitt_book.otf"
    var cooperHewittHeavy = "fonts/cooper_hewitt_Heavy.otf"
    var dancingScriptRegular = "fonts/dancing_script_regular.otf"

    //F
    var fTusj = "fonts/fff_tusj.ttf"
    var firaSansBold = "fonts/fira_sans_bold.otf"
    var firaSansBoldItalic = "fonts/fira_sans_bold_italic.otf"
    var firaSansBook = "fonts/fira_sans_book.otf"
    var firaSansEight = "fonts/fira_sans_eight.otf"

    //G
    var greatVibesRegular = "fonts/great_vibes_regular.otf"

    //H
    var helloValentina = "fonts/hello_valentina.ttf"

    //I
    var interBlack = "fonts/inter_black.ttf"
    var interBold = "fonts/inter_bold.ttf"
    var interBoldItalic = "fonts/inter_bolditalic.ttf"
    var interExtraBold = "fonts/inter_extrabold.ttf"

    //J
    var josefinBold = "fonts/josefin_sans_bold.ttf"
    var josefinBoldItalic = "fonts/josefin_sans_bold_iItalic.ttf"
    var josefinLight = "fonts/josefin_sans_light.ttf"
    var josefinRegular = "fonts/josefin_sans_regular.ttf"
    var josefiThin = "fonts/josefin_sans_thin.ttf"

    //L
    var latoBlack = "fonts/lato_black.ttf"
    var latoBlackItalic = "fonts/lato_black_italic.ttf"
    var latoBold = "fonts/lato_bold.ttf"
    var latoBoldItalic = "fonts/lato_bold_Italic.ttf"
    var latoHairLIneItalic = "fonts/lato_hair_line_Italic.ttf"

    //m
    var montSerratAlternatesBlack = "fonts/montserrat_alternates_black.otf"
    var montSerratAlternatesBlackItalic = "fonts/montserrat_alternates_blackItalic.otf"
    var montSerratAlternatesBold = "fonts/montserrat_alternates_bold.otf"

    //N
    var openSansBold = "fonts/opensans_bold.ttf"
    var openSansBoldItalic = "fonts/opensans_bold_italic.ttf"
    var openSansExtraBoldItalic = "fonts/opensans_extra_bold_italic.ttf"
    var openSansItalic = "fonts/opensans_italic.ttf"
    var openSansLight = "fonts/opensans_light.ttf"
    var openSansRegular = "fonts/opensans_regular.ttf"
    var openSansSemiBold = "fonts/opensans_semi_bold.ttf"
    var openSansSemiBoldItalic = "fonts/opensans_semi_bold_italic.ttf"
    var ostrichRegular = "fonts/ostrich_regular.ttf"
    var ostrichSansBlack = "fonts/ostrichsans_black.otf"
    var ostrichSansBold = "fonts/ostrichsans_bold.otf"
    var ostrichSansHeavy = "fonts/ostrichsans_heavy.otf"
    var ostrichSansLight = "fonts/ostrichsans_light.otf"
    var ostrichSansMedium = "fonts/ostrichsans_medium.otf"
    var ostrichSansRoundedMedium = "fonts/ostrichsansrounded_medium.otf"
    var osWaldBold = "fonts/oswald_bold.ttf"
    var osWaldBoldItalic = "fonts/oswald_bold_italic.ttf"
    var osWaldSemiBoldItalic = "fonts/oswald_demi_bold_italic.ttf"

    var playfairDisplayBlack = "fonts/playfair_display_black.otf"
    var playfairDisplayBlackItalic = "fonts/playfair_display_black_italic.otf"
    var playfairDisplayBold = "fonts/Playfair_display_bold.otf"

    var poppinBlackItalic = "fonts/poppin_-black_italic.otf"
    var poppinBlack = "fonts/poppins_black.otf"
    var poppinBold = "fonts/poppins_bold.otf"
    var poppinBoldItalic = "fonts/poppins_bold_italic.otf"
    var poppinExtraBold = "fonts/poppins_extra_bold.otf"
    var ptc55 = "fonts/ptc_55.ttf"
    var ptc75F = "fonts/ptc_75f.ttf"

    // Q
    var quicksAndBold = "fonts/quicksand_bold.otf"
    var quicksAndBoldItalic = "fonts/quicksand_bold_italic.otf"
    var quicksDash = "fonts/quicksand_dash.otf"
    var quicksAndItalic = "fonts/quicksand_italic.otf"
    var quicksAndLight = "fonts/quicksand_light.otf"

    //R
    var raleWayBlack = "fonts/raleway_black.ttf"
    var raleWayBlackItalic = "fonts/raleway_black_italic.ttf"
    var raleWayBold = "fonts/raleway_bold.ttf"
    var raleWayBoldItalic = "fonts/raleway_bold_italic.ttf"
    var raleWayItalic = "fonts/raleway_italic.ttf"
    var raleWayMedium = "fonts/raleway_medium.ttf"

    //S
    var seasRn = "fonts/seasrn.ttf"
    var sofiaRegular = "fonts/sofia_regular.otf"
    var sourceSansProBlackIt = "fonts/source_sans_pro_blackit.otf"
    var sourceSansProBold = "fonts/source_sans_pro_bold.otf"
    var sourceSansProExtraLight = "fonts/source_sans_pro_extra_light.otf"
    var sourceSansProBlack = "fonts/source_sans_pro_extra_light_it.otf"

    //T
    var titiliumBold = "fonts/titillium_bold.otf"
    var titiliumLight = "fonts/titillium_light.otf"
    var titiliumRegular = "fonts/titillium_regular.otf"
    var titiliumRegularItalic = "fonts/titillium_regular_italic.otf"
    var titiliumSemiBold = "fonts/titillium_semi_bold.otf"

    //W
    const val walkwayBlack = "fonts/walkway_black.ttf"
    const val walkwayBold = "fonts/walkway_bold.ttf"
    const val walkwayOblique = "fonts/walkway_oblique.ttf"
    const val walkwayObliqueBlack = "fonts/walkway_oblique_black.ttf"
    const val walkwayObliqueBold = "fonts/walkway_oblique_bold.ttf"
    const val walkwayObliqueSemiBold = "fonts/walkway_oblique_semi_bold.ttf"
    const val windSong = "fonts/windsong.ttf"




}