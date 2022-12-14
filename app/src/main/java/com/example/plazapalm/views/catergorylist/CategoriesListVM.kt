package com.example.plazapalm.views.catergorylist

import android.annotation.SuppressLint
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
                getCategoriesApi("a", false)
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
    fun getCategoriesApi(search: String, showLoader: Boolean) = viewModelScope.launch {


        Log.e("ASDASAAA", selectedList.toString())

        val body = JSONObject()
        body.put(Constants.AUTHORIZATION, token.get())
        body.put("lat", latitude.get())
        body.put("long", longitude.get())
        body.put("offset", page.get()!!)
        body.put("limit", 10)
        body.put("search=", search)
        repository.makeCall(
            apiKey = ApiEnums.GET_CATEGORIES,
            loader = showLoader,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<CategoriesResponseModel>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<CategoriesResponseModel> {
                    return retrofitApi.getCategories(
                        Authorization = token.get().toString(),
                        Lat = latitude.get(),
                        Long = longitude.get(),
                        OffSet = page.get()!!,
                        Limit = 500,
                        Search = search
                    )
                }

                override fun onResponse(res: Response<CategoriesResponseModel>) {

                    adapterCategories.addItems(res.body()?.data!!)

                    for (idx in 0 until adapterCategories.getAllItems().size) {
                        if (selectedList.contains(adapterCategories.getAllItems()[idx].category_name)) {

                            adapterCategories.getAllItems()[idx].isCheck=true
                        }
                    }
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