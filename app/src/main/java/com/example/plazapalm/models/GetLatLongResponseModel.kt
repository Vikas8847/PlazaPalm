package com.example.plazapalm.models

data class GetLatLongResponseModel(
    val data: GetLatLngData,
    val message: String,
    val status: Int
)

data class GetLatLngData(
    val booking_status: Boolean,
    val user_id: String,
    val user_lat: Double,
    val user_location: GetLatLngUserLocation,
    val user_long: Double
)

data class GetLatLngUserLocation(
    val coordinates: List<Double>,
    val type: String
)

