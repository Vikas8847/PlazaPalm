package com.example.plazapalm.views.dashboard

 data class DashBoardPostData(
    val c_id: ArrayList<String>,
    var lat: String,
    var limit: String,
    var long: String,
    var miles: String,
    var offset: String,
    val search: String
)