package com.example.plazapalm.views.advancesettings.editfontpage

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.location.Location
import android.os.Build
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.SearchView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceShowViewProfileBinding
import com.example.plazapalm.databinding.FontsListFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.SAVE_EDIT_COVER_PAGE
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.BindingAdapters.pref
import com.example.plazapalm.utils.ColorsAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.academyEngravedLetPlain
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.CommonMethods.dialog
import com.example.plazapalm.utils.CommonMethods.showToast
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.views.dashboard.DashBoardPostData
import com.google.android.gms.maps.model.LatLng
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.slider.Slider
import com.skydoves.colorpickerview.ColorPickerView
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.util.*
import javax.inject.Inject

@HiltViewModel
class EditFrontPageVM @Inject constructor(
    private var preferenceFile: PreferenceFile,
    private var repository: Repository,
    private var dataStoreUtil: DataStoreUtil
) : ViewModel(), clickItem {
    private var profileBinding: AdvanceShowViewProfileBinding? = null
    var appCompatTxtFont: AppCompatTextView? = null
    var fontsNameList = ArrayList<FontsListModelResponse>()
    var SelectedDialog = ObservableField("")
    val fontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.fonts_list_item) }
    var fontSize = ObservableFloat()
    var titlename = ObservableField("")
    var backgroundColor = ObservableField("")
    var idList = ArrayList<String>()
    var userMiles = ObservableField("")
    var distanceCal = ObservableField("")


    var selectedbackgrouncolor = -65536

    var fontColorLiveData = 0

    var borderColorLiveData = 0

    var fontTypeface: Typeface? = null
    var isChecked = ObservableBoolean(false)
    var isBottomText = ObservableBoolean(false)
    var isTopText = ObservableBoolean(false)

    var userProfileName = ObservableField("")
    var userProfileDescription = ObservableField("")
    var userProfileLocation = ObservableField("")

    var typfaceObserverLiveData = MutableLiveData<Boolean>()
    val distance = ObservableField("")


    val backgroundColorLiveData = MutableLiveData<Any>()
    val columnColorLD = MutableLiveData<Any>()
    val fontColorLD = MutableLiveData<Any>()
    val borderColorLD = MutableLiveData<Any>()


    var sliderOpacitty: Slider? = null

    @SuppressLint("StaticFieldLeak")
    var slider_size: Slider? = null
    var size_tv: TextView? = null

    var opacity_tv: TextView? = null

    var fontsName = ObservableField("Optima-Regular")


    private var layoutColrs: ConstraintLayout? = null
    var fontsFilteredList = ArrayList<FontsListModelResponse>()
    var scheduleBinding: FontsListFragmentBinding? = null
    var columnOpacity = ObservableFloat()
    var borderOpacity = ObservableFloat()
    var borderWidth = ObservableFloat()
    var borderColor = ObservableField("")
    var fontName = ObservableField("mdgdfg")
    var fontColor = ObservableField("")
    var fontOpacity = ObservableFloat()
    var destinationLat = ObservableDouble()
    var destinationLong = ObservableDouble()
    var recyclerChoosecolor: RecyclerView? = null
    var borderSlideValue = 0F
    var columnColorLiveData = 0

    @SuppressLint("StaticFieldLeak")
    var title: TextView? = null

    @SuppressLint("StaticFieldLeak")
    private var changeColor: TextView? = null

    @SuppressLint("StaticFieldLeak")
    private var cardLayoutColrs: CardView? = null
    var checkColor = ObservableField("")
    var colorList = ArrayList<ChooseColor>()

    init {
        colorList.add(ChooseColor(R.color.goldYellow))
        colorList.add(ChooseColor(R.color.gold))
        colorList.add(ChooseColor(R.color.brickRed))
        colorList.add(ChooseColor(R.color.paleRed))
        colorList.add(ChooseColor(R.color.plumLight))
        colorList.add(ChooseColor(R.color.purple))
        colorList.add(ChooseColor(R.color.coolBlue))
        colorList.add(ChooseColor(R.color.turfGreen))
        colorList.add(ChooseColor(R.color.blueGray))
        colorList.add(ChooseColor(R.color.sky))
        colorList.add(ChooseColor(R.color.green))
        colorList.add(ChooseColor(R.color.orange))
        setFontsInAdapterList()
        setAdapter()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun onClicks(view: View) {
        when (view.id) {
            /*attac button click */
            R.id.btnEditFrontLookAttach -> {
                // call here post api of fonts
                postFrontPageApi()
            }
            R.id.ivAdvanceEditFrontPage -> {
                view.findNavController().navigateUp()
            }
            R.id.btnEditFrontPageView -> {
                /*call herer on view button dialog (get fonts api)*/
                showToast(context, "In Progress ....")
                //showViewProfileDialog()
            }
            R.id.viewBoxLookingBGColor -> {
                checkColor.set("FONTCOLOR")
                showColorDialog("FONTCOLOR")
            }
            R.id.tvAdvanceEditFrontPageFontValue -> {
                showBottomSheetDialogOne()
            }
        }
    }


    private fun showViewProfileDialog() {

        // getProfileByCategory("",true)
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.advance_show_view_profile)
            profileBinding =
                AdvanceShowViewProfileBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
            profileBinding!!.root
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(true)
            // setDataOnViewClickDialog()
            dialog?.show()
        }
    }

    private fun setDataOnViewClickDialog() {
        if (isTopText.get()) {
            profileBinding?.tvProfileUserName?.text = "Vikas Panchal"
            profileBinding?.tvProfileUserName?.typeface = fontTypeface
        } else if (isBottomText.get()) {
            profileBinding?.tvProfileUserName?.text = "Vikas Panchal"
            profileBinding?.tvProfileUserDescription?.text = "Mohali"
            profileBinding?.tvProfileUserDescription?.typeface = fontTypeface
            profileBinding?.tvProfileUserAddress?.typeface = fontTypeface
            profileBinding?.tvProfileUserAddress?.text = "Punjab"

        } else if (isBottomText.get() && isTopText.get()) {
//Top Text
            profileBinding?.tvProfileUserName?.text = "Vikas Panchal"
            profileBinding?.tvProfileUserName?.typeface = fontTypeface

            //Bottom Text..
            profileBinding?.tvProfileUserDescription?.text = "Mohali"
            profileBinding?.tvProfileUserDescription?.typeface = fontTypeface
            profileBinding?.tvProfileUserAddress?.typeface = fontTypeface
            profileBinding?.tvProfileUserAddress?.text = "Punjab"

        } else {
            profileBinding?.tvProfileUserName?.text = "Vikas Panchal"
            //Bottom Text..
            profileBinding?.tvProfileUserDescription?.text = "Mohali"
            profileBinding?.tvProfileUserAddress?.text = "Punjab"

        }
    }


    var fontBottomSheet: BottomSheetDialog? = null

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun showBottomSheetDialogOne() {
        fontBottomSheet =
            BottomSheetDialog(MainActivity.context.get()!!, R.style.CustomBottomSheetDialogTheme)
        fontBottomSheet?.behavior?.state = BottomSheetBehavior.STATE_COLLAPSED
        scheduleBinding =
            FontsListFragmentBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
        scheduleBinding?.model = this
        fontBottomSheet?.setCancelable(true)
        scheduleBinding?.apply {
            tvChooseFontCancel.setOnClickListener {
                fontBottomSheet?.dismiss()
                context.hideKeyboard()
            }
            clFontListMain.setOnClickListener {
                context.hideKeyboard()
            }

            rvChooseFonts.setOnClickListener {
                context.hideKeyboard()
            }
            searchFunctionality()
        }
        fontBottomSheet?.setContentView(scheduleBinding?.root!!)
        fontBottomSheet?.show()
        typfaceObserverLiveData.postValue(false)
        fontListAdapter.setOnItemClick { view, position, type ->
            when (type) {
                "fontsItemClick" -> {
                    fontBottomSheet?.dismiss()
                    val adapterList = fontListAdapter.getAllItems()
                    val fontName = adapterList[position].name
                    val typeface = adapterList[position].fontTypeface
                    appCompatTxtFont?.typeface = typeface
                    fontTypeface = typeface
                    fontsName.set(fontName)
                    typfaceObserverLiveData.postValue(true)
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun setAdapter() {
        fontsNameList.map {
            false
        }
        scheduleBinding?.rvChooseFonts?.layoutManager = LinearLayoutManager(MainActivity.activity)
        scheduleBinding?.rvChooseFonts?.adapter = fontListAdapter
        updateRecyclerView()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setFontsInAdapterList() {
        //  appCompatTxtFont: AppCompatTextView? = null
        /*Academy_Engraved*/
        val academyEngravedLetPlain =
            Typeface.createFromAsset(context.assets, academyEngravedLetPlain)
        appCompatTxtFont?.typeface = academyEngravedLetPlain

        /*AbrilFatFace_Regular*/
        val abrilFatFaceRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.abrilFatFaceRegular)
        appCompatTxtFont?.typeface = abrilFatFaceRegular

        /*AlexBrush_Regular*/
        val alexBrushRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.alexBrushRegular)
        appCompatTxtFont?.typeface = alexBrushRegular

        val allerBD = Typeface.createFromAsset(context.assets, CommonMethods.allerBD)
        appCompatTxtFont?.typeface = allerBD

        val allerBDLT = Typeface.createFromAsset(context.assets, CommonMethods.allerBDLT)
        appCompatTxtFont?.typeface = allerBDLT

        val allerDisplay = Typeface.createFromAsset(context.assets, CommonMethods.allerDisplay)
        appCompatTxtFont?.typeface = allerDisplay


        val allerIt = Typeface.createFromAsset(context.assets, CommonMethods.allerIt)
        appCompatTxtFont?.typeface = allerIt

        val allerRG = Typeface.createFromAsset(context.assets, CommonMethods.allerRG)
        appCompatTxtFont?.typeface = allerRG


        val amaticBold = Typeface.createFromAsset(context.assets, CommonMethods.amaticBold)
        appCompatTxtFont?.typeface = amaticBold

        val amaticSCRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.amaticSCRegular)
        appCompatTxtFont?.typeface = amaticSCRegular

        val antinoBold = Typeface.createFromAsset(context.assets, CommonMethods.antonioBold)
        appCompatTxtFont?.typeface = antinoBold

        val antonioLight = Typeface.createFromAsset(context.assets, CommonMethods.antonioLight)
        appCompatTxtFont?.typeface = antonioLight

        val antonioRegular = Typeface.createFromAsset(context.assets, CommonMethods.antonioRegular)
        appCompatTxtFont?.typeface = antonioRegular

        val BebasRegular = Typeface.createFromAsset(context.assets, CommonMethods.BebasRegular)
        appCompatTxtFont?.typeface = BebasRegular

        /*  val blackJack = Typeface.createFromAsset(context.assets, CommonMethods.blackJack)
          appCompatTxtFont?.typeface = blackJack*/

        //C
        val caviarDreams = Typeface.createFromAsset(context.assets, CommonMethods.caviarDreams)
        appCompatTxtFont?.typeface = caviarDreams

        val caviarDreamsItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.caviarDreamsItalic)
        appCompatTxtFont?.typeface = caviarDreamsItalic

        val chunkFivePrint = Typeface.createFromAsset(context.assets, CommonMethods.chunkFivePrint)
        appCompatTxtFont?.typeface = chunkFivePrint

        val chunkFiveRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.chunkFiveRegular)
        appCompatTxtFont?.typeface = chunkFiveRegular

        val cooperHewittBold =
            Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBold)
        appCompatTxtFont?.typeface = cooperHewittBold

        val cooperHewittBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBoldItalic)
        appCompatTxtFont?.typeface = cooperHewittBoldItalic

        val cooperHewittBook =
            Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBook)
        appCompatTxtFont?.typeface = cooperHewittBook

        val cooperHewittHeavy =
            Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittHeavy)
        appCompatTxtFont?.typeface = cooperHewittHeavy

        val dancingScriptRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.dancingScriptRegular)
        appCompatTxtFont?.typeface = dancingScriptRegular

        val fTus = Typeface.createFromAsset(context.assets, CommonMethods.fTusj)
        appCompatTxtFont?.typeface = fTus

        val firaSansBold = Typeface.createFromAsset(context.assets, CommonMethods.firaSansBold)
        appCompatTxtFont?.typeface = firaSansBold


        val firaSansBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.firaSansBoldItalic)
        appCompatTxtFont?.typeface = firaSansBoldItalic

        val firaSansBook = Typeface.createFromAsset(context.assets, CommonMethods.firaSansBook)
        appCompatTxtFont?.typeface = firaSansBook


        val firaSansEight = Typeface.createFromAsset(context.assets, CommonMethods.firaSansEight)
        appCompatTxtFont?.typeface = firaSansEight


        val greatVibesRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.greatVibesRegular)
        appCompatTxtFont?.typeface = greatVibesRegular


        val helloValentina = Typeface.createFromAsset(context.assets, CommonMethods.helloValentina)
        appCompatTxtFont?.typeface = helloValentina


        val interBlack = Typeface.createFromAsset(context.assets, CommonMethods.interBlack)
        appCompatTxtFont?.typeface = interBlack

        val interBold = Typeface.createFromAsset(context.assets, CommonMethods.interBold)
        appCompatTxtFont?.typeface = interBold


        val interBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.interBoldItalic)
        appCompatTxtFont?.typeface = interBoldItalic

        val interExtraBold = Typeface.createFromAsset(context.assets, CommonMethods.interExtraBold)
        appCompatTxtFont?.typeface = interExtraBold


        val josefinBold = Typeface.createFromAsset(context.assets, CommonMethods.josefinBold)
        appCompatTxtFont?.typeface = josefinBold

        val josefinBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.josefinBoldItalic)
        appCompatTxtFont?.typeface = josefinBoldItalic

        val josefinLight = Typeface.createFromAsset(context.assets, CommonMethods.josefinLight)
        appCompatTxtFont?.typeface = josefinLight

        val josefinRegular = Typeface.createFromAsset(context.assets, CommonMethods.josefinRegular)
        appCompatTxtFont?.typeface = josefinRegular

        val josefiThin = Typeface.createFromAsset(context.assets, CommonMethods.josefiThin)
        appCompatTxtFont?.typeface = josefiThin

        val latoBlack = Typeface.createFromAsset(context.assets, CommonMethods.latoBlack)
        appCompatTxtFont?.typeface = latoBlack


        val latoBlackItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.latoBlackItalic)
        appCompatTxtFont?.typeface = latoBlackItalic

        val latoBold = Typeface.createFromAsset(context.assets, CommonMethods.latoBold)
        appCompatTxtFont?.typeface = latoBold

        val latoBoldItalic = Typeface.createFromAsset(context.assets, CommonMethods.latoBoldItalic)
        appCompatTxtFont?.typeface = latoBoldItalic

        val latoHairLIneItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.latoHairLIneItalic)
        appCompatTxtFont?.typeface = latoHairLIneItalic

        val montSerratAlternatesBlack =
            Typeface.createFromAsset(context.assets, CommonMethods.montSerratAlternatesBlack)
        appCompatTxtFont?.typeface = montSerratAlternatesBlack

        val montSerratAlternatesBlackItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.montSerratAlternatesBlackItalic)
        appCompatTxtFont?.typeface = montSerratAlternatesBlackItalic


        val montSerratAlternatesBold =
            Typeface.createFromAsset(context.assets, CommonMethods.montSerratAlternatesBold)
        appCompatTxtFont?.typeface = montSerratAlternatesBold
        //O

        val openSansBold = Typeface.createFromAsset(context.assets, CommonMethods.openSansBold)
        appCompatTxtFont?.typeface = openSansBold

        val openSansBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.openSansBoldItalic)
        appCompatTxtFont?.typeface = openSansBoldItalic


        val openSansExtraBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.openSansExtraBoldItalic)
        appCompatTxtFont?.typeface = openSansExtraBoldItalic

        val openSansItalic = Typeface.createFromAsset(context.assets, CommonMethods.openSansItalic)
        appCompatTxtFont?.typeface = openSansItalic

        val openSansLight = Typeface.createFromAsset(context.assets, CommonMethods.openSansLight)
        appCompatTxtFont?.typeface = openSansLight

        val openSansRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.openSansRegular)
        appCompatTxtFont?.typeface = openSansRegular

        val openSansSemiBold =
            Typeface.createFromAsset(context.assets, CommonMethods.openSansSemiBold)
        appCompatTxtFont?.typeface = openSansSemiBold


        val openSansSemiBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.openSansSemiBoldItalic)
        appCompatTxtFont?.typeface = openSansSemiBoldItalic

        val ostrichRegular = Typeface.createFromAsset(context.assets, CommonMethods.ostrichRegular)
        appCompatTxtFont?.typeface = ostrichRegular

        val ostrichSansBlack =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBlack)
        appCompatTxtFont?.typeface = ostrichSansBlack

        val ostrichSansBold =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBold)
        appCompatTxtFont?.typeface = ostrichSansBold


        val ostrichSansHeavy =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansHeavy)
        appCompatTxtFont?.typeface = ostrichSansHeavy

        val ostrichSansLight =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansLight)
        appCompatTxtFont?.typeface = ostrichSansLight

        val ostrichSansMedium =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansMedium)
        appCompatTxtFont?.typeface = ostrichSansMedium


        val ostrichSansRoundedMedium =
            Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansRoundedMedium)
        appCompatTxtFont?.typeface = ostrichSansRoundedMedium

        val osWaldBold = Typeface.createFromAsset(context.assets, CommonMethods.osWaldBold)
        appCompatTxtFont?.typeface = osWaldBold


        val osWaldBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.osWaldBoldItalic)
        appCompatTxtFont?.typeface = osWaldBoldItalic

        val osWaldSemiBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.osWaldSemiBoldItalic)
        appCompatTxtFont?.typeface = osWaldSemiBoldItalic

        val playfairDisplayBlack =
            Typeface.createFromAsset(context.assets, CommonMethods.playfairDisplayBlack)
        appCompatTxtFont?.typeface = playfairDisplayBlack

        val playfairDisplayBlackItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.playfairDisplayBlackItalic)
        appCompatTxtFont?.typeface = playfairDisplayBlackItalic

        val playfairDisplayBold =
            Typeface.createFromAsset(context.assets, CommonMethods.playfairDisplayBold)
        appCompatTxtFont?.typeface = playfairDisplayBold

        val poppinBlackItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.poppinBlackItalic)
        appCompatTxtFont?.typeface = poppinBlackItalic

        val poppinBlack = Typeface.createFromAsset(context.assets, CommonMethods.poppinBlack)
        appCompatTxtFont?.typeface = poppinBlack

        val poppinBold = Typeface.createFromAsset(context.assets, CommonMethods.poppinBold)
        appCompatTxtFont?.typeface = poppinBold


        val poppinBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.poppinBoldItalic)
        appCompatTxtFont?.typeface = poppinBoldItalic

        val poppinExtraBold =
            Typeface.createFromAsset(context.assets, CommonMethods.poppinExtraBold)
        appCompatTxtFont?.typeface = poppinExtraBold

        val ptc55 = Typeface.createFromAsset(context.assets, CommonMethods.ptc55)
        appCompatTxtFont?.typeface = ptc55

        val ptc75F = Typeface.createFromAsset(context.assets, CommonMethods.ptc75F)
        appCompatTxtFont?.typeface = ptc75F
        //Q

        val quicksAndBold = Typeface.createFromAsset(context.assets, CommonMethods.quicksAndBold)
        appCompatTxtFont?.typeface = quicksAndBold


        val quicksAndBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.quicksAndBoldItalic)
        appCompatTxtFont?.typeface = quicksAndBoldItalic

        val quicksDash = Typeface.createFromAsset(context.assets, CommonMethods.quicksDash)
        appCompatTxtFont?.typeface = quicksDash

        val quicksAndItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.quicksAndItalic)
        appCompatTxtFont?.typeface = quicksAndItalic

        val quicksAndLight = Typeface.createFromAsset(context.assets, CommonMethods.quicksAndLight)
        appCompatTxtFont?.typeface = quicksAndLight

        //R

        val raleWayBlack = Typeface.createFromAsset(context.assets, CommonMethods.raleWayBlack)
        appCompatTxtFont?.typeface = raleWayBlack


        val raleWayBlackItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.raleWayBlackItalic)
        appCompatTxtFont?.typeface = raleWayBlackItalic


        val raleWayBold = Typeface.createFromAsset(context.assets, CommonMethods.raleWayBold)
        appCompatTxtFont?.typeface = raleWayBold

        val raleWayBoldItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.raleWayBoldItalic)
        appCompatTxtFont?.typeface = raleWayBoldItalic

        val raleWayItalic = Typeface.createFromAsset(context.assets, CommonMethods.raleWayItalic)
        appCompatTxtFont?.typeface = raleWayItalic

        val raleWayMedium = Typeface.createFromAsset(context.assets, CommonMethods.raleWayMedium)
        appCompatTxtFont?.typeface = raleWayMedium


        val seasRn = Typeface.createFromAsset(context.assets, CommonMethods.seasRn)
        appCompatTxtFont?.typeface = seasRn

        val sofiaRegular = Typeface.createFromAsset(context.assets, CommonMethods.sofiaRegular)
        appCompatTxtFont?.typeface = sofiaRegular

        val sourceSansProBlackIt =
            Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBlackIt)
        appCompatTxtFont?.typeface = sourceSansProBlackIt


        val sourceSansProBold =
            Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBold)
        appCompatTxtFont?.typeface = sourceSansProBold

        val sourceSansProExtraLight =
            Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProExtraLight)
        appCompatTxtFont?.typeface = sourceSansProExtraLight


        val sourceSansProBlack =
            Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBlack)
        appCompatTxtFont?.typeface = sourceSansProBlack


        val titiliumBold = Typeface.createFromAsset(context.assets, CommonMethods.titiliumBold)
        appCompatTxtFont?.typeface = titiliumBold

        val titiliumLight = Typeface.createFromAsset(context.assets, CommonMethods.titiliumLight)
        appCompatTxtFont?.typeface = titiliumLight


        val titiliumRegular =
            Typeface.createFromAsset(context.assets, CommonMethods.titiliumRegular)
        appCompatTxtFont?.typeface = titiliumRegular


        val titiliumRegularItalic =
            Typeface.createFromAsset(context.assets, CommonMethods.titiliumRegularItalic)
        appCompatTxtFont?.typeface = titiliumRegularItalic

        val titiliumSemiBold =
            Typeface.createFromAsset(context.assets, CommonMethods.titiliumSemiBold)
        appCompatTxtFont?.typeface = titiliumSemiBold


        val windSong = Typeface.createFromAsset(context.assets, CommonMethods.windSong)
        appCompatTxtFont?.typeface = windSong

        val walkwayBlack = Typeface.createFromAsset(context.assets, CommonMethods.walkwayBlack)
        appCompatTxtFont?.typeface = walkwayBlack

        val walkwayBold = Typeface.createFromAsset(context.assets, CommonMethods.walkwayBold)
        appCompatTxtFont?.typeface = walkwayBold

        val walkwayOblique = Typeface.createFromAsset(context.assets, CommonMethods.walkwayOblique)
        appCompatTxtFont?.typeface = walkwayOblique

        val walkwayObliqueBlack =
            Typeface.createFromAsset(context.assets, CommonMethods.walkwayObliqueBlack)
        appCompatTxtFont?.typeface = walkwayObliqueBlack

        val walkwayObliqueBold =
            Typeface.createFromAsset(context.assets, CommonMethods.walkwayObliqueBold)
        appCompatTxtFont?.typeface = walkwayObliqueBold

        val walkwayObliqueSemiBold =
            Typeface.createFromAsset(context.assets, CommonMethods.walkwayObliqueSemiBold)
        appCompatTxtFont?.typeface = walkwayObliqueSemiBold

        /*Adding data in font list */
        fontsNameList.add(
            FontsListModelResponse(
                academyEngravedLetPlain!!,
                "Academy Engraved LET "
            )
        )
        fontsNameList.add(FontsListModelResponse(abrilFatFaceRegular, "Abril FatFace"))
        fontsNameList.add(FontsListModelResponse(alexBrushRegular, "Alex Brush"))
        fontsNameList.add(FontsListModelResponse(allerBD, "Aller BD"))
        fontsNameList.add(FontsListModelResponse(allerBDLT, " Aller BD IT"))
        fontsNameList.add(FontsListModelResponse(allerIt, "Aller IT "))
        fontsNameList.add(FontsListModelResponse(allerDisplay, " Aller Display "))
        fontsNameList.add(FontsListModelResponse(allerRG, "Aller RG "))
        fontsNameList.add(FontsListModelResponse(antinoBold, "Antoino Bold"))
        fontsNameList.add(FontsListModelResponse(antonioLight, "Antonio Light"))
        fontsNameList.add(FontsListModelResponse(antonioRegular, "Antonio Regular"))
        fontsNameList.add(FontsListModelResponse(antonioRegular, "Antonio Regular"))
        //B
        fontsNameList.add(FontsListModelResponse(BebasRegular, " Bebas Regular"))
        //ontsNameList.add(FontsListModelResponse(blackJack, "Black Jack"))
        //C
        fontsNameList.add(FontsListModelResponse(caviarDreams, "Caviar Dreams"))
        fontsNameList.add(FontsListModelResponse(caviarDreamsItalic, "Caviar Dreams Italic"))
        fontsNameList.add(FontsListModelResponse(chunkFivePrint, "ChunkFive Print"))
        fontsNameList.add(FontsListModelResponse(chunkFiveRegular, "Chunk Five Regular "))
        fontsNameList.add(FontsListModelResponse(cooperHewittBold, "Cooper HewittBold"))
        //D
        fontsNameList.add(FontsListModelResponse(dancingScriptRegular, "Dancing Regular"))
        //F
        fontsNameList.add(FontsListModelResponse(fTus, "FTus"))
        fontsNameList.add(FontsListModelResponse(firaSansBold, "Firs Sans Bold"))
        fontsNameList.add(FontsListModelResponse(firaSansBoldItalic, "Fira Sans Bold Italic"))
        fontsNameList.add(FontsListModelResponse(firaSansBook, "Fira Sans Book "))
        fontsNameList.add(FontsListModelResponse(firaSansEight, "Fira Sans Eight"))
        //G
        fontsNameList.add(FontsListModelResponse(greatVibesRegular, "Great Vibes Regular"))
        fontsNameList.add(FontsListModelResponse(helloValentina, "Hello Valentina"))
        fontsNameList.add(FontsListModelResponse(interBlack, "Inter Black"))
        fontsNameList.add(FontsListModelResponse(interBold, "interBold"))
        fontsNameList.add(FontsListModelResponse(interBoldItalic, "inter Bold Italic"))
        fontsNameList.add(FontsListModelResponse(interExtraBold, "interExtraBold"))
        fontsNameList.add(FontsListModelResponse(interBold, "interBold"))
        fontsNameList.add(FontsListModelResponse(interBoldItalic, "Inter Bold Italic"))
        fontsNameList.add(FontsListModelResponse(interExtraBold, "Inter Extra Bold"))
        //J
        fontsNameList.add(FontsListModelResponse(josefinBold, "Josefin Bold"))
        fontsNameList.add(FontsListModelResponse(josefinBoldItalic, "Josefin Bold Italic"))
        fontsNameList.add(FontsListModelResponse(josefinLight, "Josefin Light"))
        fontsNameList.add(FontsListModelResponse(josefinRegular, "Josefin Regular"))
        //L
        fontsNameList.add(FontsListModelResponse(latoBlack, "Lato Black"))
        fontsNameList.add(FontsListModelResponse(latoBlackItalic, "Lato Black Italic"))
        fontsNameList.add(FontsListModelResponse(latoBold, "Lato Bold"))
        fontsNameList.add(FontsListModelResponse(latoBoldItalic, "Lato Bold Italic"))
        fontsNameList.add(FontsListModelResponse(latoHairLIneItalic, "Lato Hair Italic "))
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBlack,
                "Mont Serrat Alternates Black"
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBlackItalic,
                "Mont Serrat Alternates Black Italic"
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBold,
                "Mont Serrat Alternates Bold"
            )
        )
        fontsNameList.add(FontsListModelResponse(openSansBold, "Open Sans Bold"))
        fontsNameList.add(FontsListModelResponse(openSansBoldItalic, "Open Sans Bold Italic"))
        fontsNameList.add(
            FontsListModelResponse(
                openSansExtraBoldItalic,
                "Open Sans Extra Bold Italic"
            )
        )
        fontsNameList.add(FontsListModelResponse(openSansItalic, "Open Sans Italic"))
        fontsNameList.add(FontsListModelResponse(openSansLight, "Open Sans Light"))
        fontsNameList.add(FontsListModelResponse(openSansRegular, "Open Sans Regular"))
        fontsNameList.add(FontsListModelResponse(openSansSemiBold, "Open Sans Semi Bold"))
        fontsNameList.add(
            FontsListModelResponse(
                openSansSemiBoldItalic,
                "Open Sans Semi Bold Italic"
            )
        )
        fontsNameList.add(FontsListModelResponse(ostrichRegular, "Ostrich Regular"))
        fontsNameList.add(FontsListModelResponse(ostrichSansBlack, "Ostrich Sans Black"))
        fontsNameList.add(FontsListModelResponse(ostrichSansBold, "Ostrich Sans Bold"))
        fontsNameList.add(FontsListModelResponse(ostrichSansHeavy, "Ostrich Sans Heavy"))
        fontsNameList.add(FontsListModelResponse(ostrichSansLight, "Ostrich Sans Light"))
        fontsNameList.add(FontsListModelResponse(ostrichSansMedium, "Ostrich Sans Medium"))
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansRoundedMedium,
                "Ostrich Sans Rounded Medium"
            )
        )
        fontsNameList.add(FontsListModelResponse(osWaldBold, "OsWald Bold"))
        fontsNameList.add(FontsListModelResponse(osWaldBoldItalic, "OsWald Bold Italic"))
        fontsNameList.add(FontsListModelResponse(osWaldSemiBoldItalic, "OsWald Semi Bold Italic"))
        fontsNameList.add(FontsListModelResponse(playfairDisplayBlack, "Play Fair Display Black"))
        fontsNameList.add(
            FontsListModelResponse(
                playfairDisplayBlackItalic,
                "Play Fair Display Black Italic"
            )
        )
        fontsNameList.add(FontsListModelResponse(playfairDisplayBold, "Play Fair Display Bold"))
        fontsNameList.add(FontsListModelResponse(poppinBlackItalic, "Poppin Black Italic"))
        fontsNameList.add(FontsListModelResponse(poppinBlack, "Poppin Black"))
        fontsNameList.add(FontsListModelResponse(poppinBold, "Poppin Bold"))
        fontsNameList.add(FontsListModelResponse(poppinBoldItalic, "Poppin Bold Italic"))
        fontsNameList.add(FontsListModelResponse(poppinExtraBold, "Poppin Extra Bold"))
        fontsNameList.add(FontsListModelResponse(ptc55, "PTC 55"))
        fontsNameList.add(FontsListModelResponse(ptc75F, "PTC 75F"))
        fontsNameList.add(FontsListModelResponse(quicksAndBold, "Quicks And Bold"))
        fontsNameList.add(FontsListModelResponse(quicksAndBoldItalic, "Quicks And Bold Italic"))
        fontsNameList.add(FontsListModelResponse(quicksDash, "Quicks Dash"))
        fontsNameList.add(FontsListModelResponse(quicksAndItalic, "Quicks And Italic"))
        fontsNameList.add(FontsListModelResponse(quicksAndLight, "Quicks And Light"))
        fontsNameList.add(FontsListModelResponse(raleWayBlack, "RaleWay Black"))
        fontsNameList.add(FontsListModelResponse(raleWayBlackItalic, "RaleWay Black Italic"))
        fontsNameList.add(FontsListModelResponse(raleWayBold, "RaleWay Bold"))
        fontsNameList.add(FontsListModelResponse(raleWayBoldItalic, "RaleWay Bold Italic"))
        fontsNameList.add(FontsListModelResponse(raleWayItalic, "RaleWayItalic"))
        fontsNameList.add(FontsListModelResponse(raleWayMedium, "RaleWay Medium"))
        fontsNameList.add(FontsListModelResponse(seasRn, "SeasRn"))
        fontsNameList.add(FontsListModelResponse(sofiaRegular, "Sofia Regular"))
        fontsNameList.add(FontsListModelResponse(sourceSansProBlackIt, "SourceSans ProBlackIt"))
        fontsNameList.add(FontsListModelResponse(sourceSansProBold, "SourceSans ProBold"))
        fontsNameList.add(
            FontsListModelResponse(
                sourceSansProExtraLight,
                "SourceSans ProExtra Light"
            )
        )
        fontsNameList.add(FontsListModelResponse(sourceSansProBlack, "SourceSans ProBlack"))
        fontsNameList.add(FontsListModelResponse(titiliumLight, "Titilium Light"))
        fontsNameList.add(FontsListModelResponse(titiliumRegular, "Titilium Regular"))
        fontsNameList.add(FontsListModelResponse(titiliumRegularItalic, "Titilium RegularItalic"))
        fontsNameList.add(FontsListModelResponse(titiliumSemiBold, "Titilium SemiBold"))
        fontsNameList.add(FontsListModelResponse(windSong, "WindSong"))
        fontsNameList.add(FontsListModelResponse(walkwayBlack, "walkway Black"))
        fontsNameList.add(FontsListModelResponse(walkwayBold, "walkway Bold"))
        fontsNameList.add(FontsListModelResponse(walkwayOblique, "walkway Oblique"))
        fontsNameList.add(FontsListModelResponse(walkwayObliqueBlack, "walkway Oblique Black"))
        fontsNameList.add(FontsListModelResponse(walkwayObliqueBold, "walkway Oblique Bold"))
        fontListAdapter.addItems(fontsNameList)
        updateRecyclerView()
    }

    private fun searchFunctionality() {
        scheduleBinding?.etChooseFont?.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                search(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                search(newText)
                return true
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun search(text: String?) {
        val fontsFilteredList = ArrayList<FontsListModelResponse>()
        fontsFilteredList.clear()
        text.let {
            fontsNameList.forEach { fontsName ->
                if (fontsName.name.lowercase(Locale.getDefault())
                        .contains(text?.lowercase(Locale.getDefault())!!) || fontsName.fontTypeface.toString()
                        .lowercase(Locale.getDefault())
                        .contains(text.lowercase(Locale.getDefault()))
                ) {
                    fontsFilteredList.add(fontsName)
                }
            }
            fontListAdapter.addItems(fontsFilteredList)
            updateRecyclerView()
        }
    }

    private fun updateRecyclerView() {
        scheduleBinding?.rvChooseFonts.apply {
            fontListAdapter.notifyDataSetChanged()
        }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("NotifyDataSetChanged", "ResourceAsColor", "CutPasteId")
    private fun showColorDialog(From: String) {
        dialog = Dialog(context/*, android.R.style.Theme_Dialog*/)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog!!.setContentView(R.layout.choose_colors)
        title = dialog?.findViewById(R.id.tvDeleteTitle)
        sliderOpacitty = dialog?.findViewById(R.id.sliderOpacitty)
        slider_size = dialog?.findViewById(R.id.slider_size)
        opacity_tv = dialog?.findViewById(R.id.opacity_tv)
        size_tv = dialog?.findViewById(R.id.size_tv)
        changeColor = dialog?.findViewById(R.id.change_back_id)
        layoutColrs = dialog?.findViewById(R.id.Show_back)
        cardLayoutColrs = dialog?.findViewById(R.id.show_color_id)
        when (checkColor.get()) {

            "FONTCOLOR" -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(context.getColor(R.color.gray))
                title?.text = "Font Color"
                changeColor?.text = "Font Sample"
                SelectedDialog.set("Font Color")

                Log.e("SDFFFSDFFF", SelectedDialog.get().toString())
                /** Slider for SIZE */
                slider_size?.addOnChangeListener { _, value, _ ->
                    changeColor?.textSize = value
                    fontSize.set(value)
                    preferenceFile.storeosize(Constants.FONT_SIZE, value)
                    Log.e("WOrking", "---$value")
                }
                /** Slider for Opacity */
                sliderOpacitty?.addOnChangeListener { _, value, _ ->
                    val alpha = value / 100
                    changeColor?.alpha = alpha
                    fontOpacity.set(alpha)
                    preferenceFile.storeopacity(Constants.FONT_OPACITY, alpha)
                    Log.e("WOrking11222", "---$value")
                }
            }
        }
//        dialog!!.getWindow()!!.getAttributes().gravity = Gravity.LEFT or Gravity.TOP
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
        dialog?.window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
//         setColor =   dialog!!.findViewById<AppCompatTextView>(R.id.change_back_id)

        recyclerChoosecolor = dialog!!.findViewById(R.id.color_recyclerView)
        recyclerChoosecolor?.layoutManager = GridLayoutManager(context, 6)
        recyclerChoosecolor?.adapter = ColorsAdapter(context, colorList, this)
        // ChooseColorAdapter.addItems(colorList as ArrayList<ChooseColor>)
        recyclerChoosecolor?.adapter?.notifyDataSetChanged()
        dialog?.setCancelable(true)

        dialog?.findViewById<TextView>(R.id.more_colors)?.setOnClickListener {
            Log.e("SDFSDF", "SDFSDFSDF")
            showBottomDialog()
        }
        dialog?.findViewById<TextView>(R.id.reset_all)?.setOnClickListener {
            /** Correction is pending */
            dialog!!.findViewById<CardView>(R.id.show_color_id)
                .setBackgroundResource(R.drawable.back_color_choose)
            dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                .setBackgroundColor(context.getColor(R.color.white))
            dialog!!.findViewById<TextView>(R.id.change_back_id)
                .setBackgroundColor(context.getColor(R.color.white))

        }
        dialog?.findViewById<TextView>(R.id.tvCancelBtn)?.setOnClickListener {
            dialog?.dismiss()
        }
        dialog?.findViewById<TextView>(R.id.tvSaveSwipeBtn)?.setOnClickListener {

            backgroundColorLiveData.value = selectedbackgrouncolor
            Log.e("ZZZZZZZZZ", selectedbackgrouncolor.toString())
            dialog?.dismiss()
        }
        if (!context.isFinishing) {
            dialog?.show()
        }


    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setBorderBackground(layout: CardView, value: Float, color: Int) {
        borderSlideValue = value
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.RECTANGLE
        shape.cornerRadii = floatArrayOf(20f, 20f, 20f, 20f, 20f, 20f, 20f, 20f)
        shape.setStroke(value.toInt(), context.getColor(color))
        layout.background = shape

    }


    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    fun showBottomDialog() {
        val dialog = BottomSheetDialog(context)
        dialog.setContentView(R.layout.color_picker_layout)

        val colorPickerView = dialog.findViewById<ColorPickerView>(R.id.colorPickerView)
        val showColor = dialog.findViewById<TextView>(R.id.show_colors)
        val cancel = dialog.findViewById<ImageView>(R.id.cancel_iv)
        val choose = dialog.findViewById<TextView>(R.id.selectcancel_iv)
        colorPickerView!!.setColorListener(ColorEnvelopeListener { envelope, fromUser ->
            when (checkColor.get()) {
                "BACKGROUND" -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setBackgroundColor(envelope.color)
//                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)?.setBackgroundColor(envelope.color!!)
                    layoutColrs?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    /** Store locally */
                    preferenceFile.storecolor(Constants.BACKGROUND_COLOR, envelope.color)
                }
                "COLUMN" -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setBackgroundColor(envelope.color)
                    layoutColrs?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    columnColorLiveData = envelope.color
                    val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and envelope.color)
                    /** Store locally */
                    preferenceFile.storecolorString(Constants.COLUMN_COLOR, hexColor)
                }
                "BORDER" -> {
                    val layout = dialog.findViewById<CardView>(R.id.show_color_id)
                    showColor?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
//                    borderColorLiveData = envelope.color
                    //crash app
                    //       setBorderBackground(layout!!, 5F,selectedbackgrouncolor)

                    /** Store locally */

                    /** Store locally */
                    preferenceFile.storecolor(Constants.BORDER_COLOR, envelope.color)
                }
                "FONTCOLOR" -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setTextColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    fontColorLiveData = envelope.color
                    val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and envelope.color)
                    /** Store locally */
                    preferenceFile.storecolorString(Constants.FONT_COLOR, hexColor)
                }
            }
            Log.e("DFSDF", selectedbackgrouncolor.toString())
        })
        cancel?.setOnClickListener {
            dialog.dismiss()
        }
        choose?.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun click(categoryName: String, position: Int, _id: String?, s: String, color: Int?) {
        Log.e("SFFFFFFFF", color.toString() + "mzCVAVSSA" + position.toString())
        when (checkColor.get()) {
            "BACKGROUND" -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(context.getColor(color!!))
                val cd =
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color

                selectedbackgrouncolor = colorCode
//                preferenceFile.storecolor(BACKGROUND_COLOR,colorCode)
                Log.e("ASFDf", colorCode.toString())

            }

            "COLUMN" -> {
//                dialog!!.findViewById<TextView>(R.id.change_back_id).setBackgroundColor(CommonMethods.context.getColor(color!!))
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(context.getColor(color!!))

                val cd =
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color

                selectedbackgrouncolor = colorCode
                columnColorLiveData = colorCode

                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and color)
                preferenceFile.storecolorString(Constants.COLUMN_COLOR, hexColor)

                Log.e("ASFDf", colorCode.toString())

            }
            "BORDER" -> {
                borderColorLiveData = color!!
                selectedbackgrouncolor = color
                setBorderBackground(cardLayoutColrs!!, borderSlideValue, selectedbackgrouncolor)
//                cardLayoutColrs?.setBackgroundColor(CommonMethods.context.getColor(color!!))
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and color)

                preferenceFile.storecolorString(Constants.BORDER_COLOR, hexColor)

                Log.e("ASFDf", color.toString())

            }

            "FONTCOLOR" -> {

                /** Slider for size */
                slider_size?.addOnChangeListener { slider, value, fromUser ->

                    changeColor?.textSize = value
                    Log.e(
                        "WOrking", "---" + value.toString()
                    )
                }

                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(context.getColor(R.color.gray))

                title?.text = "Font Color"
                changeColor?.text = "Font Sample"

                dialog!!.findViewById<TextView>(R.id.change_back_id)
                    .setTextColor(context.getColor(color!!))
                val colorCode =
                    dialog!!.findViewById<TextView>(R.id.change_back_id).currentTextColor

                selectedbackgrouncolor = colorCode
                fontColorLiveData = colorCode
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and colorCode)
                preferenceFile.storecolorString(Constants.FONT_COLOR, hexColor)


//                changeColor?.setTextColor(CommonMethods.context.getColor(color!!))
//                selectedbackgrouncolor = color

                Log.e("SDFFFSDFFF", colorCode.toString())
            }
        }
    }


    /*Call here get fonts Api */
    fun getFontsApi() {
        repository.makeCall(
            ApiEnums.GET_FRONT_FONT_PAGE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetFontResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetFontResponse> {
                    return retrofitApi.getFonts(preferenceFile.retrieveKey("token").toString())
                }

                override fun onResponse(res: Response<GetFontResponse>) {
                    Log.e("AQQAAA", res.body().toString())
                    if (res.body() != null) {
                        if (res.isSuccessful && res.code() == 200) {
                            val data = res.body()!!.data
                            fontColor.set(data.frontpage_font_color)
                            // dataStoreUtil.saveObject(SAVE_EDIT_COVER_PAGE, res.body()!!.data)
                            /** Set Colors... */
                            SelectedDialog.set("Font Color")
                            /**Set Font Not According to Type**/
                            preferenceFile.storecolorString(
                                Constants.FONT_COLOR,
                                data.frontpage_font_color.toString()
                            )
                            //STORE FONT COLOR
                            fontColorLD.value = data.frontpage_font_color!!

                            if (data.is_top_selected == true || data.is_bottom_selected == true) {
                                isTopText.set(true)
                                isBottomText.set(true)
                            } else {
                                isBottomText.set(false)
                                isTopText.set(false)
                            }
                        } else {
                            showToast(context, res.body()!!.message)
                        }
                    } else {
                        showToast(context, res.body()!!.message)
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("zxczxczxc", message)
                }
            }
        )
    }

    /** Post api for color back ground ..**/
    private fun postFrontPageApi() = viewModelScope.launch {
        Log.e(
            "PRINT--REQUEST--BODY",
            "TOKEN-- " + preferenceFile.retrieveKey("token").toString() +
                    "BACK-- " + backgroundColor.get().toString() +
                    // "backgroundType-- " + backgroundType.get().toString() +
                    //  "columnColor-- " + columnColor.get().toString() +
                    "columnOpacity-- " + columnOpacity.get().toDouble() +
                    "borderOpacity-- " + borderOpacity.get().toDouble() +
                    "borderWidth-- " + borderWidth.get() +
                    "borderColor-- " + borderColor.get().toString() +
                    "fontName-- " + fontsName.get().toString() +
                    "fontColor-- " + fontColor.get().toString() +
                    "fontSize-- " + fontSize.get().toInt() +
                    "fontOpacity -- " + fontOpacity.get().toDouble()
        )

        repository.makeCall(ApiEnums.POST_EDIT_COVER_PAGE,
            loader = true, saveInCache = false, getFromCache = false,
            object : ApiProcessor<Response<PostFrontPageResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<PostFrontPageResponse> {
                    return retrofitApi.postFonts(
                        Authorization = preferenceFile.retrieveKey("token").toString(),
                        FrontPageBottomText = "",
                        FrontPageFontSize = fontSize.get().toInt(),
                        FrontPageTopText = "",
                        FrontPagerFontOpacity = fontOpacity.get().toString(),
                        FrontPagerFrontColor = fontColor.get().toString(),
                        isTopSelected = isTopText.get(),
                        isBottomSelected = isBottomText.get()
                    )
                }

                override fun onResponse(res: Response<PostFrontPageResponse>) {
                    Log.e("CONFIRMBOOKING", res.body().toString() + "RESS")

                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            showToast(context, res.body()!!.message)
                            dataStoreUtil.saveObject(SAVE_EDIT_COVER_PAGE, res.body()!!.data)

                        } else {
                            showToast(context, res.body()!!.message)
                        }
                    } else {
                        showToast(context, res.message())
                    }
                }
            })
    }

    /**Get view Profile by categories ***/
    private fun getProfileByCategory(search: String, showLoader: Boolean) {
        val dataArray = ArrayList<String>()
        for (idx in 0 until idList.size) {
            dataArray.add(idList[idx])
        }
        val dataObject = DashBoardPostData(
            dataArray, pref.retvieLatlong("lati").toDouble().toString(),
            "500", pref.retvieLatlong("longi").toDouble().toString(),
            userMiles.get().toString(), "1", search
        )

        Log.e("KADJrtgdfASDASDKL", idList.toString())

        Log.e("Dash_Board_Input===", dataObject.toString())
        Log.e(
            "SDAMILES",
            userMiles.get().toString() + " LATI " + pref.retvieLatlong("lati")
                .toDouble() + " LONG " + pref.retvieLatlong("longi")
                .toDouble() + " CATEIDDD - " + idList.toString() + "search --- " + search
        )

        repository.makeCall(
            ApiEnums.GETPROFILE_BYCATE,
            loader = showLoader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileCateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileCateResponse> {
                    return retrofitApi.getProfileByCategory(
                        pref.retrieveKey("token").toString(),
                        "application/json",
                        dataObject

                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetProfileCateResponse>) {

                    Log.d("WORKINGG_->>>---  ", res.body()!!.data.toString() + "DDDDDDDDS")

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.body()!!.status == 200) {

                                if (res.body()!!.data.size > 0) {
                                    val profileList = ArrayList<ProfileCateData>()
                                    profileList.clear()
                                    for (idx in 0 until res.body()?.data!!.size) {
                                        res.body()?.data!![idx].lngValue =
                                            res.body()?.data!![idx].long
                                        profileList.add(res.body()?.data!![idx])
                                    }
                                    Log.d("DashBoardResponse->", res.body()!!.data.toString())

                                    calculateLatLngToMiles()
                                    Log.d("viaksdistance", distance.get().toString().split(".")[0])

                                } else {
                                    Log.e("ASDASQKHE", "NO Data Found ")

                                }

                            } else {
                                Log.d("DashBoardResponse->", res.body()?.message.toString())

                                if (showLoader) {
                                    showToast(context, res.body()?.message.toString())
                                }
                            }
                        } else {
                            Log.d("DashBoardResponse->", res.body()?.message.toString())

                            if (showLoader) {
                                showToast(context, res.body()?.message.toString())
                            }
                        }
                    } else {
                        Log.d("DashBoardResponse->", res.body()?.message.toString())

                        if (showLoader) {
                            showToast(context, res.body()?.message.toString())
                        }
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("sdsdsd3", message)
                }

            }
        )
    }

    fun calculateLatLngToMiles() {
        val latLngA =
            LatLng(pref.retvieLatlong("lati").toDouble(), pref.retvieLatlong("longi").toDouble())
        val latLngB = LatLng(destinationLat.get(), destinationLong.get())
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude
        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude
        distance.set(locationA.distanceTo(locationB).toDouble().toString())
        Log.d("distanceCal", distance.get().toString().split(".")[0])
        Log.d("distanceCalqwer", distanceCal.get().toString())
        userMiles.set(distance.get().toString().split(".")[0])


    }

    private fun getDataFromDataStroe() {
        dataStoreUtil.readObject(SAVE_EDIT_COVER_PAGE, GetFontResponse::class.java) {
            fontColor.set(it?.data?.frontpage_font_color)
        }
    }

}