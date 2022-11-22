package com.example.plazapalm.views.reportselection

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.models.ReportDataModal
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class ReportChooseVM @Inject constructor() : ViewModel() {

    var isChecked=ObservableBoolean(false)
    var selectedData =ObservableField("")
    var P_ID =ObservableField("")

     var reportModelList: ArrayList<ReportDataModal> = ArrayList()
    val reportChooseAdapter by lazy { RecyclerAdapter<ReportDataModal>(R.layout.fragment_report_choose_option_items) }

    init {
        reportModelList.add(ReportDataModal("False, misleading or harmful,\n" + "Information",))
        reportModelList.add(ReportDataModal("Inappropriate Profile", ))
        reportModelList.add(ReportDataModal("Fake/Spam", ))
        reportModelList.add(ReportDataModal("Outdated", ))
        reportModelList.add(ReportDataModal("Harassment or Hate Speech", ))
        reportModelList.add(ReportDataModal("Wrong Category", ))
        reportChooseAdapter.addItems(reportModelList)
        reportChooseAdapter.notifyDataSetChanged()

    }

    fun onClicks(view: View) {

        when (view.id) {

            R.id.ivReportChooseBackBtn -> {
                view.findNavController().navigateUp()
            }

            R.id. btnReportChecked -> {
                val bundle = Bundle()
                bundle.putString("commingFrom","ReportChooseFrag")
                bundle.putString("selectedData",selectedData.get().toString())
                bundle.putString("_p_id",P_ID.get().toString())

                Log.e("QAZQAZQAZ",selectedData.get().toString() + "DDSSS" + P_ID.get().toString())

                view.navigateWithId(R.id.action_reportChooseOptionFragment_to_reportFragment , bundle)
            }

        }

    }
}