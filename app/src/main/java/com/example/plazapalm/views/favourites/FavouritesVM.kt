package com.example.plazapalm.views.favourites

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.FavData
import com.example.plazapalm.models.GetFavResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class FavouritesVM @Inject constructor(
    var repository: Repository,
    var preferenceFile: PreferenceFile,
    var storeUtil: DataStoreUtil,

    )  : ViewModel() {
    var favouritesList = ArrayList<FavData>()
    val favAdapter by lazy { RecyclerAdapter<FavData>(R.layout.favourites_list_items) }
    var isFavorite = Bundle()
    var noData = ObservableBoolean(false)


    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFavBackBtn -> {
                view.findNavController().navigateUp()
            }
        }

    }

    init {

        getFavdata()

        favAdapter.setOnItemClick { view, position, type ->
            when (type) {
                "favDetailsItem" -> {

                    isFavorite.putString("comingFrom", "isFavorite")
                    isFavorite.putInt("pos", position)
                    view.navigateWithId(
                        R.id.action_favouritesFragment_to_favDetailsFragment,
                        isFavorite
                    )
                }
            }
        }

    }

     fun getFavdata() {
        repository.makeCall(ApiEnums.GET_FAVDETAILS,
            loader = true, saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetFavResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetFavResponse> {
                    return retrofitApi.getFavDetals(
                        preferenceFile.retrieveKey("token"),
                        preferenceFile.retvieLatlong("lati").toDouble(),
                        preferenceFile.retvieLatlong("longi").toDouble()
                    )
                }

                override fun onResponse(res: Response<GetFavResponse>) {

                    if (res.isSuccessful || res.body() != null) {

                        if (res.code() == 200) {
                            val ImagesList = ArrayList<String>()

                            /** SEND DATA TO FAVDETAILS // BY SERIALIZABLE */

                            isFavorite.putSerializable("ResBody", res.body()!!.data!!)

                            Log.e("REESSFAVVV", res.body().toString())

                            data(res.body()!!.data)
                            var newList = res.body()!!.data as ArrayList<FavData>

                            favAdapter.addItems(newList)
                            favAdapter.notifyDataSetChanged()

                            if (favAdapter.getAllItems()!=null){
                            if (favAdapter.getAllItems().size==0){
                                noData.set(true)
                            }
                            }



                        } else {

                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                        }

                    } else {

                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            })
        }

    private fun data(body: ArrayList<FavData>?) {

    }

}

