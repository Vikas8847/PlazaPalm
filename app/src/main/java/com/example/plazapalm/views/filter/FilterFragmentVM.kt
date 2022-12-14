package com.example.plazapalm.views.filter

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.SelCategory
import com.example.plazapalm.models.SelectedDataModelList
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateWithId
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class FilterFragmentVM @Inject constructor(
    private var dataStoreUtil: DataStoreUtil,
    private var pref: PreferenceFile
) : ViewModel() {
    var miles = ObservableField("")
    var location = ObservableField("Mohali PB")
    var long = ObservableField("")
    var lat = ObservableField("")

    var filterDataList = ArrayList<SelectedDataModelList>()
    var newfilterList =  ObservableField(ArrayList<String>())
    val filterAdapter by lazy { RecyclerAdapter<SelectedDataModelList>(R.layout.filter_catergories_item) }

    init {

        if (pref.retrieveLocation()!=null){
            location.set(pref.retrieveLocation())
            Log.e("SSSSSWWWQQQ0", pref.retrieveLocation().toString())
        }

//        filterAdapter.addItems(filterDataList)
//        filterAdapter.notifyDataSetChanged()

        Log.e("SSSSSWWWQQQ0", filterDataList.toString())
        Log.e("SSSSSWWWQQQ0", newfilterList.toString())

    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFilterBackButton -> {
                view.findNavController().navigateUp()
            }

            R.id.tvFilterAddCategories -> {
                val bundle = Bundle()
                bundle.putString("comingFrom", "isFilter")

                var dataList=filterAdapter.getAllItems()
                var senderList=ArrayList<String>()
                senderList.clear()
                for(idx in 0 until dataList.size)
                {
                    senderList.add(dataList[idx].cateName.toString())
                }
                Log.e("Sender_List_Data===",senderList.toString())
                bundle.putSerializable("SelecatedCategory", senderList)

                view.navigateWithId(R.id.action_filterFragment_to_categoriesListFragment, bundle)
            }
            R.id.tvFilterLocationDescription -> {
                view.navigateWithId(R.id.addCitiesFragment)
            }

            R.id.btnReportSubmit -> {

                val bundle = Bundle()
                bundle.putString("comingFromIsfilter", "isFilter")
//                bundle.putSerializable("SelecatedCategory", filterDataList)
                var selCateList = ArrayList<SelCategory>()
                selCateList.clear()

                for(idx in 0 until filterAdapter.getAllItems().size){
                    selCateList.add(SelCategory(filterAdapter.getAllItems()[idx].cateName,filterAdapter.getAllItems()[idx].cate_ID,
                        filterAdapter.getAllItems()[idx].adapterPos,filterAdapter.getAllItems()[idx].istrue , filterAdapter.getAllItems()[idx].count))
                }

                var gsonValue = Gson().toJson(selCateList)
                pref.storeFilterResponse(gsonValue)

//                dataStoreUtil.saveData(Constants.CategoryList, gsonValue)
                view.navigateWithId(R.id.dashBoardFragment, bundle)

                Log.e("Sender_List_Data===",filterAdapter.getAllItems().toString())
                Log.e("afj;asdioas===",selCateList.toString())

            }
        }
    }

}