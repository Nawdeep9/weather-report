package com.weather.info.weatherreport.controllers

import com.weather.info.weatherreport.services.WeatherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}

import scala.util.{Failure, Success}

@RestController
class WeatherController {

  @Autowired
  val service : WeatherService = null

  @GetMapping(path = Array("/weather/report/v2"))
  def getWeatherReportV2(@RequestParam(required = true) city : String): ResponseEntity[String] =
    service.getReportForCity(city) match {
      case Success(v) => new ResponseEntity(v.toString,HttpStatus.OK)
      case Failure(ex) => new ResponseEntity(s"""{message: ${ex.getLocalizedMessage}}""", HttpStatus.NO_CONTENT)
    }
}
