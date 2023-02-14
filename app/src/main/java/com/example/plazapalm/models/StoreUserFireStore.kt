package com.example.plazapalm.models

import com.example.plazapalm.recycleradapter.AbstractModel

data class StoreUserFireStore(
    val uId :String?="",
    val usderName :String?="",
    val userImage :String?="",
)

data class MessageData(
    val message :String?="",
    val messageType :String?="",
    val messageTime :String?="",
    val readStatus :Boolean?=false,
    val senderuid :String?="",
    val reciveruid :String?="",
    val milisecondTime :Long?=0,
)

data class LastSeenData(
    val name :String?="",
    val message :String?="",
    val userImage :String?="",
    val milisecondTime :Any?=0,
    val chatId :String?="",
    val userId :String?="",
    val isBlock :Boolean
):AbstractModel()




