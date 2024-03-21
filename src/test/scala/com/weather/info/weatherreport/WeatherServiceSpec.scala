package com.weather.info.weatherreport

import com.weather.info.weatherreport.modules.{ApiResponse, Main, Response, Weather}
import com.weather.info.weatherreport.services.WeatherService
import org.junit.Assert.assertEquals
import org.junit.{Before, Test}
import org.junit.runner.RunWith
import org.mockito.{InjectMocks, Mock}
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.mockito.Mockito.when
import org.springframework.test.util.ReflectionTestUtils

import scala.util.Try
import scala.jdk.CollectionConverters._

@RunWith(classOf[SpringRunner])
@SpringBootTest(classes = Array(classOf[Application]))
class WeatherServiceSpec {

  @InjectMocks
  private val service: WeatherService = null

  @Mock
  private val dao : WeatherApiConnector = null

  @Before
  def before(): Unit = {
    ReflectionTestUtils.setField(service, "dao", dao)
  }

  @Test
  def reportForCityTest(): Unit = {
    when(dao.getApiData("abc")).thenReturn(Try(ApiResponse(Main("1","2"),Seq(Weather("Thunderstorm")).asJava)))
    val result = service.getReportForCity("abc")
    assertEquals(Response(2f,1f,keepUmbrella = true),result.get)
  }
}
