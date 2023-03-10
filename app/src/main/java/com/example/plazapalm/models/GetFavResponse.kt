package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel
import java.io.Serializable

data class GetFavResponse(
    var data: ArrayList<FavData>?,
    val message: String? = "",
    val status: Int? = 0
) : AbstractModel(), Serializable

data class FavData(
    val _id: String? = "",
    var address: String? = "",
    val c_id: String? = "",
    val category_name: String? = "",
    val description_1: String? = "",
    val description_2: String? = "",
    val description_3: String? = "",
    val distance: Double? = 0.0,
    val expiry_date: String? = "",
    val first_name: String? = "",
    val frontpage_bottom_text: String? = "",
    val frontpage_top_text: String? = "",
    val isPremium: Int? = 0,
    val is_bottom_selected: Boolean? = false,
    val is_top_selected: Boolean? = false,
    val last_name: String? = "",
    val lat: Double? = 0.0,
    val location: FavLocation?,
    val location_text: String? = "",
    val long: Double? = 0.0,
    val p_id: String? = "",
    val postProfile_picture: List<String>?,
    val profile_title: String? = "",
    val tags: String? = "",
    val user_name: String? = "",
    val favouriteCount: Int? = 0,
    var booking_status: Boolean? = false,
    var mediaType: Int? = 0,
    var frontpage_font_size: Any,
    var frontpage_font_color: String? = "",
    var frontpage_font_opacity: Int? = 0,
) : AbstractModel()

data class FavLocation(
    val coordinates: List<Double>?,
    val type: String? = ""
) : AbstractModel()