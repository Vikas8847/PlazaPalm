package com.example.plazapalm.models

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.annotation.RequiresApi

data class GetPostProfileResponse(
    val `data`: postData,
    val message: String,
    val status: Int
)

data class postData(
    val _id: String?,
    val address: String?,
    val booking_status: Boolean?,
    val c_id: String?,
    val category_name: String?,
    val dark_theme: Boolean?,
    val description_1: String? = "",
    val description_2: String? = "",
    val description_3: String? = "",
    val dislikeCount: Int?,
    val distance: Double?,
    val expiry_date: String?,
    val favouriteCount: Int?,
    val first_name: String? = "",
    val follow: Boolean?,
    val font_size: Int?,
    val isAddedToProfile: Boolean?,
    val isDisliked: Boolean?,
    val isFavourite: Boolean?,
    val isLiked: Boolean?,
    val isPremium: Int?,
    val last_name: String?,
    val lat: Double?,
    val likeCount: Int?,
    val location: getLocation?,
    val location_OnOff: Boolean?,
    val location_text: String? = "",
    val long: Double?,
    val postProfile_picture: List<Any>?,
    val profile_title: String? = "",
    val tags: String? = "",
    val user_id: String? = "",
    val user_name: String? = "",
    val p_id: String? = "",

    val background_color: String? = "",
    val background_type: String? = "",
    val border_color: String? = "",
    val border_opacity: Int? = 0,
    val border_width: Int? = 0,
    val column_color: String? = "",
    val column_opacity: Int? = 0,
    val font_color: String? = "",
    val font_name: String? = "",
    val font_opacity: Int? = 0,
    val profile_status: Boolean? = false


) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readInt(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt(),
        TODO("location"),
        parcel.readByte() != 0.toByte(),
        parcel.readString(),
        parcel.readDouble(),
        TODO("postProfile_picture"),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(address)
        parcel.writeByte(if (booking_status!!) 1 else 0)
        parcel.writeString(c_id)
        parcel.writeString(category_name)
        parcel.writeByte(if (dark_theme!!) 1 else 0)
        parcel.writeString(description_1)
        parcel.writeString(description_2)
        parcel.writeString(description_3)
        parcel.writeInt(dislikeCount!!)
        parcel.writeDouble(distance!!)
        parcel.writeString(expiry_date)
        parcel.writeInt(favouriteCount!!)
        parcel.writeString(first_name)
        parcel.writeByte(if (follow!!) 1 else 0)
        parcel.writeInt(font_size!!)
        parcel.writeByte(if (isAddedToProfile!!) 1 else 0)
        parcel.writeByte(if (isDisliked!!) 1 else 0)
        parcel.writeByte(if (isFavourite!!) 1 else 0)
        parcel.writeByte(if (isLiked!!) 1 else 0)
        parcel.writeInt(isPremium!!)
        parcel.writeString(last_name)
        parcel.writeDouble(lat!!)
        parcel.writeInt(likeCount!!)
        parcel.writeByte(if (location_OnOff!!) 1 else 0)
        parcel.writeString(location_text)
        parcel.writeDouble(long!!)
        parcel.writeString(profile_title)
        parcel.writeString(tags)
        parcel.writeString(user_id)
        parcel.writeString(user_name)
        parcel.writeString(p_id)
        parcel.writeString(background_color)
        parcel.writeString(background_type)
        parcel.writeString(border_color)

        try {
            if (border_opacity != null) {
                parcel.writeInt(border_opacity!!)
            }
            if (border_width != null) {
                parcel.writeInt(border_width!!)
            }
            if (column_color != null) {
                parcel.writeString(column_color!!)
            }
            if (column_opacity != null) {
                parcel.writeInt(column_opacity!!)
            }
            if (font_color != null) {
                parcel.writeString(font_color!!)
            }
            if (font_name != null) {
                parcel.writeString(font_name!!)
            }
            if (font_opacity != null) {
                parcel.writeInt(font_opacity!!)
            }
            if (profile_status != null) {
                parcel.writeBoolean(profile_status!!)
            }
        } catch (e: Exception) {
            Log.e("sdffe", e.toString())
        }

//        parcel.writeInt(border_opacity!!)
//        parcel.writeInt(border_width!!)
//        parcel.writeString(column_color)
//        parcel.writeInt(column_opacity!!)
//        parcel.writeString(font_color)
//        parcel.writeString(font_name)
//        parcel.writeInt(font_opacity!!)

        parcel.writeBoolean(profile_status!!)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<postData> {
        override fun createFromParcel(parcel: Parcel): postData {
            return postData(parcel)
        }

        override fun newArray(size: Int): Array<postData?> {
            return arrayOfNulls(size)
        }
    }
}

data class getLocation(
    val coordinates: List<Double>,
    val type: String
)