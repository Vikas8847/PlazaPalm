package com.example.plazapalm.views.dashboard

import android.annotation.SuppressLint
import android.app.Dialog
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableDouble
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.models.GetProfileCateResponse
import com.example.plazapalm.models.ProfileCateData
import com.example.plazapalm.models.SelectedDataModel
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.context
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.navigateWithId
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class DashBoardVM @Inject constructor(
    private var repository: Repository,
    var dataStoreUtil: DataStoreUtil,
    var pref: PreferenceFile
) : ViewModel() {
    private var _id: String? = null
    var calulatedDistance = ObservableField("")
    var destinationLong: Double? = null
    var destinationLat: Double? = null
    var recyclerSelectedEvents: RecyclerView? = null
    var idList = ArrayList<String>()
    var token = ObservableField("")
    var status = ObservableField("")
    var lati = ObservableDouble()
    var longi = ObservableDouble()
    var isDataVisible = ObservableBoolean(false)
    var distanceCal = ObservableField("")
    var isClicked: ObservableBoolean = ObservableBoolean(false)
    val distance = ObservableField("")
    var idCategoriesData = ObservableArrayList<CategoriesData>()


    val adapter by lazy { RecyclerAdapter<ProfileCateData>(R.layout.dash_board_items) }
    val dashSelectedAdapter by lazy { RecyclerAdapter<CategoriesData>(R.layout.dash_board_events_items) }


    init {

        val selectedCategoriesList = ArrayList<SelectedDataModel>()
        selectedCategoriesList.add(SelectedDataModel("Android"))
        selectedCategoriesList.add(SelectedDataModel("Kotlin"))
        selectedCategoriesList.add(SelectedDataModel("Java"))
        selectedCategoriesList.add(SelectedDataModel("NodeJs"))

        //  dashSelectedAdapter.addItems(idCategoriesData)
        //   dashSelectedAdapter.notifyDataSetChanged()
    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.clDashBoardListSearch -> {
                CommonMethods.showToast(context, "In Progress ")
            }
            R.id.clMainDashBoard -> {
                context.hideKeyboard()
            }
            R.id.ivDashBoardSelectedList -> {
                isClicked.set(true)
                if (isClicked.get()) {
                    showSelectedCatAlert()
                    isClicked.set(false)
                } else {
                    isClicked.set(true)
                }
                //  CommonMethods.showToast(context, "In Progress ")
            }
            R.id.ivDashBoardFilter -> {
                view.navigateWithId(R.id.action_dashBoardFragment_to_filterFragment)
            }
        }
    }

    init {
        Log.e("ASDFASDFSFSDf", status.get().toString())
        // getProfileByCategory()
        token.set(pref.retrieveKey("token"))
        /*  if (status.get().toString() == "OPEN") {
              getProfileByCategory()
          }
          else
          {
              dataList.add(DashBoardModel(
                      "Chris\nEvans",
                      "Android Developer",
                      "Mohali PB ",
                      R.drawable.dash_items_nurse_image,
                      21
                  )
              )
              dataList.add(
                  DashBoardModel(
                      "Natalie\nPortman",
                      "IOS Developer",
                      "Chandigarh",
                      R.drawable.charis_event_image,
                      22
                  )
              )
              dataList.add(
                  DashBoardModel(
                      "Robert\nJohnson",
                      "React Native Developer",
                      "Mohali PB",
                      R.drawable.robert_electrician_image,
                      23
                  )
              )
              dataList.add(
                  DashBoardModel(
                      "Justin\nPottor",
                      "Php Developer",
                      "Mohali PB",
                      R.drawable.justin_carpainter_image,
                      23
                  )
              )
              dataList.add(
                  DashBoardModel(
                      "Justin\nPottor",
                      "Php Developer",
                      "Mohali PB",
                      R.drawable.justin_carpainter_image,
                      23
                  )
              )
              dataList.add(
                  DashBoardModel(
                      "Justin\nPottor",
                      "Php Developer",
                      "Mohali PB",
                      R.drawable.justin_carpainter_image,
                      23
                  )
              )

              adapter.addItems(dataList)
              adapter.notifyDataSetChanged()

          }
          selectedEventsList.add(SelectedDataModel("Deserts and Drinks"))
          selectedEventsList.add(SelectedDataModel("Events"))
          selectedEventsList.add(SelectedDataModel("Dispensaries"))
          selectedEventsList.add(SelectedDataModel("Local Services"))
          selectedEventsList.add(SelectedDataModel("Pets"))
          dashSelectedAdapter.addItems(selectedEventsList)
          dashSelectedAdapter.notifyDataSetChanged()*/
/*
        adapter.setOnItemClick { view, _, type ->
            when (type){
                "dashItemClick" -> {
                    val isDashBoard = Bundle()
                    isDashBoard.putString("comingFrom", "isDashBoard")
                    view.navigateWithId(R.id.action_dashBoardFragment_to_favDetailsFragment, isDashBoard)
                }
            }
        }
*/

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun showSelectedCatAlert() {
        val dialog: Dialog?
        dialog = Dialog(context, R.style.FullHeightDialog)
        dialog.setContentView(R.layout.dash_board_events_items)
        recyclerSelectedEvents = dialog.findViewById(R.id.rvDashBoardSelectedEvents)
        recyclerSelectedEvents?.layoutManager = LinearLayoutManager(context)
        recyclerSelectedEvents?.adapter = dashSelectedAdapter
        dashSelectedAdapter.addItems(idList as ArrayList<CategoriesData>)
        recyclerSelectedEvents?.adapter?.notifyDataSetChanged()
        dialog.setCancelable(true)
        dialog.show()
    }

    fun getProfileByCategory() {
        val body = JSONObject()
        body.put("c_id", idList)
        body.put("offset", 1)
        body.put("lat", lati.get())
        body.put("lng", longi.get())
        body.put("search", "a")
        repository.makeCall(
            ApiEnums.GETPROFILE_BYCATE,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetProfileCateResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetProfileCateResponse> {
                    return retrofitApi.getProfileByCategory(
                        token.get().toString(),
                        idList,
                        1,
                        5,
                        lati.get(),
                        longi.get(),
                        "a"
                    )
                }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<GetProfileCateResponse>) {
                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.body()!!.status == 200) {
                                adapter.addItems(res.body()?.data!!)
                                Log.d("DashBoardResponse->", res.body()!!.data.toString())

                                destinationLat = adapter.getAllItems()[0].lat
                                destinationLong = adapter.getAllItems()[0].long
                                /*  destinationLat = adapter.getAllItems()[0].lat
                                  destinationLong = adapter.getAllItems()[0].long*/
                                calculateLatLngToMiles()
                                adapter.setOnItemClick { view, position, type ->

                                    /* adapter.getAllItems().map {
                                         destinationLat=it.lat
                                         destinationLong=it.long
                                     }*/

                                    when (type) {
                                        "dashItemClick" -> {
                                            val isDashBoard = Bundle()
                                            isDashBoard.putString("comingFrom", "isDashBoard")
                                            isDashBoard.putString(
                                                "DashBoardPostId",
                                                res.body()!!.data[position]._id
                                            )
                                            isDashBoard.putDouble(
                                                "DashBoardPostLatitude",
                                                lati.get()
                                            )
                                            isDashBoard.putDouble(
                                                "DashBoardPostLongitude",
                                                longi.get()
                                            )
                                            view.navigateWithId(
                                                R.id.action_dashBoardFragment_to_favDetailsFragment,
                                                isDashBoard
                                            )
                                        }
                                    }
                                }
                            } else {
                                CommonMethods.showToast(context, res.body()?.message.toString())
                            }
                        } else {
                            CommonMethods.showToast(context, res.body()?.message.toString())
                        }
                    } else {
                        CommonMethods.showToast(context, res.body()?.message.toString())
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("sdsdsd3", message)
                    CommonMethods.showToast(context, message)
                }
            }
        )
    }

    fun calculateLatLngToMiles() {
        val latLngA = LatLng(lati.get(), longi.get())
        val latLngB = LatLng(destinationLat!!.toDouble(), destinationLong!!.toDouble())
        val locationA = Location("Point A")
        locationA.latitude = latLngA.latitude
        locationA.longitude = latLngA.longitude
        val locationB = Location("Point B")
        locationB.latitude = latLngB.latitude
        locationB.longitude = latLngB.longitude
        distance.set(locationA.distanceTo(locationB).toDouble().toString())
        Log.d("distanceCal", distance.get().toString().split(".")[0])
        distanceCal.set(distance.get().toString().split(".")[0])

    }
}


