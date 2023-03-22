package com.example.plazapalm.views.myprofile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.MyProifleFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.pref.business_profile_status
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyProfileFragment : Fragment(R.layout.my_proifle_fragment) {
    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile
    private var binding: MyProifleFragmentBinding? = null
    private val viewModel: MyProfileVM by viewModels()
    var username = ObservableField("")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = MyProifleFragmentBinding.inflate(inflater, container, false)
        viewModel.getProfile()
        viewModel.myProfileData()
        getstatus()
        getBusinessStatus()
        premiumAccount()
        CommonMethods.statusBar(false)

        Log.e("ekmfkemfefefefefe=e==", pref.retrieveKey("token").toString())


        return binding?.root

    }


    private fun getBusinessStatus() {
        if (pref.retrieveBoolKey(business_profile_status)!!.equals(true)) {

            binding?.tvUpgrade?.visibility = View.VISIBLE
            binding?.viewUpgrade?.visibility = View.VISIBLE

            binding?.tvViewMyProfile?.visibility = View.VISIBLE
            binding?.viewProfile?.visibility = View.VISIBLE

        } else {

            binding?.tvAdvanceSetting?.visibility = View.GONE
            binding?.viewAdvanceSettings?.visibility = View.GONE

            binding?.tvQRCode?.visibility = View.GONE
            binding?.viewQRCode?.visibility = View.GONE

            binding?.tvViewMyProfile?.visibility = View.GONE
            binding?.viewProfile?.visibility = View.GONE

            binding?.tvUpgrade?.visibility = View.GONE
            binding?.viewUpgrade?.visibility = View.GONE

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClicks()
        premiumAccount()
        viewModel.myProfileData()
        binding?.vm = viewModel

    }

    private fun getstatus() {
        Log.e("SDSDSDSDSDS", pref.retrieveBoolKey(Constants.POSTSTATUS).toString())
        if (pref.retrieveBoolKey(Constants.POSTSTATUS)!!.equals(true)) {
            viewModel.status.set("View Profile")
            viewModel.changestatus.set(true)
            Log.e("TRUE", pref.retrieveBoolKey(Constants.POSTSTATUS).toString())

        } else {
            viewModel.status.set("Post a Profile")
            viewModel.changestatus.set(false)
            Log.e("FALSE", pref.retrieveBoolKey(Constants.POSTSTATUS).toString())

        }
    }

    /*click functionality..*/
    private fun onClicks() {
        binding?.ivMyProfileScanner?.setOnClickListener {
            view?.navigateWithId(R.id.qrCodeScannerFragment)
        }
    }

    private fun premiumAccount() {

        if (pref.retrviepurchaseUserId() != "") {

            binding?.tvAdvanceSetting?.visibility = View.VISIBLE
            binding?.viewAdvanceSettings?.visibility = View.VISIBLE

            binding?.tvQRCode?.visibility = View.VISIBLE
            binding?.viewQRCode?.visibility = View.VISIBLE

            binding?.tvViewMyProfile?.visibility = View.VISIBLE
            binding?.viewProfile?.visibility = View.VISIBLE

            binding?.tvUpgrade?.visibility = View.GONE
            binding?.viewUpgrade?.visibility = View.GONE

        }

    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity?)!!.setTabMethod(4)
        getstatus()
    }
}