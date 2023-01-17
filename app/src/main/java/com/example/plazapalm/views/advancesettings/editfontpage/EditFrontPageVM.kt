package com.example.plazapalm.views.advancesettings.editfontpage

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FontsListFragmentBinding
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.navigateWithId
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class EditFrontPageVM @Inject constructor() : ViewModel() {
    var fontsNameList = ArrayList<FontsListModelResponse>()

    //  var fontsNameList = ArrayList<FontsListModelResponse>()
    var scheduleBinding: FontsListFragmentBinding? = null
    val fontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.fonts_list_item) }

    @SuppressLint("StaticFieldLeak")
    var appCompatTextView: AppCompatTextView? = null

    init {

        setAdapter()
    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivAdvanceEditFrontPage -> {
                view.findNavController().navigateUp()
            }
            R.id.btnEditFrontPageView -> {
                view.navigateWithId(R.id.favDetailsFragment)
            }
            R.id.tvAdvanceEditFrontPageFontValue -> {
                showBottomSheetDialogOne()
            }
        }
    }

    var fontBottomSheet: BottomSheetDialog? = null

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun showBottomSheetDialogOne() {
        fontBottomSheet =
            BottomSheetDialog(MainActivity.context.get()!!, R.style.CustomBottomSheetDialogTheme)
        scheduleBinding =
            FontsListFragmentBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
        scheduleBinding?.model = this
        fontBottomSheet?.setCancelable(true)
        scheduleBinding?.apply {
            tvChooseFontCancel.setOnClickListener {
                fontBottomSheet?.dismiss()
            }
        }
        fontBottomSheet?.setContentView(scheduleBinding?.root!!)
        fontBottomSheet?.show()

/*
        fontListAdapter.setOnItemClick { _, position, _ ->
            when (position) {
                0 ->
                {
                    fontsNameList.add(FontsListModelResponse("hello_valentina"))
                }
                2 ->
                {
                    fontsNameList.add(FontsListModelResponse("fonts/Roboto-Black.ttf"))
                }
                3->
                {
                    fontsNameList.add(FontsListModelResponse("fonts/Roboto-Italic.ttf"))
                }
                4 ->
                {
                    fontsNameList.add(FontsListModelResponse("fonts/Roboto-Black.ttf"))
                }
            }

        }
*/
    }

    @SuppressLint("NotifyDataSetChanged", "ResourceType")
    private fun setAdapter() {
        fontsNameList.map {
            false
        }
        val appCompatTxtFont: AppCompatTextView? = null
        // val newfont2: AppCompatTextView? = null

/*Academy_Engraved*/
        val academyEngravedLetPlain =
            Typeface.createFromAsset(context.assets, CommonMethods.academyEngravedLetPlain)
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
        appCompatTxtFont.typeface = BebasRegular

        /*Adding data in font list */
        fontsNameList.add(FontsListModelResponse(academyEngravedLetPlain, "Academy Engraved LET "))
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

        //B

        fontsNameList.add(FontsListModelResponse())
        fontListAdapter.addItems(fontsNameList)
        fontListAdapter.notifyDataSetChanged()

        scheduleBinding?.rvChooseFonts?.layoutManager = LinearLayoutManager(MainActivity.activity)
        scheduleBinding?.rvChooseFonts?.adapter = fontListAdapter
        scheduleBinding?.rvChooseFonts?.adapter?.notifyDataSetChanged()


    }
}