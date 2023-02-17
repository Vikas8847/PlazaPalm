package com.example.plazapalm.models

   data class ConfirmBookingProfileResponse(
    val data: BookData?,
    val message: String?="",
    val status: Int?=0
  )

   data class BookData(
    val __v: Int?=0,
    val _id: String?="",
    val booking_status: String?="",
    val category_name: String?="",
    val choose_date: String?="",
    val choose_time: String?="",
    val created_at: String?="",
    val customer_id: String?="",
    val description: String?="",
    val post_profile_id: String?="",
    val question_answer: List<QuestionAnswer?>,
    val updated_at: String?=""
     )

    data class QuestionAnswer(
     val _id: String,
     val answer_text: String?,
     val q_id: String?,
     val question_text: String?
)