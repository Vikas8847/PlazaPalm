package com.example.plazapalm.models

data class GetMapFeature(
    val data: GetMapData,
    val message: String,
    val status: Int
)

data class GetMapData(
    val dark_theme: Boolean,
    val follow: Boolean,
    val location_OnOff: Boolean,
    val user_id: String,
    val user_lat: Int,
    val user_long: Int
)