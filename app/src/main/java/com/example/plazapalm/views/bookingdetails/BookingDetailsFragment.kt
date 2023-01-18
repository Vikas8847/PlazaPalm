package com.example.plazapalm.views.bookingdetails

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.BookingDetailsFragmentBinding
import com.example.plazapalm.models.CalenderData
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class BookingDetailsFragment : Fragment(R.layout.booking_details_fragment) {
    private var binding: BookingDetailsFragmentBinding? = null
    private val viewModel: BookingDetailsVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = BookingDetailsFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        getBundleData()
        return binding?.root

    }

    private fun getBundleData() {
        if (arguments != null) {
            when {
                /** comming From Calendar Screen */

                arguments?.getString("calendarScreen") != null -> {

                    val userdata: ArrayList<CalenderData> =
                        arguments?.getSerializable("userData") as ArrayList<CalenderData> /* = java.util.ArrayList<com.example.plazapalm.models.CalenderData> */
                    val postion = arguments?.get("position")


                    val date = userdata.get(postion as Int).choose_date

                    val split = date?.split("T")

                    val before = split?.get(0).toString()

                    viewModel.userFName.set(userdata.get(postion as Int).customer_first_name)
                    viewModel.usercustomerId.set(userdata.get(postion as Int).customer_id)
                    viewModel.userLName.set(userdata.get(postion as Int).customer_last_name)
                    viewModel.userPostProfileId.set(userdata.get(postion as Int).post_profile_id)
                    viewModel.userType.set(userdata.get(postion as Int).userType)
                    viewModel.date.set(before.toString())
                    viewModel.description.set(userdata.get(postion as Int).description)
                    viewModel.location.set(userdata.get(postion as Int).location_text)
                    viewModel.categaryName.set(userdata.get(postion as Int).category_name)

                    if (!(userdata.get(postion as Int ).booking_status.toString().isNullOrEmpty()) ||
                        userdata.get(postion as Int ).booking_status.toString().equals("pending")){
                        viewModel.bookingStatus.set("Booking Status : " + userdata.get(postion as Int).booking_status)

                    }else{
                        viewModel.bookingStatus.set("Category : " + userdata.get(postion as Int).category_name)
                    }

                    viewModel.time.set(userdata.get(postion as Int).choose_time)
                    viewModel.booking_id.set(userdata.get(postion as Int)._id)
                    viewModel.userFLName.set(viewModel.userFName.get() + " " + viewModel.userLName.get())

                    Log.e("AAAAAAA", userdata.get(postion as Int ).booking_status.toString())

                    if (viewModel.userType.get().equals("customer")) {
                        viewModel.getCustomerDetails()
                    } else if(viewModel.userType.get().equals("Provider")) {

                        Log.e("WWWSSSS", "WPRKINGG++++FINEE")
                    }
                }
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
    }


}