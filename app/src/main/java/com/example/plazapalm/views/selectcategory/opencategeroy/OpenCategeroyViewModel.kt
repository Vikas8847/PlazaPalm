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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
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

    private var clickItem1: clickItem? = null

    @SuppressLint("StaticFieldLeak")
    private var requireActivity1: FragmentActivity? = null

    @SuppressLint("StaticFieldLeak")
    private var rvCategoryLocation1: RecyclerView? = null
    private var categoryList: ArrayList<CategoriesData>? = null
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
    var noData = ObservableBoolean(false)

    init {
        /** get Token from Data store*/
        token.set(pref.retrieveKey("token"))

    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.clSearchLocation -> {
                val bundle = Bundle()
                bundle.putString("CommingFrom", "OpenCategery")
                bundle.putString("location_txt", address.get().toString())
                view.navigateWithId(R.id.action_openCategeroyFragment_to_addCitiesFragment)

            }
            R.id.clMainCategory -> {
                //For Hide Keyboard
                CommonMethods.context.hideKeyboard()
            }
        }

    }


    @SuppressLint("NotifyDataSetChanged")
    private fun showCategories(
        data: ArrayList<CategoriesData>,
        rvCategoryLocation: RecyclerView,
        requireActivity: FragmentActivity,
        clickItem: clickItem,typeData:Int
    ) {
        rvCategoryLocation?.layoutManager = LinearLayoutManager(requireActivity)
      //  if (selectCateAdapter == null) {
            selectCateAdapter = SelectCateAdapter(requireActivity, data, clickItem, "OpenCategeroy")
            rvCategoryLocation?.adapter = selectCateAdapter
            rvCategoryLocation?.adapter?.notifyDataSetChanged()
      /*  } else {

      .
            selectCateAdapter!!.addNewDataList(data)
            selectCateAdapter!!.notifyDataSetChanged()
        }*/
     /*   if(typeData==1) {
            categoryList!!.clear()
            categoryList = selectCateAdapter!!.getNewList()
            Log.e("gfskegsgs===",categoryList!!.size.toString())
        }*/
        if (selectCateAdapter!!.categortList != null) {
            if (selectCateAdapter!!.categortList.size == 0) {
                Log.e("SAAasds", "WORGKL")
                noData.set(true)
            } else {
                noData.set(false)

            }
        }

    }

/*
    fun onTextChange(editable: Editable) {
        if (editable.toString().length > 0) {
            Handler().postDelayed({

                getSearchData(editable.toString(), false)


//                getCategoriesApi(editable.toString(), false)
//                getCategoriesApi( null,"" ,"" , false, null , 1,editable.toString())


            }, 1000)
        } else {
            Handler().postDelayed({

                getSearchData("", false)


//                getCategoriesApi( null, null , null,false,null,1,"")
//                getCategoriesApi("", false)
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }
*/


/*
    private fun getSearchData(searchtext: String, loader: Boolean) = viewModelScope.launch {


        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        body.put("offset", page)
        body.put("limit", 10)
        body.put("search=", searchtext)

//        body.put("search=", searchText)

        Log.e(
            "dsadas",
            latitude.get().toDouble().toString() + "  <<--DFDF-->>  " + longitude.get().toString()
                .toString() + name.get() + "XXXX"
        )

        Log.e("cateRseeee===", body.toString())
        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = loader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                        Lat = latitude.get()!!.toDouble(),
                        Long = longitude.get()!!.toDouble(),
                        OffSet = 1,
                        Limit = 1000,
                        Search = searchtext
                        //Search = searchText.get().toString()
                    )
                }

                override fun onResponse(res: Response<CategoriesResponseModel>) {
                    Log.e("SSSSS", res.body().toString())

                    if (res.isSuccessful && res.body() != null) {
//                        refreshContainer.isRefreshing = false
                        if (res.body()!!.status == 200) {
                            categoryList = res.body()?.data!!

                            */
/*  showCategories(
                                  res.body()?.data!!,
                                  rvCategoryLocation,
                                  requireActivity,
                                  clickItem
                              )*//*


                            var tempSearchList = ArrayList<CategoriesData>()
                            tempSearchList.clear()

                            for (idx in 0 until categoryList!!.size) {
                                if (categoryList!![idx].category_name.toLowerCase()
                                        .contains(searchText.get().toString().toLowerCase())
                                ) {
                                    tempSearchList.add(categoryList!![idx])
                                }
                            }

                            showCategories(
                                tempSearchList!!,
                                rvCategoryLocation1!!,
                                requireActivity1!!,
                                this@OpenCategeroyViewModel.clickItem1!!
                            )


                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())

                    }
                }
            })
    }
*/



    fun onTextChange(editable: Editable) {

        var tempSearchList = ArrayList<CategoriesData>()
        tempSearchList.clear()

        if (editable.toString().length > 0) {

                Log.e("sfszfzffsdff333=",categoryList!!.size.toString())
                // getProfileByCategory(editable.toString(), false, "")
                for (idx in 0 until categoryList!!.size) {
                    Log.e("sfszfzffsdff111=",categoryList!![idx].category_name.toLowerCase())
                    Log.e("sfszfzffsdff222=",editable.toString().toLowerCase())
                    if (categoryList!![idx].category_name.toLowerCase().contains(editable.toString().toLowerCase())
                    ) {
                        tempSearchList.add(categoryList!![idx])
                    }
                }

                showCategories(
                    tempSearchList!!,
                    rvCategoryLocation1!!,
                    requireActivity1!!,
                    clickItem1!!,0
                )


        } else {
            Handler().postDelayed({
                showCategories(
                    categoryList!!,
                    rvCategoryLocation1!!,
                    requireActivity1!!,
                    clickItem1!!,0
                )
                //  getProfileByCategory("", false, "")
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }


//     val myScrollListener = object : RecyclerView.OnScrollListener() {
//        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
//            super.onScrollStateChanged(recyclerView, newState)
//            // Handle the scroll state changed event
//        }
//
//        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//            super.onScrolled(recyclerView, dx, dy)
//            if (dy > 0) { // Scrolling down
//
//                val layoutManager = LinearLayoutManager(CommonMethods.context)
//
//                val visibleItemCount = layoutManager.childCount
//                val totalItemCount = layoutManager.itemCount
//                val pastVisibleItems = layoutManager.findFirstVisibleItemPosition()
//                if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
//                    // Reached the end of the list, load more data
//                    currentPage++
//                    fetchData(currentPage)
//                }
//            }
//        }
//    }
//
//    private fun fetchData(page: Int) {
//        val newDataList = myViewModel.fetchData(page)
//        dataList.addAll(newDataList)
//        adapter.notifyDataSetChanged()
//    }


    fun getCategoriesApi(
        rvCategoryLocation: RecyclerView,
        requireActivity: FragmentActivity,
        refreshContainer: SwipeRefreshLayout,
        loader: Boolean,
        clickItem: clickItem,
        page: Int,
        searchtext: String

    ) = viewModelScope.launch {

        rvCategoryLocation1 = rvCategoryLocation
        requireActivity1 = requireActivity

        this@OpenCategeroyViewModel.clickItem1 = clickItem
        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        // body.put("lat", "30.8987")
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        // body.put("long", "76.7179")
        body.put("offset", page)
        body.put("limit", 10)
        //body.put("search=", searchText.get())
        body.put("search=", "")

        Log.e(
            "dsadas",
            latitude.get().toDouble().toString() + "  <<--DFDF-->>  " + longitude.get().toString()
                .toString() + name.get() + "XXXX"
        )

        Log.e("cateRseeee===", body.toString())
        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = loader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                        Lat = latitude.get()!!.toDouble(),
                        Long = longitude.get()!!.toDouble(),
                        OffSet = page,
                        Limit = 1000,
                        Search = ""
                        //Search = searchText.get().toString()
                    )
                }

                override fun onResponse(res: Response<CategoriesResponseModel>) {
                    Log.e("SSSSS", res.body().toString())

                    if (res.isSuccessful && res.body() != null) {
                        refreshContainer.isRefreshing = false
                        if (res.body()!!.status == 200) {
                            categoryList = res.body()?.data!!

                            /*  showCategories(
                                  res.body()?.data!!,
                                  rvCategoryLocation,
                                  requireActivity,
                                  clickItem
                              )*/

                            var tempSearchList = ArrayList<CategoriesData>()
                            tempSearchList.clear()

                            for (idx in 0 until categoryList!!.size) {
                                if (categoryList!![idx].category_name.toLowerCase()
                                        .contains(searchText.get().toString().toLowerCase())
                                ) {
                                    tempSearchList.add(categoryList!![idx])
                                }
                            }

                            showCategories(
                                tempSearchList!!,
                                rvCategoryLocation1!!,
                                requireActivity1!!,
                                this@OpenCategeroyViewModel.clickItem1!!,1
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
}