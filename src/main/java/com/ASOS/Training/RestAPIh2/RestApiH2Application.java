package com.ASOS.Training.RestAPIh2;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages= {"com.ASOS.Training.RestAPIh2"})
@EnableSwagger2
public class RestApiH2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApiH2Application.class, args);
	}
	
	@Bean
	public Docket config()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.ASOS.Training.RestAPIh2"))
				.build()
				.apiInfo(apiInfo1());
		
	}

	private ApiInfo apiInfo1() {
		  return new ApiInfo(
			      "My Example REST API", 
			      "Some custom description of API.", 
			      "API TOS", 
			      "Terms of service", 
			      new Contact("Hema Reddy", "www.example.com", "hema@abc.com"), 
			      "License of API", "API license URL", Collections.emptyList());
			}


}
