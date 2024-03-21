package com.weather.info.weatherreport.modules

case class Response(pressure : Float, temperature : Float, keepUmbrella : Boolean) {
  override def toString: String =
    s"""Temperature: ${this.temperature}, Pressure: ${this.pressure}, umbrella needed : ${this.keepUmbrella}"""
}
