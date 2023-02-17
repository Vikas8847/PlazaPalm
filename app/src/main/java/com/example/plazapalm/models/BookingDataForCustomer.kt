package com.example.plazapalm.models

data class BookingDataForCustomer(
    val data: List<GetDataforCustomer>,
    val message: String,
    val status: Int
)

data class GetDataforCustomer(
    val _id: String,
    val booking_status: String,
    val category_name: String,
    val choose_date: String,
    val choose_time: String,
    val customer_id: String,
    val description: String,
    val first_name: String,
    val last_name: String,
    val location_text: String,
    val postProfile_picture: List<String>,
    val post_profile_id: String,
    val post_profile_user_id: String,
    val profile_title: String,
    val question_answer: List<BookQuestionAnswerForCustomer>
)

data class BookQuestionAnswerForCustomer(
    val _id: String,
    val answer_text: String,
    val q_id: String,
    val question_text: String
)