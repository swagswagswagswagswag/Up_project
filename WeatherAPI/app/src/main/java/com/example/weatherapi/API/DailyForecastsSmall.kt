package com.example.weatherapi.API

import java.util.Date

data class DailyForecastsSmall(
    var Date : Date,
    var EpochDate : Int,
    var Temperature : Temperature,
    var Day : DayOrNight,
    var Night : DayOrNight
)
