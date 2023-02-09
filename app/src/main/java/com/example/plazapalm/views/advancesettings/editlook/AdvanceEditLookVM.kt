package com.example.plazapalm.views.advancesettings.editlook

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.SearchView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
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
import com.example.plazapalm.databinding.AdvanceEditlookFontlistBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.EDIT_COLORS_LOOK
import com.example.plazapalm.datastore.GET_COLORS_EDIT_LOOK
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.ChooseColor
import com.example.plazapalm.models.EditLookColorsResponse
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.models.GetColorsResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.ColorsAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.Constants.BACKGROUND_COLOR
import com.example.plazapalm.utils.Constants.BORDER_COLOR
import com.example.plazapalm.utils.Constants.BORDER_OPACITY
import com.example.plazapalm.utils.Constants.BORDER_WIDTH
import com.example.plazapalm.utils.Constants.Background_color
import com.example.plazapalm.utils.Constants.Border_Color
import com.example.plazapalm.utils.Constants.COLUMN
import com.example.plazapalm.utils.Constants.COLUMN_COLOR
import com.example.plazapalm.utils.Constants.COLUMN_OPACITY
import com.example.plazapalm.utils.Constants.Column_color
import com.example.plazapalm.utils.Constants.FONTCOLOR
import com.example.plazapalm.utils.Constants.FONT_COLOR
import com.example.plazapalm.utils.hideKeyboard
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


@SuppressLint("StaticFieldLeak")
@HiltViewModel
class AdvanceEditLookVM @Inject constructor(

    private var dataStoreUtil: DataStoreUtil,
    private var preferenceFile: PreferenceFile,
    private var repository: Repository,

    ) : ViewModel(), clickItem {
    var hexColor: String? = null
    var fontsFilteredList = ArrayList<FontsListModelResponse>()
    var advanceEditLookFontsNameList = ArrayList<FontsListModelResponse>()
    var appCompatTxtFont: AppCompatTextView? = null

    var fontsName = ObservableField("Optima-Regular")
    var fontBottomSheet: BottomSheetDialog? = null
    var scheduleBinding: AdvanceEditlookFontlistBinding? = null
    var typfaceObserverLiveData = MutableLiveData<Boolean>()
    val advanceFontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.advance_editlook_fonts_list_item) }
    var fontTypeface: Typeface? = null
    var colorList = ArrayList<ChooseColor>()
    var recyclerChoosecolor: RecyclerView? = null
    var dialog: Dialog? = null
    var titlename = ObservableField("")
    var SelectedDialog = ObservableField("")
    var checkColor = ObservableField("")
    var backgroundColor = ObservableField("")
    var backgroundType = ObservableField("color")
    var columnColor = ObservableField("")
    var columnOpacity = ObservableFloat()
    var borderOpacity = ObservableFloat()
    var borderWidth = ObservableFloat()
    var borderColor = ObservableField("")
    var fontName = ObservableField("mdgdfg")
    var fontColor = ObservableField("")
    var fontSize = ObservableFloat()
    var fontOpacity = ObservableFloat()
    var selectedbackgrouncolor = -65536
    var borderSlideValue = 0F
    var columnColorLiveData = 0
    var borderColorLiveData = 0
    var fontColorLiveData = 0
    val backgroundColorLiveData = MutableLiveData<Any?>()
    val columnColorLD = MutableLiveData<Any>()
    val fontColorLD = MutableLiveData<Any>()
    val borderColorLD = MutableLiveData<Any>()
    var title: TextView? = null
    var fontSample: TextView? = null
    var sliderOpacitty: Slider? = null
    var slider_size: Slider? = null
    var opacity_tv: TextView? = null
    var size_tv: TextView? = null
    var changeColor: TextView? = null
    var layoutColrs: ConstraintLayout? = null
    var cardLayoutColrs: CardView? = null

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
            R.id.ivAdvanceEditLookBack -> {
                preferenceFile.cleardata(BORDER_COLOR)
                preferenceFile.cleardata(COLUMN_COLOR)
                preferenceFile.cleardata(BACKGROUND_COLOR)
                preferenceFile.cleardata(FONT_COLOR)

                view.findNavController().navigateUp()

            }
            R.id.btnAdvanceEditLookView -> {
                //CommonMethods.showToast(MainActivity.context.get()!!,"Crash is Coming.. FavDetailsFragment.")
                val bundle = Bundle()
                bundle.putString("comingFrom", "isEditLook")
                view.findNavController().navigate(R.id.favDetailsFragment, bundle)
            }

            R.id.viewBoxLookingBGColor -> {
                checkColor.set(CommonMethods.BACKGROUND)
                showColorDialog(CommonMethods.BACKGROUND)
            }
//Colmn
            R.id.viewBoxColumnBGColor -> {
                checkColor.set(CommonMethods.COLUMN)
                showColorDialog(CommonMethods.COLUMN)
            }
            R.id.viewBoxBorderColor -> {
                checkColor.set(CommonMethods.BORDER)
                showColorDialog(CommonMethods.BORDER)
            }
            R.id.tvAdvanceEditLookFontValues -> {
                //here open bottom sheet of fontslist ..
                showBottomSheetDialogOne()
            }
            R.id.viewBoxEditFonts -> {
                checkColor.set(FONTCOLOR)
                showColorDialog(FONTCOLOR)
            }
            R.id.btnAdvanceEditLookAttach -> {
                postColorsAPI()
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun showBottomSheetDialogOne() {
        fontsFilteredList.clear()
        fontBottomSheet =
            BottomSheetDialog(MainActivity.context.get()!!, R.style.CustomBottomSheetDialogTheme)
        fontBottomSheet?.behavior?.state = BottomSheetBehavior.STATE_COLLAPSED
        scheduleBinding =
            AdvanceEditlookFontlistBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
        fontBottomSheet?.setCancelable(true)
        scheduleBinding?.model = this
        scheduleBinding?.apply {
            tvAdvanceEditLookChooseFontCancel.setOnClickListener {
                fontBottomSheet?.dismiss()
                CommonMethods.context.hideKeyboard()
            }
            clFontListMain.setOnClickListener {
                CommonMethods.context.hideKeyboard()
            }

            rvAdvanceChooseFonts.setOnClickListener {
                CommonMethods.context.hideKeyboard()
            }
            searchFunctionality()
        }
        fontBottomSheet?.setContentView(scheduleBinding?.root!!)
        fontBottomSheet?.show()
        typfaceObserverLiveData.postValue(false)
        advanceFontListAdapter.setOnItemClick { view, position, type ->
            when (type) {
                CommonMethods.fontsItemClick -> {
                    fontBottomSheet?.dismiss()
                    val adapterList = advanceFontListAdapter.getAllItems()
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
        advanceEditLookFontsNameList.map {
            false
        }
        scheduleBinding?.rvAdvanceChooseFonts?.layoutManager =
            LinearLayoutManager(MainActivity.activity)
        scheduleBinding?.rvAdvanceChooseFonts?.adapter = advanceFontListAdapter
        updateRecyclerView()
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setFontsInAdapterList() {
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
        advanceFontListAdapter.addItems(advanceEditLookFontsNameList)
        updateRecyclerView()
    }

    private fun searchFunctionality() {
        scheduleBinding?.etAdvanceEditLookChooseFont?.setOnQueryTextListener(object :
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
        fontsFilteredList = ArrayList()
        fontsFilteredList.clear()
        text.let {
            advanceEditLookFontsNameList.forEach { fontsName ->
                if (fontsName.name.lowercase()
                        .contains(text?.lowercase(Locale.getDefault())!!) || fontsName.fontTypeface.toString()
                        .lowercase().contains(text.lowercase(Locale.getDefault()))
                ) {
                    fontsFilteredList.add(fontsName)
                }
            }
            advanceFontListAdapter.addItems(fontsFilteredList)
            updateRecyclerView()
        }
    }

    private fun updateRecyclerView() {
        scheduleBinding?.rvAdvanceChooseFonts.apply {
            advanceFontListAdapter.notifyDataSetChanged()
        }
    }

    /** Post api for color back ground ..**/
    private fun postColorsAPI() = viewModelScope.launch {
        repository.makeCall(ApiEnums.COLOR_LOOK,
            loader = true, saveInCache = false, getFromCache = false,
            object : ApiProcessor<Response<EditLookColorsResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<EditLookColorsResponse> {
                    return retrofitApi.postEditLookColors(
                        preferenceFile.retrieveKey("token").toString(),
                        backgroundColor = backgroundColor.get().toString(),
                        backgroundType = backgroundType.get().toString(),
                        columnColor = columnColor.get().toString(),
                        columnOpacity = columnOpacity.get().toDouble(),
                        borderOpacity = borderOpacity.get().toDouble(),
                        borderWidth = borderWidth.get(),
                        borderColor = borderColor.get().toString(),
                        fontName = fontsName.get().toString(),
                        fontColor = fontColor.get().toString(),
                        fontSize = fontSize.get().toInt(),
                        fontOpacity = fontOpacity.get().toDouble()
                    )
                }

                override fun onResponse(res: Response<EditLookColorsResponse>) {
                    Log.e("CONFIRMBOOKING", res.body().toString() + "RESS")
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                            dataStoreUtil.saveObject(EDIT_COLORS_LOOK, res.body()!!.data)
                            preferenceFile.storeFontName(
                                Constants.ADVANCE_EDIT_LOOK_FONTS_NAME,
                                res.body()?.data?.font_name!!
                            )
                            Log.d("AdvanceFontGet", " " + res.body()?.data!!.font_name)
                            Log.e("5554455---G", res.body()!!.data.toString() + "RESS")
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }
            })
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("NotifyDataSetChanged", "ResourceAsColor", "CutPasteId", "ResourceType")
    private fun showColorDialog(From: String) {
        dialog = Dialog(CommonMethods.context)
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
            //for background ..
            Constants.BACKGROUND -> {
                if (preferenceFile.retviecolorString("BACKGROUND_COLOR") != null && preferenceFile.retviecolorString("BACKGROUND_COLOR") != "")
                {
                    val setStoredBackgroundColor = preferenceFile.retviecolorString("BACKGROUND_COLOR")
                    layoutColrs?.setBackgroundColor(Color.parseColor(setStoredBackgroundColor.toString()))
                }
                title?.text = Background_color
                sliderOpacitty?.visibility = View.GONE
                slider_size?.visibility = View.GONE
                opacity_tv?.visibility = View.GONE
                size_tv?.visibility = View.GONE
                SelectedDialog.set(Background_color)
                Log.e("SDAFSDFF", titlename.get().toString())

            }
            //for column ...
            COLUMN -> {
                if (preferenceFile.retviecolorString("COLUMN_COLOR") != null && preferenceFile.retviecolorString("COLUMN_COLOR")!! != "")
                {
                    title?.text = "Column Color"
                    slider_size?.visibility = View.GONE
                    size_tv?.visibility = View.GONE
                    SelectedDialog.set(Column_color)
                    //  Log.e("Data_Colum111===",colorValue.toString())
                    layoutColrs?.setBackgroundColor(Color.parseColor(preferenceFile.retviecolorString("COLUMN_COLOR")))

                    /** Slider for Opacity */
                    sliderOpacitty?.addOnChangeListener { _, value, _ ->
                        val alpha = value / 100
                        dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).alpha = alpha
                        columnOpacity.set(alpha)
                        preferenceFile.storeopacity(COLUMN_OPACITY, alpha)
                        Log.e("WOrking11222", "---$value")
                    }
                } else {
                    /**Coloumn color..**/
                    title?.text = "Column Color"
                    slider_size?.visibility = View.GONE
                    size_tv?.visibility = View.GONE
                    SelectedDialog.set(Column_color)
                    /** Slider for Opacity */
                    sliderOpacitty?.addOnChangeListener { _, value, _ ->
                        val alpha = value / 100
                        dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).alpha = alpha
                        columnOpacity.set(alpha)
                        preferenceFile.storeopacity(COLUMN_OPACITY, alpha)
                        Log.e("WOrking11222", "---$value")
                    }
                }
            }

            //for border ..
            Constants.BORDER -> {
                val borderView = dialog!!.findViewById<CardView>(R.id.show_color_id)
                if (preferenceFile.retviecolorString("BORDER_COLOR") != null && preferenceFile.retviecolorString("BORDER_COLOR") != "")
                {
                    setBorderBackground(borderView, borderSlideValue, Color.parseColor(preferenceFile.retviecolorString("BORDER_COLOR")))
                    if(preferenceFile.retviecolorString("COLUMN_COLOR") != null && preferenceFile.retviecolorString("COLUMN_COLOR") != "") {
                        layoutColrs?.setBackgroundColor(Color.parseColor(preferenceFile.retviecolorString("COLUMN_COLOR")))
                    }

                    slider_size?.addOnChangeListener { _, value, _ ->
                        changeColor?.textSize = value
                        borderWidth.set(value)
                        preferenceFile.storeosize(BORDER_WIDTH, value)
                        //here set cardView background on slider change ...
                        setBorderBackground(borderView, value, selectedbackgrouncolor)
                    }

                    sliderOpacitty?.addOnChangeListener { _, value, _ ->
                        val alpha = value / 100
                        borderOpacity.set(alpha)
                        preferenceFile.storeopacity(BORDER_OPACITY, alpha)
                        dialog!!.findViewById<CardView>(R.id.show_color_id)?.alpha = alpha
                        Log.e("WOrking11222", "---$value")
                    }

                    //   title?.text = "Border Color"
                    //  SelectedDialog.set("Border Color")

                    title?.text = Border_Color
                    SelectedDialog.set(Border_Color)
                    size_tv?.visibility = View.GONE

                } else {
                    // val layout = dialog!!.findViewById<CardView>(R.id.show_color_id)
                    setBorderBackground(borderView, 12f, R.color.gray)
                    /** Slider for SIZE */
                    slider_size?.addOnChangeListener { _, value, _ ->
                        changeColor?.textSize = value
                        borderWidth.set(value)
                        preferenceFile.storeosize(BORDER_WIDTH, value)

                        setBorderBackground(borderView, value, selectedbackgrouncolor)

                        Log.e(
                            "WOrking", "---$value"
                        )
                    }
                    /** Slider for Opacity */
                    sliderOpacitty?.addOnChangeListener { slider, value, fromUser ->
                        val alpha = value / 100
                        borderOpacity.set(alpha)
                        preferenceFile.storeopacity(BORDER_OPACITY, alpha)
                        dialog!!.findViewById<CardView>(R.id.show_color_id)?.alpha = alpha
                        Log.e("WOrking11222", "---$value")
                    }
                    title?.text = "Border Color"
                    SelectedDialog.set("Border Color")
                }


            }
            //for font color...
            "FONTCOLOR" -> {
                if (preferenceFile.retviecolorString("FONT_COLOR") != null && preferenceFile.retviecolorString("FONT_COLOR") != "" && preferenceFile.retviecolorString("BORDER_COLOR") != null && preferenceFile.retviecolorString("BORDER_COLOR") != "" && preferenceFile.retviecolorString("COLUMN_COLOR") != null && preferenceFile.retviecolorString("COLUMN_COLOR") != "")
                {
                    title?.text = "Font Color"
                    changeColor?.text = "Font Sample"
                    val fontColorForSetText=preferenceFile.retviecolorString("FONT_COLOR")
                    changeColor?.setTextColor(Color.parseColor(fontColorForSetText.toString()))

                    val borderColorSetFont=preferenceFile.retviecolorString("BORDER_COLOR")
                    setBorderBackground(cardLayoutColrs!!, borderSlideValue, Color.parseColor(borderColorSetFont.toString()))

                    val layoutBgColor = preferenceFile.retviecolorString("COLUMN_COLOR")
                    layoutColrs?.setBackgroundColor(Color.parseColor(layoutBgColor.toString()))

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
                } else {
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                        .setBackgroundColor(MainActivity.context.get()!!.getColor(R.color.gray))
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
        }
        CommonMethods.dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        CommonMethods.dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
        dialog?.window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        /**Set Recycler Adapter here **/
        recyclerChoosecolor = dialog!!.findViewById(R.id.color_recyclerView)
        recyclerChoosecolor?.layoutManager = GridLayoutManager(CommonMethods.context, 6)
        recyclerChoosecolor?.adapter = ColorsAdapter(CommonMethods.context, colorList, this)
        recyclerChoosecolor?.adapter?.notifyDataSetChanged()
        dialog?.setCancelable(true)
        dialog?.findViewById<TextView>(R.id.more_colors)?.setOnClickListener {
            showBottomDialog()
        }

        /**For Reset (functionality)...**/
        dialog?.findViewById<TextView>(R.id.reset_all)?.setOnClickListener {
            /** Correction is pending */
            dialog!!.findViewById<CardView>(R.id.show_color_id)
                .setBackgroundResource(R.drawable.back_color_choose)
            dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                .setBackgroundColor(CommonMethods.context.getColor(R.color.white))
            dialog!!.findViewById<TextView>(R.id.change_back_id)
                .setBackgroundColor(CommonMethods.context.getColor(R.color.white))
        }

        /**Cancel Button **/
        dialog?.findViewById<TextView>(R.id.tvCancelBtn)?.setOnClickListener {
            dialog?.dismiss()
        }
        /**Save Button **/
        dialog?.findViewById<TextView>(R.id.tvSaveSwipeBtn)?.setOnClickListener {
            backgroundColorLiveData.value = selectedbackgrouncolor
            dialog?.dismiss()
        }
        if (!CommonMethods.context.isFinishing) {
            dialog?.show()
        }
    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun setBorderBackground(layout: CardView, value: Float, color: Int) {
        try {
            borderSlideValue = value
            val shape = GradientDrawable()
            shape.shape = GradientDrawable.RECTANGLE
            shape.cornerRadii = floatArrayOf(20f, 20f, 20f, 20f, 20f, 20f, 20f, 20f)
           // shape.setStroke(value.toInt(), MainActivity.context.get()?.getColor(color)!!)
            shape.setStroke(value.toInt(), color)
            layout.background = shape
        } catch (e: Exception) {
            Log.d("AdvanceEditBorderBGEx->", "${e.message.toString()}")
        }
    }
    /**Select color click..**/
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun click(categoryName: String, position: Int, _id: String?, s: String, color: Int?) {
        when (checkColor.get()) {
            Constants.BACKGROUND -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).setBackgroundColor(CommonMethods.context.getColor(color!!))
                val cd = dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color
                selectedbackgrouncolor = colorCode
                hexColor = java.lang.String.format("#%06X", 0xFFFFFF and selectedbackgrouncolor)
                preferenceFile.storecolorString(BACKGROUND_COLOR, hexColor!!)
                Log.e("ASFDf", colorCode.toString())
            }
            COLUMN -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).setBackgroundColor(CommonMethods.context.getColor(color!!))
                val cd = dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color
                columnColorLiveData = colorCode
                selectedbackgrouncolor = colorCode
                layoutColrs?.setBackgroundColor(selectedbackgrouncolor)
                hexColor = java.lang.String.format("#%06X", 0xFFFFFF and selectedbackgrouncolor)
                preferenceFile.storecolorString(COLUMN_COLOR, hexColor!!)
                Log.e("ASFDf", colorCode.toString())
                Log.e("Data_Colum222===", hexColor.toString())
            }
            Constants.BORDER ->
            {
                selectedbackgrouncolor = color!!
                // cardLayoutColrs?.setCardBackgroundColor(selectedbackgrouncolor)
                setBorderBackground(cardLayoutColrs!!, borderSlideValue, selectedbackgrouncolor)
                //here save color in shared pref..
                hexColor = java.lang.String.format("#%06X", 0xFFFFFF and selectedbackgrouncolor)
                preferenceFile.storecolorString(BORDER_COLOR, hexColor!!)
                Log.e("ASFDaaaf==", selectedbackgrouncolor.toString())
            }
            CommonMethods.FONTCOLOR -> {
                /** Slider for size */
                slider_size?.addOnChangeListener { _, value, _ ->
                    changeColor?.textSize = value
                }
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).setBackgroundColor(CommonMethods.context.getColor(R.color.gray))
                title?.text = "Font Color"
                changeColor?.text = "Font Sample"
                dialog!!.findViewById<TextView>(R.id.change_back_id).setTextColor(MainActivity.context.get()!!.getColor(color!!))
                val colorCode = dialog!!.findViewById<TextView>(R.id.change_back_id).currentTextColor
                selectedbackgrouncolor = colorCode
                fontColorLiveData = colorCode
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and colorCode)
                preferenceFile.storecolorString(FONT_COLOR, hexColor)
            }
        }
    }

    /*This is not for set Color for now*/
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    fun showBottomDialog() {
        val dialog = BottomSheetDialog(CommonMethods.context /*R.style.DialogeTheme*/)
        dialog.setContentView(R.layout.color_picker_layout)
        val colorPickerView = dialog.findViewById<ColorPickerView>(R.id.colorPickerView)
        val showColor = dialog.findViewById<TextView>(R.id.show_colors)
        val cancel = dialog.findViewById<ImageView>(R.id.cancel_iv)
        val choose = dialog.findViewById<TextView>(R.id.selectcancel_iv)
        colorPickerView!!.setColorListener(ColorEnvelopeListener { envelope, fromUser ->
            when (checkColor.get()) {
                Constants.BACKGROUND -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setBackgroundColor(envelope.color)
                    layoutColrs?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    /** Store locally */
                    preferenceFile.storecolor(BACKGROUND_COLOR, envelope.color)
                }
                COLUMN -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setBackgroundColor(envelope.color)
                    layoutColrs?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    columnColorLiveData = envelope.color
                    hexColor = java.lang.String.format("#%06X", 0xFFFFFF and envelope.color)
                    /** Store locally */
                    preferenceFile.storecolorString(COLUMN_COLOR, hexColor!!)
                }
                Constants.BORDER -> {
                    showColor?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color

                    /** Store locally */
                    preferenceFile.storecolor(BORDER_COLOR, envelope.color)
                }


                "FONTCOLOR" -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setTextColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    fontColorLiveData = envelope.color
                    val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and envelope.color)
                    /** Store locally */
                    preferenceFile.storecolorString(FONT_COLOR, hexColor)
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

    /***Get Edit Looks Api ..*/
    fun getEditLookColor() {
        repository.makeCall(
            ApiEnums.GET_EDITCOLORS,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetColorsResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetColorsResponse> {
                    return retrofitApi.colorLookGet(preferenceFile.retrieveKey("token").toString())
                }

                override fun onResponse(res: Response<GetColorsResponse>) {
                    Log.e("AQQAAA", res.body().toString())
                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {
//                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                                dataStoreUtil.saveObject(GET_COLORS_EDIT_LOOK, res.body()!!.data!!)
                                /** Set Colors... */
                                SelectedDialog.set("Background Color")
                                val data = res.body()!!.data
                                backgroundColorLiveData.value = data!!.background_color!!
                                columnColorLD.value = data.column_color!!
                                borderColorLD.value = data.border_color!!
                                fontColorLD.value = data.font_color!!
                                fontsName.set(data.font_name.toString())
                                //store background color in shared pref
                                preferenceFile.storecolorString(
                                    BACKGROUND_COLOR,
                                    data.background_color!!
                                )
                                //store font color in share pref
                                preferenceFile.storecolorString(FONT_COLOR, data.font_color)
                                //store border color in shared pref
                                preferenceFile.storecolorString(BORDER_COLOR, data.border_color)
                                //store column color in shared pref
                                preferenceFile.storecolorString(
                                    COLUMN_COLOR,
                                    data.column_color as String
                                )

                                Log.e("VVVVVVSS", res.body().toString())

                            } else {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    res.body()!!.message!!
                                )
                            }
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("zxczxczxc", message)

                }
            }
        )

    }
}
