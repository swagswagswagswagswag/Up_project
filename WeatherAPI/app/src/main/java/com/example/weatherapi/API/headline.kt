package com.example.weatherapi.API

import java.text.DateFormat
import java.time.DateTimeException
import java.util.Date

data class headline(
    var EffectiveDate : Date,
    var EffectiveEpochDate : Int,
    var Severity : Int,
    var Text : String?,
    var Category : String?,
    var EndDate : Date,
    var EndEpochDate : Int,
    var MobileLink : String?,
    var Link : String?
)
