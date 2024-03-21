package com.weather.info.weatherreport.services

import com.weather.info.weatherreport.WeatherApiConnector
import com.weather.info.weatherreport.modules.Response
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import scala.util.Try

@Service
class WeatherService {

  @Autowired
  private val dao : WeatherApiConnector = null

  private val badWeather = Set("Thunderstorm", "Drizzle", "Rain")

  /**
   * Write a micro service that,
   *
   * @param city for a given city name
   * @return returns the 1. current temperature
   *         2. air pressure and
   *         3. an indicator of whether you should take an umbrella with you or not.
   */
  def getReportForCity(city: String): Try[Response] = {
    val data = dao.getApiData(city)
    data.map( d => Response(
      temperature = d.main.temp.toFloat,
      pressure = d.main.pressure.toFloat,
      keepUmbrella = badWeather.contains(d.weather.get(0).main)))
  }


}