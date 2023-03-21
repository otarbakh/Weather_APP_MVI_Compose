package com.example.weather_app_mvi_compose.di

import com.example.weather_app_mvi_compose.data.r.location.DefaultLocationTracker
import com.example.weather_app_mvi_compose.data.r.repository.WeatherRepositoryImpl
import com.example.weather_app_mvi_compose.domain.location.LocationTracker
import com.example.weather_app_mvi_compose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ):WeatherRepository

}