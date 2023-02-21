package com.example.plazapalm.views.termsuse

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.TermsUseFragmentBinding
import com.example.plazapalm.utils.hideProgress
import com.example.plazapalm.utils.showProgress
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TermsUseFragment : Fragment(R.layout.terms_use_fragment) {


    private var binding: TermsUseFragmentBinding? = null
    private val viewModel: TermsUseVM by viewModels()
    private val termsUrl = "https://app.termly.io/document/terms-of-use-for-saas/6cf1fdb5-5dca-4fa6-bd48-01e9e5dfd02f"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = TermsUseFragmentBinding.inflate(inflater, container, false)
        opewebView()
        return binding?.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun opewebView() {
        requireActivity().showProgress()
        binding!!.webview.settings.setJavaScriptEnabled(true)
        binding!!.webview.loadUrl(termsUrl)
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

}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm=viewModel
    }

}