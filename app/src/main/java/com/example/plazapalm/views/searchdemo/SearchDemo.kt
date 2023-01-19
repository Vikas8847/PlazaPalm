package com.example.plazapalm.views.searchdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FragmentSearchDemoBinding


class SearchDemo : Fragment() {


    var binding:FragmentSearchDemoBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSearchDemoBinding.inflate(layoutInflater)
        return binding?.root
    }

}