package com.tommy.simpleweather.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val id: Long,
    val name: String,
    val cities: List<City>
) : Parcelable {
}