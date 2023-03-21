package com.example.weather_app_mvi_compose.presentation

import com.example.weather_app_mvi_compose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null

)
