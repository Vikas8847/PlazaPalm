package com.example.plazapalm.views.confirmbookthankyou

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ConfirmBookingFragmentBinding
import com.example.plazapalm.models.GetDataForBookingResponse
import com.example.plazapalm.models.Joined
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.RequireDataBookAdapter
import com.example.plazapalm.utils.scrollContentInEditText
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class ConfirmBookingFragment : Fragment(R.layout.confirm_booking_fragment) {
    private var binding: ConfirmBookingFragmentBinding? = null
    private val viewModel: ConfirmBookingVM by viewModels()

    lateinit var adapter: RequireDataBookAdapter

    @Inject
    lateinit var preferenceFile: PreferenceFile

    @Inject
    lateinit var repository: Repository

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
                    viewModel.postProfileId.set(arguments?.getString("p_id")!!)
                    viewModel.categoryName.set(arguments?.getString("categeory_name")!!)

                    // new code


                    binding!!.reqireRv.visibility = View.GONE

                    Log.e("SDjklfhljksdS" , arguments?.getString("p_id")!!.toString())
                }

                /** comming From Add to Booking screen */
                arguments?.getString("bookClick") != null -> {

                    binding!!.reqireRv.visibility = View.VISIBLE

                    binding?.ivBookingDetailsChat?.visibility = View.VISIBLE
                    viewModel.user_image.set(arguments?.getString("proImageg")!!)
                    viewModel.userIdForChat.set(arguments?.getString("user_Id")!!)
                    viewModel.user_Name.set(arguments?.getString("userName")!!)
                    viewModel.commingFrom.set(arguments?.getString("bookClick")!!)
                    viewModel.user_location.set(arguments?.getString("userLocation"))
                    viewModel.p_id.set(arguments?.getString("p_id")!!)
                    viewModel.addtoCalendar.set("Book")
                    viewModel.user_miles.set(arguments?.getString("miles")!!)
                    viewModel.categoryName.set(arguments?.getString("categeory_name")!!)

                    getrequiredDataForBookProfileForm()

                    Log.e(
                        "FROMBOOK", viewModel.user_Name.get().toString() + " ------" +
                                "- " + viewModel.user_location.get()
                            .toString() + " --- " + viewModel.user_image + "  CVCVC   " + viewModel.p_id.toString()
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



    private fun getrequiredDataForBookProfileForm() {

        Log.e(
            "LOCTIOMN", preferenceFile.retrieveKey("token").toString() + "  - - " +
                    "" + preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble()
                .toString() + "  -- " +
                    preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LONG)
                        .toDouble() + " -- " +
                    viewModel.p_id.get().toString()
        )

        repository.makeCall(
            apiKey = ApiEnums.requiredDataForBookProfileForm,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetDataForBookingResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetDataForBookingResponse> {
                    return retrofitApi.requiredDataForBookProfileForm(
                        preferenceFile.retrieveKey("token").toString(),
                        viewModel.p_id.get().toString(),
                        preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble(),
                        preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetDataForBookingResponse>) {
                    Log.e("khemsingh ", res.body()!!.data.toString())
//                    viewModel.postProfileId.set(res.body()!!.data[])
                    if (res.isSuccessful && res.code() == 200) {
                        if (res.body()!!.data != null) {

                            var dataList = ArrayList<Joined>()

                            for (idx in 0 until res.body()!!.data.size) {

                                for (i in 0 until res.body()!!.data[idx].joined.size) {
                                    dataList.add(
                                        Joined(
                                            res.body()!!.data[idx].joined[i]._id,
                                            res.body()!!.data[idx].joined[i].question_text
                                        )
                                    )
                                    Log.e("kbnnmn",  res.body()!!.data[idx].joined[i].question_text + "3")

                                }

                                Log.e("mnbmm", dataList.toString() + "3")

                            }

//                            requireDataBookAdapter.addItems(dataList)
//                            requireDataBookAdapter.notifyDataSetChanged()

                            setAdapter(dataList)

                        } else {
                            Log.e("SDASDASWQ123", res.body()!!.data.toString() + "2")
                        }

                    } else {
                        Log.e("SDASDASWQ123", res.body()!!.data.toString() + "1")
                    }
                }

            }
        )


    }
    private fun setAdapter(dataList: ArrayList<Joined>) {

        Log.e("SDZZ",dataList.toString())
        binding!!.reqireRv.layoutManager = LinearLayoutManager(requireActivity())
        adapter = RequireDataBookAdapter(requireActivity(), dataList, 1)
        viewModel.adapter=adapter
        binding!!.reqireRv.adapter = adapter

    }
}