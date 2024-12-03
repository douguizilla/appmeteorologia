package com.douguizilla.appmeteorologia.data.repository

import com.douguizilla.appmeteorologia.data.model.WeatherInfo
import com.douguizilla.appmeteorologia.data.remote.RemoteDataSource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo {
        val response = remoteDataSource.getWeatherDataResponse(lat, lng)
        val weather = response.weather[0]

        return WeatherInfo(
            locationName = response.name,
            conditionIcon =
        )
    }
}