package com.example.plazapalm.views.advancesettings.pictures

import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShowPictureVideoVM @Inject constructor() : ViewModel() {

    var isClicked:ObservableBoolean= ObservableBoolean(false)
    var isPlayClicked:ObservableBoolean= ObservableBoolean(false)

    var mediaType=ObservableField(0)
    var mediaValue=ObservableField("")
    fun onClicks(view: View) {
        when (view.id) {
             R.id.tvClose->{
                 view.findNavController().navigateUp()
             }

            R.id.ivPlayBtn->{
                if (isClicked.get()){
                   // isClicked.set(false)
                    isClicked.set(true)
                }
                else
                {
                    isClicked.set(false)
                   // isClicked.set(true)
                }

             }
        }

    }
}