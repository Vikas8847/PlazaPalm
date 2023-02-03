package com.example.plazapalm.views.advancesettings.editfontpage

import android.annotation.SuppressLint
import android.app.ActionBar
import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.media.MediaPlayer
import android.net.Uri
import android.os.Build
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.SearchView
import androidx.browser.customtabs.CustomTabsClient.getPackageName
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceShowViewProfileBinding
import com.example.plazapalm.databinding.EditFrontPageFragmentBinding
import com.example.plazapalm.databinding.FontsListFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.datastore.SAVE_EDIT_COVER_PAGE
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.*
import com.example.plazapalm.utils.CommonMethods.academyEngravedLetPlain
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.CommonMethods.dialog
import com.example.plazapalm.utils.CommonMethods.showToast
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
    var columnColor = ObservableField("")
    private var longi: Double? = null
    private var lati: Double? = null
    private var p_id: String? = null
    var isVideoPathContain = ObservableField("")
    var editFrontPageBinding: EditFrontPageFragmentBinding? = null
    private var profileBinding: AdvanceShowViewProfileBinding? = null
    var appCompatTxtFont: AppCompatTextView? = null
    var fontsNameList = ArrayList<FontsListModelResponse>()
    var SelectedDialog = ObservableField("")
    val fontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.fonts_list_item) }
    var fontSize = ObservableFloat(14f)
    var backgroundColor = ObservableField("")
    var selectedbackgrouncolor = -65536
    var fontColorLiveData = 0
    var borderColorLiveData = 0
    var fontTypeface: Typeface? = null
    var isChecked = ObservableBoolean(false)
    var isBottomText = ObservableBoolean()
    var isTopText = ObservableBoolean()
    var typfaceObserverLiveData = MutableLiveData<Boolean>()
    val distance = ObservableField("")
    val backgroundColorLiveData = MutableLiveData<Any>()
    var fontColorLD = MutableLiveData<Any>()
    private var sliderOpacitty: Slider? = null
    var slider_size: Slider? = null
    private var size_tv: TextView? = null
    var opacity_tv: TextView? = null
    var fontsName = ObservableField("Optima-Regular")
    private var layoutColrs: ConstraintLayout? = null
    var scheduleBinding: FontsListFragmentBinding? = null
    var borderColor = ObservableField("")
    var fontColor = ObservableField("")
    var fontOpacity = ObservableFloat()
    var recyclerChoosecolor: RecyclerView? = null
    var borderSlideValue = 0F
    var columnColorLiveData = 0
    var title: TextView? = null
    private var changeColor: TextView? = null
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
        getProfileId()
        setFontsInAdapterList()
        setAdapter()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun onClicks(view: View) {
        when (view.id) {
            R.id.btnEditFrontLookAttach -> {
                postFrontPageApi()
            }
            R.id.ivAdvanceEditFrontPage -> {
                view.findNavController().navigateUp()
            }
            R.id.checkEditFrontPageTopText -> {
                isTopText.set(!(isTopText.get()))
            }
            R.id.checkBottomTextFrontPage -> {
                isBottomText.set(!(isBottomText.get()))
            }

            R.id.btnEditFrontPageView -> {
                getProfileApi()
            }
            R.id.viewBoxLookingBGColor -> {
                checkColor.set(Constants.FONTCOLOR)
                showColorDialog(Constants.FONT_COLOR)
            }
            R.id.tvAdvanceEditFrontPageFontValue -> {
                showBottomSheetDialogOne()
            }
        }
    }


    private fun getProfileApi() {
        lati = preferenceFile.retvieLatlong("lati").toDouble()
        longi = preferenceFile.retvieLatlong("longi").toDouble()
        getProfileId()
        getPostProfileApi(p_id!!, lati!!, longi!!)
    }

    //vikas
    @SuppressLint("UseCompatLoadingForDrawables")
    private fun showViewProfileDialog(response: GetPostProfileResponse) {
        //get post profile api ..
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            profileBinding =
                AdvanceShowViewProfileBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
            dialog?.setContentView(profileBinding?.root!!)
            /**Set advance  profile edit cover page data **/
            profileBinding?.apply {
                /**Check if fontlist text contains names set typeface according to their name **/
                tvProfileUserName.text = response.data.first_name
                tvProfileUserAddress.text = response.data.address
                tvProfileUserDescription.text = response.data.description_1

                /**Set font color for view only **/
                tvProfileUserName.setTextColor(Color.parseColor(fontColor.get()))
                tvProfileUserAddress.setTextColor(Color.parseColor(fontColor.get()))
                tvProfileUserDescription.setTextColor(Color.parseColor(fontColor.get()))

                /**Set font size for view **/
                tvProfileUserName.textSize = fontSize.get()
                tvProfileUserAddress.textSize = fontSize.get()
                tvProfileUserDescription.textSize = fontSize.get()
                /**Set type face of view according to topText and Bottom Text is Selected or not **/
                if (this@EditFrontPageVM.isTopText.get()) {
                    tvProfileUserName.typeface = fontTypeface
                    //call here toptext selected font-typfaces...
                    topTextSelecedTypeFaces()
                }
                if (this@EditFrontPageVM.isBottomText.get()) {
                    tvProfileUserAddress.typeface = fontTypeface
                    tvProfileUserDescription.typeface = fontTypeface
                    bottomTextSelectedTypeFaces()
                }
                if (response.data.postProfile_picture?.contains(".mp4") == true) {
                    if (response.data.postProfile_picture[0] == response.data.postProfile_picture.contains(
                            ".mp4"
                        )
                    ) {
                        /**play Video functionality is pending due to updated code ... **/
                        profileBinding!!.ivDashBoardCat.visibility = View.GONE
                        profileBinding!!.videVAdvanceShowProfile.visibility = View.VISIBLE
                        val uri = Uri.parse(response.data.postProfile_picture[0].toString())
                        profileBinding!!.videVAdvanceShowProfile.setVideoURI(uri)
                        profileBinding!!.videVAdvanceShowProfile.start()
                        profileBinding!!.videVAdvanceShowProfile.requestFocus()
                    } else {
                        profileBinding!!.ivDashBoardCat.visibility = View.VISIBLE
                        profileBinding!!.videVAdvanceShowProfile.visibility = View.GONE
                        Glide.with(MainActivity.context.get()!!)
                            .load(IMAGE_LOAD_URL + response.data.postProfile_picture.get(0))
                            .error(R.drawable.placeholder)
                            .into(profileBinding?.ivDashBoardCat!!)
                    }
                } else {
                    profileBinding!!.ivDashBoardCat.visibility = View.VISIBLE
                    profileBinding!!.videVAdvanceShowProfile.visibility = View.GONE
                    Glide.with(MainActivity.context.get()!!)
                        .load(IMAGE_LOAD_URL + response.data.postProfile_picture?.get(0))
                        .error(R.drawable.placeholder)
                        .into(profileBinding?.ivDashBoardCat!!)
                }
                // setVideoPlayerMethod(videVAdvanceShowProfile,response.data.postProfile_picture,)
            }
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog!!.window?.attributes?.height = ViewGroup.LayoutParams.WRAP_CONTENT
            dialog?.setCancelable(true)
            dialog?.show()
            //val uri= Uri.parse("https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")
        }
    }

    private fun topTextSelecedTypeFaces() {
        profileBinding?.apply {
            when {
                fontsName.get() == CommonMethods.acadeMyLetFontName -> {
                    val academyEngravedLetPlain =
                        Typeface.createFromAsset(context.assets, academyEngravedLetPlain)
                    tvProfileUserName.typeface = academyEngravedLetPlain
                }
                fontsName.get() == CommonMethods.abrilFatFaceFontName -> {
                    val abrilFatFaceRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.abrilFatFaceRegular)
                    tvProfileUserName.typeface = abrilFatFaceRegular
                }
                fontsName.get() == CommonMethods.alexBrushFontName -> {
                    val alexBrushRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.alexBrushRegular)
                    tvProfileUserName.typeface = alexBrushRegular
                }

                fontsName.get() == CommonMethods.allerBDItFontName -> {
                    val allerBD = Typeface.createFromAsset(context.assets, CommonMethods.allerBD)
                    tvProfileUserName.typeface = allerBD
                }
                fontsName.get() == CommonMethods.allerBDItFontName -> {
                    val allerBDLT =
                        Typeface.createFromAsset(context.assets, CommonMethods.allerBDLT)
                    tvProfileUserName.typeface = allerBDLT
                }
                fontsName.get() == CommonMethods.AllerDisplayFontName -> {
                    val allerDisplay =
                        Typeface.createFromAsset(context.assets, CommonMethods.allerDisplay)
                    tvProfileUserName.typeface = allerDisplay
                }
                fontsName.get() == CommonMethods.allerItFontName -> {
                    val allerIt = Typeface.createFromAsset(context.assets, CommonMethods.allerIt)
                    tvProfileUserName.typeface = allerIt
                }

                fontsName.get() == CommonMethods.AllerRGFontName -> {
                    val allerRG = Typeface.createFromAsset(context.assets, CommonMethods.allerRG)
                    tvProfileUserName.typeface = allerRG
                }

                fontsName.get() == CommonMethods.amaticBoldFontName -> {
                    val amaticBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.amaticBold)
                    tvProfileUserName.typeface = amaticBold
                }

                fontsName.get() == CommonMethods.amaticSCRegularFontName -> {
                    val amaticSCRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.amaticSCRegular)
                    tvProfileUserName.typeface = amaticSCRegular
                }

                fontsName.get() == CommonMethods.AntonioBoldFontName -> {
                    val antonioBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioBold)
                    tvProfileUserName.typeface = antonioBold
                }

                fontsName.get() == CommonMethods.AntonioLightFontName -> {
                    val antonioLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioLight)
                    tvProfileUserName.typeface = antonioLight
                }

                fontsName.get() == CommonMethods.AntonioRegularFontName -> {
                    val antonioRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioRegular)
                    tvProfileUserName.typeface = antonioRegular
                }

                fontsName.get() == CommonMethods.bebasRegularFontName -> {
                    val bebasRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.bebasRegular)
                    tvProfileUserName.typeface = bebasRegular
                }


                fontsName.get() == CommonMethods.caviarDreamsFontName -> {
                    val caviarDreams =
                        Typeface.createFromAsset(context.assets, CommonMethods.caviarDreams)
                    tvProfileUserName.typeface = caviarDreams
                }


                fontsName.get() == CommonMethods.caviarDreamsItalicFontName -> {
                    val caviarDreamsItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.caviarDreamsItalic)
                    tvProfileUserName.typeface = caviarDreamsItalic
                }

                fontsName.get() == CommonMethods.chunkFivePrintFontName -> {
                    val chunkFivePrint =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFivePrint)
                    tvProfileUserName.typeface = chunkFivePrint
                }

                fontsName.get() == CommonMethods.chunkFiveRegularFontName -> {
                    val chunkFiveRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFiveRegular)
                    tvProfileUserName.typeface = chunkFiveRegular
                }

                fontsName.get() == CommonMethods.chunkFiveRegularFontName -> {
                    val chunkFiveRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFiveRegular)
                    tvProfileUserName.typeface = chunkFiveRegular
                }

                fontsName.get() == CommonMethods.cooperHewittBoldFontName -> {
                    val cooperHewittBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBold)
                    tvProfileUserName.typeface = cooperHewittBold
                }

                fontsName.get() == CommonMethods.cooperHewittBoldFontName -> {
                    val cooperHewittBook =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBook)
                    tvProfileUserName.typeface = cooperHewittBook
                }

                fontsName.get() == CommonMethods.cooperHewittBoldItalicFontName -> {
                    val cooperHewittBoldItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.cooperHewittBoldItalic
                    )
                    tvProfileUserName.typeface = cooperHewittBoldItalic
                }

                fontsName.get() == CommonMethods.cooperHewittHeavyFontName -> {
                    val cooperHewittHeavy =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittHeavy)
                    tvProfileUserName.typeface = cooperHewittHeavy
                }


                fontsName.get() == CommonMethods.dancingRegularFontName -> {
                    val dancingScriptRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.dancingScriptRegular)
                    tvProfileUserName.typeface = dancingScriptRegular
                }


                fontsName.get() == CommonMethods.ftusFontName -> {
                    val fTusj = Typeface.createFromAsset(context.assets, CommonMethods.fTusj)
                    tvProfileUserName.typeface = fTusj
                }


                fontsName.get() == CommonMethods.firaSansBoldFontName -> {
                    val firaSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBold)
                    tvProfileUserName.typeface = firaSansBold
                }


                fontsName.get() == CommonMethods.firaSansBoldItalicFontName -> {
                    val firaSansBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBoldItalic)
                    tvProfileUserName.typeface = firaSansBoldItalic
                }

                fontsName.get() == CommonMethods.firaSansBookFontName -> {
                    val firaSansBook =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBook)
                    tvProfileUserName.typeface = firaSansBook
                }

                fontsName.get() == CommonMethods.firaSansEightFontName -> {
                    val firaSansEight =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansEight)
                    tvProfileUserName.typeface = firaSansEight
                }

                fontsName.get() == CommonMethods.greatVibesRegularFontName -> {
                    val greatVibesRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.greatVibesRegular)
                    tvProfileUserName.typeface = greatVibesRegular
                }


                fontsName.get() == CommonMethods.helloValentinaFontName -> {
                    val helloValentina =
                        Typeface.createFromAsset(context.assets, CommonMethods.helloValentina)
                    tvProfileUserName.typeface = helloValentina
                }


                fontsName.get() == CommonMethods.interBlackFontName -> {
                    val interBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBlack)
                    tvProfileUserName.typeface = interBlack
                }


                fontsName.get() == CommonMethods.interBoldFontName -> {
                    val interBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBold)
                    tvProfileUserName.typeface = interBold
                }


                fontsName.get() == CommonMethods.interBoldItalicFontName -> {
                    val interBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBoldItalic)
                    tvProfileUserName.typeface = interBoldItalic
                }


                fontsName.get() == CommonMethods.interExtraBoldFontName -> {
                    val interExtraBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.interExtraBold)
                    tvProfileUserName.typeface = interExtraBold
                }


                fontsName.get() == CommonMethods.josefinBoldFontName -> {
                    val josefinBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinBold)
                    tvProfileUserName.typeface = josefinBold
                }


                fontsName.get() == CommonMethods.josefinBoldItalicFontName -> {
                    val josefinBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinBoldItalic)
                    tvProfileUserName.typeface = josefinBoldItalic
                }


                fontsName.get() == CommonMethods.josefinLightFontName -> {
                    val josefinLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinLight)
                    tvProfileUserName.typeface = josefinLight
                }


                fontsName.get() == CommonMethods.josefinRegularFontName -> {
                    val josefinRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinRegular)
                    tvProfileUserName.typeface = josefinRegular
                }

                fontsName.get() == CommonMethods.latoBlackFontName -> {
                    val latoBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBlack)
                    tvProfileUserName.typeface = latoBlack
                }

                fontsName.get() == CommonMethods.latoBlackItalicFontName -> {
                    val latoBlackItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBlackItalic)
                    tvProfileUserName.typeface = latoBlackItalic
                }


                fontsName.get() == CommonMethods.latoBoldFontName -> {
                    val latoBold = Typeface.createFromAsset(context.assets, CommonMethods.latoBold)
                    tvProfileUserName.typeface = latoBold
                }

                fontsName.get() == CommonMethods.latoBoldItalicFontName -> {
                    val latoBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBoldItalic)
                    tvProfileUserName.typeface = latoBoldItalic
                }


                fontsName.get() == CommonMethods.montSerratAlternatesBlackFontName -> {
                    val montSerratAlternatesBlack = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBlack
                    )
                    tvProfileUserName.typeface = montSerratAlternatesBlack
                }


                fontsName.get() == CommonMethods.montSerratAlternatesBlackItalicFontName -> {
                    val montSerratAlternatesBlackItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBlackItalic
                    )
                    tvProfileUserName.typeface = montSerratAlternatesBlackItalic
                }

                fontsName.get() == CommonMethods.montSerratAlternatesBoldFontName -> {
                    val montSerratAlternatesBold = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBold
                    )
                    tvProfileUserName.typeface = montSerratAlternatesBold
                }

                fontsName.get() == CommonMethods.openSansBoldFontName -> {
                    val openSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansBold)
                    tvProfileUserName.typeface = openSansBold
                }


                fontsName.get() == CommonMethods.openSansBoldItalicFontName -> {
                    val openSansBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansBoldItalic)
                    tvProfileUserName.typeface = openSansBoldItalic
                }


                fontsName.get() == CommonMethods.openSansBoldItalicFontName -> {
                    val openSansItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansItalic)
                    tvProfileUserName.typeface = openSansItalic
                }


                fontsName.get() == CommonMethods.openSansLightFontName -> {
                    val openSansLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansLight)
                    tvProfileUserName.typeface = openSansLight
                }


                fontsName.get() == CommonMethods.openSansRegularFontName -> {
                    val openSansRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansRegular)
                    tvProfileUserName.typeface = openSansRegular
                }


                fontsName.get() == CommonMethods.openSansSemiBoldFontName -> {
                    val openSansSemiBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansSemiBold)
                    tvProfileUserName.typeface = openSansSemiBold
                }


                fontsName.get() == CommonMethods.openSansSemiBoldItalicFontName -> {
                    val openSansSemiBoldItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.openSansSemiBoldItalic
                    )
                    tvProfileUserName.typeface = openSansSemiBoldItalic
                }


                fontsName.get() == CommonMethods.ostrichRegularFontName -> {
                    val ostrichRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichRegular)
                    tvProfileUserName.typeface = ostrichRegular
                }


                fontsName.get() == CommonMethods.ostrichSansBlackFontName -> {
                    val ostrichSansBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBlack)
                    tvProfileUserName.typeface = ostrichSansBlack
                }

                fontsName.get() == CommonMethods.ostrichSansBoldFontName -> {
                    val ostrichSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBold)
                    tvProfileUserName.typeface = ostrichSansBold
                }


                fontsName.get() == CommonMethods.ostrichSansHeavyFontName -> {
                    val ostrichSansHeavy =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansHeavy)
                    tvProfileUserName.typeface = ostrichSansHeavy
                }


                fontsName.get() == CommonMethods.ostrichSansLightFontName -> {
                    val ostrichSansLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansLight)
                    tvProfileUserName.typeface = ostrichSansLight
                }


                fontsName.get() == CommonMethods.ostrichSansMediumFontName -> {
                    val ostrichSansMedium =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansMedium)
                    tvProfileUserName.typeface = ostrichSansMedium
                }


                fontsName.get() == CommonMethods.oswaldBoldFontName -> {
                    val osWaldBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.osWaldBold)
                    tvProfileUserName.typeface = osWaldBold
                }


                fontsName.get() == CommonMethods.oswaldBoldItalicFontName -> {
                    val osWaldBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.osWaldBoldItalic)
                    tvProfileUserName.typeface = osWaldBold
                }


                fontsName.get() == CommonMethods.oswaldSemiBoldItalicFontName -> {
                    val osWaldSemiBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.osWaldSemiBoldItalic)
                    tvProfileUserName.typeface = osWaldSemiBoldItalic
                }


                fontsName.get() == CommonMethods.playFairDisplayBlackFontName -> {
                    val playfairDisplayBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.playfairDisplayBlack)
                    tvProfileUserName.typeface = playfairDisplayBlack
                }


                fontsName.get() == CommonMethods.playFairDisplayBlackItalicFontName -> {
                    val playfairDisplayBlackItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.playfairDisplayBlackItalic
                    )
                    tvProfileUserName.typeface = playfairDisplayBlackItalic
                }


                fontsName.get() == CommonMethods.playFairDisplayBoldFontName -> {
                    val playfairDisplayBlackItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.playfairDisplayBlackItalic
                    )
                    tvProfileUserName.typeface = playfairDisplayBlackItalic
                }


                fontsName.get() == CommonMethods.poppinBlackItalicFontName -> {
                    val poppinBlackItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinBlackItalic)
                    tvProfileUserName.typeface = poppinBlackItalic
                }

                fontsName.get() == CommonMethods.poppinBlackFontName -> {
                    val poppinBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinBlack)
                    tvProfileUserName.typeface = poppinBlack
                }


                fontsName.get() == CommonMethods.poppinBoldFontName -> {
                    val poppinBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinBold)
                    tvProfileUserName.typeface = poppinBold
                }
                fontsName.get() == CommonMethods.poppinBoldItalicFontName -> {
                    val poppinBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinBoldItalic)
                    tvProfileUserName.typeface = poppinBoldItalic
                }


                fontsName.get() == CommonMethods.poppinBoldItalicFontName -> {
                    val poppinBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinBoldItalic)
                    tvProfileUserName.typeface = poppinBoldItalic
                }


                fontsName.get() == CommonMethods.poppinExtraBoldFontName -> {
                    val poppinExtraBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.poppinExtraBold)
                    tvProfileUserName.typeface = poppinExtraBold
                }


                fontsName.get() == CommonMethods.ptc55FontName -> {
                    val ptc55 = Typeface.createFromAsset(context.assets, CommonMethods.ptc55)
                    tvProfileUserName.typeface = ptc55
                }


                fontsName.get() == CommonMethods.ptc75FontName -> {
                    val ptc75F = Typeface.createFromAsset(context.assets, CommonMethods.ptc75F)
                    tvProfileUserName.typeface = ptc75F
                }


                fontsName.get() == CommonMethods.quicksAndBoldFontName -> {
                    val quicksAndBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.quicksAndBold)
                    tvProfileUserName.typeface = quicksAndBold
                }


                fontsName.get() == CommonMethods.quicksAndBoldItalicFontName -> {
                    val quicksAndBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.quicksAndBoldItalic)
                    tvProfileUserName.typeface = quicksAndBoldItalic
                }

                fontsName.get() == CommonMethods.quicksDashFontName -> {
                    val quicksDash =
                        Typeface.createFromAsset(context.assets, CommonMethods.quicksDash)
                    tvProfileUserName.typeface = quicksDash
                }

                fontsName.get() == CommonMethods.quicksAndBoldItalicFontName -> {
                    val quicksAndItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.quicksAndItalic)
                    tvProfileUserName.typeface = quicksAndItalic
                }

                fontsName.get() == CommonMethods.raleWayBlackFontName -> {
                    val raleWayBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayBlack)
                    tvProfileUserName.typeface = raleWayBlack
                }


                fontsName.get() == CommonMethods.raleWayBlackItalicFontName -> {
                    val raleWayBlackItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayBlackItalic)
                    tvProfileUserName.typeface = raleWayBlackItalic
                }

                fontsName.get() == CommonMethods.raleWayBoldFontName -> {
                    val raleWayBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayBold)
                    tvProfileUserName.typeface = raleWayBold
                }

                fontsName.get() == CommonMethods.raleWayBoldItalicFontName -> {
                    val raleWayBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayBoldItalic)
                    tvProfileUserName.typeface = raleWayBoldItalic
                }


                fontsName.get() == CommonMethods.raleWayItalicFontName -> {
                    val raleWayItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayItalic)
                    tvProfileUserName.typeface = raleWayItalic
                }


                fontsName.get() == CommonMethods.raleWayMediumFontName -> {
                    val raleWayMedium =
                        Typeface.createFromAsset(context.assets, CommonMethods.raleWayMedium)
                    tvProfileUserName.typeface = raleWayMedium
                }


                fontsName.get() == CommonMethods.seasRnFontName -> {
                    val seasRn = Typeface.createFromAsset(context.assets, CommonMethods.seasRn)
                    tvProfileUserName.typeface = seasRn
                }


                fontsName.get() == CommonMethods.sofiaRegularFontName -> {
                    val sofiaRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.sofiaRegular)
                    tvProfileUserName.typeface = sofiaRegular
                }


                fontsName.get() == CommonMethods.sourceSansProBlackItFontName -> {
                    val sourceSansProBlackIt =
                        Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBlackIt)
                    tvProfileUserName.typeface = sourceSansProBlackIt
                }


                fontsName.get() == CommonMethods.sourceSansProBoldFontName -> {
                    val sourceSansProBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBold)
                    tvProfileUserName.typeface = sourceSansProBold
                }


                fontsName.get() == CommonMethods.sourceSansProExtraLightFontName -> {
                    val sourceSansProExtraLight = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.sourceSansProExtraLight
                    )
                    tvProfileUserName.typeface = sourceSansProExtraLight
                }


                fontsName.get() == CommonMethods.sourceSansProBlackFontName -> {
                    val sourceSansProBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBlack)
                    tvProfileUserName.typeface = sourceSansProBlack
                }


                fontsName.get() == CommonMethods.sourceSansProExtraLightFontName -> {
                    val sourceSansProExtraLight = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.sourceSansProExtraLight
                    )
                    tvProfileUserName.typeface = sourceSansProExtraLight
                }

                fontsName.get() == CommonMethods.sourceSansProBlackFontName -> {
                    val sourceSansProBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.sourceSansProBlack)
                    tvProfileUserName.typeface = sourceSansProBlack
                }


                fontsName.get() == CommonMethods.titiliumSemiBoldFontName -> {
                    val titiliumSemiBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.titiliumSemiBold)
                    tvProfileUserName.typeface = titiliumSemiBold
                }


                fontsName.get() == CommonMethods.titiliumLightFontName -> {
                    val titiliumLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.titiliumLight)
                    tvProfileUserName.typeface = titiliumLight
                }


                fontsName.get() == CommonMethods.titiliumRegularFontName -> {
                    val titiliumRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.titiliumRegular)
                    tvProfileUserName.typeface = titiliumRegular
                }


                fontsName.get() == CommonMethods.titiliumRegularItalicFontName -> {
                    val titiliumRegularItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.titiliumRegularItalic
                    )
                    tvProfileUserName.typeface = titiliumRegularItalic
                }

                fontsName.get() == CommonMethods.windSongFontName -> {
                    val windSong = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.windSong
                    )
                    tvProfileUserName.typeface = windSong
                }


                fontsName.get() == CommonMethods.walkWayBlackFontName -> {
                    val walkwayBlack = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.walkwayBlack
                    )
                    tvProfileUserName.typeface = walkwayBlack
                }


                fontsName.get() == CommonMethods.walkWayObliqueFontName -> {
                    val walkwayOblique = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.walkwayOblique
                    )
                    tvProfileUserName.typeface = walkwayOblique
                }

                fontsName.get() == CommonMethods.walkWayObliqueBlackFontName -> {
                    val walkwayObliqueBlack = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.walkwayObliqueBlack
                    )
                    tvProfileUserName.typeface = walkwayObliqueBlack
                }

                fontsName.get() == CommonMethods.walkwayObliqueSemiBoldFontName -> {
                    val walkwayObliqueSemiBold = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.walkwayObliqueSemiBold
                    )
                    tvProfileUserName.typeface = walkwayObliqueSemiBold
                }


            }
        }
    }

    private fun bottomTextSelectedTypeFaces() {
        profileBinding?.apply {
            when {
                fontsName.get() == CommonMethods.acadeMyLetFontName -> {
                    val academyEngravedLetPlain =
                        Typeface.createFromAsset(context.assets, academyEngravedLetPlain)
                    tvProfileUserDescription.typeface = academyEngravedLetPlain
                    tvProfileUserAddress.typeface = academyEngravedLetPlain
                }
                fontsName.get() == CommonMethods.abrilFatFaceFontName -> {
                    val abrilFatFaceRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.abrilFatFaceRegular)
                    tvProfileUserDescription.typeface = abrilFatFaceRegular
                    tvProfileUserAddress.typeface = abrilFatFaceRegular

                }
                fontsName.get() == CommonMethods.alexBrushFontName -> {
                    val alexBrushRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.alexBrushRegular)
                    tvProfileUserDescription.typeface = alexBrushRegular
                    tvProfileUserAddress.typeface = alexBrushRegular

                }

                fontsName.get() == CommonMethods.allerBDItFontName -> {
                    val allerBD = Typeface.createFromAsset(context.assets, CommonMethods.allerBD)
                    tvProfileUserDescription.typeface = allerBD
                    tvProfileUserAddress.typeface = allerBD
                }

                fontsName.get() == CommonMethods.allerBDItFontName -> {
                    val allerBDLT =
                        Typeface.createFromAsset(context.assets, CommonMethods.allerBDLT)
                    tvProfileUserDescription.typeface = allerBDLT
                    tvProfileUserAddress.typeface = allerBDLT
                }

                fontsName.get() == CommonMethods.AllerDisplayFontName -> {
                    val allerDisplay =
                        Typeface.createFromAsset(context.assets, CommonMethods.allerDisplay)
                    tvProfileUserDescription.typeface = allerDisplay
                    tvProfileUserAddress.typeface = allerDisplay
                }

                fontsName.get() == CommonMethods.allerItFontName -> {
                    val allerIt = Typeface.createFromAsset(context.assets, CommonMethods.allerIt)
                    tvProfileUserDescription.typeface = allerIt
                    tvProfileUserAddress.typeface = allerIt
                }

                fontsName.get() == CommonMethods.AllerRGFontName -> {
                    val allerRG = Typeface.createFromAsset(context.assets, CommonMethods.allerRG)
                    tvProfileUserDescription.typeface = allerRG
                    tvProfileUserAddress.typeface = allerRG
                }

                fontsName.get() == CommonMethods.amaticBoldFontName -> {
                    val amaticBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.amaticBold)
                    tvProfileUserDescription.typeface = amaticBold
                    tvProfileUserAddress.typeface = amaticBold
                }

                fontsName.get() == CommonMethods.amaticSCRegularFontName -> {
                    val amaticSCRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.amaticSCRegular)
                    tvProfileUserDescription.typeface = amaticSCRegular
                    tvProfileUserAddress.typeface = amaticSCRegular
                }

                fontsName.get() == CommonMethods.AntonioBoldFontName -> {
                    val antonioBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioBold)
                    tvProfileUserDescription.typeface = antonioBold
                    tvProfileUserAddress.typeface = antonioBold
                }

                fontsName.get() == CommonMethods.AntonioLightFontName -> {
                    val antonioLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioLight)
                    tvProfileUserDescription.typeface = antonioLight
                    tvProfileUserAddress.typeface = antonioLight
                }

                fontsName.get() == CommonMethods.AntonioRegularFontName -> {
                    val antonioRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.antonioRegular)
                    tvProfileUserDescription.typeface = antonioRegular
                    tvProfileUserAddress.typeface = antonioRegular
                }

                fontsName.get() == CommonMethods.bebasRegularFontName -> {
                    val bebasRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.bebasRegular)
                    tvProfileUserDescription.typeface = bebasRegular
                    tvProfileUserAddress.typeface = bebasRegular
                }


                fontsName.get() == CommonMethods.caviarDreamsFontName -> {
                    val caviarDreams =
                        Typeface.createFromAsset(context.assets, CommonMethods.caviarDreams)
                    tvProfileUserDescription.typeface = caviarDreams
                    tvProfileUserAddress.typeface = caviarDreams
                }


                fontsName.get() == CommonMethods.caviarDreamsItalicFontName -> {
                    val caviarDreamsItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.caviarDreamsItalic)
                    tvProfileUserDescription.typeface = caviarDreamsItalic
                    tvProfileUserAddress.typeface = caviarDreamsItalic
                }

                fontsName.get() == CommonMethods.chunkFivePrintFontName -> {
                    val chunkFivePrint =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFivePrint)
                    tvProfileUserDescription.typeface = chunkFivePrint
                    tvProfileUserAddress.typeface = chunkFivePrint
                }

                fontsName.get() == CommonMethods.chunkFiveRegularFontName -> {
                    val chunkFiveRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFiveRegular)
                    tvProfileUserDescription.typeface = chunkFiveRegular
                    tvProfileUserAddress.typeface = chunkFiveRegular
                }

                fontsName.get() == CommonMethods.chunkFiveRegularFontName -> {
                    val chunkFiveRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.chunkFiveRegular)
                    tvProfileUserDescription.typeface = chunkFiveRegular
                    tvProfileUserAddress.typeface = chunkFiveRegular
                }

                fontsName.get() == CommonMethods.cooperHewittBoldFontName -> {
                    val cooperHewittBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBold)
                    tvProfileUserDescription.typeface = cooperHewittBold
                    tvProfileUserAddress.typeface = cooperHewittBold
                }

                fontsName.get() == CommonMethods.cooperHewittBoldFontName -> {
                    val cooperHewittBook =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittBook)
                    tvProfileUserDescription.typeface = cooperHewittBook
                    tvProfileUserAddress.typeface = cooperHewittBook
                }

                fontsName.get() == CommonMethods.cooperHewittBoldItalicFontName -> {
                    val cooperHewittBoldItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.cooperHewittBoldItalic
                    )
                    tvProfileUserDescription.typeface = cooperHewittBoldItalic
                    tvProfileUserAddress.typeface = cooperHewittBoldItalic
                }

                fontsName.get() == CommonMethods.cooperHewittHeavyFontName -> {
                    val cooperHewittHeavy =
                        Typeface.createFromAsset(context.assets, CommonMethods.cooperHewittHeavy)
                    tvProfileUserDescription.typeface = cooperHewittHeavy
                    tvProfileUserAddress.typeface = cooperHewittHeavy
                }


                fontsName.get() == CommonMethods.dancingRegularFontName -> {
                    val dancingScriptRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.dancingScriptRegular)
                    tvProfileUserDescription.typeface = dancingScriptRegular
                    tvProfileUserAddress.typeface = dancingScriptRegular
                }


                fontsName.get() == CommonMethods.ftusFontName -> {
                    val fTusj = Typeface.createFromAsset(context.assets, CommonMethods.fTusj)
                    tvProfileUserDescription.typeface = fTusj
                    tvProfileUserDescription.typeface = fTusj
                }


                fontsName.get() == CommonMethods.firaSansBoldFontName -> {
                    val firaSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBold)
                    tvProfileUserDescription.typeface = firaSansBold
                    tvProfileUserAddress.typeface = firaSansBold
                }


                fontsName.get() == CommonMethods.firaSansBoldItalicFontName -> {
                    val firaSansBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBoldItalic)
                    tvProfileUserDescription.typeface = firaSansBoldItalic
                    tvProfileUserAddress.typeface = firaSansBoldItalic
                }

                fontsName.get() == CommonMethods.firaSansBookFontName -> {
                    val firaSansBook =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansBook)
                    tvProfileUserDescription.typeface = firaSansBook
                    tvProfileUserAddress.typeface = firaSansBook
                }

                fontsName.get() == CommonMethods.firaSansEightFontName -> {
                    val firaSansEight =
                        Typeface.createFromAsset(context.assets, CommonMethods.firaSansEight)
                    tvProfileUserDescription.typeface = firaSansEight
                    tvProfileUserAddress.typeface = firaSansEight
                }

                fontsName.get() == CommonMethods.greatVibesRegularFontName -> {
                    val greatVibesRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.greatVibesRegular)
                    tvProfileUserDescription.typeface = greatVibesRegular
                    tvProfileUserAddress.typeface = greatVibesRegular
                }


                fontsName.get() == CommonMethods.helloValentinaFontName -> {
                    val helloValentina =
                        Typeface.createFromAsset(context.assets, CommonMethods.helloValentina)
                    tvProfileUserDescription.typeface = helloValentina
                    tvProfileUserAddress.typeface = helloValentina
                }


                fontsName.get() == CommonMethods.interBlackFontName -> {
                    val interBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBlack)
                    tvProfileUserDescription.typeface = interBlack
                    tvProfileUserAddress.typeface = interBlack
                }


                fontsName.get() == CommonMethods.interBoldFontName -> {
                    val interBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBold)
                    tvProfileUserDescription.typeface = interBold
                    tvProfileUserAddress.typeface = interBold
                }


                fontsName.get() == CommonMethods.interBoldItalicFontName -> {
                    val interBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.interBoldItalic)
                    tvProfileUserDescription.typeface = interBoldItalic
                    tvProfileUserAddress.typeface = interBoldItalic
                }


                fontsName.get() == CommonMethods.interExtraBoldFontName -> {
                    val interExtraBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.interExtraBold)
                    tvProfileUserDescription.typeface = interExtraBold
                    tvProfileUserAddress.typeface = interExtraBold
                }


                fontsName.get() == CommonMethods.josefinBoldFontName -> {
                    val josefinBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinBold)
                    tvProfileUserDescription.typeface = josefinBold
                    tvProfileUserAddress.typeface = josefinBold
                }


                fontsName.get() == CommonMethods.josefinBoldItalicFontName -> {
                    val josefinBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinBoldItalic)
                    tvProfileUserDescription.typeface = josefinBoldItalic
                    tvProfileUserAddress.typeface = josefinBoldItalic
                }


                fontsName.get() == CommonMethods.josefinLightFontName -> {
                    val josefinLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinLight)
                    tvProfileUserDescription.typeface = josefinLight
                    tvProfileUserAddress.typeface = josefinLight
                }


                fontsName.get() == CommonMethods.josefinRegularFontName -> {
                    val josefinRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.josefinRegular)
                    tvProfileUserDescription.typeface = josefinRegular
                    tvProfileUserAddress.typeface = josefinRegular
                }

                fontsName.get() == CommonMethods.latoBlackFontName -> {
                    val latoBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBlack)
                    tvProfileUserDescription.typeface = latoBlack
                    tvProfileUserAddress.typeface = latoBlack
                }

                fontsName.get() == CommonMethods.latoBlackItalicFontName -> {
                    val latoBlackItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBlackItalic)
                    tvProfileUserDescription.typeface = latoBlackItalic
                    tvProfileUserAddress.typeface = latoBlackItalic
                }


                fontsName.get() == CommonMethods.latoBoldFontName -> {
                    val latoBold = Typeface.createFromAsset(context.assets, CommonMethods.latoBold)
                    tvProfileUserDescription.typeface = latoBold
                    tvProfileUserAddress.typeface = latoBold
                }

                fontsName.get() == CommonMethods.latoBoldItalicFontName -> {
                    val latoBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.latoBoldItalic)
                    tvProfileUserDescription.typeface = latoBoldItalic
                    tvProfileUserAddress.typeface = latoBoldItalic
                }


                fontsName.get() == CommonMethods.montSerratAlternatesBlackFontName -> {
                    val montSerratAlternatesBlack = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBlack
                    )
                    tvProfileUserDescription.typeface = montSerratAlternatesBlack
                    tvProfileUserAddress.typeface = montSerratAlternatesBlack
                }


                fontsName.get() == CommonMethods.montSerratAlternatesBlackItalicFontName -> {
                    val montSerratAlternatesBlackItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBlackItalic
                    )
                    tvProfileUserDescription.typeface = montSerratAlternatesBlackItalic
                    tvProfileUserAddress.typeface = montSerratAlternatesBlackItalic
                }

                fontsName.get() == CommonMethods.montSerratAlternatesBoldFontName -> {
                    val montSerratAlternatesBold = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.montSerratAlternatesBold
                    )
                    tvProfileUserDescription.typeface = montSerratAlternatesBold
                    tvProfileUserAddress.typeface = montSerratAlternatesBold
                }

                fontsName.get() == CommonMethods.openSansBoldFontName -> {
                    val openSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansBold)
                    tvProfileUserDescription.typeface = openSansBold
                    tvProfileUserAddress.typeface = openSansBold
                }


                fontsName.get() == CommonMethods.openSansBoldItalicFontName -> {
                    val openSansBoldItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansBoldItalic)
                    tvProfileUserDescription.typeface = openSansBoldItalic
                    tvProfileUserAddress.typeface = openSansBoldItalic
                }


                fontsName.get() == CommonMethods.openSansBoldItalicFontName -> {
                    val openSansItalic =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansItalic)
                    tvProfileUserDescription.typeface = openSansItalic
                    tvProfileUserAddress.typeface = openSansItalic
                }


                fontsName.get() == CommonMethods.openSansLightFontName -> {
                    val openSansLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansLight)
                    tvProfileUserDescription.typeface = openSansLight
                    tvProfileUserAddress.typeface = openSansLight
                }


                fontsName.get() == CommonMethods.openSansRegularFontName -> {
                    val openSansRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansRegular)
                    tvProfileUserDescription.typeface = openSansRegular
                    tvProfileUserAddress.typeface = openSansRegular
                }


                fontsName.get() == CommonMethods.openSansSemiBoldFontName -> {
                    val openSansSemiBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.openSansSemiBold)
                    tvProfileUserDescription.typeface = openSansSemiBold
                    tvProfileUserAddress.typeface = openSansSemiBold
                }


                fontsName.get() == CommonMethods.openSansSemiBoldItalicFontName -> {
                    val openSansSemiBoldItalic = Typeface.createFromAsset(
                        context.assets,
                        CommonMethods.openSansSemiBoldItalic
                    )
                    tvProfileUserDescription.typeface = openSansSemiBoldItalic
                    tvProfileUserAddress.typeface = openSansSemiBoldItalic
                }


                fontsName.get() == CommonMethods.ostrichRegularFontName -> {
                    val ostrichRegular =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichRegular)
                    tvProfileUserDescription.typeface = ostrichRegular
                    tvProfileUserAddress.typeface = ostrichRegular

                }


                fontsName.get() == CommonMethods.ostrichSansBlackFontName -> {
                    val ostrichSansBlack =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBlack)
                    tvProfileUserDescription.typeface = ostrichSansBlack
                    tvProfileUserAddress.typeface = ostrichSansBlack
                }

                fontsName.get() == CommonMethods.ostrichSansBoldFontName -> {
                    val ostrichSansBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansBold)
                    tvProfileUserDescription.typeface = ostrichSansBold
                    tvProfileUserAddress.typeface = ostrichSansBold
                }


                fontsName.get() == CommonMethods.ostrichSansHeavyFontName -> {
                    val ostrichSansHeavy =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansHeavy)
                    tvProfileUserDescription.typeface = ostrichSansHeavy
                    tvProfileUserAddress.typeface = ostrichSansHeavy
                }


                fontsName.get() == CommonMethods.ostrichSansLightFontName -> {
                    val ostrichSansLight =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansLight)
                    tvProfileUserDescription.typeface = ostrichSansLight
                    tvProfileUserAddress.typeface = ostrichSansLight
                }


                fontsName.get() == CommonMethods.ostrichSansMediumFontName -> {
                    val ostrichSansMedium =
                        Typeface.createFromAsset(context.assets, CommonMethods.ostrichSansMedium)
                    tvProfileUserDescription.typeface = ostrichSansMedium
                    tvProfileUserAddress.typeface = ostrichSansMedium
                }


                fontsName.get() == CommonMethods.oswaldBoldFontName -> {
                    val osWaldBold =
                        Typeface.createFromAsset(context.assets, CommonMethods.osWaldBold)
                    tvProfileUserDescription.typeface = osWaldBold
                    tvProfileUserAddress.typeface = osWaldBold
                }


                fontsName.get() == CommonMethods.oswaldBoldItalicFontName -> {
                    val osWaldBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.osWaldBoldItalic
                        )
                    tvProfileUserDescription.typeface = osWaldBold
                }


                fontsName.get() == CommonMethods.oswaldSemiBoldItalicFontName -> {
                    val osWaldSemiBoldItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.osWaldSemiBoldItalic
                        )
                    tvProfileUserDescription.typeface = osWaldSemiBoldItalic
                    tvProfileUserAddress.typeface = osWaldSemiBoldItalic
                }


                fontsName.get() == CommonMethods.playFairDisplayBlackFontName -> {
                    val playfairDisplayBlack =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.playfairDisplayBlack
                        )
                    tvProfileUserDescription.typeface = playfairDisplayBlack
                    tvProfileUserAddress.typeface = playfairDisplayBlack
                }


                fontsName.get() == CommonMethods.playFairDisplayBlackItalicFontName -> {
                    val playfairDisplayBlackItalic = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.playfairDisplayBlackItalic
                    )
                    tvProfileUserDescription.typeface = playfairDisplayBlackItalic
                    tvProfileUserAddress.typeface = playfairDisplayBlackItalic
                }


                fontsName.get() == CommonMethods.playFairDisplayBoldFontName -> {
                    val playfairDisplayBlackItalic = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.playfairDisplayBlackItalic
                    )
                    tvProfileUserDescription.typeface = playfairDisplayBlackItalic
                    tvProfileUserAddress.typeface = playfairDisplayBlackItalic
                }


                fontsName.get() == CommonMethods.poppinBlackItalicFontName -> {
                    val poppinBlackItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinBlackItalic
                        )
                    tvProfileUserDescription.typeface = poppinBlackItalic
                    tvProfileUserAddress.typeface = poppinBlackItalic
                }

                fontsName.get() == CommonMethods.poppinBlackFontName -> {
                    val poppinBlack =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinBlack
                        )
                    tvProfileUserDescription.typeface = poppinBlack
                    tvProfileUserAddress.typeface = poppinBlack
                }


                fontsName.get() == CommonMethods.poppinBoldFontName -> {
                    val poppinBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinBold
                        )
                    tvProfileUserDescription.typeface = poppinBold
                    tvProfileUserAddress.typeface = poppinBold
                }
                fontsName.get() == CommonMethods.poppinBoldItalicFontName -> {
                    val poppinBoldItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinBoldItalic
                        )
                    tvProfileUserDescription.typeface = poppinBoldItalic
                    tvProfileUserAddress.typeface = poppinBoldItalic
                }


                fontsName.get() == CommonMethods.poppinBoldItalicFontName -> {
                    val poppinBoldItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinBoldItalic
                        )
                    tvProfileUserDescription.typeface = poppinBoldItalic
                    tvProfileUserAddress.typeface = poppinBoldItalic
                }


                fontsName.get() == CommonMethods.poppinExtraBoldFontName -> {
                    val poppinExtraBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.poppinExtraBold
                        )
                    tvProfileUserDescription.typeface = poppinExtraBold
                    tvProfileUserAddress.typeface = poppinExtraBold
                }


                fontsName.get() == CommonMethods.ptc55FontName -> {
                    val ptc55 = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.ptc55
                    )
                    tvProfileUserDescription.typeface = ptc55
                    tvProfileUserAddress.typeface = ptc55
                }


                fontsName.get() == CommonMethods.ptc75FontName -> {
                    val ptc75F = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.ptc75F
                    )
                    tvProfileUserDescription.typeface = ptc75F
                    tvProfileUserAddress.typeface = ptc75F
                }


                fontsName.get() == CommonMethods.quicksAndBoldFontName -> {
                    val quicksAndBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.quicksAndBold
                        )
                    tvProfileUserDescription.typeface = quicksAndBold
                    tvProfileUserAddress.typeface = quicksAndBold
                }


                fontsName.get() == CommonMethods.quicksAndBoldItalicFontName -> {
                    val quicksAndBoldItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.quicksAndBoldItalic
                        )
                    tvProfileUserDescription.typeface = quicksAndBoldItalic
                    tvProfileUserAddress.typeface = quicksAndBoldItalic
                }

                fontsName.get() == CommonMethods.quicksDashFontName -> {
                    val quicksDash =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.quicksDash
                        )
                    tvProfileUserDescription.typeface = quicksDash
                    tvProfileUserAddress.typeface = quicksDash
                }

                fontsName.get() == CommonMethods.quicksAndBoldItalicFontName -> {
                    val quicksAndItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.quicksAndItalic
                        )
                    tvProfileUserDescription.typeface = quicksAndItalic
                    tvProfileUserAddress.typeface = quicksAndItalic
                }

                fontsName.get() == CommonMethods.raleWayBlackFontName -> {
                    val raleWayBlack =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayBlack
                        )
                    tvProfileUserDescription.typeface = raleWayBlack
                    tvProfileUserAddress.typeface = raleWayBlack
                }


                fontsName.get() == CommonMethods.raleWayBlackItalicFontName -> {
                    val raleWayBlackItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayBlackItalic
                        )
                    tvProfileUserDescription.typeface = raleWayBlackItalic
                    tvProfileUserAddress.typeface = raleWayBlackItalic
                }

                fontsName.get() == CommonMethods.raleWayBoldFontName -> {
                    val raleWayBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayBold
                        )
                    tvProfileUserDescription.typeface = raleWayBold
                    tvProfileUserAddress.typeface = raleWayBold
                }

                fontsName.get() == CommonMethods.raleWayBoldItalicFontName -> {
                    val raleWayBoldItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayBoldItalic
                        )
                    tvProfileUserDescription.typeface = raleWayBoldItalic
                    tvProfileUserAddress.typeface = raleWayBoldItalic
                }


                fontsName.get() == CommonMethods.raleWayItalicFontName -> {
                    val raleWayItalic =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayItalic
                        )
                    tvProfileUserDescription.typeface = raleWayItalic
                    tvProfileUserAddress.typeface = raleWayItalic
                }


                fontsName.get() == CommonMethods.raleWayMediumFontName -> {
                    val raleWayMedium =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.raleWayMedium
                        )
                    tvProfileUserDescription.typeface = raleWayMedium
                }


                fontsName.get() == CommonMethods.seasRnFontName -> {
                    val seasRn = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.seasRn
                    )
                    tvProfileUserDescription.typeface = seasRn
                    tvProfileUserAddress.typeface = seasRn
                }


                fontsName.get() == CommonMethods.sofiaRegularFontName -> {
                    val sofiaRegular =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.sofiaRegular
                        )
                    tvProfileUserDescription.typeface = sofiaRegular
                    tvProfileUserAddress.typeface = sofiaRegular
                }


                fontsName.get() == CommonMethods.sourceSansProBlackItFontName -> {
                    val sourceSansProBlackIt =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.sourceSansProBlackIt
                        )
                    tvProfileUserDescription.typeface = sourceSansProBlackIt
                    tvProfileUserAddress.typeface = sourceSansProBlackIt
                }


                fontsName.get() == CommonMethods.sourceSansProBoldFontName -> {
                    val sourceSansProBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.sourceSansProBold
                        )
                    tvProfileUserDescription.typeface = sourceSansProBold
                    tvProfileUserAddress.typeface = sourceSansProBold
                }


                fontsName.get() == CommonMethods.sourceSansProExtraLightFontName -> {
                    val sourceSansProExtraLight = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.sourceSansProExtraLight
                    )
                    tvProfileUserDescription.typeface = sourceSansProExtraLight
                    tvProfileUserAddress.typeface = sourceSansProExtraLight
                }


                fontsName.get() == CommonMethods.sourceSansProBlackFontName -> {
                    val sourceSansProBlack =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.sourceSansProBlack
                        )
                    tvProfileUserDescription.typeface = sourceSansProBlack
                    tvProfileUserAddress.typeface = sourceSansProBlack
                }


                fontsName.get() == CommonMethods.sourceSansProExtraLightFontName -> {
                    val sourceSansProExtraLight = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.sourceSansProExtraLight
                    )
                    tvProfileUserDescription.typeface = sourceSansProExtraLight
                    tvProfileUserAddress.typeface = sourceSansProExtraLight
                }

                fontsName.get() == CommonMethods.sourceSansProBlackFontName -> {
                    val sourceSansProBlack =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.sourceSansProBlack
                        )
                    tvProfileUserDescription.typeface = sourceSansProBlack
                    tvProfileUserAddress.typeface = sourceSansProBlack
                }


                fontsName.get() == CommonMethods.titiliumSemiBoldFontName -> {
                    val titiliumSemiBold =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.titiliumSemiBold
                        )
                    tvProfileUserDescription.typeface = titiliumSemiBold
                    tvProfileUserAddress.typeface = titiliumSemiBold
                }


                fontsName.get() == CommonMethods.titiliumLightFontName -> {
                    val titiliumLight =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.titiliumLight
                        )
                    tvProfileUserDescription.typeface = titiliumLight
                    tvProfileUserAddress.typeface = titiliumLight
                }


                fontsName.get() == CommonMethods.titiliumRegularFontName -> {
                    val titiliumRegular =
                        Typeface.createFromAsset(
                            MainActivity.context.get()!!.assets,
                            CommonMethods.titiliumRegular
                        )
                    tvProfileUserDescription.typeface = titiliumRegular
                    tvProfileUserAddress.typeface = titiliumRegular
                }


                fontsName.get() == CommonMethods.titiliumRegularItalicFontName -> {
                    val titiliumRegularItalic = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.titiliumRegularItalic
                    )
                    tvProfileUserDescription.typeface = titiliumRegularItalic
                    tvProfileUserAddress.typeface = titiliumRegularItalic
                }

                fontsName.get() == CommonMethods.windSongFontName -> {
                    val windSong = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.windSong
                    )
                    tvProfileUserDescription.typeface = windSong
                    tvProfileUserAddress.typeface = windSong
                }


                fontsName.get() == CommonMethods.walkWayBlackFontName -> {
                    val walkwayBlack = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.walkwayBlack
                    )
                    tvProfileUserDescription.typeface = walkwayBlack
                    tvProfileUserAddress.typeface = walkwayBlack
                }


                fontsName.get() == CommonMethods.walkWayObliqueFontName -> {
                    val walkwayOblique = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.walkwayOblique
                    )
                    tvProfileUserDescription.typeface = walkwayOblique
                    tvProfileUserAddress.typeface = walkwayOblique
                }

                fontsName.get() == CommonMethods.walkWayObliqueBlackFontName -> {
                    val walkwayObliqueBlack = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.walkwayObliqueBlack
                    )
                    tvProfileUserDescription.typeface = walkwayObliqueBlack
                    tvProfileUserAddress.typeface = walkwayObliqueBlack
                }

                fontsName.get() == CommonMethods.walkwayObliqueSemiBoldFontName -> {
                    val walkwayObliqueSemiBold = Typeface.createFromAsset(
                        MainActivity.context.get()!!.assets,
                        CommonMethods.walkwayObliqueSemiBold
                    )
                    tvProfileUserDescription.typeface = walkwayObliqueSemiBold
                    tvProfileUserAddress.typeface = walkwayObliqueSemiBold
                }


            }
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
                CommonMethods.context.hideKeyboard()
            }
            clFontListMain.setOnClickListener {
                CommonMethods.context.hideKeyboard()
            }
            rvChooseFonts.setOnClickListener {
                CommonMethods.context.hideKeyboard()
            }
            searchFunctionality()
        }
        fontBottomSheet?.setContentView(scheduleBinding?.root!!)
        fontBottomSheet?.show()
        typfaceObserverLiveData.postValue(false)
        fontListAdapter.setOnItemClick { view, position, type ->
            when (type) {
                CommonMethods.fontsItemClick -> {
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
        //vikas
        /*Academy_Engraved*/
        val academyEngravedLetPlain =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, academyEngravedLetPlain)
        appCompatTxtFont?.typeface = academyEngravedLetPlain

        /*AbrilFatFace_Regular*/
        val abrilFatFaceRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.abrilFatFaceRegular
            )
        appCompatTxtFont?.typeface = abrilFatFaceRegular

        /*AlexBrush_Regular*/
        val alexBrushRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.alexBrushRegular
            )
        appCompatTxtFont?.typeface = alexBrushRegular

        val allerBD =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.allerBD)
        appCompatTxtFont?.typeface = allerBD

        val allerBDLT =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.allerBDLT)
        appCompatTxtFont?.typeface = allerBDLT

        val allerDisplay = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.allerDisplay
        )
        appCompatTxtFont?.typeface = allerDisplay


        val allerIt =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.allerIt)
        appCompatTxtFont?.typeface = allerIt

        val allerRG =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.allerRG)
        appCompatTxtFont?.typeface = allerRG


        val amaticBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.amaticBold)
        appCompatTxtFont?.typeface = amaticBold

        val amaticSCRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.amaticSCRegular
            )
        appCompatTxtFont?.typeface = amaticSCRegular

        val antinoBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.antonioBold)
        appCompatTxtFont?.typeface = antinoBold

        val antonioLight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.antonioLight
        )
        appCompatTxtFont?.typeface = antonioLight

        val antonioRegular = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.antonioRegular
        )
        appCompatTxtFont?.typeface = antonioRegular

        val BebasRegular = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.bebasRegular
        )
        appCompatTxtFont?.typeface = BebasRegular

        /*  val blackJack = Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.blackJack)
          appCompatTxtFont?.typeface = blackJack*/

        //C
        val caviarDreams = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.caviarDreams
        )
        appCompatTxtFont?.typeface = caviarDreams

        val caviarDreamsItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.caviarDreamsItalic
            )
        appCompatTxtFont?.typeface = caviarDreamsItalic

        val chunkFivePrint = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.chunkFivePrint
        )
        appCompatTxtFont?.typeface = chunkFivePrint

        val chunkFiveRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.chunkFiveRegular
            )
        appCompatTxtFont?.typeface = chunkFiveRegular

        val cooperHewittBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.cooperHewittBold
            )
        appCompatTxtFont?.typeface = cooperHewittBold

        val cooperHewittBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.cooperHewittBoldItalic
            )
        appCompatTxtFont?.typeface = cooperHewittBoldItalic

        val cooperHewittBook =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.cooperHewittBook
            )
        appCompatTxtFont?.typeface = cooperHewittBook

        val cooperHewittHeavy =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.cooperHewittHeavy
            )
        appCompatTxtFont?.typeface = cooperHewittHeavy

        val dancingScriptRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.dancingScriptRegular
            )
        appCompatTxtFont?.typeface = dancingScriptRegular

        val fTus =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.fTusj)
        appCompatTxtFont?.typeface = fTus

        val firaSansBold = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.firaSansBold
        )
        appCompatTxtFont?.typeface = firaSansBold


        val firaSansBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.firaSansBoldItalic
            )
        appCompatTxtFont?.typeface = firaSansBoldItalic

        val firaSansBook = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.firaSansBook
        )
        appCompatTxtFont?.typeface = firaSansBook


        val firaSansEight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.firaSansEight
        )
        appCompatTxtFont?.typeface = firaSansEight


        val greatVibesRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.greatVibesRegular
            )
        appCompatTxtFont?.typeface = greatVibesRegular


        val helloValentina = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.helloValentina
        )
        appCompatTxtFont?.typeface = helloValentina


        val interBlack =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.interBlack)
        appCompatTxtFont?.typeface = interBlack

        val interBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.interBold)
        appCompatTxtFont?.typeface = interBold


        val interBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.interBoldItalic
            )
        appCompatTxtFont?.typeface = interBoldItalic

        val interExtraBold = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.interExtraBold
        )
        appCompatTxtFont?.typeface = interExtraBold


        val josefinBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.josefinBold)
        appCompatTxtFont?.typeface = josefinBold

        val josefinBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.josefinBoldItalic
            )
        appCompatTxtFont?.typeface = josefinBoldItalic

        val josefinLight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.josefinLight
        )
        appCompatTxtFont?.typeface = josefinLight

        val josefinRegular = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.josefinRegular
        )
        appCompatTxtFont?.typeface = josefinRegular

        val josefiThin =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.josefiThin)
        appCompatTxtFont?.typeface = josefiThin

        val latoBlack =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.latoBlack)
        appCompatTxtFont?.typeface = latoBlack


        val latoBlackItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.latoBlackItalic
            )
        appCompatTxtFont?.typeface = latoBlackItalic

        val latoBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.latoBold)
        appCompatTxtFont?.typeface = latoBold

        val latoBoldItalic = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.latoBoldItalic
        )
        appCompatTxtFont?.typeface = latoBoldItalic

        val latoHairLIneItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.latoHairLIneItalic
            )
        appCompatTxtFont?.typeface = latoHairLIneItalic

        val montSerratAlternatesBlack =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.montSerratAlternatesBlack
            )
        appCompatTxtFont?.typeface = montSerratAlternatesBlack

        val montSerratAlternatesBlackItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.montSerratAlternatesBlackItalic
            )
        appCompatTxtFont?.typeface = montSerratAlternatesBlackItalic


        val montSerratAlternatesBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.montSerratAlternatesBold
            )
        appCompatTxtFont?.typeface = montSerratAlternatesBold
        //O

        val openSansBold = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.openSansBold
        )
        appCompatTxtFont?.typeface = openSansBold

        val openSansBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.openSansBoldItalic
            )
        appCompatTxtFont?.typeface = openSansBoldItalic


        val openSansExtraBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.openSansExtraBoldItalic
            )
        appCompatTxtFont?.typeface = openSansExtraBoldItalic

        val openSansItalic = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.openSansItalic
        )
        appCompatTxtFont?.typeface = openSansItalic

        val openSansLight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.openSansLight
        )
        appCompatTxtFont?.typeface = openSansLight

        val openSansRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.openSansRegular
            )
        appCompatTxtFont?.typeface = openSansRegular

        val openSansSemiBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.openSansSemiBold
            )
        appCompatTxtFont?.typeface = openSansSemiBold


        val openSansSemiBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.openSansSemiBoldItalic
            )
        appCompatTxtFont?.typeface = openSansSemiBoldItalic

        val ostrichRegular = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.ostrichRegular
        )
        appCompatTxtFont?.typeface = ostrichRegular

        val ostrichSansBlack =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansBlack
            )
        appCompatTxtFont?.typeface = ostrichSansBlack

        val ostrichSansBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansBold
            )
        appCompatTxtFont?.typeface = ostrichSansBold


        val ostrichSansHeavy =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansHeavy
            )
        appCompatTxtFont?.typeface = ostrichSansHeavy

        val ostrichSansLight =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansLight
            )
        appCompatTxtFont?.typeface = ostrichSansLight

        val ostrichSansMedium =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansMedium
            )
        appCompatTxtFont?.typeface = ostrichSansMedium


        val ostrichSansRoundedMedium =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.ostrichSansRoundedMedium
            )
        appCompatTxtFont?.typeface = ostrichSansRoundedMedium

        val osWaldBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.osWaldBold)
        appCompatTxtFont?.typeface = osWaldBold


        val osWaldBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.osWaldBoldItalic
            )
        appCompatTxtFont?.typeface = osWaldBoldItalic

        val osWaldSemiBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.osWaldSemiBoldItalic
            )
        appCompatTxtFont?.typeface = osWaldSemiBoldItalic

        val playfairDisplayBlack =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.playfairDisplayBlack
            )
        appCompatTxtFont?.typeface = playfairDisplayBlack

        val playfairDisplayBlackItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.playfairDisplayBlackItalic
            )
        appCompatTxtFont?.typeface = playfairDisplayBlackItalic

        val playfairDisplayBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.playfairDisplayBold
            )
        appCompatTxtFont?.typeface = playfairDisplayBold

        val poppinBlackItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.poppinBlackItalic
            )
        appCompatTxtFont?.typeface = poppinBlackItalic

        val poppinBlack =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.poppinBlack)
        appCompatTxtFont?.typeface = poppinBlack

        val poppinBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.poppinBold)
        appCompatTxtFont?.typeface = poppinBold


        val poppinBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.poppinBoldItalic
            )
        appCompatTxtFont?.typeface = poppinBoldItalic

        val poppinExtraBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.poppinExtraBold
            )
        appCompatTxtFont?.typeface = poppinExtraBold

        val ptc55 =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.ptc55)
        appCompatTxtFont?.typeface = ptc55

        val ptc75F =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.ptc75F)
        appCompatTxtFont?.typeface = ptc75F
        //Q

        val quicksAndBold = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.quicksAndBold
        )
        appCompatTxtFont?.typeface = quicksAndBold


        val quicksAndBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.quicksAndBoldItalic
            )
        appCompatTxtFont?.typeface = quicksAndBoldItalic

        val quicksDash =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.quicksDash)
        appCompatTxtFont?.typeface = quicksDash

        val quicksAndItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.quicksAndItalic
            )
        appCompatTxtFont?.typeface = quicksAndItalic

        val quicksAndLight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.quicksAndLight
        )
        appCompatTxtFont?.typeface = quicksAndLight

        //R

        val raleWayBlack = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.raleWayBlack
        )
        appCompatTxtFont?.typeface = raleWayBlack


        val raleWayBlackItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.raleWayBlackItalic
            )
        appCompatTxtFont?.typeface = raleWayBlackItalic


        val raleWayBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.raleWayBold)
        appCompatTxtFont?.typeface = raleWayBold

        val raleWayBoldItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.raleWayBoldItalic
            )
        appCompatTxtFont?.typeface = raleWayBoldItalic

        val raleWayItalic = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.raleWayItalic
        )
        appCompatTxtFont?.typeface = raleWayItalic

        val raleWayMedium = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.raleWayMedium
        )
        appCompatTxtFont?.typeface = raleWayMedium


        val seasRn =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.seasRn)
        appCompatTxtFont?.typeface = seasRn

        val sofiaRegular = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.sofiaRegular
        )
        appCompatTxtFont?.typeface = sofiaRegular

        val sourceSansProBlackIt =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.sourceSansProBlackIt
            )
        appCompatTxtFont?.typeface = sourceSansProBlackIt


        val sourceSansProBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.sourceSansProBold
            )
        appCompatTxtFont?.typeface = sourceSansProBold

        val sourceSansProExtraLight =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.sourceSansProExtraLight
            )
        appCompatTxtFont?.typeface = sourceSansProExtraLight


        val sourceSansProBlack =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.sourceSansProBlack
            )
        appCompatTxtFont?.typeface = sourceSansProBlack


        val titiliumBold = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.titiliumBold
        )
        appCompatTxtFont?.typeface = titiliumBold

        val titiliumLight = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.titiliumLight
        )
        appCompatTxtFont?.typeface = titiliumLight


        val titiliumRegular =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.titiliumRegular
            )
        appCompatTxtFont?.typeface = titiliumRegular


        val titiliumRegularItalic =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.titiliumRegularItalic
            )
        appCompatTxtFont?.typeface = titiliumRegularItalic

        val titiliumSemiBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.titiliumSemiBold
            )
        appCompatTxtFont?.typeface = titiliumSemiBold


        val windSong =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.windSong)
        appCompatTxtFont?.typeface = windSong

        val walkwayBlack = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.walkwayBlack
        )
        appCompatTxtFont?.typeface = walkwayBlack

        val walkwayBold =
            Typeface.createFromAsset(MainActivity.context.get()!!.assets, CommonMethods.walkwayBold)
        appCompatTxtFont?.typeface = walkwayBold

        val walkwayOblique = Typeface.createFromAsset(
            MainActivity.context.get()!!.assets,
            CommonMethods.walkwayOblique
        )
        appCompatTxtFont?.typeface = walkwayOblique

        val walkwayObliqueBlack =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.walkwayObliqueBlack
            )
        appCompatTxtFont?.typeface = walkwayObliqueBlack

        val walkwayObliqueBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.walkwayObliqueBold
            )
        appCompatTxtFont?.typeface = walkwayObliqueBold

        val walkwayObliqueSemiBold =
            Typeface.createFromAsset(
                MainActivity.context.get()!!.assets,
                CommonMethods.walkwayObliqueSemiBold
            )
        appCompatTxtFont?.typeface = walkwayObliqueSemiBold

        /*Adding data in font list */
        //vikas
        fontsNameList.add(
            FontsListModelResponse(
                academyEngravedLetPlain!!,
                CommonMethods.acadeMyLetFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                abrilFatFaceRegular,
                CommonMethods.abrilFatFaceFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(alexBrushRegular, CommonMethods.alexBrushFontName))
        fontsNameList.add(FontsListModelResponse(allerBD, CommonMethods.allerBDFontName))
        fontsNameList.add(FontsListModelResponse(allerBDLT, CommonMethods.allerBDItFontName))
        fontsNameList.add(FontsListModelResponse(allerIt, CommonMethods.allerItFontName))
        fontsNameList.add(FontsListModelResponse(allerDisplay, CommonMethods.AllerDisplayFontName))
        fontsNameList.add(FontsListModelResponse(allerRG, CommonMethods.AllerRGFontName))
        fontsNameList.add(FontsListModelResponse(antinoBold, CommonMethods.AntonioBoldFontName))
        fontsNameList.add(FontsListModelResponse(antonioLight, CommonMethods.AntonioLightFontName))
        fontsNameList.add(
            FontsListModelResponse(
                antonioRegular,
                CommonMethods.AntonioRegularFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(amaticBold, CommonMethods.amaticBoldFontName))
        //B
        fontsNameList.add(FontsListModelResponse(BebasRegular, CommonMethods.bebasRegularFontName))
        //ontsNameList.add(FontsListModelResponse(blackJack, "Black Jack"))

        //C
        fontsNameList.add(FontsListModelResponse(caviarDreams, CommonMethods.caviarDreamsFontName))
        fontsNameList.add(
            FontsListModelResponse(
                caviarDreamsItalic,
                CommonMethods.caviarDreamsItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                chunkFivePrint,
                CommonMethods.chunkFivePrintFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                chunkFiveRegular,
                CommonMethods.chunkFiveRegularFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                cooperHewittBold,
                CommonMethods.cooperHewittBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                cooperHewittBoldItalic,
                CommonMethods.cooperHewittBoldItalicFontName
            )
        )
        //D
        fontsNameList.add(
            FontsListModelResponse(
                dancingScriptRegular,
                CommonMethods.dancingRegularFontName
            )
        )
        //Fc
        fontsNameList.add(FontsListModelResponse(fTus, CommonMethods.ftusFontName))
        fontsNameList.add(FontsListModelResponse(firaSansBold, CommonMethods.firaSansBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                firaSansBoldItalic,
                CommonMethods.firaSansBoldItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(firaSansBook, CommonMethods.firaSansBookFontName))
        fontsNameList.add(
            FontsListModelResponse(
                firaSansEight,
                CommonMethods.firaSansEightFontName
            )
        )
        //G
        fontsNameList.add(
            FontsListModelResponse(
                greatVibesRegular,
                CommonMethods.greatVibesRegularFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                helloValentina,
                CommonMethods.helloValentinaFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(interBlack, CommonMethods.interBlackFontName))
        fontsNameList.add(FontsListModelResponse(interBold, CommonMethods.interBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                interBoldItalic,
                CommonMethods.interBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                interExtraBold,
                CommonMethods.interExtraBoldFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(interBold, CommonMethods.interBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                interExtraBold,
                CommonMethods.inter_Extra_Bold_FontName
            )
        )
        //J
        fontsNameList.add(FontsListModelResponse(josefinBold, CommonMethods.josefinBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                josefinBoldItalic,
                CommonMethods.josefinBoldItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(josefinLight, CommonMethods.josefinLightFontName))
        fontsNameList.add(
            FontsListModelResponse(
                josefinRegular,
                CommonMethods.josefinRegularFontName
            )
        )
        //L
        fontsNameList.add(FontsListModelResponse(latoBlack, CommonMethods.latoBlackFontName))
        fontsNameList.add(
            FontsListModelResponse(
                latoBlackItalic,
                CommonMethods.latoBlackItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(latoBold, CommonMethods.latoBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                latoBoldItalic,
                CommonMethods.latoBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                latoHairLIneItalic,
                CommonMethods.latoHairItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBlack,
                CommonMethods.montSerratAlternatesBlackFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBlackItalic,
                CommonMethods.montSerratAlternatesBlackItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                montSerratAlternatesBold,
                CommonMethods.montSerratAlternatesBoldFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(openSansBold, CommonMethods.openSansBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                openSansBoldItalic,
                CommonMethods.openSansBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansExtraBoldItalic,
                CommonMethods.openSansExtraBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansItalic,
                CommonMethods.openSansItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansLight,
                CommonMethods.openSansLightFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansRegular,
                CommonMethods.openSansRegularFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansSemiBold,
                CommonMethods.openSansSemiBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                openSansSemiBoldItalic,
                CommonMethods.openSansSemiBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichRegular,
                CommonMethods.ostrichRegularFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansBlack,
                CommonMethods.ostrichSansBlackFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansBold,
                CommonMethods.ostrichSansBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansHeavy,
                CommonMethods.ostrichSansHeavyFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansLight,
                CommonMethods.ostrichSansLightFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansMedium,
                CommonMethods.ostrichSansMediumFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                ostrichSansRoundedMedium,
                CommonMethods.ostrichSansRoundedFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(osWaldBold, CommonMethods.oswaldBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                osWaldBoldItalic,
                CommonMethods.oswaldBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                osWaldSemiBoldItalic,
                CommonMethods.oswaldSemiBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                playfairDisplayBlack,
                CommonMethods.playFairDisplayBlackFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                playfairDisplayBlackItalic,
                CommonMethods.playFairDisplayBlackItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                playfairDisplayBold,
                CommonMethods.playFairDisplayBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                poppinBlackItalic,
                CommonMethods.poppinBlackItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(poppinBlack, CommonMethods.poppinBlackFontName))
        fontsNameList.add(FontsListModelResponse(poppinBold, CommonMethods.poppinBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                poppinBoldItalic,
                CommonMethods.poppinBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                poppinExtraBold,
                CommonMethods.poppinExtraBoldFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(ptc55, CommonMethods.ptc55FontName))
        fontsNameList.add(FontsListModelResponse(ptc75F, CommonMethods.ptc75FontName))
        fontsNameList.add(
            FontsListModelResponse(
                quicksAndBold,
                CommonMethods.quicksAndBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                quicksAndBoldItalic,
                CommonMethods.quicksAndBoldItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(quicksDash, CommonMethods.quicksDashFontName))
        fontsNameList.add(
            FontsListModelResponse(
                quicksAndItalic,
                CommonMethods.quickAndItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                quicksAndLight,
                CommonMethods.quickAndLightFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(raleWayBlack, CommonMethods.raleWayBlackFontName))
        fontsNameList.add(
            FontsListModelResponse(
                raleWayBlackItalic,
                CommonMethods.raleWayBlackItalicFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(raleWayBold, CommonMethods.raleWayBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                raleWayBoldItalic,
                CommonMethods.raleWayBoldItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                raleWayItalic,
                CommonMethods.raleWayItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                raleWayMedium,
                CommonMethods.raleWayMediumFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(seasRn, CommonMethods.seasRnFontName))
        fontsNameList.add(FontsListModelResponse(sofiaRegular, CommonMethods.sofiaRegularFontName))
        fontsNameList.add(
            FontsListModelResponse(
                sourceSansProBlackIt,
                CommonMethods.sourceSansProBlackItFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                sourceSansProBold,
                CommonMethods.sourceSansProBoldFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                sourceSansProExtraLight,
                CommonMethods.sourceSansProExtraLightFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                sourceSansProBlack,
                CommonMethods.sourceSansProBlackFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                titiliumLight,
                CommonMethods.titiliumLightFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                titiliumRegular,
                CommonMethods.titiliumRegularFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                titiliumRegularItalic,
                CommonMethods.titiliumRegularItalicFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                titiliumSemiBold,
                CommonMethods.titiliumSemiBoldFontName
            )
        )
        fontsNameList.add(FontsListModelResponse(windSong, CommonMethods.windSongFontName))
        fontsNameList.add(FontsListModelResponse(walkwayBlack, CommonMethods.walkWayBlackFontName))
        fontsNameList.add(FontsListModelResponse(walkwayBold, CommonMethods.walkWayBoldFontName))
        fontsNameList.add(
            FontsListModelResponse(
                walkwayOblique,
                CommonMethods.walkWayObliqueFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                walkwayObliqueBlack,
                CommonMethods.walkWayObliqueBlackFontName
            )
        )
        fontsNameList.add(
            FontsListModelResponse(
                walkwayObliqueBold,
                CommonMethods.walkWayObliqueBoldFontName
            )
        )
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
        dialog = Dialog(MainActivity.context.get()!!/*, android.R.style.Theme_Dialog*/)
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
//        dialog!!.getWindow()!!.getAttributes().gravity = Gravity.LEFT or Gravity.TOP
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
        dialog?.window!!.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
//         setColor =   dialog!!.findViewById<AppCompatTextView>(R.id.change_back_id)

        recyclerChoosecolor = dialog!!.findViewById(R.id.color_recyclerView)
        recyclerChoosecolor?.layoutManager = GridLayoutManager(MainActivity.context.get()!!, 6)
        recyclerChoosecolor?.adapter = ColorsAdapter(MainActivity.context.get()!!, colorList, this)
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
                .setBackgroundColor(MainActivity.context.get()!!.getColor(R.color.white))
            dialog!!.findViewById<TextView>(R.id.change_back_id)
                .setBackgroundColor(MainActivity.context.get()!!.getColor(R.color.white))

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
        shape.setStroke(value.toInt(), MainActivity.context.get()!!.getColor(color))
        layout.background = shape

    }

    /**Color picker dialog ..**/
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    fun showBottomDialog() {
        val dialog = BottomSheetDialog(MainActivity.context.get()!!)
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
            CommonMethods.BACKGROUND -> {
                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(MainActivity.context.get()!!.getColor(color!!))
                val cd =
                    dialog!!.findViewById<ConstraintLayout>(R.id.Show_back).background as ColorDrawable
                val colorCode = cd.color

                selectedbackgrouncolor = colorCode
                Log.e("ASFDf", colorCode.toString())

            }

            CommonMethods.COLUMN -> {
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
            CommonMethods.BORDER -> {
                borderColorLiveData = color!!
                selectedbackgrouncolor = color
                setBorderBackground(cardLayoutColrs!!, borderSlideValue, selectedbackgrouncolor)
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and color)
                preferenceFile.storecolorString(Constants.BORDER_COLOR, hexColor)

                Log.e("ASFDf", color.toString())

            }

            CommonMethods.FONTCOLOR -> {

                /** Slider for size */
                slider_size?.addOnChangeListener { _, value, _ ->

                    changeColor?.textSize = value
                    Log.e(
                        "WOrking", "---$value"
                    )
                }

                dialog!!.findViewById<ConstraintLayout>(R.id.Show_back)
                    .setBackgroundColor(context.getColor(R.color.gray))
                title?.text = "Font Color"
                changeColor?.text = "Font Sample"
                dialog!!.findViewById<TextView>(R.id.change_back_id)
                    .setTextColor(MainActivity.context.get()!!.getColor(color!!))
                val colorCode =
                    dialog!!.findViewById<TextView>(R.id.change_back_id).currentTextColor

                selectedbackgrouncolor = colorCode
                fontColorLiveData = colorCode
                val hexColor = java.lang.String.format("#%06X", 0xFFFFFF and colorCode)
                preferenceFile.storecolorString(Constants.FONT_COLOR, hexColor)
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
                            // fontColorLD.value = data.frontpage_font_color!!
                            /** Set Colors... */
                            SelectedDialog.set("Font Color")
                            //preferenceFile.storecolorString(Constants.FONT_COLOR, data.frontpage_font_color.toString())
                            //STORE FONT COLOR
                            fontColorLD.value = data.frontpage_font_color!!

                            preferenceFile.storeBoolKey(
                                Constants.isTopTextSelected,
                                data.is_top_selected!!
                            )
                            isBottomText.set(data.is_bottom_selected!!)
                            isTopText.set(data.is_top_selected)

                            fontsName.set(data.frontpage_top_text)
                            fontsName.set(data.frontpage_bottom_text)
                            fontColor.set(data.frontpage_font_color)

                            preferenceFile.storeBoolKey(
                                Constants.isBottomTextSelected,
                                data.is_bottom_selected
                            )


                        } else {
                            showToast(MainActivity.context.get()!!, res.body()!!.message)
                        }
                    } else {
                        showToast(MainActivity.context.get()!!, res.body()!!.message)
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
        Log.e("TopText_data===", isTopText.get().toString())
        Log.e("TopText_data111===", isBottomText.get().toString())
        repository.makeCall(ApiEnums.POST_EDIT_COVER_PAGE,
            loader = true, saveInCache = false, getFromCache = false,
            object : ApiProcessor<Response<PostFrontPageResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<PostFrontPageResponse> {
                    return retrofitApi.postFonts(
                        Authorization = preferenceFile.retrieveKey("token").toString(),
                        FrontPageBottomText = fontsName.get()!!,
                        FrontPageFontSize = fontSize.get().toInt(),
                        FrontPageTopText = fontsName.get()!!,
                        FrontPagerFontOpacity = fontOpacity.get().toString(),
                        FrontPagerFrontColor = fontColor.get().toString(),
                        isBottomSelected = isBottomText.get(),
                        isTopSelected = isTopText.get(),
                    )
                }

                override fun onResponse(res: Response<PostFrontPageResponse>) {
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body() != null) {
                            showToast(context, res.body()!!.message)
                            dataStoreUtil.saveObject(SAVE_EDIT_COVER_PAGE, res.body()!!.data)
                            //   preferenceFile.saveBoolean(Constants.isTopTextSelected,res.body()!!.data.is_top_selected!!)
                            //  preferenceFile.saveBoolean(Constants.isBottomTextSelected,res.body()!!.data.is_bottom_selected!!)

                        } else {
                            showToast(MainActivity.context.get()!!, res.body()!!.message)
                        }
                    } else {
                        showToast(MainActivity.context.get()!!, res.message())
                    }
                }
            })
    }

    private fun getPostProfileApi(p_id: String, lati: Double, longi: Double) {
        val e = Log.e("KKKKAAALLLL", "$p_id PID $lati LAT  $longi LONG ")
        repository.makeCall(
            ApiEnums.GET_POST_PROFILE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetPostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetPostProfileResponse> {

                    return retrofitApi.getPostProfile(
                        preferenceFile.retrieveKey("token").toString(),
                        p_id,
                        preferenceFile.retvieLatlong("lati"),
                        preferenceFile.retvieLatlong("longi")
                    )
                }

                override fun onResponse(res: Response<GetPostProfileResponse>) {
                    Log.e("AQQAAARESPONEEES", res.body().toString())
                    if (res.isSuccessful) {
                        if (res.code() == 200) {
                            showViewProfileDialog(res.body()!!)
                        } else {
                            showToast(MainActivity.context.get()!!, res.message())
                        }
                    } else {
                        showToast(MainActivity.context.get()!!, res.message())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("zxczxczxc", message)
                }
            }
        )
    }

    fun setVideoPlayerMethod(
        videoView: VideoView, imageUrl: String?, ivVideoIcon: ImageView,
        widthPixels: Int, parentLayout: ConstraintLayout,
    ) {
        val position = 0
        val metrics = DisplayMetrics()
        context.windowManager.defaultDisplay.getMetrics(metrics)
        val videoView = FullScreenVideoView(MainActivity.activity)
        try {
            if (imageUrl != null && imageUrl != "") {
                videoView.setVideoPath(imageUrl)
                videoView.setOnPreparedListener { mp ->
                    mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING)
                    parentLayout.removeAllViews()
                    parentLayout.addView(
                        videoView,
                        ConstraintLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.MATCH_PARENT
                        )
                    )
                    val params = videoView.layoutParams as ConstraintLayout.LayoutParams
                    params.width = widthPixels
                    //params.height = metrics.heightPixels
                    params.leftMargin = 0
                    videoView.layoutParams = params
                    mp.setVolume(0f, 0f)
                    videoView.seekTo(position)
                    ivVideoIcon.visibility = View.GONE
                    if (position == 0) {
                        videoView.start()
                    } else {
                        videoView.pause()
                    }

                    mp.isLooping = true
                    Log.d("VideoPreparing", "video is preparing " + videoView.duration)
                }
                videoView.setOnErrorListener { mediaPlayer, _, _ ->

                    Log.d("VideoError", "$mediaPlayer")
                    showToast(MainActivity.context.get()!!, "Error in Video Playing..")
                    false
                }

                videoView.setOnCompletionListener { mp ->
                    // videoView.start()
                    if (mp.duration == videoView.duration) {
                        showToast(MainActivity.context.get()!!, "Video is Completed ..")
                    }
                }
                videoView.requestFocus()
                videoView.start()
            } else {
            }
        } catch (e: Exception) {
            Log.d("ErrorInViewPostProfile", "Error coming in player ${e.message.toString()}")
        }

    }


    private fun getProfileId() {
        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {
            p_id = it?.data?.p_id
        }
    }


}