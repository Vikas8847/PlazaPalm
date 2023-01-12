package com.example.plazapalm.views.report

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ReportFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateWithId
import com.example.plazapalm.views.reportselection.ReportChooseVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReportFragment : Fragment(R.layout.report_fragment) {
    private var binding: ReportFragmentBinding? = null
    private val viewModel: ReportVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ReportFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        getBundleData()
        return binding?.root
    }

    private fun getBundleData() {
        if (arguments !=null){

            when(arguments?.get("commingFrom")){

                "ReportChooseFrag" -> {
                    viewModel?.firstName?.set(arguments?.getString("selectedData").toString())
                    viewModel?.p_Id?.set(arguments?.getString("_p_id").toString())

                    Log.e("QAZQAZQAZ",arguments?.getString("selectedData").toString() + "REPORTTTFRAGGGG"
                            + arguments?.getString("_p_id").toString())

                }

            }

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel

//        binding?.ivReportBackButton?.setOnClickListener {
//            view.findNavController().navigateUp()
//        }
//        binding?.btnReportSubmit?.setOnClickListener {
//            view.navigateWithId(R.id.myProfileFragment)
//        }
    }
}