package com.example.plazapalm.models

data class GetColorsResponse(
    val data: GetColrsData?,
    val message: String?="",
    val status: Int?=0
)

data class GetColrsData(
    val background_color: String?="",
    val background_type: String?="",
    val booking_status: Boolean?=false,
    val border_color: String?="",
    val border_opacity: Double?=0.0,
    val border_width: Int?=0,
    val column_color: Any?="",
    val column_opacity: Int?=0,
    val font_color: String?="",
    val font_name: String?="",
    val font_opacity: Int?=0,
    val font_size: Int?=0,
    val post_profile_id: String?="",
    val user_id: String?=""
)