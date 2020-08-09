package com.tommy.simpleweather.storage.dao

import androidx.room.Query
import androidx.room.Transaction
import com.tommy.simpleweather.storage.UserWithCitiesAndForecast

interface UserDAO {

    @Transaction
    @Query("SELECT * FROM user WHERE userId = :id")
    fun getById(id: Int): UserWithCitiesAndForecast?
}