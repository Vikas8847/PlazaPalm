package com.example.plazapalm.views.advancesettings.editfontpage

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.SearchView
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceShowViewProfileBinding
import com.example.plazapalm.databinding.FontsListFragmentBinding
import com.example.plazapalm.datastore.GET_COLORS_EDIT_LOOK
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.models.GetColorsResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.academyEngravedLetPlain
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.CommonMethods.dialog
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import java.util.*
import javax.inject.Inject


@HiltViewModel
class EditFrontPageVM @Inject constructor() : ViewModel() {
    var appCompatTxtFont: AppCompatTextView? = null
    var fontsNameList = ArrayList<FontsListModelResponse>()
    var fontTypeface: Typeface? = null
    var isChecked = ObservableBoolean(false)

    var userProfileName = ObservableField("")
    var userProfileDescription = ObservableField("")
    var userProfileLocation = ObservableField("")

    var typfaceObserverLiveData = MutableLiveData<Boolean>()

    var fontsName = ObservableField("Optima-Regular")

    var fontsFilteredList = ArrayList<FontsListModelResponse>()
    var scheduleBinding: FontsListFragmentBinding? = null
    val fontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.fonts_list_item) }


    init {
        setFontsInAdapterList()
        setAdapter()
    }

    fun onClicks(view: View) {
        when (view.id) {
            /*attac button click */
            R.id.btnEditFrontLookAttach->{
                // call here post api of fonts
            }
            R.id.ivAdvanceEditFrontPage -> {
                view.findNavController().navigateUp()
            }
            R.id.btnEditFrontPageView -> {
                /*call herer on view button dialog (get fonts api)*/
                // showViewProfileDialog()
            }
            R.id.tvAdvanceEditFrontPageFontValue -> {
                showBottomSheetDialogOne()
            }
        }
    }


    private fun showViewProfileDialog() {
        val profileBinding: AdvanceShowViewProfileBinding?
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.advance_show_view_profile)
            profileBinding =
                AdvanceShowViewProfileBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
            profileBinding.root
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(true)
            if (isChecked.get()) {
                userProfileName.set("Vikas Panchal")
                profileBinding.tvProfileUserName.text = "Vikas Panchal"
                // isChecked.set(false)
            } else {
                userProfileName.set("Vikas Panchal")
                isChecked.set(true)
            }
            dialog?.show()
        }
    }


    var fontBottomSheet: BottomSheetDialog? = null

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun showBottomSheetDialogOne() {
        fontBottomSheet = BottomSheetDialog(MainActivity.context.get()!!, R.style.CustomBottomSheetDialogTheme)
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
        fontsNameList.add(FontsListModelResponse(academyEngravedLetPlain!!, "Academy Engraved LET "))
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
                if (fontsName.name.lowercase(Locale.getDefault()).contains(text?.lowercase(Locale.getDefault())!!) || fontsName.fontTypeface.toString().lowercase(Locale.getDefault()).contains(text.lowercase(Locale.getDefault()))
                )
                {
                    fontsFilteredList.add(fontsName)
                }
                updateRecyclerView()
            }
        }
    }
    private fun updateRecyclerView() {
        scheduleBinding?.rvChooseFonts.apply {
            fontListAdapter.notifyDataSetChanged()
        }
    }


    /*Call here get fonts Api */
/*
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
                                */
/** Set Colors... */
/*

                                SelectedDialog.set("Background Color")
                                val data = res.body()!!.data
                                backgroundColorLiveData.value = data!!.background_color!!
                                columnColorLD.value = data.column_color!!
                                borderColorLD.value = data.border_color!!
                                fontColorLD.value = data.font_color!!
                                preferenceFile.storecolorString(
                                    Constants.BACKGROUND_COLOR,
                                    data.background_color!!
                                )
                                preferenceFile.storecolorString(Constants.FONT_COLOR, data.font_color)
                                preferenceFile.storecolorString(Constants.BORDER_COLOR, data.border_color)
                                preferenceFile.storecolorString(
                                    Constants.COLUMN_COLOR,
                                    data.border_color
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
*/

}