package com.weather.info.weatherreport.modules

import com.fasterxml.jackson.annotation.JsonProperty

case class ApiResponse(@JsonProperty("main") main : Main, @JsonProperty("weather") weather: java.util.List[Weather])
case class Main(@JsonProperty("temp") temp : String, @JsonProperty("pressure") pressure: String)
case class Weather(@JsonProperty("main") main : String)
