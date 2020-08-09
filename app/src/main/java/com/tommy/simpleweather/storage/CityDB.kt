package com.tommy.simpleweather.storage

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.*

@Entity(tableName = UserDB.TABLE_NAME)
data class CityDB(
    @PrimaryKey
    val cityId: Long,
    val name: String,
    val country: String,
    val timeZone: TimeZone
) {

    companion object {
        const val TABLE_NAME = "city"
    }
}

@Entity(primaryKeys = ["cityId", "forecastId"])
data class CityForecast(
    val cityId: Long,
    val forecastId: Int
)

data class CityWithForecasts(
    @Embedded val city: CityDB,
    @Relation(
        parentColumn = "cityId",
        entityColumn = "forecastId",
        associateBy = Junction(CityForecast::class)
    )
    val forecasts: List<ForecastDB>
)