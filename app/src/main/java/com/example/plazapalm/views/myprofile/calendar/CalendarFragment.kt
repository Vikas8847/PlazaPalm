package com.example.plazapalm.views.myprofile.calendar

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.applandeo.materialcalendarview.listeners.OnCalendarPageChangeListener
import com.example.plazapalm.R
import com.example.plazapalm.databinding.CalendarFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


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
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //calendarClick()
        getBundleData()
        calendarClick()

        binding?.vm = viewModel
    }

    private fun getBundleData() {
        if (arguments != null) {
            when (arguments?.getString("comingFromm")) {
                "Calendar" -> {
                    viewModel.p_Id.set(arguments?.get("p_id").toString())

                    val currentDate =
                        SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date())

                    val split = currentDate?.split("-")

                    val day = split?.get(0)
                    val month = split?.get(1)
                    val year = split?.get(2)

                    viewModel.getCalanderDataMonthWise(month!!.toInt(), year!!.toInt())

                    Log.e("ASAW", currentDate)
                }

            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("ResourceType")
    private fun calendarClick() {

//        val calendar = Calendar.getInstance()
//        calendar[2023, 0] = 5
//
//        binding?.clCalendar?.setDate(calendar)


        var calendars =Calendar.getInstance()
        calendars.set(2023, 0, 5)

        var calendars2 =Calendar.getInstance()
        calendars2.set(2023, 0, 8)

        var calendars3 =Calendar.getInstance()
        calendars3.set(2023, 0, 7)

        var calendars4 =Calendar.getInstance()
        calendars4.set(2023, 0, 12)

        var calendarList=ArrayList<Calendar>()
        calendarList.add(calendars)
        calendarList.add(calendars2)
        calendarList.add(calendars3)
        calendarList.add(calendars4)

        binding?.clCalendar?.setHighlightedDays(calendarList)
        binding?.clCalendar?.selectedDates=calendarList
        viewModel.SeletedDate.observe(requireActivity()) {
            Log.e("SDSDQQWq", it.toString())
        }
        binding?.clCalendar?.isEnabled=false
        binding?.clCalendar?.setOnPreviousPageChangeListener(object : OnCalendarPageChangeListener {
            override fun onChange() {

                montYear(
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH) + 1,
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.YEAR)
                )

                Log.e(
                    "Calendar_Dateee====",
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH)
                        .toString() + 1.toString() + "FF-- " + binding?.clCalendar?.currentPageDate!!.get(
                        Calendar.YEAR
                    ).toString()
                )

            }

        })

        binding?.clCalendar?.setOnForwardPageChangeListener(object : OnCalendarPageChangeListener {
            override fun onChange() {
                montYear(
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH) + 1,
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.YEAR)
                )

                Log.e(
                    "Calendar_Dateee====",
                    binding?.clCalendar?.currentPageDate!!.get(Calendar.MONTH)
                        .toString() + 1.toString() + "FF-- " + binding?.clCalendar?.currentPageDate!!.get(
                        Calendar.YEAR
                    ).toString()
                )

            }

        })
        binding?.clCalendar?.setSelectionBetweenMonthsEnabled(false)

    }

    private fun montYear(month: Int, year: Int) {

        viewModel.month.set(month)
        viewModel.year.set(year)
        viewModel.click.set(true)
        viewModel.getCalanderDataMonthWise(month, year)

    }

}


