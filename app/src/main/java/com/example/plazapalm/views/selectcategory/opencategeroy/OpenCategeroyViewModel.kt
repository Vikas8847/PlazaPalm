package com.example.plazapalm.views.selectcategory.opencategeroy

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.interfaces.clickItem
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.models.CategoriesResponseModel
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateWithId
import com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class OpenCategeroyViewModel @Inject constructor(
    var dataStoreUtil: DataStoreUtil,
    var cacheUtil: CacheUtil,
    var pref: PreferenceFile,
    var repository: Repository
    ) : ViewModel() {

    private var clickItem1: clickItem?=null
    private var requireActivity1: FragmentActivity?=null
    private var rvCategoryLocation1: RecyclerView?=null
    private var categoryList: List<CategoriesData>?=null
    var position: Int = -1
    var isChecked = ObservableBoolean(false)
    var token = ObservableField("")
    var page = ObservableField(1)
    var searchText = ObservableField("")
    var isClicked: Boolean = false
    var latitude = ObservableDouble()
    var longitude = ObservableDouble()
    var name = ObservableField("")
    var address = ObservableField("")
    var selectCateAdapter: SelectCateAdapter? = null

    init {
        /*get Token from Data store*/
        token.set(pref.retrieveKey("token"))

    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.clSearchLocation -> {
                val bundle = Bundle()
                bundle.putString("CommingFrom", "OpenCategery")
                bundle.putString("location_txt",address.get().toString())
                view.navigateWithId(R.id.action_openCategeroyFragment_to_addCitiesFragment)

            }
            R.id.clMainCategory->{
                //For Hide Keyboard
                CommonMethods.context.hideKeyboard()
            }}

    }

    fun getCategoriesApi(
        rvCategoryLocation: RecyclerView,
        requireActivity: FragmentActivity,
        clickItem: clickItem
    ) = viewModelScope.launch {
        rvCategoryLocation1=rvCategoryLocation
        requireActivity1=requireActivity
        clickItem1=clickItem
        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        // body.put("lat", "30.8987")
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        // body.put("long", "76.7179")
        body.put("offset", page.get()!!)
        body.put("limit", 100)
        //body.put("search=", searchText.get())
        body.put("search=","")

        Log.e(
            "dsadas",
            latitude.get().toDouble().toString() + "  <<--DFDF-->>  " + longitude.get().toString()
                .toString() + name.get() + "XXXX"
        )
        Log.e("cateogory_Responseeee===",body.toString())
        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                        Lat = latitude.get()!!.toDouble(),
                        Long = longitude.get()!!.toDouble(),
                        OffSet = page.get()!!,
                        Limit = 100,
                        Search =""
                        //Search = searchText.get().toString()
                    )
                }

                override fun onResponse(res: Response<CategoriesResponseModel>) {
                    Log.e("SSSSS", res.body().toString())

                    if (res.isSuccessful && res.body() != null) {
                        if (res.body()!!.status == 200) {
                            categoryList=res.body()?.data!!

                          /*  showCategories(
                                res.body()?.data!!,
                                rvCategoryLocation,
                                requireActivity,
                                clickItem
                            )*/

                            var tempSearchList=ArrayList<CategoriesData>()
                            tempSearchList.clear()

                            for(idx in 0 until categoryList!!.size)
                            {
                                if(categoryList!![idx].category_name.toLowerCase().contains(searchText.get().toString().toLowerCase()))
                                {
                                    tempSearchList.add(categoryList!![idx])
                                }
                            }
                            showCategories(
                                tempSearchList!!,
                                rvCategoryLocation1!!,
                                requireActivity1!!,
                                clickItem1!!
                            )

                        } else {
                            CommonMethods.showToast(requireActivity, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(requireActivity, res.message())

                    }
                }
            })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun showCategories(
        data: List<CategoriesData>,
        rvCategoryLocation: RecyclerView,
        requireActivity: FragmentActivity,
        clickItem: clickItem
    ) {
        rvCategoryLocation?.layoutManager = LinearLayoutManager(requireActivity)
        selectCateAdapter = SelectCateAdapter(requireActivity, data, clickItem, "OpenCategeroy")
        rvCategoryLocation?.adapter = selectCateAdapter
        rvCategoryLocation?.adapter?.notifyDataSetChanged()

    }

    fun onTextChange(editable: Editable) {

        var tempSearchList=ArrayList<CategoriesData>()
        tempSearchList.clear()

        if (editable.toString().length > 0) {
            Handler().postDelayed({
               // getProfileByCategory(editable.toString(), false, "")
                for(idx in 0 until categoryList!!.size)
                {
                    if(categoryList!![idx].category_name.toLowerCase().contains(editable.toString().toLowerCase()))
                        {
                            tempSearchList.add(categoryList!![idx])
                        }
                }
                showCategories(
                    tempSearchList!!,
                    rvCategoryLocation1!!,
                    requireActivity1!!,
                    clickItem1!!
                )

            }, 1000)
        } else {
            Handler().postDelayed({
                showCategories(
                    categoryList!!,
                    rvCategoryLocation1!!,
                    requireActivity1!!,
                    clickItem1!!
                )
              //  getProfileByCategory("", false, "")
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }
}