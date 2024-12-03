package com.douguizilla.appmeteorologia.data.repository

import com.douguizilla.appmeteorologia.data.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Float, lng: Float) : WeatherInfo
}