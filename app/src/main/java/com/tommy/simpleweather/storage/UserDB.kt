package com.tommy.simpleweather.storage

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.PrimaryKey
import androidx.room.Relation
import com.tommy.simpleweather.models.User

@Entity(tableName = UserDB.TABLE_NAME)
data class UserDB(
    @PrimaryKey
    val userId: Long,
    val name: String
) {

    companion object {
        const val TABLE_NAME = "user"
    }
}

@Entity(primaryKeys = ["userId", "cityId"])
data class UserCity(
    val userId: Long,
    val cityId: Long
) {
}

data class UserWithCitiesAndForecast(
    @Embedded val user: User,
    @Relation(
        entity = CityDB::class,
        parentColumn = "userId",
        entityColumn = "cityId",
        associateBy = Junction(UserCity::class)
    )
    val cities: List<CityWithForecasts>
) {
}