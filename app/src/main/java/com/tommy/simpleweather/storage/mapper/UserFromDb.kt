package com.tommy.simpleweather.storage.mapper

import com.tommy.simpleweather.models.City
import com.tommy.simpleweather.models.Forecast
import com.tommy.simpleweather.models.User
import com.tommy.simpleweather.models.Weather
import com.tommy.simpleweather.storage.UserWithCitiesAndForecast

internal object UserFromDb : Mapper<UserWithCitiesAndForecast, User> {
    override fun map(from: UserWithCitiesAndForecast): User {
        return User(
            id = from.user.id,
            name = from.user.name,
            cities = from.cities.map { cityWithForecasts ->
                City(
                    id = cityWithForecasts.city.cityId,
                    name = cityWithForecasts.city.name,
                    country = cityWithForecasts.city.country,
                    timeZone = cityWithForecasts.city.timeZone,
                    forecast = cityWithForecasts.forecasts.map { forecastDB ->
                        Forecast(
                            date = forecastDB.date,
                            uvIndex = forecastDB.uvIndex,
                            visibility = forecastDB.visibility,
                            temperature = forecastDB.temperature,
                            windSpeed = forecastDB.windSpeed,
                            weather = Weather.valueOf(forecastDB.weather)
                        )
                    }
                )
            }
        )
    }
}