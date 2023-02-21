package com.example.plazapalm.views.privacypolicy

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.PrivacyPolicyFragmentBinding
import com.example.plazapalm.utils.hideProgress
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrivacyPolicyFragment : Fragment(R.layout.privacy_policy_fragment) {

    private var binding: PrivacyPolicyFragmentBinding? = null
    private val viewModel: PrivacyPolicyVM by viewModels()
    private val privacyUrl = "http://3.134.214.217:3000/auth/privacyPolicy"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = PrivacyPolicyFragmentBinding.inflate(inflater, container, false)
        opewebView()
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.vm = viewModel

    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun opewebView() {
        binding!!.webview.settings.setJavaScriptEnabled(true)

        binding!!.webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                hideProgress()
            }
        }
        binding!!.webview.loadUrl("https://app.termly.io/document/privacy-policy/60b97e6b-1d14-45f8-b136-372f27b9304e")

    }
}