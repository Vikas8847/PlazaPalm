package com.example.plazapalm.views.catergorylist

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.models.CategoriesResponseModel
import com.example.plazapalm.models.SelectedDataModelList
import com.example.plazapalm.networkcalls.*
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class CategoriesListVM @Inject constructor(
    var dataStoreUtil: DataStoreUtil,
    var cacheUtil: CacheUtil,
    var pref: PreferenceFile,
    var repository: Repository,
) : ViewModel() {
    var categoriesDataList = ArrayList<CategoriesData>()
    var selectedList = ArrayList<String>()
    var checkBox: AppCompatCheckBox
    var searchItems = ObservableField("")
    var position: Int = -1
    var isChecked = ObservableBoolean(false)
    var token = ObservableField("")
    var page = ObservableField(1)
    var isClicked: Boolean = false
    var latitude = ObservableDouble()
    var longitude = ObservableDouble()
    var address = ObservableField("")
    var selectedCategory = ""
    var currentLatitude = ObservableDouble()
    var currentLongitude = ObservableDouble()
    val adapterCategories by lazy { RecyclerAdapter<CategoriesData>(R.layout.categories_list_items) }


    init {
        /*get Token from Data store*/
        token.set(pref.retrieveKey("token"))
        checkBox = AppCompatCheckBox(CommonMethods.context)

        if (pref.retrieveLocation() != null) {
            address.set(pref.retrieveLocation())
        }

/*
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
        }*/

    }

    /** Search items */
    fun onTextChange(editable: Editable) {
        if (editable.toString().length > 0) {
            Handler().postDelayed({
                getCategoriesApi(editable.toString(), false)
            }, 1000)
        } else {
            Handler().postDelayed({
                getCategoriesApi("", false)
            }, 1000)
        }

        Log.e("QQWQWQw", editable.toString())
    }

    /**Clicks Implemented Here**/
    fun onClicks(view: View) {
        when (view.id) {
            R.id.clMainCategory -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.clSearchLocation -> {
                //Add City screen will be open hare
                var bundle = Bundle()
                bundle.putString("PostProfile", "open_cat_screen")

                bundle.putString("location_txt", address.get().toString())
                bundle.putString("lat", latitude.get().toString())
                bundle.putString("long", longitude.get().toString())

                view.navigateWithId(R.id.action_categoriesListFragment_to_addCitiesFragment,bundle)
            }
            R.id.ivCategory -> {
                view.findNavController().navigateUp()
            }
            R.id.tvSelectCategory -> {

            }
            /* R.id.ivSelectedCategory->{
                 isClicked=true
             }*/
        }
    }

    /*call get Categories Api..*/
    fun getCategoriesApi(search: String, showLoader: Boolean) = viewModelScope.launch {

        Log.e("ASDASAAA", selectedList.toString() + "--V-- " + latitude.get() +"--V-- "  + longitude.get())
        Log.e("ASDASAAA111", selectedList.toString() + "--V-- " + pref.retvieLatlong("longi").toDouble()
                +"--V-- "  +pref.retvieLatlong("longi").toDouble())

        /*
                 viewModel.lati.set(pref.retvieLatlong("lati").toDouble())
                    viewModel.longi.set(pref.retvieLatlong("longi").toDouble())

                    * */

        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        body.put("offset", page.get()!!)
        body.put("limit", 500)
        body.put("search=", search)
        Log.e("fgmlfmgssssgegeg====",body.toString())

        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = showLoader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                       /* Lat = pref.retvieLatlong("lati").toDouble(),
                        Long = pref.retvieLatlong("longi").toDouble(),*/
                        latitude.get(),
                        longitude.get(),
                        OffSet = page.get()!!,
                        Limit = 500,
                        Search = search
                    )
                }

                override fun onResponse(res: Response<CategoriesResponseModel>) {

                    adapterCategories.addItems(res.body()?.data!!)
                    Log.e("Category_response==",res.body()?.data!!.toString())
                    var newDataList=ArrayList<CategoriesData>()
                    newDataList.clear()
                    categoriesDataList.clear()
                    for (idx in 0 until adapterCategories.getAllItems().size) {
                        if (selectedList.contains(adapterCategories.getAllItems()[idx].category_name)) {

                            adapterCategories.getAllItems()[idx].isCheck=true
                            newDataList.add(adapterCategories.getAllItems()[idx])
                        }
                    }
                    categoriesDataList.addAll(newDataList)
                    Log.e("nvkwdnwvdswvdvd===",categoriesDataList.toString())
                    adapterCategories.notifyDataSetChanged()
//                    dataStoreUtil.saveData(res.body()?.data!!)
//                    Log.e("SSSSS", res.body()?.data!![0]._id.toString())

                    adapterCategories.setOnItemClick { view, position, type ->
                        when (type) {
                            "PostProfile" -> {
                                categoriesDataList =
                                    adapterCategories.getAllItems() as ArrayList<CategoriesData>
                                categoriesDataList[position].isCheck =
                                    !categoriesDataList[position].isCheck!!
                                adapterCategories.notifyDataSetChanged()

                                Log.e(
                                    "DAATA",
                                    "category=====" + categoriesDataList[position].category_name + "MLLLZZAZA====" + categoriesDataList[position].category_name + categoriesDataList.toString()
                                )

                            }
                        }
                    }

                }

            })
    }
}