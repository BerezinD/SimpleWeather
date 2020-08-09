package com.tommy.simpleweather.storage.mapper

import com.tommy.simpleweather.models.User
import com.tommy.simpleweather.storage.CityDB
import com.tommy.simpleweather.storage.CityWithForecasts
import com.tommy.simpleweather.storage.ForecastDB
import com.tommy.simpleweather.storage.UserWithCitiesAndForecast

class UserToDB : Mapper<User, UserWithCitiesAndForecast> {
    override fun map(from: User): UserWithCitiesAndForecast {
        return UserWithCitiesAndForecast(
            user = from,
            cities = from.cities.map { city ->
                CityWithForecasts(
                    city = CityDB(city.id, city.name, city.country, city.timeZone),
                    forecasts = city.forecast.map { forecast ->
                        ForecastDB(
                            date = forecast.date,
                            uvIndex = forecast.uvIndex,
                            windSpeed = forecast.windSpeed,
                            temperature = forecast.temperature,
                            visibility = forecast.visibility,
                            weather = forecast.weather.toString()
                        )
                    }
                )
            }
        )
    }
}