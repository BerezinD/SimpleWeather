package com.tommy.simpleweather.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class City(
    val id: Long,
    val name: String,
    val country: String,
    val timeZone: TimeZone,
    val forecast: List<Forecast>
) : Parcelable {
}