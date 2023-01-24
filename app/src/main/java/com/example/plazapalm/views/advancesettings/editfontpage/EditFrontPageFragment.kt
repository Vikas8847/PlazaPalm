package com.example.plazapalm.views.advancesettings.editfontpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.EditFrontPageFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.hideKeyboard
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditFrontPageFragment : Fragment(R.layout.edit_front_page_fragment) {
    private var binding: EditFrontPageFragmentBinding? = null
    private val viewModel: EditFrontPageVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = EditFrontPageFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        viewModel.getFontsApi()
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
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
                viewModel.isChecked.set(true)
            } else {
                viewModel.isChecked.set(false)
            }
        }
    }
}