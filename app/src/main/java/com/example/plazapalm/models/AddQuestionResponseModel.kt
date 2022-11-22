package com.example.plazapalm.models

data class AddQuestionResponseModel(
    val data: QueData?,
    val message: String?="",
    val status: Int?=0
   )

    data class QueData(
    val __v: Int?=0,
    val _id: String?="",
    val p_id: String?="",
    val question_text: String?=""
)