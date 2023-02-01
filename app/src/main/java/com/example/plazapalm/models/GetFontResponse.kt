package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel
import java.io.Serializable

data class GetFontResponse(
    val data: GetFontData,
    val message: String,
    val status: Int
) : Serializable, AbstractModel()

data class GetFontData(
    val user_id: String? = "",
    val post_profile_id: String? = "",
    val frontpage_top_text: String? = "",
    val frontpage_bottom_text: String? = "",
    val frontpage_font_size: Int? = 0,
    val frontpage_font_color: String? = "",
    val frontpage_font_opacity: Int? = 0,
    val is_top_selected: Boolean?=false,
    val is_bottom_selected: Boolean?=false,
    var booking_status: Boolean? = false
) : Serializable, AbstractModel()