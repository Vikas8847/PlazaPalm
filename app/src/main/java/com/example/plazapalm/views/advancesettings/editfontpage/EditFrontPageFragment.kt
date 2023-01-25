package com.example.plazapalm.views.advancesettings.editfontpage

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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
import com.example.plazapalm.databinding.EditFrontPageFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import dagger.hilt.android.AndroidEntryPoint
import java.lang.String
import javax.inject.Inject

@AndroidEntryPoint
class EditFrontPageFragment : Fragment(R.layout.edit_front_page_fragment) {
    private var binding: EditFrontPageFragmentBinding? = null
    @Inject
    lateinit var dataStoreUtil: DataStoreUtil
    @Inject
    lateinit var preferenceFile: PreferenceFile
    private val viewModel: EditFrontPageVM by viewModels()
    private var checkApi = ObservableBoolean(false)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        preferenceFile.cleardata(Constants.BORDER_COLOR)
        preferenceFile.cleardata(Constants.COLUMN_COLOR)
        preferenceFile.cleardata(Constants.BACKGROUND_COLOR)
        preferenceFile.cleardata(Constants.FONT_COLOR)
        checkApi.set(true)
        viewModel.getFontsApi()

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = EditFrontPageFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        return binding?.root
    }
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        backPressedData()
        setbackground()

        binding!!.clCoordinateEditCoverPage.setOnClickListener {
            CommonMethods.context.hideKeyboard()
        }
        viewModel.typfaceObserverLiveData.observe(requireActivity()) {
            val data = it as Boolean
            if (data) {
                binding?.tvAdvanceEditFrontPageFontValue?.typeface = viewModel.fontTypeface
            }
        }
        binding?.checkEditFrontPageTopText?.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                viewModel.isTopText.set(true)
            } else {
                viewModel.isTopText.set(false)
            }

        }

        binding?.checkBottomTextFrontPage?.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked){
                viewModel.isBottomText.set(true)
            }
            else{
                viewModel.isBottomText.set(false)
            }

        }
    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun setbackground() {
        viewModel.fontColorLD.observe(viewLifecycleOwner) {
            Log.e("fontColorLD---", it.toString())
            if (it != null && !(it.equals(""))) {
                if (it is Int) {
                    val data = it
                    binding?.viewBoxLookingBGColor?.setBackgroundColor(data)
                } else {
                    val data = it as String
                    binding?.viewBoxLookingBGColor?.setBackgroundColor(Color.parseColor(data.toString()))
                }
            }

        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onResume() {
        super.onResume()
        if (!checkApi.get()) {
            getLocalData()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun getLocalData() {
        /**Get Fonts Color..**/
        if (preferenceFile.retviecolorString(Constants.FONT_COLOR) != null && !(preferenceFile.retviecolorString(Constants.FONT_COLOR).equals(""))
        ) {
            val fontColor = preferenceFile.retviecolorString(Constants.FONT_COLOR)
            viewModel.fontColorLD.value = fontColor
            Log.e("SSSSSSSSSqw4", fontColor.toString())
        }
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