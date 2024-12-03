package com.douguizilla.appmeteorologia.data.remote

import com.douguizilla.appmeteorologia.data.remote.response.WeatherDataResponse

interface RemoteDataSource {
    suspend fun getWeatherDataResponse(lat: Float, lng: Float) : WeatherDataResponse
}