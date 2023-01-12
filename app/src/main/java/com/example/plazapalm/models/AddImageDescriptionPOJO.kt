package com.example.plazapalm.models

data class AddImageDescriptionPOJO(
    var Image: String? = "", var Desc: String? = "", var Video: String? = "",
    var fontColor: String? = "", var fontSize: Int? = 0, var fontOpacity: Int? = 0,
    var columnColor: String? = "", var borderSiz: Int? = 0, var borderColor: String? = ""
)