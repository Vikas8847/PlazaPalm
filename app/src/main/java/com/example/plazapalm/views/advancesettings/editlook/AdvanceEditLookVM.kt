package com.example.plazapalm.views.advancesettings.editlook

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.EDIT_COLORS_LOOK
import com.example.plazapalm.datastore.GET_COLORS_EDIT_LOOK
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.ChooseColor
import com.example.plazapalm.models.EditLookColorsResponse
import com.example.plazapalm.models.GetColorsResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.ColorsAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants.BACKGROUND_COLOR
import com.example.plazapalm.utils.Constants.BORDER_COLOR
import com.example.plazapalm.utils.Constants.BORDER_OPACITY
import com.example.plazapalm.utils.Constants.BORDER_WIDTH
import com.example.plazapalm.utils.Constants.COLUMN_COLOR
import com.example.plazapalm.utils.Constants.COLUMN_OPACITY
import com.example.plazapalm.utils.Constants.FONT_COLOR
import com.example.plazapalm.utils.Constants.FONT_OPACITY
import com.example.plazapalm.utils.Constants.FONT_SIZE
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.slider.Slider
import com.skydoves.colorpickerview.ColorPickerView
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject


@SuppressLint("StaticFieldLeak")
@HiltViewModel
class AdvanceEditLookVM @Inject constructor(

    private var dataStoreUtil: DataStoreUtil,
    private var preferenceFile: PreferenceFile,
    private var repository: Repository

) : ViewModel(), clickItem {

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

    val backgroundColorLiveData = MutableLiveData<Any>()
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

    val ChooseColorAdapter by lazy { RecyclerAdapter<ChooseColor>(R.layout.choose_color_items) }

    init {

//        getEditLookColor()

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
                val bundle = Bundle()
                bundle.putString("comingFrom", "isEditLook")
                view.findNavController().navigate(R.id.favDetailsFragment, bundle)
            }

            R.id.viewBoxLookingBGColor -> {
                checkColor.set("BACKGROUND")
                showColorDialog("BACKGROUND")
            }

            R.id.viewBoxColumnBGColor -> {
                checkColor.set("COLUMN")
                showColorDialog("COLUMN")
            }
            R.id.viewBoxBorderColor -> {
                checkColor.set("BORDER")
                showColorDialog("BORDER")
            }
            R.id.tvAdvanceEditLookFontValues -> {
                checkColor.set(" ")
            }
            R.id.viewBoxEditFonts -> {
                checkColor.set("FONTCOLOR")
                showColorDialog("FONTCOLOR")
            }
            R.id.btnAdvanceEditLookAttach -> {
                Log.e("AAA", "WORKINGGG--- ")
                postColorsAPI()
            }

        }

    }

    private fun postColorsAPI() = viewModelScope.launch {

        Log.e(
            "PRINT--REQUEST--BODY",
            "TOKEN-- " + preferenceFile.retrieveKey("token").toString() +
                    "BACK-- " + backgroundColor.get().toString() +
                    "backgroundType-- " + backgroundType.get().toString() +
                    "columnColor-- " + columnColor.get().toString() +
                    "columnOpacity-- " + columnOpacity.get().toDouble() +
                    "borderOpacity-- " + borderOpacity.get().toDouble() +
                    "borderWidth-- " + borderWidth.get() +
                    "borderColor-- " + borderColor.get().toString() +
                    "fontName-- " + fontName.get().toString() +
                    "fontColor-- " + fontColor.get().toString() +
                    "fontSize-- " + fontSize.get().toInt() +
                    "fontOpacity -- " + fontOpacity.get().toDouble()
        )

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
                        fontName = fontName.get().toString(),
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
    @SuppressLint("NotifyDataSetChanged", "ResourceAsColor", "CutPasteId")
    private fun showColorDialog(From: String) {
        dialog = Dialog(CommonMethods.context/*, android.R.style.Theme_Dialog*/)
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
            "BACKGROUND" -> {
                title?.text = "Background Color"
                sliderOpacitty?.visibility = View.GONE
                slider_size?.visibility = View.GONE
                opacity_tv?.visibility = View.GONE
                size_tv?.visibility = View.GONE
//                titlename.set("Background Color")
                SelectedDialog.set("Background Color")
                Log.e("SDAFSDFF", titlename.get().toString())

            }

            //for column ...
            "COLUMN" -> {
                slider_size?.visibility = View.GONE
                size_tv?.visibility = View.GONE

                title?.text = "Column Color"
                SelectedDialog.set("Column Color")

                /** Slider for Opacity */

                sliderOpacitty?.addOnChangeListener { slider, value, fromUser ->
                    val alpha = value / 100
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).alpha = alpha
                    columnOpacity.set(alpha)
                    preferenceFile.storeopacity(COLUMN_OPACITY, alpha)
                    Log.e("WOrking11222", "---" + value.toString())

                }
            }

            //for border ..
            "BORDER" -> {
                val layout = dialog!!.findViewById<CardView>(R.id.show_color_id)
                setBorderBackground(layout, 12f, R.color.gray)
                /** Slider for SIZE */
                slider_size?.addOnChangeListener { slider, value, fromUser ->
                    changeColor?.textSize = value
                    borderWidth.set(value)
                    preferenceFile.storeosize(BORDER_WIDTH, value)

                    setBorderBackground(layout, value, selectedbackgrouncolor)

                    Log.e(
                        "WOrking", "---" + value.toString()
                    )
                }

                /** Slider for Opacity */

                sliderOpacitty?.addOnChangeListener { slider, value, fromUser ->
                    val alpha = value / 100
                    borderOpacity.set(alpha)
                    preferenceFile.storeopacity(BORDER_OPACITY, alpha)
                    dialog!!.findViewById<CardView>(R.id.show_color_id)?.alpha = alpha

                    Log.e("WOrking11222", "---" + value.toString())

                }

                title?.text = "Border Color"
                SelectedDialog.set("Border Color")
            }

            //for font color...
            "FONTCOLOR" -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).setBackgroundColor(CommonMethods.context.getColor(R.color.gray))
                title?.text = "Font Color"
                changeColor?.text = "Font Sample"
                SelectedDialog.set("Font Color")
                Log.e("SDFFFSDFFF", SelectedDialog.get().toString())

                /** Slider for SIZE */
                slider_size?.addOnChangeListener { _, value, _ ->
                    changeColor?.textSize = value
                    fontSize.set(value)
                    //store text size
                    preferenceFile.storeosize(FONT_SIZE, value)

                    Log.e("WOrking", "---$value")
                }

                /** Slider for Opacity */
                sliderOpacitty?.addOnChangeListener { _, value, _ ->
                    val alpha = value / 100
                    changeColor?.alpha = alpha
                    fontOpacity.set(alpha)
                    //store font opacity ..
                    preferenceFile.storeopacity(FONT_OPACITY, alpha)
                    Log.e("WOrking11222", "---$value")

                }

            }
        }


//        dialog!!.getWindow()!!.getAttributes().gravity = Gravity.LEFT or Gravity.TOP
        CommonMethods.dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        CommonMethods.dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
        dialog?.window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

//         setColor =   dialog!!.findViewById<AppCompatTextView>(R.id.change_back_id)

        recyclerChoosecolor = dialog!!.findViewById(R.id.color_recyclerView)
        recyclerChoosecolor?.layoutManager = GridLayoutManager(CommonMethods.context, 6)
        recyclerChoosecolor?.adapter = ColorsAdapter(CommonMethods.context, colorList, this)

        // ChooseColorAdapter.addItems(colorList as ArrayList<ChooseColor>)
        recyclerChoosecolor?.adapter?.notifyDataSetChanged()
        dialog?.setCancelable(true)

        dialog?.findViewById<TextView>(R.id.more_colors)?.setOnClickListener {
            Log.e("SDFSDF", "SDFSDFSDF")
            showBottomDialog()
        }

        //for reset color ..
        dialog?.findViewById<TextView>(R.id.reset_all)?.setOnClickListener {
            /** Correction is pending */
            dialog!!.findViewById<CardView>(R.id.show_color_id)
                .setBackgroundResource(R.drawable.back_color_choose)
            dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                .setBackgroundColor(CommonMethods.context.getColor(R.color.white))
            dialog!!.findViewById<TextView>(R.id.change_back_id)
                .setBackgroundColor(CommonMethods.context.getColor(R.color.white))

        }

        //Cancel Button..
        dialog?.findViewById<TextView>(R.id.tvCancelBtn)?.setOnClickListener {
            dialog?.dismiss()
        }

        //Save Button
        dialog?.findViewById<TextView>(R.id.tvSaveSwipeBtn)?.setOnClickListener {
            backgroundColorLiveData.value = selectedbackgrouncolor
            Log.e("ZZZZZZZZZ", selectedbackgrouncolor.toString())
            dialog?.dismiss()
        }

        if (!CommonMethods.context.isFinishing) {
            dialog?.show()
        }

        /// localStorage....

    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setBorderBackground(layout: CardView, value: Float, color: Int) {
        borderSlideValue = value
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.RECTANGLE
        shape.cornerRadii = floatArrayOf(20f, 20f, 20f, 20f, 20f, 20f, 20f, 20f)
        shape.setStroke(value.toInt(), CommonMethods.context.getColor(color))
        layout.background = shape

    }


    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    override fun click(categoryName: String, position: Int, _id: String?, s: String, color: Int?) {
        Log.e("SFFFFFFFF", color.toString() + "mzCVAVSSA" + position.toString())
        when (checkColor.get()) {
            "BACKGROUND" -> {

                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(CommonMethods.context.getColor(color!!))

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
                    .setBackgroundColor(CommonMethods.context.getColor(color!!))

                val cd =
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color

                selectedbackgrouncolor = colorCode
                columnColorLiveData = colorCode

                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and color)
                preferenceFile.storecolorString(COLUMN_COLOR, hexColor)

                Log.e("ASFDf", colorCode.toString())

            }

            "BORDER" -> {

                borderColorLiveData = color!!
                selectedbackgrouncolor = color
                setBorderBackground(cardLayoutColrs!!, borderSlideValue, selectedbackgrouncolor)
//                cardLayoutColrs?.setBackgroundColor(CommonMethods.context.getColor(color!!))
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and color)

                preferenceFile.storecolorString(BORDER_COLOR, hexColor)

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
                    .setBackgroundColor(CommonMethods.context.getColor(R.color.gray))

                title?.text = "Font Color"
                changeColor?.text = "Font Sample"

                dialog!!.findViewById<TextView>(R.id.change_back_id)
                    .setTextColor(CommonMethods.context.getColor(color!!))
                val colorCode =
                    dialog!!.findViewById<TextView>(R.id.change_back_id).currentTextColor

                selectedbackgrouncolor = colorCode
                fontColorLiveData = colorCode
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and colorCode)
                preferenceFile.storecolorString(FONT_COLOR, hexColor)


//                changeColor?.setTextColor(CommonMethods.context.getColor(color!!))
//                selectedbackgrouncolor = color

                Log.e("SDFFFSDFFF", colorCode.toString())
            }
        }
    }

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
                "BACKGROUND" -> {
                    selectedbackgrouncolor = envelope.color
                    showColor?.setBackgroundColor(envelope.color)
                    changeColor?.setBackgroundColor(envelope.color)
//                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)?.setBackgroundColor(envelope.color!!)
                    layoutColrs?.setBackgroundColor(envelope.color)
                    selectedbackgrouncolor = envelope.color
                    /** Store locally */
                    /** Store locally */
                    preferenceFile.storecolor(BACKGROUND_COLOR, envelope.color)

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
                    /** Store locally */
                    preferenceFile.storecolorString(COLUMN_COLOR, hexColor)
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
                                //store background color in shared pref
                                preferenceFile.storecolorString(BACKGROUND_COLOR, data.background_color!!)
                                //store font color in share pref
                                preferenceFile.storecolorString(FONT_COLOR, data.font_color)
                                //store border color in shared pref
                                preferenceFile.storecolorString(BORDER_COLOR, data.border_color)
                                //store column color in shared pref
                                preferenceFile.storecolorString(COLUMN_COLOR, data.border_color)

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
