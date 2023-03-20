package com.example.weather_app_mvi_compose.data.r.repository

import com.example.weather_app_mvi_compose.data.r.mappers.toWeatherInfo
import com.example.weather_app_mvi_compose.data.r.remote.WeatherAPI
import com.example.weather_app_mvi_compose.domain.repository.WeatherRepository
import com.example.weather_app_mvi_compose.domain.util.Resource
import com.example.weather_app_mvi_compose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat =lat,
                    long =long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred. ")
        }
    }
}