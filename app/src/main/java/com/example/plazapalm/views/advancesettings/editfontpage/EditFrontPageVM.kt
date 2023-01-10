package com.example.plazapalm.views.advancesettings.editfontpage

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FontsListFragmentBinding
import com.example.plazapalm.models.FontsListModelResponse
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.navigateWithId
import com.google.android.material.bottomsheet.BottomSheetDialog
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EditFrontPageVM @Inject constructor() : ViewModel() {
    var fontsNameList = ArrayList<FontsListModelResponse>()
    val fontListAdapter by lazy { RecyclerAdapter<FontsListModelResponse>(R.layout.fonts_list_item) }
    init
    {
        setAdapter()
    }

    fun onClicks(view: View){
        when (view.id) {
            R.id.ivAdvanceEditFrontPage ->{
                view.findNavController().navigateUp()
            }
            R.id.btnEditFrontPageView -> {
                view.navigateWithId(R.id.favDetailsFragment)
            }
            R.id.tvAdvanceEditFrontPageFontValue -> {
                showBottomSheetDialogOne()
            }
        }
    }
    var fontBottomSheet: BottomSheetDialog? = null

    @SuppressLint("NotifyDataSetChanged")
    private fun showBottomSheetDialogOne() {
        fontBottomSheet = BottomSheetDialog(MainActivity.context.get()!!, R.style.CustomBottomSheetDialogTheme)
        val scheduleBinding = FontsListFragmentBinding.inflate(LayoutInflater.from(MainActivity.context.get()!!))
        scheduleBinding.model = this
        fontBottomSheet?.setCancelable(true)

        scheduleBinding.apply {
            rvChooseFonts.layoutManager=LinearLayoutManager(MainActivity.context.get()!!)
            rvChooseFonts.adapter=fontListAdapter
            tvChooseFontCancel.setOnClickListener {
                fontBottomSheet?.dismiss()
            }
        }

        fontBottomSheet?.setContentView(scheduleBinding.root)
        fontBottomSheet?.show()

    }
    private fun setAdapter(){
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontsNameList.add(FontsListModelResponse("Android"))
        fontListAdapter.addItems(fontsNameList)
        fontListAdapter.notifyDataSetChanged()
    }
}