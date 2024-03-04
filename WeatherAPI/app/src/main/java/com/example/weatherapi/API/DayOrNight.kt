package com.example.weatherapi.API

data class DayOrNight(
    var Icon : Int,
    var IconPhrase : String?,
    var HasPrecipitation : Boolean,
    var PrecipitationType : String?,
    var PrecipitationIntensity : String?
)
