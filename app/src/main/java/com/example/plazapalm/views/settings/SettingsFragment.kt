package com.example.plazapalm.views.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.SettingsFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SettingsFragment : Fragment(R.layout.settings_fragment) {
    private var binding: SettingsFragmentBinding? = null
    private val viewModel: SettingsVM by viewModels()
    @Inject
    lateinit var dataStore: DataStoreUtil

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SettingsFragmentBinding.inflate(layoutInflater)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel

        dataStore.readObject(LOGIN_DATA, GetProfileResponseModel::class.java) {

            /** Sender Data */

            if (it != null) {
                viewModel.senderUserID.set(it?.data?.user_id.toString())
                Log.e("Login_User_ID===",it?.data?.user_id.toString())
            }
    }}

}