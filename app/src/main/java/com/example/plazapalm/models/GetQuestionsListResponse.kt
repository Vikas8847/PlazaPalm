package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel

data class GetQuestionsListResponse(
    val data: List<QueData?>,
//   val data: List<GetQueData?>,
    val message: String?="",
    val status: Int?=0
)

data class GetQueData(
    val __v: Int?=0,
    val _id: String?="",
    val p_id: String?="",
    val question_text: String?=""
):AbstractModel()


