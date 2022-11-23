package com.example.plazapalm.views.confirmbookthankyou

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ConfirmBookingFragmentBinding
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.utils.CommonMethods
import com.google.gson.Gson
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
        return binding?.root
    }

    private fun getBundleData() {
        if (arguments != null) {
            when {
                arguments?.getString("ispopUpAddCal") != null && arguments?.containsKey("ispopUpAddCal")!! -> {


                    viewModel.user_Name.set(arguments?.getString("user_name")!!)
                    viewModel.user_location.set(arguments?.getString("user_location").toString())
                    viewModel.user_image.set(arguments?.getString("pro_imageg")!!)

//                    viewModel.user_miles.set(arguments?.getFloat("pro_imageg")!!)

                }

                arguments?.getStringArrayList("filterCategoriesIds") != null -> {



                }

            }

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
    }

}