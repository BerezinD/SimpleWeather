package com.tommy.simpleweather.models

import java.util.TimeZone

data class City(
    val id: Long,
    val name: String,
    val country: String,
    val timeZone: TimeZone,
    val forecast: Forecast
) {
}