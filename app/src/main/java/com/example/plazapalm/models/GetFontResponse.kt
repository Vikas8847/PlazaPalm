package com.example.plazapalm.models

data class GetFontResponse(
    val data: GetFontData,
    val message: String,
    val status: Int
)

data class GetFontData(
    val booking_status: Boolean? = false,
    val frontpage_bottom_text: String? = "",
    val frontpage_top_text: String? = "",
    val is_bottom_selected: Boolean? = false,
    val is_top_selected: Boolean? = false,
    val post_profile_id: String? = "",
    val user_id: String? = ""
)