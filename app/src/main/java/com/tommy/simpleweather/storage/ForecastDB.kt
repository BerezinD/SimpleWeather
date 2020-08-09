package com.tommy.simpleweather.storage

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = UserDB.TABLE_NAME)
data class ForecastDB(
    val date: LocalDate,
    val uvIndex: Int,
    val visibility: Float,
    val windSpeed: Float,
    val temperature: Float,
    val weather: String
) {
    @PrimaryKey(autoGenerate = true)
    var forecastId: Long = 0

    companion object {
        const val TABLE_NAME = "Forecast"
    }
}