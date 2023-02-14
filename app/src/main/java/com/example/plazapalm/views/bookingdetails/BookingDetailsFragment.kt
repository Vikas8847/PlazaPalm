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
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.pref.preferenceName
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class BookingDetailsFragment : Fragment(R.layout.booking_details_fragment) {
    private var binding: BookingDetailsFragmentBinding? = null
    private val viewModel: BookingDetailsVM by viewModels()
    @Inject
    lateinit var pref :PreferenceFile
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
                    val postion = arguments?.get("position") as Int

                    val date = userdata.get(postion as Int).choose_date
                    val split = date?.split("T")
                    val before = split?.get(0).toString()

                    if (viewModel.userType.get().equals("customer")) {
                        viewModel.bookingStatus.set("Booking Status : " + userdata.get(postion as Int).booking_status)
//                        viewModel.getCustomerDetails()
                    } else  {
//                        viewModel.getCustomerDetails()
                        viewModel.bookingStatus.set("Category : " + userdata.get(postion).category_name)
                        Log.e("WWWSSSS", "WPRKINGG++++FINEE")
                    }

                    if (!(userdata.get(postion).booking_status.toString().isEmpty()) &&
                        userdata.get(postion).booking_status.toString().equals("pending")){
                        Log.e("DasQWK","Work1")
                        viewModel.btnText.set("Cancel Booking")
                        viewModel.bookingStatus.set("Booking Status : " + userdata.get(postion as Int).booking_status)

                    }else if(!(userdata.get(postion).booking_status.toString().isEmpty()) &&
                        userdata.get(postion).booking_status.toString().equals("reminderBooking")){
                        Log.e("DasQWK","Work2")
                        viewModel.btnText.set("Delete Reminder")
                        viewModel.bookingStatus.set("Category : " + userdata.get(postion as Int).category_name)
                    } else if(!(userdata.get(postion).booking_status.toString().isEmpty()) && userdata.get(postion).booking_status.toString().equals("cancelled")){
                        binding!!.btnBookingDetailsCancel.visibility =View.GONE
                        viewModel.bookingStatus.set("Booking Status : " + userdata.get(postion as Int).booking_status)

                    } else {
                        Log.e("DasQWK","Work3")
                        viewModel.bookingStatus.set("Category : " + "Shops")
                    }

                    if (userdata.get(postion).postProfile_picture==null || userdata.get(postion).postProfile_picture.isEmpty()){
                        Log.e("DasQWK","Work4")
                        viewModel.imageUrl.set("https://i.picsum.photos/id/65/200/300.jpg?hmac=o9HaDBPcrCPi8zfB6MoTe6MNNVPsEN4orpzsHhCPlbU")
                    }else{
                        Log.e("DasQWK","Work5")
                        viewModel.imageUrl.set(userdata.get(postion as Int).postProfile_picture[0].toString())
                    }

                    viewModel.userFName.set(userdata.get(postion).postProfile_first_name)
                    viewModel.userIdForChat.set(userdata.get(postion).post_profile_user_id)
                    viewModel.usercustomerId.set(userdata.get(postion).customer_id)
                    viewModel.userLName.set(userdata.get(postion as Int).postProfile_last_name)
                    viewModel.userPostProfileId.set(userdata.get(postion as Int).post_profile_id)
                    viewModel.userType.set(userdata.get(postion as Int).userType)
                    viewModel.date.set(before.toString())
                    viewModel.description.set(userdata.get(postion as Int).description)
                    viewModel.location.set(userdata.get(postion as Int).location_text)
                    viewModel.categaryName.set(userdata.get(postion as Int).category_name)
                    viewModel.time.set(userdata.get(postion).choose_time)
                    viewModel.booking_id.set(userdata.get(postion)._id)
                    viewModel.userFLName.set(viewModel.userFName.get() + " " + viewModel.userLName.get())

                    Log.e("LSDFWEMVCDX", userdata.toString())

                }
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view , savedInstanceState)
        binding?.vm = viewModel

    }


}