package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel

data class GetProfileCateResponse(
    val data: List<ProfileCateData>,
    val message: String,
    val status: Int
): AbstractModel()

data class ProfileCateData(
    val _id: String?="",
    val address: String?="",
    val c_id: String?="",
    val category_name: String?="",
    val created_at: String?="",
    val description_1: String?="",
    val description_2: String?="",
    val description_3: String?="",
    val expiry_date: Any?,
    val first_name: String?="",
    val frontpage_bottom_text: String?="",
    val frontpage_top_text: String?="",
    val isAddedToCalender: Boolean?=false,
    var isFavourite: Boolean?=false,
    val isPremium: Int?=0,
    val is_bottom_selected: Boolean?=false,
    val is_top_selected: Boolean?=false,
    val last_name: String?="",
    val lat: Double?,
    val likeCount: Int?=0,
    val location_text: String?="",
    val long: Double?,
    val postProfile_picture: List<String>?,
    val profile_title: String?="",
    val tags: String?="",
    val u_id: String?="",
    val user_name: String?="",
    val miles: String?=""

)  : AbstractModel()