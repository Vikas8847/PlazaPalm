package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel
import java.io.Serializable

data class GetProfileCateResponse(
    val data: ArrayList<ProfileCateData>,
    val message: String,
    val status: Int
): AbstractModel(), Serializable

data class ProfileCateData(
    val _id: String,
    val address: String,
    val booking_status: Boolean,
    val c_id: String,
    val category_name: String,
    val created_at: String,
    val description_1: String,
    val description_2: String,
    val description_3: String,
    val distance: Double,
    val expiry_date: String,
    val first_name: String,
    var frontpage_bottom_text: String?="",
    var frontpage_top_text: String?="",
    val isAddedToCalender: Boolean,
    var isFavourite: Boolean?=false,
    val isPremium: Int,
    var is_bottom_selected: Boolean?=false,
    var is_top_selected: Boolean?=false,
    val last_name: String,
    val lat: Double,
    val likeCount: Int,
    val likes: List<Any>,
    val location: DashLocation,
    var location_text: String?="",
    var long: Double?=0.0,
    val postProfile_picture: List<String>,
    val profile_title: String,
    val tags: String,
    val u_id: String,
    val user_name: String,
    var lngValue:Double?,
    var mediaType:Int,
    var frontpage_font_size:Any?=null,
    var frontpage_font_opacity:Any?=null,
    var frontpage_font_color:String?="",
    val p_id: String? = "",
    val favouriteCount: Int? = 0
): AbstractModel(),Serializable

data class DashLocation(
    val coordinates: List<Double>,
    val type: String
):Serializable

/*
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
  //  val lng: Double?,
    var long: Double?=0.0,
    val postProfile_picture: ArrayList<String>?,
    val profile_title: String?="",
    val tags: String?="",
    val u_id: String?="",
    val user_name: String?="",
    val miles: String?="",
    val booking_status: Boolean?=false,
    var lngValue:Double?,
    val location: DashLocation,
    val distance: Double,
    val likes: ArrayList<Any>

    )  : AbstractModel()


data class DashLocation(
    val coordinates: ArrayList<Double>,
    val type: String
)*/
