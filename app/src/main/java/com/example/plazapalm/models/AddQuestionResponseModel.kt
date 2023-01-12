package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel

data class AddQuestionResponseModel(

    val data: QueData?,
    val message: String?="",
    val status: Int?=0
    ):AbstractModel()

    data class QueData(
    val __v: Int?=0,
    val _id: String?="",
    val p_id: String?="",
    val question_text: String?="",
    val question_no: String?=""

   ):AbstractModel()
