package com.spring.linux.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	  @Override 
	  public void addCorsMappings(CorsRegistry registry) { 
	    registry
	      .addMapping("/**")
	      .allowedOrigins("http://0.0.0.0:80")
	      .allowedHeaders("*") 
	      .allowedMethods("GET", "POST", "PUT", "DELETE") 
	      .allowCredentials(true); 
	  } 
}