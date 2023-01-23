package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel

data class PicturesModel(
    var image: String,
    var type:Int
) : AbstractModel()