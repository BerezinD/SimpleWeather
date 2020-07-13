package com.tommy.simpleweather.models

import java.time.LocalDate

data class Forecast(
    val date: LocalDate,
    val uvIndex: Int,
    val visibility: Float,
    val windSpeed: Float,
    val temperature: Float,
    val weather: Weather
) {
}