package com.example.plazapalm.views.reportselection

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FragmentReportChooseOptionBinding
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReportChooseOptionFragment : Fragment(R.layout.fragment_report_choose_option) {
    private var binding: FragmentReportChooseOptionBinding? = null
    private val viewModel: ReportChooseVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
     ): View? {
        binding = FragmentReportChooseOptionBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        setAdapter()
         setItemSingleSelection()
        getBundleData()
    }

    private fun getBundleData() {
        if (arguments?.getString("p_id")!=null){
           viewModel.P_ID.set(arguments?.getString("p_id"))
        }
        else if(arguments?.getString("p_id")!=null) {

        }
    }

    private fun setAdapter() {
        binding?.rvReportOptions?.layoutManager = LinearLayoutManager(requireContext())
        binding?.rvReportOptions?.adapter = viewModel.reportChooseAdapter
        binding?.rvReportOptions?.adapter?.notifyDataSetChanged()
    }


    @SuppressLint("NotifyDataSetChanged")
    private fun checkReportList(position:Int){
        viewModel.reportModelList.map {
            it.isChecked=false
        }
        viewModel.reportModelList[position].isChecked=true
        binding?.rvReportOptions?.adapter?.notifyDataSetChanged()
    }

    private fun setItemSingleSelection() {
//        viewModel.isChecked
        viewModel.reportChooseAdapter.setOnItemClick { view, position, type ->
            when (type) {
                "onReportChooseItemClick" -> {

                    Log.e("QAZQAZQAZ",viewModel.reportModelList.get(position).text.toString())

                    checkReportList(position)
                    viewModel.selectedData.set(viewModel.reportModelList.get(position).text.toString())
                }
            }
        }
    }
}