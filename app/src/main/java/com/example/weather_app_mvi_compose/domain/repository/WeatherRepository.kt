package com.example.weather_app_mvi_compose.domain.repository

import com.example.weather_app_mvi_compose.domain.util.Resource
import com.example.weather_app_mvi_compose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}