package com.tommy.simpleweather.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.time.LocalDate

@Parcelize
data class Forecast(
    val date: LocalDate,
    val uvIndex: Int,
    val visibility: Float,
    val windSpeed: Float,
    val temperature: Float,
    val weather: Weather
) : Parcelable {
}