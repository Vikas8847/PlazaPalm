package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel
import java.io.Serializable

data class SelectedDataModelList(
    var cateName: String?="",
    var cate_ID: String?="",
    var adapterPos: Int?=0,
    var istrue: Boolean?=false,
    var count: String ="",
    var checkSlider:Boolean?=false
    ) : Serializable , AbstractModel()