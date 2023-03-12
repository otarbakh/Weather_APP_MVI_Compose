package com.example.weather_app_mvi_compose.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: weatherDataDto
)
