package com.example.plazapalm.views.filter

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plazapalm.R
import com.example.plazapalm.databinding.FilterFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.SelCategory
import com.example.plazapalm.models.SelectedDataModelList
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.Gson
import com.google.gson.internal.LinkedTreeMap
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import javax.inject.Inject


@AndroidEntryPoint
class FilterFragment : Fragment(R.layout.filter_fragment) {
    lateinit var binding: FilterFragmentBinding

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile
    lateinit var categoryList: ArrayList<SelectedDataModelList>

    private val viewModel: FilterFragmentVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FilterFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = viewModel
        categoryList = ArrayList()
        setCategoryAdapter()
        getBundleData()
        sliderCustomize()
        getLocalData()
        setLocation()
        // sliderCustomize()

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getLocalData() {

        if (pref.retrieveFilterLocation() != null && pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toDouble()!=0.0) {
            viewModel.location.set(pref.retrieveFilterLocation())
            viewModel.lat.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LAT).toString())
            viewModel.long.set(pref.retvieLatlong(Constants.FILTER_SCREEN_LONG).toString())
            Log.e("QQQQQQ",pref.retrieveFilterLocation().toString())
           // getdata()
        }else
        {
            //getLastLocation()
        }





        if (pref.retvieMiles()!=null && (pref.retvieMiles()!=0)){

            var miles = pref.retvieMiles()
            binding.tvFilterMilesValue.text=miles.toString() + " Miles"
            binding.sliderFilter.value =miles.toFloat()
          //  binding.sliderFilter.value = 1.0f


            viewModel.miles.set(miles.toString())

            Log.e("AAAZZZZasQQA",miles.toString())


        }else{
            binding.tvFilterMilesValue.text= 25.toString() + " Miles"
            binding.sliderFilter.value =25.toFloat()
        }

        viewModel.filterDataList.clear()

        if (pref.retrieveFilterResponse()!=null && !(pref.retrieveFilterResponse().equals(""))){
            Log.e("AAAZZZZ",pref.retrieveFilterResponse().toString())

            val myType = object : TypeToken<ArrayList<SelCategory>>() {}.type
            val newList: ArrayList<SelCategory> = Gson().fromJson<ArrayList<SelCategory>>(pref.retrieveFilterResponse(), myType)
            val categoryList=ArrayList<SelectedDataModelList>()

            for (idx in 0 until newList.size) {

                categoryList.add(SelectedDataModelList(newList[idx].cateName,newList[idx].cate_ID, newList[idx].adapterPos,newList[idx].istrue,newList[idx].count))
                viewModel.filterDataList.add(SelectedDataModelList(newList[idx].cateName,newList[idx].cate_ID, newList[idx].adapterPos,newList[idx].istrue,newList[idx].count))

            }

            viewModel.filterAdapter.setOnItemClick {
                    view, position, type -> when (type) {
                        "onSwipeFiterItem" -> {
                            Log.e("ASDDASDAS", "ASDASDASD")

                            viewModel.filterAdapter.getAllItems().removeAt(position)
                            viewModel.filterAdapter.notifyDataSetChanged()

                        }
                    }
            }

            var gsonValue = Gson().toJson(categoryList)

            viewModel.filterAdapter.addItems(categoryList)
           viewModel.filterAdapter.notifyDataSetChanged()

            Log.e("sdfsdfsdfsfsdfsdf", viewModel.filterDataList.toString())
            Log.e("hbibibi", newList.toString())
            Log.e("asxsxsxsxsxa", categoryList.toString())

        }


    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getBundleData() {

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("selectedCategories")
            ?.observe(viewLifecycleOwner) { result ->

                /** Get data from bundle using back stack */

                val myType = object : TypeToken<Bundle>() {}.type
                val bundleData = Gson().fromJson<Bundle>(result, myType)
                    /* val gson = GsonBuilder()
                    .addDeserializationExclusionStrategy(GsonDeserializeExclusion())
                    .create()*/

                var categeoryData: ArrayList<SelectedDataModelList> = bundleData.getSerializable("SelectedList")!! as ArrayList<SelectedDataModelList>
                val tempList = ArrayList<String>()
                categoryList.clear()

                for (idx in 0 until categeoryData.size) {

                    var data22 = categeoryData[idx] as LinkedTreeMap<String, Any>
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
                    viewModel.filterDataList.add(SelectedDataModelList(categoryList[idx].cateName,categoryList[idx].cate_ID, categoryList[idx].adapterPosition,categoryList[idx].istrue,categoryList[idx].count))
                    tempList.add(data22.get("cateName").toString())

                }

                 viewModel.newfilterList.set(tempList)
                 viewModel.filterAdapter.addItems(categoryList)
                 viewModel.filterAdapter.notifyDataSetChanged()

//                var gsonValue = Gson().toJson(categoryList)
//                dataStoreUtil.saveData(CategoryList, gsonValue)

            }

    }

    private fun setCategoryAdapter() {
        binding.rvFilterCategory.layoutManager = LinearLayoutManager(requireContext())
        binding.rvFilterCategory.adapter = viewModel.filterAdapter
        binding.rvFilterCategory.adapter?.notifyDataSetChanged()

        /** remove item from recyclerview */

    }

    private fun sliderCustomize() {

        binding.sliderFilter.addOnChangeListener { _, value, _ ->

            viewModel.miles.set(value.toInt().toString())

            binding.tvFilterMilesValue.text = "${value.toInt()} Miles"
            Log.e("SSSSSSSS----",value.toInt().toString())

            pref.storeMiles(value.toInt())

            // binding.tvFilterMilesValue.text = viewModel.miles.set(value.toInt().toString()).toString()

        }
    }

    /** Set Location */
    fun setLocation() {
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("bundle")
            ?.observe(viewLifecycleOwner) { data ->

                val datafromLocation = data
                // Split will return an array
                val split = datafromLocation.split("/")

                /*val longi = split[0] // First element
                val lati = split[1] // Second element*/

                val lati = split[0] // First element
                val longi = split[1] // Second element
                val address = split[2] // Second element

                viewModel.location.set(address)
                viewModel.long.set(longi)
                viewModel.lat.set(lati)

                Log.e("WWWWWWWW", data.toString())


            }
    }

    class GsonDeserializeExclusion : ExclusionStrategy {
        override fun shouldSkipField(f: FieldAttributes): Boolean {
            return f.declaredClass == SimpleDateFormat::class.java
        }

        override fun shouldSkipClass(clazz: Class<*>?): Boolean {
            return false
        }
    }
}