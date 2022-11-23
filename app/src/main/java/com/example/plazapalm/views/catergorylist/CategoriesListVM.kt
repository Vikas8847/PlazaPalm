package com.example.plazapalm.views.catergorylist

import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import android.view.View
import android.widget.CheckBox
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
import java.lang.Exception
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
    var checkBox:AppCompatCheckBox
    var isVisible = ObservableBoolean(false)
    var position: Int = -1
    var isChecked = ObservableBoolean(false)
    var token = ObservableField("")
    var page = ObservableField(1)
    var searchText = ObservableField("")
    var isClicked: Boolean = false
    var latitude = ObservableDouble()
    var longitude = ObservableDouble()
    var address = ObservableField("")
    var selectedCategory=""
    var currentLatitude=ObservableDouble()
    var currentLongitude=ObservableDouble()
    val adapterCategories by lazy { RecyclerAdapter<CategoriesData>(R.layout.categories_list_items) }





    init {
        /*get Token from Data store*/
        token.set(pref.retrieveKey("token"))
        checkBox= AppCompatCheckBox(CommonMethods.context)
        //adapterCategories.addItems(categoriesDataList)



/*
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
        }*/

    }


    /**Clicks Implemented Here**/
    fun onClicks(view: View) {
        when (view.id) {
            R.id.clMainCategory -> {
                CommonMethods.context.hideKeyboard()
            }
            R.id.clSearchLocation -> {
                //Add City screen will be open hare
                view.navigateWithId(R.id.action_categoriesListFragment_to_addCitiesFragment)
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
    fun getCategoriesApi() = viewModelScope.launch {
        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        body.put("offset", page.get()!!)
        body.put("limit", 10)
        body.put("search=", searchText.get())
        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                        Lat = latitude.get(),
                        Long = longitude.get(),
                        OffSet = page.get()!!,
                        Limit = 100,
                        Search = searchText.get().toString()
                    )
                }
                override fun onResponse(res: Response<CategoriesResponseModel>) {
                    adapterCategories.addItems(res.body()?.data!!)
//                    dataStoreUtil.saveData(res.body()?.data!!)
                    Log.e("SSSSS", res.body()?.data!![0]._id.toString())

                    adapterCategories.setOnItemClick { view, position, type ->
                        when (type) {
                            "PostProfile" -> {
                                 categoriesDataList = adapterCategories.getAllItems() as ArrayList<CategoriesData>
                                 categoriesDataList[position].isCheck = !categoriesDataList[position].isCheck!!
                                 adapterCategories .notifyDataSetChanged()

                                Log.e("DAATA" , categoriesDataList.toString() + "  ----- " + categoriesDataList[position].isCheck)

                            }
                        }
                    }

                }

            })
    }
}