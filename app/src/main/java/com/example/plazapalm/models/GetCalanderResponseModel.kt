package com.example.plazapalm.models

    data class GetCalanderResponseModel(
    val data: List<CalenderData?>,
    val message: String? = "",
    val status: Int? = 0
     )

    data class CalenderData(
    val _id: String? = "",
    val booking_status: String? = "",
    val category_name: String? = "",
    val choose_date: String? = "",
    val choose_time: String? = "",
    val customer_first_name: String? = "",
    val customer_id: String? = "",
    val customer_last_name: String? = "",
    val description: String? = "",
    val location_text: String? = "",
    val month: Int? = 0,
    val postProfile_first_name: String? = "",
    val postProfile_last_name: String? = "",
    val postProfile_picture: List<String?>,
    val post_profile_id: String? = "",
    val post_profile_user_id: String? = "",
    val userType: String? = "",
    val year: Int? = 0
     )
