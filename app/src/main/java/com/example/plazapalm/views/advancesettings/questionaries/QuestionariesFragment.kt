package com.example.plazapalm.views.advancesettings.questionaries

import android.graphics.Canvas
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.plazapalm.R
import com.example.plazapalm.databinding.QuestionariesFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.swipelayout.SwipeController
import com.example.plazapalm.swipelayout.SwipeControllerActions
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.CommonMethods.showSwipeDeleteAccountDialog
import com.example.plazapalm.views.advancesettings.itemtouchhelper.SwipeToDeleteCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class QuestionariesFragment : Fragment(R.layout.questionaries_fragment) {

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile

    var swipeController: SwipeController? = null


    private var binding: QuestionariesFragmentBinding? = null
    private val viewModel: QuestionariesVM by viewModels()
    lateinit var SwipeToDeleteAdapter:SwipeToDeleteAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QuestionariesFragmentBinding.inflate(layoutInflater)
        CommonMethods.statusBar(true)
        setQuestionsAdapter()
        getLocalData()

        swipeItem()
        return binding?.root
    }

    private fun swipeItem() {

    }

    private fun getLocalData() {

        dataStoreUtil?.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {

            val p_Id = it?.data?.p_id
            if (p_Id != "" && p_Id != null) {
                Log.e("XVCCCXXXX" ,p_Id)
                viewModel.p_id.set(p_Id)
                viewModel.getQuestionsListAPI(p_Id)
            } else {

            }

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//         setQuestionAdapter()
        binding?.vm = viewModel

    }

    override fun onResume() {
        super.onResume()
        CommonMethods.statusBar(true)
    }


    private fun setQuestionsAdapter(){
        binding?.rvQuestionary?.layoutManager= LinearLayoutManager(requireContext())
        binding?.rvQuestionary?.adapter=viewModel.questionsAdapter
        binding?.rvQuestionary?.adapter?.notifyDataSetChanged()


   /*     swipeController = SwipeController(object : SwipeControllerActions() {
            override fun onRightClicked(position: Int) {
                viewModel.questionsAdapter.getAllItems().removeAt(position)
                viewModel.questionsAdapter.notifyItemRemoved(position)
                viewModel.questionsAdapter.notifyItemRangeChanged(position, viewModel.questionsAdapter.getItemCount())
            }
        })

        val itemTouchhelper = ItemTouchHelper(swipeController)
        itemTouchhelper.attachToRecyclerView(binding?.rvQuestionary)

        binding?.rvQuestionary?.addItemDecoration(object : ItemDecoration() {
            override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
                swipeController!!.onSwiped(c)
            }
        })*/

    }

    private fun setQuestionAdapter() {
        binding?.rvQuestionary?.layoutManager = LinearLayoutManager(requireContext())
        SwipeToDeleteAdapter = SwipeToDeleteAdapter(viewModel.questionDataList)
        binding?.rvQuestionary?.adapter = SwipeToDeleteAdapter
        val swipeHandler = object : SwipeToDeleteCallback(requireActivity()) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                var adapter = binding?.rvQuestionary?.adapter as SwipeToDeleteAdapter
                showSwipeDeleteAccountDialog()
                adapter.removeAt(viewHolder.adapterPosition)
                adapter.notifyDataSetChanged()
            }
        }

        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView(binding?.rvQuestionary)
        binding?.rvQuestionary?.adapter?.notifyDataSetChanged()

    }


}