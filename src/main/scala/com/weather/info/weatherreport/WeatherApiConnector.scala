package com.weather.info.weatherreport

import com.weather.info.weatherreport.modules.ApiResponse
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

import scala.util.Try

@Component
class WeatherApiConnector {

  @Value("${baseUri}")
  private val baseUri = ""

  @Value("${apiKey}")
  private val apiKey = ""

  @Value("${units}")
  private val units = "metric"

  @Autowired
  private val restTemplate : RestTemplate = null

  def getApiData(city: String): Try[ApiResponse] = {
    val uri = s"$baseUri?q=$city&appid=$apiKey&units=$units"
    Try(restTemplate.getForObject(uri, classOf[ApiResponse]))
  }
}
