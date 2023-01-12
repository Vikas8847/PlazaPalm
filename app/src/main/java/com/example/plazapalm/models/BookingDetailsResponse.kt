package com.example.plazapalm.models

data class BookingDetailsResponse(
    val `data`: List<GetData?>,
    val message: String? = "",
    val status: Int? = 0
  )

data class GetData(
    val _id: String? = "",
    val booking_status: String? = "",
    val category_name: String? = "",
    val choose_date: String? = "",
    val choose_time: String? = "",
    val customer_id: String? = "",
    val description: String? = "",
    val post_profile_id: String? = "",
    val question_answer: List<Any?>
)