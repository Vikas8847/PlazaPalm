package com.example.plazapalm.models

import android.os.Parcel
import android.os.Parcelable
import com.example.plazapalm.recycleradapter.AbstractModel

data class CategoriesResponseModel(
    val data: List<CategoriesData>?,
    val message: String?,
    val status: Int?
) : AbstractModel(), Parcelable {

    constructor(parcel: Parcel) : this(
        TODO("data"),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(message)
        parcel.writeValue(status)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoriesResponseModel> {
        override fun createFromParcel(parcel: Parcel): CategoriesResponseModel {
            return CategoriesResponseModel(parcel)
        }

        override fun newArray(size: Int): Array<CategoriesResponseModel?> {
            return arrayOfNulls(size)
        }
    }
}

data class CategoriesData(
    val _id: String? = "",
    val category_name: String = "",
    val count: String = "",
    var isCheck: Boolean? = false
) : AbstractModel(), Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(_id)
        parcel.writeString(category_name)
        parcel.writeString(count)
        parcel.writeValue(isCheck)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoriesData> {
        override fun createFromParcel(parcel: Parcel): CategoriesData {
            return CategoriesData(parcel)
        }

        override fun newArray(size: Int): Array<CategoriesData?> {
            return arrayOfNulls(size)
        }
    }
}




/*data class CategoriesResponseModel(
    val data: List<CategoriesData>?,
    val message: String?,
    val status: Int?
):AbstractModel()
data class CategoriesData(
    val _id: String? = "",
    val category_name: String = "",
    val count: String = "",
    var isCheck:Boolean?=false
) : AbstractModel()*/
