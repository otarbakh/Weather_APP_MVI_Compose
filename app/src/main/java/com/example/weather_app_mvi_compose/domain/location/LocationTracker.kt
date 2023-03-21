package com.example.weather_app_mvi_compose.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation():Location?
}