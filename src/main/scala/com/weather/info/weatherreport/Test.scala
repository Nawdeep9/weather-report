package com.weather.info.weatherreport
import com.weather.info.weatherreport.modules.{Main, Response}
object Test extends App{
//  implicit val formats = DefaultFormats
//  val jsonString = """{
//                     |  "coord": {
//                     |    "lon": -0.1257,
//                     |    "lat": 51.5085
//                     |  },
//                     |  "weather": [
//                     |    {
//                     |      "id": 801,
//                     |      "main": "Clouds",
//                     |      "description": "few clouds",
//                     |      "icon": "02d"
//                     |    }
//                     |  ],
//                     |  "base": "stations",
//                     |  "main": {
//                     |    "temp": 288.59,
//                     |    "feels_like": 287.68,
//                     |    "temp_min": 286.48,
//                     |    "temp_max": 289.96,
//                     |    "pressure": 1026,
//                     |    "humidity": 57
//                     |  },
//                     |  "visibility": 10000,
//                     |  "wind": {
//                     |    "speed": 2.57,
//                     |    "deg": 0
//                     |  },
//                     |  "clouds": {
//                     |    "all": 16
//                     |  },
//                     |  "dt": 1653730205,
//                     |  "sys": {
//                     |    "type": 2,
//                     |    "id": 268730,
//                     |    "country": "GB",
//                     |    "sunrise": 1653709970,
//                     |    "sunset": 1653768182
//                     |  }	,
//                     |  "timezone": 3600,
//                     |  "id": 2643743,
//                     |  "name": "London",
//                     |  "cod": 200
//                     |}""".stripMargin
//  val jValue = parse(jsonString)
//  val data = jValue.extract[Response]
//  val result = Result(
//    temperature = data.main.temp.toFloat,
//    pressure = data.main.pressure.toFloat,
//    keepUmbrella = false
//  )
//  print(result)
}
