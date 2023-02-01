package com.example.plazapalm.views.dashboard

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.R
import com.example.plazapalm.databinding.DashBoardFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.CategoriesData
import com.example.plazapalm.models.SelCategory
import com.example.plazapalm.models.SelectedDataModelList
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.Constants.SELECTED_CATEGORY_ID
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class DashBoardFragment : Fragment(R.layout.dash_board_fragment) {
    @Inject
    lateinit var dataStore: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile

    private var binding: DashBoardFragmentBinding? = null

    private lateinit var mFusedLocation: FusedLocationProviderClient
    private val viewModel: DashBoardVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DashBoardFragmentBinding.inflate(layoutInflater)

        if (pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble() != 0.0 && pref.retvieLatlong(
                Constants.FILTER_SCREEN_LONG).toDouble() != 0.0
        ) {
        viewModel.updateDeviceToken()
        if (pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble()!=0.0 &&  pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble()!=0.0 ) {
            viewModel.lati.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble())
            viewModel.longi.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble())

            Log.e("ASDASWWERWR00ss",
                pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble().toFloat().toString())
            Log.e("gsdgklslgswgs====", viewModel.lati.get().toString())
            Log.e("gsdgklslgswgs11====", viewModel.longi.get().toString())
        }

        mFusedLocation = LocationServices.getFusedLocationProviderClient(requireContext())

        if (pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble() != 0.0 && pref.retvieLatlong(
                Constants.FILTER_SCREEN_LONG).toDouble() != 0.0
        ) {
            /*   pref.storeLatlong("longi", pref.retvieLatlong("lati").toDouble().toFloat())
    pref.storeLatlong("lati", pref.retvieLatlong("longi").toDouble().toFloat())*/
            Log.e("ASDASWWERWR00ss",
                pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble().toFloat().toString())
            initUI()
        } else {
            getLastLocation()
            Log.e("ASDASWWERWR00ss", "DONE DSD GOOOD -- ")
        }
        return binding?.root

    }

    fun initUI() {
        if (arguments?.getString("fromCategories") != null && arguments?.containsKey("fromCategories")!! || arguments?.getStringArrayList(
                "filterCategoriesIds") != null ||
            arguments?.getStringArrayList("FromLoginScreenCategoriesIds") != null || arguments?.getString(
                "fromOpencate") != null
        ) {
            getCategoriesListAndID()
        } else {
            viewModel.lati.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble())
            viewModel.longi.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble())

            if (!(viewModel.selectedCatId.get().toString().equals(""))) {
                viewModel.getProfileByCategory("", true, viewModel.selectedCatId.get().toString())
            } else {
                viewModel.getProfileByCategory("", true, "")
            }
        }

        getlocalData()
        viewModel.getProfile()

        viewModel.profileResponse.observe(requireActivity(), androidx.lifecycle.Observer {
            var data = it as Boolean
            Handler().postDelayed(object : Runnable {
                override fun run() {
                    if (data) {
                        if (pref.retrieveKey("link_share_pid") != null && !(pref.retrieveKey("link_share_pid")
                                .equals(""))
                        ) {
                            Log.e("Profile_API_HIT===", "1111")
                            openDirectProfileDetail(pref.retrieveKey("link_share_pid")!!, 0.0, 0.0)
                        } else {
                            Log.e("Share_PID=====", pref.retrieveKey("link_share_pid").toString())
                        }
                    }
                }
            }, 1000)

        })

        // viewModel.getProfileByCategory("", true)
    }

    fun openDirectProfileDetail(postId: String, lati: Double, longi: Double) {
        val isDashBoard = Bundle()
        isDashBoard.putString("comingFrom", "isDashBoard")
        isDashBoard.putString(
            "DashBoardPostId",
            postId
        )
        isDashBoard.putDouble(
            "DashBoardPostLatitude",
            lati
        )
        isDashBoard.putDouble(
            "DashBoardPostLongitude",
            longi
        )
        findNavController().navigate(R.id.action_dashBoardFragment_to_favDetailsFragment,
            isDashBoard)

        pref.storeKey("link_share_pid", "")
    }


    private fun getlocalData() {
        Log.e("asdsdasdasdasd", pref.retrieveCategeory(Constants.SELECTED_CATEGORY_NAME).toString())

        if (pref.retrieveCategeory(SELECTED_CATEGORY_ID) != null) {

            Log.e("jkljlss", pref.retrieveCategeory(Constants.SELECTED_CATEGORY_NAME).toString())

//            val myType = object : TypeToken<ArrayList<SelCategory>>() {}.type
//            val newList1: ArrayList<SelCategory> = Gson().fromJson<ArrayList<SelCategory>>(pref.retrieveCategeory(Constants.SELECTED_CATEGORY_NAME), myType)
//            val categoryList1=ArrayList<SelectedDataModelList>()

//            viewModel.selectedCategoriesList.clear()

//            for (idx in 0 until newList1.size) {
//
//                categoryList1.add(SelectedDataModelList(newList1[idx].cateName,newList1[idx].cate_ID, newList1[idx].adapterPos,
//                    newList1[idx].istrue,newList1[idx].count))
//
//                Log.e("fsKHEM@@", newList1.toString())
//
//            }

        }

        if (pref.retrieveFilterResponse() != null && !(pref.retrieveFilterResponse().equals(""))) {
            Log.e("AAAZZZZ", pref.retrieveFilterResponse().toString())

            val myType = object : TypeToken<ArrayList<SelCategory>>() {}.type
            val newList: ArrayList<SelCategory> =
                Gson().fromJson<ArrayList<SelCategory>>(pref.retrieveFilterResponse(), myType)
            val categoryList = ArrayList<SelectedDataModelList>()

            viewModel.selectedCategoriesList.clear()

            for (idx in 0 until newList.size) {

                categoryList.add(
                    SelectedDataModelList(
                        newList[idx].cateName,
                        newList[idx].cate_ID,
                        newList[idx].adapterPos,
                        newList[idx].istrue,
                        newList[idx].count
                    )
                )
                viewModel.selectedCategoriesList.add(
                    SelectedDataModelList(
                        newList[idx].cateName,
                        newList[idx].cate_ID,
                        newList[idx].adapterPos,
                        newList[idx].istrue,
                        newList[idx].count
                    )
                )

            }

            Log.e("sadasdasadasd", viewModel.selectedCategoriesList.toString())
            Log.e("asxsxsxsxsxa", newList.toString())

        }


/*
        dataStore.readData(Constants.CategoryList) {
            Log.e("DFSFSDWQA",it.toString())
            if (it != null) {
                val myType = object : TypeToken<ArrayList<SelectedDataModelList>>() {}.type
                val newList: List<Any> = Gson().fromJson<List<Any>>(it, myType)
                val categoryList=ArrayList<SelectedDataModelList>()

                 var newList=it as ArrayList<Any>
                for (idx in 0 until newList.size) {

                    var data22 = newList[idx] as LinkedTreeMap<String, Any>
                    var data33 = (data22.get("adapterPos") as Double).toInt()

                    Log.e("QWEQSAa", data22.get("cateName").toString())

                    categoryList.add(
                        SelectedDataModelList(
                            data22.get("cateName").toString(),
                            data22.get("cate_ID").toString(),
                            data33,
                            data22.get("istrue") as Boolean?,
                            data22.get("count").toString()
                        )
                    )

                    Log.e("sdfsdsd",categoryList.toString())

//                    tempList.add(data22.get("cateName").toString())

                }

//                viewModel.selectedCategoriesList.addAll(newList)

//                for (idx in 0 until newList.size) {
//                    selectedCategoriesList.add(SelectedDataModelList(newList[idx].cateName,newList[idx].cate_ID, newList[idx].adapterPosition,newList[idx].istrue,newList[idx].count))
//                }

//                recyclerSelectedEvents?.layoutManager = LinearLayoutManager(context)
//                recyclerSelectedEvents?.adapter = DashboardItemsAdapter(CommonMethods.context, selectedCategoriesList, this)
//                adapter.notifyDataSetChanged()

                Log.e("sadasdasadasd", viewModel.selectedCategoriesList.toString())
                Log.e("asxsxsxsxsxa", newList.toString())

            }

        }
*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
        binding?.vm = viewModel
        viewModel.rvView=binding!!.rvDashBoard
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {
        binding?.rvDashBoard?.layoutManager = GridLayoutManager(requireContext(), 2)
        binding?.rvDashBoard?.adapter?.notifyDataSetChanged()
    }

    private fun getCategoriesListAndID() {
        if (arguments != null) {
            when {

                arguments?.getString("fromCategories") != null && arguments?.containsKey("fromCategories")!! -> {

                    val idData: ArrayList<CategoriesData> =
                        arguments?.getParcelableArrayList("fromCategoriesList")!!

                    Log.e("QQAAWW", idData.toString())

                    for (idx in 0 until idData.size) {

                        viewModel.idList.addAll(listOf(idData[idx]._id!!))

                        viewModel.selectedCategoriesList.add(
                            SelectedDataModelList(
                                idData[idx].category_name,
                                idData[idx]._id!!,
                                idData[idx].adapterPosition,
                                idData[idx].isCheck!!,
                                idData[idx].count
                            )
                        )


                        /** save data locally */
                        dataStore.saveData(viewModel.list_Name, Gson().toJson(viewModel.idList))
                        dataStore.saveData(
                            viewModel.list_CateName,
                            Gson().toJson(viewModel.selectedCategoriesList)
                        )


                        /** save Categeory Id and Name locally for permanent  */
                        val gsonValueCateId = Gson().toJson(viewModel.idList)
                        pref.saveCategeory(Constants.SELECTED_CATEGORY_ID, gsonValueCateId)

                        val gsonValueCateName = Gson().toJson(viewModel.selectedCategoriesList)
                        pref.saveCategeory(Constants.SELECTED_CATEGORY_ID, gsonValueCateName)

                        Log.e("ISCATE--ID -- >>",
                            viewModel.idList.toString() + "ISCATE--NAME -->> " + viewModel.selectedCategoriesList.toString())

                        //////////

                        val gsonValue = Gson().toJson(viewModel.selectedCategoriesList)
                        pref.storeFilterResponse(gsonValue)

                        Log.e("QQAAWW2222", pref.retrieveFilterResponse().toString())

                    }

                    /* = java.util.ArrayList<com.example.plazapalm.models.CategoriesData> */ /* = java.util.ArrayList<com.example.plazapalm.models.CategoriesData> */
                    viewModel.lati.set(arguments?.getDouble("latitude")!!)
                    viewModel.longi.set(arguments?.getDouble("longitude")!!)

                    viewModel.getProfileByCategory("", true, "")

                }

                arguments?.getStringArrayList("filterCategoriesIds") != null -> {
                    val idData: ArrayList<CategoriesData> =
                        arguments?.getParcelableArrayList("filterCategoriesIds")!!

                    for (idx in 0 until idData.size) {
                        viewModel.idList.addAll(listOf(idData[idx]._id!!))
                        viewModel.selectedCategoriesList.add(
                            SelectedDataModelList(
                                idData[idx].category_name,
                                idData[idx]._id!!,
                                idData[idx].adapterPosition,
                                idData[idx].isCheck!!,
                                idData[idx].count
                            )
                        )

//                        viewModel.selectedCategoriesList.addAll(listOf(idData[idx].category_name!!))

                        /** save data locally */
                        dataStore.saveData(viewModel.list_Name, Gson().toJson(viewModel.idList))
                        dataStore.saveData(
                            viewModel.list_CateName,
                            Gson().toJson(viewModel.selectedCategoriesList)
                        )
                    }
                    viewModel.lati.set(arguments?.getDouble("Filterlatitude")!!)
                    viewModel.longi.set(arguments?.getDouble("Filterlongitude")!!)
                    viewModel.getProfileByCategory("", true, "")
                }

                arguments?.getStringArrayList("FromLoginScreenCategoriesIds") != null -> {
                    val idData: ArrayList<CategoriesData> =
                        arguments?.getParcelableArrayList("FromLoginScreenCategoriesIds")!!

                    Log.e("SADASD-0-ASD", idData.toString())

                    viewModel.selectedCategoriesList.clear()
                    for (idx in 0 until idData.size) {
                        viewModel.idList.addAll(listOf(idData[idx]._id!!))
                        viewModel.selectedCategoriesList.add(
                            SelectedDataModelList(
                                idData[idx].category_name,
                                idData[idx]._id!!,
                                idData[idx].adapterPosition,
                                idData[idx].isCheck!!,
                                idData[idx].count
                            )
                        )

                    }

                    Log.e("SADASD-0-ASD", idData.toString())

//                        viewModel.selectedCategoriesList.addAll(listOf(idData[idx].category_name!!))
                    /** save data locally */
                    dataStore.saveData(viewModel.list_Name, Gson().toJson(viewModel.idList))
                    dataStore.saveData(
                        viewModel.list_CateName,
                        Gson().toJson(viewModel.selectedCategoriesList)
                    )

                    viewModel.lati.set(arguments?.getDouble("Loginlatitude")!!)
                    viewModel.longi.set(arguments?.getDouble("Loginlongitude")!!)

                    val gsonValue = Gson().toJson(viewModel.selectedCategoriesList)
                    pref.storeFilterResponse(gsonValue)


                    val gsonValueCateIdList = Gson().toJson(viewModel.idList)
                    pref.saveCateIdList(gsonValueCateIdList)


                    Log.e("DDDDWoij", viewModel.idList.toString())
                    viewModel.getProfileByCategory("", true, "")
                }

                arguments?.getString("fromOpencate") != null -> {

                    /** Comming from Open Category screen **/

                    binding!!.ivDashBoardFilter.visibility = View.GONE
                    binding!!.searchBar.visibility = View.GONE
                    binding!!.ivDashBoardSelectedList.visibility = View.GONE
                    binding!!.tvDashBoardTitle.text = arguments?.getString("cateName")
                    viewModel.status.set(arguments?.getString("status"))

                    val cateName = arguments?.getString("cateName")
                    val c_id = arguments?.getString("c_id")

                    viewModel.idList.add(c_id!!)
                    viewModel.selectedCategoriesList.add(
                        SelectedDataModelList(
                            cateName!!,
                            "",
                            0,
                            false,
                            ""
                        )
                    )
                    // viewModel.selectedCategoriesList.add(SelectedDataModelList(idData[idx].category_name!!, idData[idx]._id!!,idData[idx].adapterPosition!!,idData[idx].isCheck!!,idData[idx].count!!))

                    /** save data locally */
                    dataStore.saveData(viewModel.list_Name, Gson().toJson(viewModel.idList))
                    dataStore.saveData(
                        viewModel.list_CateName,
                        Gson().toJson(viewModel.selectedCategoriesList)
                    )

                    viewModel.lati.set(arguments?.getDouble("latitude")!!)
                    viewModel.longi.set(arguments?.getDouble("longitude")!!)

                    //  viewModel.lati.set(pref.retvieLatlong("lati").toDouble())
                    //     viewModel.longi.set(pref.retvieLatlong("longi").toDouble())

                    Log.e(
                        "LATLANGG",
                        viewModel.lati.get()
                            .toString() + "  <<<--- Longiii ---->>>  " +
                                viewModel.longi.get() + " CIdd--- " + c_id
                    )
                    viewModel.getProfileByCategory("", true, c_id)
                }

                arguments?.getString("comingFromIsfilter") != null -> {
                    Log.e("SDSDSd", "DASWORKINGG_+++_+++")
                }

                else -> {

                }
            }

        }
    }

    private fun getLastLocation() {
        if (CommonMethods.checkPermissions()) {
            if (CommonMethods.isLocationEnabled()) {
                if (ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return
                }
                mFusedLocation.lastLocation.addOnCompleteListener { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        CommonMethods.requestNewLocationData()
                    } else {

                        viewModel.lati.set(location.latitude)
                        viewModel.longi.set(location.longitude)

                        //for Filter lat long
                        pref.storeLatlong(Constants.FILTER_SCREEN_LONG,
                            location.longitude.toFloat())
                        pref.storeLatlong(Constants.FILTER_SCREEN_LAT, location.latitude.toFloat())
                        Log.e("Current_Location==", viewModel.lati.get().toString())
                        Log.e("Current_Location11==", viewModel.longi.get().toString())

                        val geocoder = Geocoder(requireActivity(), Locale.getDefault())
                        val addresses: List<Address> =
                            geocoder.getFromLocation(location.latitude, location.longitude, 1)
                        val city = addresses[0].locality
                        val state = addresses[0].adminArea
                        val country = addresses[0].countryName

                        //for current lat long
                        pref.storeLatlong("lati", location.latitude.toFloat())
                        pref.storeLatlong("longi", location.longitude.toFloat())


                        pref.storeLocation(city)

                        pref.storeFilterLocation(city)

                        Log.e("addresSSe", city)
//                        pref.retrieveLocation
                        initUI()
                        Log.e(
                            "SDSAAAAAQA",
                            location.latitude.toString() + " " + location.longitude.toString()
                        )

                    }
                }
            } else {
                CommonMethods.showToast(requireContext(), "Turn on Location")
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        } else {
            CommonMethods.requestPermissions()
        }
    }

    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(true)

        if (!(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toDouble().toString()
                .isNullOrEmpty()) &&
            !(pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble().toString()
                .isNullOrEmpty())
        ) {

//            pref.storeLatlong("longi", pref.retvieLatlong("longi").toDouble().toFloat())
//            pref.storeLatlong("lati", pref.retvieLatlong("lati").toDouble().toFloat())
//
//            Log.e(
//                "ASDASWWERWR00ss", pref.retvieLatlong("lati").toDouble().toFloat().toString() +"----"+
//                        pref.retvieLatlong("longi").toDouble().toFloat().toString()
//            )

        } else {
            getLastLocation()
            Log.e("ASDASWWERWR00ss", "DONE DSD GOOOD -- ")
        }


        //binding.rvDashBoard.seton
        binding?.rvDashBoard?.setOnScrollListener(object : RecyclerView.OnScrollListener() {
            var ydy = 0

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val offset = dy - ydy
                ydy = dy
                var manager = (binding!!.rvDashBoard.layoutManager) as GridLayoutManager

                val currentFirstVisible: Int = manager.findFirstVisibleItemPosition()

                //   if (currentFirstVisible > firstVisibleInListview) Log.i("RecyclerView scrolled: ", "scroll up!") else Log.i("RecyclerView scrolled: ", "scroll down!")

                var firstVisibleInListview = currentFirstVisible
                Log.e("Scroll_Position===",firstVisibleInListview.toString())
if(!viewModel.isRVScroll.get()){
                if (viewModel.adapter.getAllItems().size > 0) {
                    if(!(viewModel.title.get().toString().equals(viewModel.adapter.getAllItems()
                            .get(firstVisibleInListview).category_name.toString()))){
                    viewModel.title.set(viewModel.adapter.getAllItems()
                        .get(firstVisibleInListview).category_name.toString())
                }}
}

                if(viewModel.isRVScroll.get()) {
                    viewModel.isRVScroll.set(false)
                }
                // swipeRefreshLayout.setRefreshing(false)
            }
        })
    }
}