package com.weather.info.weatherreport

import com.weather.info.weatherreport.controllers.WeatherController
import com.weather.info.weatherreport.services.WeatherService
import org.junit.{Before, Test}
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.util.ReflectionTestUtils
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@RunWith(classOf[SpringRunner])
@SpringBootTest(classes = Array(classOf[Application]))
@AutoConfigureMockMvc
class WeatherControllerSpec {

  @Autowired
  private val service: WeatherService = null

  @InjectMocks
  private val controller: WeatherController = null

  private var mockMvc: MockMvc = null

  @Before
  def before(): Unit = {
    ReflectionTestUtils.setField(controller, "service", service)
    mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
  }

  @Test
  def testGetWeatherReportV2(): Unit = {
    val requestBuilder = MockMvcRequestBuilders.get(
      "/weather/report/v2?city=london")
    val actions =  mockMvc.perform(requestBuilder)
    actions.andExpect(status.isOk)
  }
}
