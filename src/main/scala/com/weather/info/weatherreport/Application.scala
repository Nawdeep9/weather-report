package com.weather.info.weatherreport

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application{
  import org.springframework.boot.web.client.RestTemplateBuilder
  import org.springframework.context.annotation.Bean
  import org.springframework.web.client.RestTemplate

  @Bean def restTemplate(builder: RestTemplateBuilder): RestTemplate = builder.build
}

object Application extends App {
  SpringApplication.run(classOf[Application])
}
