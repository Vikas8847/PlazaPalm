package com.example.plazapalm.models

data class UpdateLatlngResponse(
    val data: UpdateLatData,
    val message: String,
    val status: Int
)

data class UpdateLatData(
    val __v: Int,
    val _id: String,
    val business_profile_status: Boolean,
    val created_at: String,
    val devices: List<Any>,
    val dislikes: List<Any>,
    val email: String,
    val favourite: List<Any>,
    val first_name: String,
    val gallery: List<Any>,
    val isBlocked: List<Any>,
    val isPremium: Int,
    val isVerified: Boolean,
    val last_name: String,
    val likes: List<String>,
    val notification: Boolean,
    val otp: String,
    val password: String,
    val updated_at: String,
    val user_lat: Double,
    val user_location: UserLocation,
    val user_long: Double,
    val user_status: Boolean
)

data class UserLocation(
    val coordinates: List<Double>,
    val type: String
)