package com.example.plazapalm.views.confirmbookthankyou

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ConfirmBookingFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.scrollContentInEditText
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConfirmBookingFragment : Fragment(R.layout.confirm_booking_fragment) {
    private var binding: ConfirmBookingFragmentBinding? = null
    private val viewModel: ConfirmBookingVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ConfirmBookingFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(false)
        getBundleData()
        click()
        return binding?.root

    }

    private fun click() {
        binding
    }

    private fun getBundleData() {
        if (arguments != null) {
            when {
                /** comming From Add to Calendar popup */

                arguments?.getString("ispopUpAddCal") != null && arguments?.containsKey("ispopUpAddCal")!! -> {
                    binding?.ivBookingDetailsChat?.visibility = View.GONE
                    viewModel.commingFrom.set(arguments?.getString("ispopUpAddCal")!!)
                    viewModel.user_Name.set(arguments?.getString("user_name")!!)
                    viewModel.user_location.set(arguments?.getString("user_location").toString())
                    viewModel.user_image.set(arguments?.getString("pro_imageg")!!)
                    viewModel.title.set("Add to Calendar")
                    viewModel.addtoCalendar.set("Add to Calendar")
                    viewModel.user_miles.set(arguments?.getString("miles")!!)
                    viewModel.p_id.set(arguments?.getString("p_id")!!)

                }



                    /** comming From Add to Booking screen */
                arguments?.getString("bookClick") != null -> {

                    binding?.ivBookingDetailsChat?.visibility = View.VISIBLE
                    viewModel.user_image.set(arguments?.getString("proImageg")!!)
                    viewModel.userIdForChat.set(arguments?.getString("user_Id")!!)
                    viewModel.user_Name.set(arguments?.getString("userName")!!)
                    viewModel.commingFrom.set(arguments?.getString("bookClick")!!)
                    viewModel.user_location.set(arguments?.getString("userLocation"))
                    viewModel.p_id.set(arguments?.getString("p_id")!!)
                    viewModel.addtoCalendar.set("Book")
                    viewModel.user_miles.set(arguments?.getString("miles")!!)


                    Log.e(
                        "FROMBOOK", viewModel.user_Name.get().toString() + " ------" +
                                "- " + viewModel.user_location.get()
                            .toString() + " --- " + viewModel.user_image
                    )
                }

                /*  */
                /** comming From Add to Calendar popup *//*

                arguments?.getString("calendarScreen") != null -> {
                    Log.e(
                        "FROMBOOK", "WORKINGG++++DONE"
                    )
                }*/

            }

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel

        scrollContentInEditText(binding?.etConfirmBookDescription!!)
    }

}