package com.example.plazapalm.views.favourites

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateWithId
import com.example.plazapalm.views.dashboard.DashboardInterface
import com.example.plazapalm.views.dashboard.RVDashboardAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class FavouritesVM @Inject constructor(
    var repository: Repository,
    var preferenceFile: PreferenceFile,
    var storeUtil: DataStoreUtil,

    )  : ViewModel(), DashboardInterface {
    var favouritesList = ArrayList<FavData>()
  //  val favAdapter by lazy { RecyclerAdapter<FavData>(R.layout.favourites_list_items) }
    var isFavorite = Bundle()
    var noData = ObservableBoolean(false)
    var lati = ObservableDouble()
    var longi = ObservableDouble()
    var fontList:ArrayList<FontsListModelResponse>?=null
    var rvadapter: RVDashboardAdapter?=null
    var rvView: RecyclerView?=null
    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFavBackBtn -> {
                view.findNavController().navigateUp()
            }
        }
    }

    init {

        getFavdata()
      /*  rvadapter.setOnItemClick { view, position, type ->
            when (type) {
                "favDetailsItem" -> {

                   *//* isFavorite.putBoolean("booking_status",
                        favAdapter.getAllItems()[position].booking_status!!)*//*

                    isFavorite.putString("comingFrom", "isFavorite")
                    isFavorite.putInt("pos", position)
                    view.navigateWithId(
                        R.id.action_favouritesFragment_to_favDetailsFragment,
                        isFavorite
                    )
                }
                "favDetailsItem_heart"->{
                    //For click on heart icon
                    AddtoFavAPI(rvadapter.getAllItems()[position].p_id.toString(),
                        position)
                }
            }
        }
*/
    }

     fun getFavdata() {
         Constants.TEMP_LATVALUE = preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LAT).toDouble()
         Constants.TEMP_LONGVALUE = preferenceFile.retvieLatlong(Constants.CURRENT_LOCATION_LONG).toDouble()

        repository.makeCall(ApiEnums.GET_FAVDETAILS,
            loader = true, saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileCateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileCateResponse> {
                    return retrofitApi.getFavDetals(
                        preferenceFile.retrieveKey("token"),
                        preferenceFile.retvieLatlong("lati").toDouble(),
                        preferenceFile.retvieLatlong("longi").toDouble()
                    )
                }

                override fun onResponse(res: Response<GetProfileCateResponse>) {

                    if (res.isSuccessful || res.body() != null) {

                        if (res.code() == 200) {
                            val ImagesList = ArrayList<String>()

                            /** SEND DATA TO FAVDETAILS // BY SERIALIZABLE */

                            isFavorite.putSerializable("ResBody", res.body()!!.data!!)

                            Log.e("REESSFAVVV", res.body().toString())

                            data(res.body()!!.data)
                           // var newList = res.body()!!.data as ArrayList<FavData>
                            var newList = ArrayList<ProfileCateData>()
                            newList.clear()

                            for (idx in 0 until res.body()?.data!!.size) {
                                if (res.body()?.data!![idx].postProfile_picture != null && res.body()?.data!![idx].postProfile_picture!!.size > 0) {
                                    var data=res.body()?.data!![idx]
                                    data.lngValue=data.long

                                    if(data.postProfile_picture[0].contains(".png") ||
                                        data.postProfile_picture[0].contains(".jpg") || data.postProfile_picture[0].contains(".jpeg"))
                                    {
                                        data.mediaType=1
                                    }else
                                    {
                                        data.mediaType=2
                                        Log.e("rererererer===",data.postProfile_picture[0])
                                    }
                                    /*res.body()?.data!![idx].lngValue =
                                        res.body()?.data!![idx].long*/
                                    newList.add(data)
                                }
                            }

                         /*   favAdapter.addItems(newList)
                            favAdapter.notifyDataSetChanged()*/

                            rvadapter=  RVDashboardAdapter(CommonMethods.context,newList,this@FavouritesVM,fontList!!,"fav")
                            rvView!!.setHasFixedSize(true)
                            rvView!!.layoutManager= GridLayoutManager(CommonMethods.context,2)

                            rvView!!.adapter=rvadapter


                            if (rvadapter!!.getProfileList()!=null){
                            if (rvadapter!!.getProfileList().size==0){
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

    private fun data(body: ArrayList<ProfileCateData>?) {

    }

    private fun AddtoFavAPI(pIdValue: String, position: Int, ) {

        Log.e("SADFddddddddddddd==", pIdValue)

        repository.makeCall(
            apiKey = ApiEnums.REMOVE_FAV,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddFavPostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddFavPostProfileResponse> {
                    return retrofitApi.addtoFav(
                        preferenceFile.retrieveKey("token").toString(),
                        pIdValue,
                        false
                    )
                }

                override fun onResponse(res: Response<AddFavPostProfileResponse>) {
                    Log.e("QWQQWWSSS", res.body().toString())

                    if (res.isSuccessful || res != null) {
                        if (res.body()!!.status == 200) {
                           // dialog?.dismiss()
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                            CommonMethods.context.runOnUiThread {
                                rvadapter!!.getProfileList().removeAt(position)
                                rvadapter!!.notifyDataSetChanged()

                                if(rvadapter!!.getProfileList().size==0)
                                {
                                    noData.set(true)
                                }
                            }
                        } else {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }
            }
        )
    }

    override fun onFavouriteClick(position: Int) {
        AddtoFavAPI(rvadapter!!.getProfileList()[position].p_id.toString(),
            position)
    }

    override fun onItemClick(position: Int, view: View) {
        isFavorite.putString("comingFrom", "isFavorite")
        isFavorite.putInt("pos", position)
        view.navigateWithId(
            R.id.action_favouritesFragment_to_favDetailsFragment,
            isFavorite
        )
    }
}

