package com.example.plazapalm.views.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.LoginFragmentBinding
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.login_fragment) {
    private var binding: LoginFragmentBinding? = null
    private val viewModel: LoginVM by viewModels()
    @Inject
    lateinit var pref:PreferenceFile

    lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LoginFragmentBinding.inflate(layoutInflater)
        FirebaseApp.initializeApp(requireActivity())
        FirebaseMessaging.getInstance().token.addOnCompleteListener { task: Task<String> ->

            if (!task.isSuccessful) {
                return@addOnCompleteListener
            }

            viewModel.sendFirebaseLoginToken.set(task.result)
            pref.saveFirebaseToken(task.result)

            Log.i("PUSH_TOKEN", "pushToken: "+ viewModel.sendFirebaseLoginToken.get())

        }

        return binding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = Firebase.auth
        viewModel.anonymousUser()
        binding?.vm = viewModel
    }
    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(false)
    }
    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        /** Change UI **/
//        updateUI(currentUser)
    }
}