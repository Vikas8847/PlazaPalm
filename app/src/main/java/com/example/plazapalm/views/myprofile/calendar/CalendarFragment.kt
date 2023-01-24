package com.example.plazapalm.views.myprofile.calendar

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.applandeo.materialcalendarview.EventDay
import com.applandeo.materialcalendarview.listeners.OnCalendarPageChangeListener
import com.applandeo.materialcalendarview.listeners.OnDayClickListener
import com.example.plazapalm.R
import com.example.plazapalm.databinding.CalendarFragmentBinding
import com.example.plazapalm.utils.CommonMethods
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

    @SuppressLint("ResourceType")
    private fun calendarClick() {

        val calandar = Calendar.getInstance()
        var month = 1

        viewModel.SeletedDate.observe(requireActivity()){
            Log.e("SDSDQQWq" , it.toString())
        }



/*
        binding?.clCalendar?.setOnDayClickListener(object : OnDayClickListener {
            override fun onDayClick(eventDay: EventDay) {
                val clickedDayCalendar = eventDay.calendar

               */
              /*  val date = (dayofMonth.toString() + "-" + (month + 1) + "-" + year)

                val month = ((month + 1))
                val year = (year)

                viewModel.month.set(month)
                viewModel.year.set(year)

                binding?.tvCalendar?.text = date
                viewModel.click.set(true)
                viewModel.getCalanderDataMonthWise(month, year)*//*


                Log.e("DATAEE", clickedDayCalendar.toString())
                // binding?

            }

        })
*/

        binding?.clCalendar?.setOnPreviousPageChangeListener(object : OnCalendarPageChangeListener {
            override fun onChange() {
                month ++
                var year =2023
                viewModel.month.set(month)
                viewModel.year.set(year)

//                binding?.tvCalendar?.text = date
                viewModel.click.set(true)
                viewModel.getCalanderDataMonthWise(month, year)

                Log.e("DATAEE", month.toString())

            }


        })
        binding?.clCalendar?.setOnForwardPageChangeListener(object : OnCalendarPageChangeListener {
            override fun onChange() {
                 month--
                var year =2023
                viewModel.month.set(month)
                viewModel.year.set(year)

//                binding?.tvCalendar?.text = date
                viewModel.click.set(true)
                viewModel.getCalanderDataMonthWise(month , year)

                Log.e("DATAEE", month.toString())

            }


        })
        binding?.clCalendar?.setSelectionBetweenMonthsEnabled(true)

      /*  binding?.clCalendar?.setOnDateChangeListener {
                _, year, month, dayofMonth ->
            // In this Listener we are getting values
            // such as year, month and day of month
            // on below line we are creating a variable
            // in which we are adding all the variables in it.

            val date = (dayofMonth.toString() + "-" + (month + 1) + "-" + year)

            val month = ((month + 1))
            val year = (year)

            viewModel.month.set(month)
            viewModel.year.set(year)

            binding?.tvCalendar?.text = date
            viewModel.click.set(true)
            viewModel.getCalanderDataMonthWise(month, year)
            Log.e("DATAEE", date)

            // binding?.clCalendar?.dateTextAppearance = Color.RED

        }
        binding?.clCalendar */



        /* binding?.clCalendar?.setOnDayClickListener(object : OnDayClickListener {
             override fun onDayClick(eventDay: EventDay) {
                 val clickedDayCalendar = eventDay.calendar

                 val selectedDates: List<Calendar> = binding!!.clCalendar.selectedDates

                 val calendar = Calendar.getInstance()
                 calendar[2019, 7] = 5

                 binding?.clCalendar?.setDate(calendar)

                 Log.e("QQWAA", clickedDayCalendar.toString() + "CVCVCV" + selectedDates)

             }
         })

         binding?.clCalendar?.setOnForwardPageChangeListener(object : OnCalendarPageChangeListener {
             override fun onChange() {

                 Log.e("QQWAA", "ForwardPageChange")

             }
         })

         binding?.clCalendar?.setOnPreviousPageChangeListener(object  : OnCalendarPageChangeListener{
             override fun onChange() {
                 Log.e("QQWAA", "PreviousPageChange")
             }

         })*/
    }

    /*  @SuppressLint("ResourceType")
      private fun calendar(){
          binding?.clCalendar?.setHeaderColor(resources.getColor(R.color.app_bar_light))
          //binding.clCalendar.setPages="[color]"
      }*/

}


