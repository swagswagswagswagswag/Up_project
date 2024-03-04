package com.example.weatherapi.API

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherAPI {
    @GET("forecasts/v1/daily/1day/{main}")
    fun GetNews(@Path("main") a : Int,@Query("apikey") b : String?, @Query("metric") m : Boolean = true, @Query("language") l : String? = "ru") : retrofit2.Call<Main>
}