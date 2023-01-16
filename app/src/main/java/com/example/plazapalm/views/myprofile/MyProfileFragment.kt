package com.example.plazapalm.views.myprofile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.MyProifleFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.LoginDataModel
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
    var postStatus = ObservableBoolean()

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
        return binding?.root

    }

    private fun getBusinessStatus() {
        if (pref.retrieveBoolKey(business_profile_status) != null) {
            val businessStatus = pref.retrieveBoolKey(business_profile_status)

            if (businessStatus!!.equals(true)) {

                binding?.tvUpgrade?.visibility = View.VISIBLE
                binding?.viewUpgrade?.visibility = View.VISIBLE

                binding?.tvViewMyProfile?.visibility = View.VISIBLE
                binding?.viewProfile?.visibility = View.VISIBLE

            }

            Log.e("QAAQAAA", businessStatus.toString())

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

        dataStoreUtil.readObject(LOGIN_DATA, LoginDataModel::class.java) {

//            binding?.tvMyProfileName?.text = it?.data?.first_name + " " + it?.data?.last_name
//            username.set(it?.data?.user_name)
            var user_id = it?.data?.user_id.toString()

            Log.e("SDSFSDf", it?.data?.user_name + "DFDFDDg   " + user_id.toString())

            /*** Get  premium */
            //        if (viewModel.premium == 1) {

            //63bd052fc4f44108db54e5eb

            if (user_id.equals("63b69f871545b79696c25166")) {
                binding?.tvAdvanceSetting?.visibility = View.VISIBLE
                binding?.viewAdvanceSettings?.visibility = View.VISIBLE

                binding?.tvQRCode?.visibility = View.VISIBLE
                binding?.viewQRCode?.visibility = View.VISIBLE

                binding?.tvViewMyProfile?.visibility = View.VISIBLE
                binding?.viewProfile?.visibility = View.VISIBLE

                binding?.tvUpgrade?.visibility = View.GONE
                binding?.viewUpgrade?.visibility = View.GONE
            } else {

                /* binding?.tvAdvanceSetting?.visibility = View.GONE
                 binding?.viewAdvanceSettings?.visibility = View.GONE

                 binding?.tvUpgrade?.visibility = View.VISIBLE
                 binding?.viewUpgrade?.visibility = View.VISIBLE*/

                Log.e("SAAHAEED", "WORKINGGGGGG")

            }

        }

    }

    override fun onResume() {
        super.onResume()
        getstatus()
    }
}