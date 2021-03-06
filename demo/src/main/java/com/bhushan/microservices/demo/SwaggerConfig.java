package com.bhushan.microservices.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration

//Enable Swagger
@EnableSwagger2WebMvc
public class SwaggerConfig {

	
	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2);
	}
	
	//Bean
	//Docket
	
	
	
}
