package com.example.plazapalm.views.filter

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
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
    private var pref: PreferenceFile,
) : ViewModel() {
    var miles = ObservableField("")
    var location = ObservableField("")
    var long = ObservableField("")
    var lat = ObservableField("")

    var swipeEnable = ObservableBoolean()
    var filterDataList = ArrayList<SelectedDataModelList>()
    var newfilterList = ObservableField(ArrayList<String>())
    var categoryVisibilty=ObservableBoolean(false)
    val filterAdapter by lazy { RecyclerAdapter<SelectedDataModelList>(R.layout.filter_catergories_item) }

    init {

        /* if (pref.retrieveLocation()!=null){
             location.set(pref.retrieveLocation())
             Log.e("SSSSSWWWQQQ0", location.get().toString())
         }*/

//        filterAdapter.addItems(filterDataList)
//        filterAdapter.notifyDataSetChanged()

        Log.e("SSSSSWWWQQQ0", filterDataList.toString())

    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFilterBackButton -> {
                view.findNavController().navigateUp()
            }

            R.id.tvFilterAddCategories -> {
                val bundle = Bundle()
                bundle.putString("comingFrom", "isFilter")

                var dataList = filterAdapter.getAllItems()
                var senderList = ArrayList<String>()
                senderList.clear()
                for (idx in 0 until dataList.size) {
                    senderList.add(dataList[idx].cateName.toString())
                }
                bundle.putSerializable("SelecatedCategory", senderList)
                if (pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble() != 0.0) {
                    Log.e("gsgswgswg==", pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toString())
                    bundle.putString("lat_value",
                        pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toString())
                    bundle.putString("lng_value",
                        pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toString())

                    bundle.putString("location_value", pref.retrieveFilterLocation())
                } else {
                    Log.e("gsgswgswg==", "ffff")
                    bundle.putString("lat_value", "0.0")
                    bundle.putString("lng_value", "0.0")
                    bundle.putString("location_value", "")
                }

                view.navigateWithId(R.id.action_filterFragment_to_categoriesListFragment, bundle)
            }
            R.id.tvFilterLocationDescription -> {
                var bundle = Bundle()
                bundle.putString("PostProfile", "filter_screen")

                if (location.get().toString() != null && !(location.get().toString()
                        .equals("null"))
                ) {
                    bundle.putString("location_txt", location.get().toString())
                } else {
                    bundle.putString("location_txt", "")
                }
                view.navigateWithId(R.id.addCitiesFragment, bundle)
            }

            R.id.btnReportSubmit -> {

                val bundle = Bundle()
                bundle.putString("comingFromIsfilter", "isFilter")
                var selCateList = ArrayList<SelCategory>()
                selCateList.clear()

                var catIdList = ArrayList<String>()
                catIdList.clear()
                for (idx in 0 until filterAdapter.getAllItems().size) {
                    catIdList.add(filterAdapter.getAllItems()[idx].cate_ID.toString())
                    selCateList.add(SelCategory(filterAdapter.getAllItems()[idx].cateName,
                        filterAdapter.getAllItems()[idx].cate_ID,
                        filterAdapter.getAllItems()[idx].adapterPos,
                        filterAdapter.getAllItems()[idx].istrue,
                        filterAdapter.getAllItems()[idx].count))
                }

                var gsonValue = Gson().toJson(selCateList)
                pref.storeFilterResponse(gsonValue)

                val SelectedidList = Gson().toJson(catIdList)
                pref.saveCateIdList(SelectedidList)

                view.navigateWithId(R.id.dashBoardFragment, bundle)
                Log.e("Sender_List_Data===", filterAdapter.getAllItems().toString())
                Log.e("afj;asdioas===", selCateList.toString())
            }
        }
    }
}