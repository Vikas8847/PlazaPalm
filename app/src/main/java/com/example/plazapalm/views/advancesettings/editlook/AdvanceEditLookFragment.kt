package com.example.plazapalm.views.advancesettings.editlook

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.ObservableBoolean
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AdvanceEditLookFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import dagger.hilt.android.AndroidEntryPoint
import java.lang.String
import javax.inject.Inject


@AndroidEntryPoint
class AdvanceEditLookFragment : Fragment(R.layout.advance_edit_look_fragment) {

    private var binding: AdvanceEditLookFragmentBinding? = null
    private val viewModel: AdvanceEditLookVM by viewModels()
    private var checkApi = ObservableBoolean(false)

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    @Inject
    lateinit var preferenceFile: PreferenceFile

    @RequiresApi(Build.VERSION_CODES.M)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*   preferenceFile.cleardata(Constants.BORDER_COLOR)
           preferenceFile.cleardata(Constants.COLUMN_COLOR)
           preferenceFile.cleardata(Constants.BACKGROUND_COLOR)
           preferenceFile.cleardata(Constants.FONT_COLOR)
           viewModel.getEditLookColor()
         //  checkApi.set(true)*/
        viewModel.checkOldValue.set(false)
        viewModel.getEditLookColor()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AdvanceEditLookFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        binding?.vm = viewModel

        setbackground()
        viewModel.typfaceObserverLiveData.observe(requireActivity()) {
            val data = it as Boolean
            if (data) {
                Log.e("fmwlfwfwf===","dqdqddqd")
                binding?.tvAdvanceEditLookFontValues?.typeface = viewModel.fontTypeface
            }
        }

        return binding?.root
    }



    @RequiresApi(Build.VERSION_CODES.M)
    override fun onResume() {
        super.onResume()

        Log.e("QWCGGH111", "Working---")

        if (!checkApi.get()) {
            // getLocalData()
            Log.e("QWCGGH333", "Working---")

        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun getLocalData() {

        /**Back ground color ...**/
        if (preferenceFile.retviecolorString(Constants.BACKGROUND_COLOR) != null && !(preferenceFile.retviecolorString(
                Constants.BACKGROUND_COLOR
            ).equals(""))
        ) {
            val backgroundColor = preferenceFile.retviecolorString(Constants.BACKGROUND_COLOR)
            viewModel.SelectedDialog.set("Background Color")
            viewModel.backgroundColorLiveData.value = backgroundColor
            Log.e("SSSSSSSSSqw1", backgroundColor.toString())
        }

        /**Coloumn color..**/
        if (preferenceFile.retviecolorString(Constants.COLUMN_COLOR) != null && !(preferenceFile.retviecolorString(
                Constants.COLUMN_COLOR
            ).equals(""))
        ) {
            val columnColor = preferenceFile.retviecolorString(Constants.COLUMN_COLOR)
            viewModel.columnColorLD.value = columnColor
            Log.e("SSSSSSSSSqw2", columnColor.toString())
        }

        /** Border Color ..***/
        if (preferenceFile.retviecolorString(Constants.BORDER_COLOR) != null
            && !(preferenceFile.retviecolorString(Constants.BORDER_COLOR).equals(""))
        ) {
            val borderColor = preferenceFile.retviecolorString(Constants.BORDER_COLOR)
            viewModel.borderColorLD.value = borderColor
            Log.e("SSSSSSSSSqw3", borderColor.toString())
        }

        /**Get Fonts Color..**/
        if (preferenceFile.retviecolorString(Constants.FONT_COLOR) != null && !(preferenceFile.retviecolorString(
                Constants.FONT_COLOR
            ).equals(""))
        ) {
            val fontColor = preferenceFile.retviecolorString(Constants.FONT_COLOR)
            viewModel.fontColorLD.value = fontColor
            Log.e("SSSSSSSSSqw4", fontColor.toString())
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setbackground() {
        viewModel.backgroundColorLiveData.observe(viewLifecycleOwner) {

            if(viewModel.checkOldValue.get()==false){
                Log.e("sadsdaaaaaaaaa111==", it.toString())
                when (viewModel.SelectedDialog.get().toString()) {
                    "Background Color" -> {
                        if (it != null && !(it.equals(""))) {
                            if (it is String) {
                                val data = it
                                if(data.equals("")){
                                    //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                                    binding?.viewBoxLookingBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                                }else {
                                    binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor(
                                        data.toString()))
                                }
                            } else {
                                val data = it as Int

                                binding?.viewBoxLookingBGColor?.setBackgroundColor(data)

                            }
                            val cd = binding?.viewBoxLookingBGColor?.background as ColorDrawable
                            val colorCode = cd.color
                            val hexColor = String.format("#%06X", 0xFFFFFF and colorCode)
                            viewModel.backgroundColor.set(hexColor)
                            preferenceFile.storecolorString(Constants.BACKGROUND_COLOR, hexColor)
                            Log.e("asdasdasBackground", hexColor.toString())

                        }else
                        {
                            binding?.viewBoxLookingBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                        }
                    }

                    "Column Color" -> {
                        //  var  data=it as Int
                        if (it is Int) {
                            val data = it
                            binding?.viewBoxColumnBGColor?.setBackgroundColor(data)
                        } else {
                            val data = it as String

                            if(data.equals("")){
                                //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                                binding?.viewBoxColumnBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                            }else {

                                binding?.viewBoxColumnBGColor?.setBackgroundColor(Color.parseColor(data.toString()))
                            }}
                        val cd = binding?.viewBoxColumnBGColor?.background as ColorDrawable
                        val colorCode = cd.color
                        val hexColor = String.format("#%06X", 0xFFFFFF and colorCode)
                        viewModel.columnColor.set(hexColor)

                        Log.e("asdasdasColumn", viewModel.columnColor.get().toString())
                    }

                    "Border Color" -> {

                        if (it is Int) {
                            val data = it
                            binding?.viewBoxBorderColor?.setBackgroundColor(data)
                        } else {
                            val data = it as String
                            if(data.equals("")){
                                //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                                binding?.viewBoxBorderColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                            }else {
                                binding?.viewBoxBorderColor?.setBackgroundColor(Color.parseColor(data.toString()))
                            }}

                        //  binding?.viewBoxBorderColor?.setBackgroundColor(CommonMethods.context.getColor(it))
                        val cd = binding?.viewBoxBorderColor?.background as ColorDrawable
                        val colorCode = cd.color
                        val hexColor = String.format("#%06X", 0xFFFFFF and colorCode)
                        viewModel.borderColor.set(hexColor)
                        Log.e("asdasdasBorder", viewModel.borderColor.get().toString())

                    }

                    "Font Color" -> {
                        if (it is Int) {
                            val data = it
                            binding?.viewBoxEditFonts?.setBackgroundColor(data)
                        } else {
                            val data = it as String
                            if(data.equals("")){
                                //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                                binding?.viewBoxEditFonts?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                            }else {
                                binding?.viewBoxEditFonts?.setBackgroundColor(Color.parseColor(data.toString()))
                            }}
                        Log.e("dfsdfsdf", "working")
                        // binding?.viewBoxEditFonts?.setBackgroundColor(it)
                        val cd = binding?.viewBoxEditFonts?.background as ColorDrawable
                        val colorCode = cd.color
                        val hexColor = String.format("#%06X", 0xFFFFFF and colorCode)
                        viewModel.fontColor.set(hexColor)
                        Log.e("asdasdasFONTS", viewModel.fontColor.get().toString())
                    }

                }
            }
            viewModel.checkOldValue.set(false)
        }


        viewModel.columnColorLD.observe(viewLifecycleOwner) {
            Log.e("COLOR---", it.toString())
            Log.e("sadsdaaaaaaaaa222==", it.toString())
            if (it != null && !(it.equals(""))) {
                if (it is Int) {
                    var data = it
                    binding?.viewBoxColumnBGColor?.setBackgroundColor(data)
                } else {
                    var data = it as String
                    if(data.equals("")){
                        //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                        binding?.viewBoxColumnBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                    }else {
                        binding?.viewBoxColumnBGColor?.setBackgroundColor(Color.parseColor(data.toString()))
                    }}
            }else
            {
                binding?.viewBoxColumnBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
            }
        }
        viewModel.borderColorLD.observe(viewLifecycleOwner) {
            Log.e("sadsdaaaaaaaaa333==", it.toString())
            Log.e("borderColorLD---", it.toString())
            if (it != null && !(it.equals(""))) {
                if (it is Int) {
                    var data = it
                    binding?.viewBoxBorderColor?.setBackgroundColor(data)
                } else {
                    var data = it as String
                    if(data.equals("")){
                        //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                        binding?.viewBoxBorderColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                    }else {
                        binding?.viewBoxBorderColor?.setBackgroundColor(Color.parseColor(data.toString()))
                    }
                }
            }else{
                binding?.viewBoxBorderColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
            }
        }
        viewModel.fontColorLD.observe(viewLifecycleOwner) {
            Log.e("sadsdaaaaaaaaa444==", it.toString())
            Log.e("fontColorLD---", it.toString())
            if (it != null && !(it.equals(""))) {
                if (it is Int) {
                    val data = it
                    binding?.viewBoxEditFonts?.setBackgroundColor(data)
                } else {
                    val data = it as String
                    if(data.equals("")){
                        //  binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor("#ffffff"))
                        binding?.viewBoxEditFonts?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
                    }else{
                        binding?.viewBoxEditFonts?.setBackgroundColor(Color.parseColor(data.toString()))
                    }}
            }else{
                binding?.viewBoxEditFonts?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
            }

        }
        viewModel.backgroundCLiveData.observe(viewLifecycleOwner){
            Log.e("sadsdaaaaaaaaa555==", it.toString())
            if (it != null && !(it.equals(""))) {
                if (it is String) {
                    val data = it
                    binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor(data.toString()))
                } else {
                    val data = it as Int
                    binding?.viewBoxLookingBGColor?.setBackgroundColor(data)
                }
                val cd = binding?.viewBoxLookingBGColor?.background as ColorDrawable
                val colorCode = cd.color
                val hexColor = String.format("#%06X", 0xFFFFFF and colorCode)
                viewModel.backgroundColor.set(hexColor)
                preferenceFile.storecolorString(Constants.BACKGROUND_COLOR, hexColor)
                Log.e("asdasdasBackground", hexColor.toString())
            }else
            {
                binding?.viewBoxLookingBGColor?.background=requireActivity().resources.getDrawable(R.drawable.forgot_email_bg)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // backPressedData()
        //     binding?.vm = viewModel
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setBorderBackground(layout: View, color: Int) {
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.RECTANGLE
        shape.cornerRadii = floatArrayOf(12f, 12f, 12f, 12f, 12f, 12f, 12f, 12f)
        shape.setColor(color)
        shape.setStroke(0, CommonMethods.context.getColor(R.color.black))
        layout.background = shape

    }

    private fun backPressedData() {
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<kotlin.String>("changeStatus")
            ?.observe(viewLifecycleOwner) { data ->
                Log.e("WERWEFDSFD", data.toString())
                if (data != null) {
                    checkApi.set(false)
                }

            }
    }
}
