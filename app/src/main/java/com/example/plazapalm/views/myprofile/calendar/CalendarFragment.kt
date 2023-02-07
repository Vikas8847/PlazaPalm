package com.example.plazapalm.views.myprofile.calendar

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.applandeo.materialcalendarview.listeners.OnCalendarPageChangeListener
import com.example.plazapalm.R
import com.example.plazapalm.databinding.CalendarFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
@AndroidEntryPoint
class CalendarFragment : Fragment(R.layout.calendar_fragment) {
    private var binding: CalendarFragmentBinding? = null
    private val viewModel: CalendarVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = CalendarFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(false)
        getBundleData()
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calendarClick()
        binding?.vm = viewModel
    }

    private fun getBundleData() {
        if (arguments != null) {
            when (arguments?.getString("comingFromm")) {
                Constants.Calendar -> {
                    viewModel.p_Id.set(arguments?.get("p_id").toString())
                    val currentDate =
                        SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date())
                    val calandar = Calendar.getInstance()
                    val split = currentDate.split("-")
                    val day = split[0].toInt()
                    val month = split[1].toInt()
                    val year = split[2].toInt()
                    viewModel.getCalanderDataMonthWise(month, year)
                    viewModel.calendarMutableResponse.observe(requireActivity()) {
                        val dataList = it as ArrayList<Calendar>
                        dataList.add(calandar)
                            binding?.clCalendar?.setHighlightedDays(dataList)
                           binding?.clCalendar?.selectedDates = dataList
                    }
                    Log.e("ASAW", currentDate)
                }
            }
        }
    }

      @SuppressLint("ResourceType")
      private fun calendarClick() {
          binding?.clCalendar?.setOnPreviousPageChangeListener(object : OnCalendarPageChangeListener {
              override fun onChange() {
                  val month = binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH) + 1
                  val year = binding?.clCalendar?.currentPageDate!!.get(Calendar.YEAR)
                  montYear(month, year)
                  Log.e("DATAEE", month.toString())
              }
          })
          binding?.clCalendar?.setOnForwardPageChangeListener(object :
              OnCalendarPageChangeListener {
              override fun onChange() {
                  val month = binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH) + 1
                  val year = binding?.clCalendar?.currentPageDate!!.get(Calendar.YEAR)
                  montYear(month, year)
                  Log.e("DATAEE", month.toString())
              }
          })
      }

    private fun montYear(month: Int, year: Int) {
        viewModel.month.set(month)
        viewModel.year.set(year)
        viewModel.click.set(true)
        viewModel.getCalanderDataMonthWise(month, year)
        Log.e("$month == ", year.toString())
    }

}


