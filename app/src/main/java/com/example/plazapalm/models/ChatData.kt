package com.example.plazapalm.models

data class ChatData(
    val message:String,
    val timestamp: String,
    val senderuid:String,
    val reciveruid: String,
    val image:String,
    val messageType:String
)