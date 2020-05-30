package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

//实时天气信息接口返回的JSON数据的数据模型类
class RealtimeResponse(val status: String, val result: Result) {

    class Result(val realtime: Realtime)

    class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    class AirQuality(val aqi: AQI)

    class AQI(val chn: Float)

}