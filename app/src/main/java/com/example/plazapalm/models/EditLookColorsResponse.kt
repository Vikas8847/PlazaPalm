package com.example.plazapalm.models

data class EditLookColorsResponse(
    val data: ColrsData?,
    val message: String?="",
    var status: Int?=0
)

data class ColrsData(
    val __v: Int?=0,
    val _id: String?="",
    val address: String?="",
    val background_color: String?="",
    val background_type: String?="",
    val booking_status: Boolean?=false,
    val border_color: String?="",
    val border_opacity: Double?=0.0,
    val border_width: Int?=0,
    val c_id: String?="",
    val column_color: String?="",
    val column_opacity: Int?=0,
    val created_at: String?="",
    val dark_theme: Boolean?=false,
    val description_1: String?="",
    val description_2: String?="",
    val description_3: String?="",
    val expiry_date: String?="",
    val first_name: String?="",
    val follow: Boolean?=false,
    val font_color: String?="",
    val font_name: String?="",
    val font_opacity: Int?=0,
    val font_size: Int?=0,
    val frontpage_bottom_text: String?="",
    val frontpage_top_text: String?="",
    val is_bottom_selected: Boolean?=false,
    val is_top_selected: Boolean?=false,
    val last_name: String?="",
    val lat: Double?=0.0,
    val location: Location?,
    val location_OnOff: Boolean?=false,
    val location_text: String?="",
    val long: Double?=0.0,
    val postProfile_picture: List<String>?,
    val profile_status: Boolean?=false,
    val profile_title: String?="",
    val status: Int?=0,
    val tags: String?="",
    val u_id: String?="",
    val updated_at: String?="",
    val user_name: String?=""
)

