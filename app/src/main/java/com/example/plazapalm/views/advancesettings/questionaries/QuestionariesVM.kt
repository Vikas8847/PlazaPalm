package com.example.plazapalm.views.advancesettings.questionaries

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.AddQuestionResponseModel
import com.example.plazapalm.models.DeleteQuestionsResponse
import com.example.plazapalm.models.GetQuestionsListResponse
import com.example.plazapalm.models.QueData
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.hideKeyboard
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class QuestionariesVM @Inject constructor(
    var dataStoreUtil: DataStoreUtil,
    var pref: PreferenceFile,
    private var repository: Repository,
) : ViewModel() {
    var questionDataList = ArrayList<QueData>()
    var position = -1
    var p_id = ObservableField("")
    var q_id = ObservableField("")
    var questions = ObservableField("")

    //    var noData = ObservableField("")
    var noData = ObservableBoolean(false)
    var q_no = ObservableInt()
    var istrue = ObservableBoolean(false)
    var num = 0
    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivQuestionaryBack -> {
                view.findNavController().navigateUp()
            }

            R.id.btnAddNewQuestions -> {
                /***open alert dialog for add questions...***/

                Log.e("SDFSS!@1", p_id.get().toString() + "DCC---")

                openAddQuestionDialog(
                    p_id.get().toString(),
                    repository,
                    pref.retrieveKey("token").toString()
                )

            }
        }

    }

    val questionsAdapter by lazy { RecyclerAdapter<QueData>(R.layout.add_question_items) }

    init {
//        getQuestionsListAPI()
    }

    fun getQuestionsListAPI(p_Id: String) = viewModelScope.launch {
        Log.e("QWWQWQWQQWQW", p_Id + "DCC---")

        repository.makeCall(
            ApiEnums.GET_QUESTIONS,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetQuestionsListResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetQuestionsListResponse> {
                    Log.e(
                        "SAAAQQAAQ", pref.retrieveKey("token").toString()
                                + "VV__  " + p_Id
                    )

                    return retrofitApi.listQuestion(
                        pref.retrieveKey("token").toString(),
                        p_Id
                    )
                }

                override fun onResponse(res: Response<GetQuestionsListResponse>) {
                    Log.e("SDFSQQAAA", res.body().toString())
                    istrue.set(true)
                    if (res.isSuccessful && res.body() != null) {
                        if (res.body()!!.status == 200) {
                            Log.e("SDFSQQAAA=-0=-=", res.body().toString())
                            val data = res.body()!!.data

                            for (idx in data.indices) {
                                questions.set("Question $idx")
                                Log.e("xxxxxxx", questions.get().toString())
                                num++
                                q_no.set(num)


                                questions.set("Question ${q_no.get()}")
                                Log.e("LDALA1111", questions.get().toString())


                                questionDataList.add(
                                    QueData(data[idx]?.__v, data[idx]?._id, data[idx]?.p_id, data[idx]?.question_text, questions.get(),)
                                )
                            }
                            Log.e("SDfsdf", questionDataList.size.toString())

                            if (questionDataList.size > 0) {
                                setAdapter(questionDataList)
                            } else {
                                Log.e("LSSSSCSs", questionsAdapter.getAllItems().size.toString())
                                noData.set(true)
                                setAdapter(questionDataList)

                            }


                            /*     res.body()!!.message?.let {
                                     CommonMethods.showToast(
                                         CommonMethods.context,
                                         it
                                     )
                                 }*/

                        } else {
                            res.body()!!.message?.let {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    it
                                )
                            }

                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }
            })

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter(questionDataList: ArrayList<QueData>) {

        Log.e("LDALA1111", questions.get().toString())

        Log.e("jfjfjosdfsdf===", questionDataList.toString())

        questionsAdapter.addItems(questionDataList)
        questionsAdapter.getAllItems()
      //  questionsAdapter.notifyDataSetChanged()

        questionsAdapter.setOnItemClick { _, pos, type ->
            when (type) {

                "onSwipeItemClick" -> {
                    Log.e("SADQAWQA", pos.toString())

                    /**Swipe to Delete .... **/
                    q_id.set(questionsAdapter.getAllItems()[pos]._id)
//                    var q_Id = questionDataList[pos]?._id
                    //  showSwipeDeleteAccountDialog(q_id.get().toString(), pos)
                    showSwipeDeleteAccountDialog(
                        questionsAdapter.getAllItems()[pos]._id.toString(),
                        pos
                    )
                }
                else -> {

                }
            }
        }

        /** Add questions set adapter if commen adapter not workk  */

        /*
         questionsAdapter.addItems(questionDataList)
         questionsAdapter.getAllItems()
         questionsAdapter.notifyDataSetChanged()
         Log.e("jfjfjosdfsdf===", questionDataList.toString())
         questionsAdapter.setOnItemClick { _, _, type ->
             when (type) {
                 "onSwipeItemClick" -> {
                     */
        /**Swipe to Delete .... **//*
                    CommonMethods.showSwipeDeleteAccountDialog()
                }
                else -> {

                }
            }
        }*/

    }

    /**Open Add question Alert ...***/
    fun openAddQuestionDialog(p_id: String, repository: Repository, token: String) {
        if (CommonMethods.dialog != null && CommonMethods.dialog?.isShowing!!) {
            CommonMethods.dialog?.dismiss()
            CommonMethods.dialog = null
            Log.e("Show_Dialog====","2222222")
        } else {
            Log.e("Show_Dialog====","33333")
            CommonMethods.dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            CommonMethods.dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            CommonMethods.dialog?.setContentView(R.layout.add_questions)
            CommonMethods.dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            CommonMethods.dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            CommonMethods.dialog?.setCancelable(false)

            var addques = CommonMethods.dialog?.findViewById<AppCompatEditText>(R.id.etAddQuestions)
            var btnSave = CommonMethods.dialog?.findViewById<AppCompatButton>(R.id.btnAddedQuesSave)

            /**choose options click(Button) **/
            btnSave?.setOnClickListener {
                if (addques?.text.isNullOrEmpty()) {

                    val toast =
                        Toast.makeText(
                            CommonMethods.context,
                            "Please enter question.",
                            Toast.LENGTH_SHORT
                        )
                    toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
                    toast.show()

                } else {
                    addQuesApi(p_id, addques?.text.toString(), repository, token)
                    CommonMethods.dialog?.dismiss()

                }
            }
            CommonMethods.dialog?.findViewById<AppCompatImageView>(R.id.ivAddQuestionCross)
                ?.setOnClickListener {

                    CommonMethods.dialog?.dismiss()
                }

            CommonMethods.dialog?.findViewById<ConstraintLayout>(R.id.clAddQuestion)
                ?.setOnClickListener {

                    CommonMethods.context.hideKeyboard()
                }
        }
        if (CommonMethods.context is AppCompatActivity && !(CommonMethods.context as AppCompatActivity).isFinishing && !CommonMethods.dialog!!.isShowing) {
            CommonMethods.dialog!!.show()
            Log.e("Show_Dialog====","2222222")
        }else
        {
            Log.e("Show_Dialog====","1111111")
        }

        // dialog?.show()
    }

    private fun addQuesApi(p_id: String, addQues: String, repository: Repository, token: String) =
        viewModelScope.launch {

            Log.e("PIDDD", p_id + "XCC  -- " + addQues)

            questionsAdapter.notifyDataSetChanged()

            repository.makeCall(
                apiKey = ApiEnums.ADD_QUESTIONS,
                loader = true,
                saveInCache = false,
                getFromCache = false,
                requestProcessor = object : ApiProcessor<Response<AddQuestionResponseModel>> {
                    override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddQuestionResponseModel> {
                        return retrofitApi.addQuestion(
                            token,
                            p_id,
                            addQues
                        )
                    }

                    @SuppressLint("NotifyDataSetChanged")
                    override fun onResponse(res: Response<AddQuestionResponseModel>) {
                        if (res.isSuccessful || res.body() != null) {
                            Log.e("QUESTIONS____RESPONSEE", res.body()?.data?.question_text.toString())
                            if (res.code() == 200) {
                                noData.set(false)
                                val data = res.body()!!.data
                                Log.e("xxxxxxx", questions.get().toString())
                                num++
                                q_no.set(num)

                                questions.set("Question ${q_no.get()}")
                                Log.e("LDALA1111", questions.get().toString())

                                if (questionsAdapter != null) {
                                    questionsAdapter.getAllItems().add(
                                        QueData(
                                            data?.__v,
                                            data?._id,
                                            data?.p_id,
                                            data?.question_text,
                                            questions.get(),
                                        )
                                    )
                                    questionsAdapter.notifyDataSetChanged()
                                } else {

                                    questionDataList.add(QueData(data?.__v, data?._id, data?.p_id, data?.question_text, questions.get(),))
                                    setAdapter(questionDataList)
                                }

                                CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

                            } else {

                                CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

                            }

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.message())
                        }
                    }

                }
            )


        }

    private fun showSwipeDeleteAccountDialog(q_id: String, pos: Int) {

        if (CommonMethods.dialog != null && CommonMethods.dialog?.isShowing!!) {
            CommonMethods.dialog?.dismiss()
            CommonMethods.dialog = null
        } else {
            CommonMethods.dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            CommonMethods.dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            CommonMethods.dialog?.setContentView(R.layout.delete_swipe_alert)
            CommonMethods.dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            CommonMethods.dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            CommonMethods.dialog?.setCancelable(false)

            CommonMethods.dialog?.findViewById<AppCompatTextView>(R.id.tvSwipeDeleteBtn)
                ?.setOnClickListener {

                    deleteQuestionAPI(q_id, pos)
                    CommonMethods.dialog?.dismiss()
                }
            CommonMethods.dialog?.findViewById<AppCompatTextView>(R.id.tvDeleteSwipeCancelBtn)
                ?.setOnClickListener {
                    CommonMethods.dialog?.dismiss()
                }
        }

        if (CommonMethods.context is AppCompatActivity && !(CommonMethods.context as AppCompatActivity).isFinishing && !CommonMethods.dialog!!.isShowing) {
            CommonMethods.dialog!!.show()
        }
        // dialog?.show()
    }

    private fun deleteQuestionAPI(q_id: String, pos: Int) = viewModelScope.launch {
        Log.e("Delete_Questions====", pos.toString())
        repository.makeCall(
            apiKey = ApiEnums.ADD_QUESTIONS,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeleteQuestionsResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeleteQuestionsResponse> {
                    return retrofitApi.deleteQuestion(
                        pref.retrieveKey("token").toString(), q_id) }

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(res: Response<DeleteQuestionsResponse>) {
                    Log.e("Delete-QUS-REEE", res.body().toString())

                    if (res.isSuccessful || res.body() != null) {
                        if (res.code() == 200) {
                            questionsAdapter.getAllItems().removeAt(pos)
                            questionsAdapter.notifyDataSetChanged()
                            num = pos+1
                            q_no.set(num)
                            questions.set("Question ${q_no.get()}")

                            if (questionsAdapter.getAllItems()!=null){
                                if (questionsAdapter.getAllItems().size == 0) {
                                    Log.e("SAAasds","WORGKL")
                                    noData.set(true)
                                }
                            }

                            CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()?.message!!)

                        }

                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }
        )

    }

}

