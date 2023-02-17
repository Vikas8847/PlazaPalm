package com.example.plazapalm.models

data class GetDataForBookingResponse(
    val data: List<DataRequreBooking>,
    val message: String,
    val status: Int
)

data class DataRequreBooking(
    val _id: String,
    val booking_status: Boolean,
    val distance: Double,
    val first_name: String,
    val joined: List<Joined>,
    val last_name: String,
    val location_text: String,
    val postProfile_picture: List<String>,
    val u_id: String
)

data class Joined(
    val _id: String? = "",
    val question_text: String? = "",
    var save_ans: String? = "",
    var q_id: String? = ""
)