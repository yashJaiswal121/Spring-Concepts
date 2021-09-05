package com.springMvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Annotation Config for replacement of  config.xml

@Configuration	
@EnableWebMvc //  --->   <mvc:annotation/> for Validation,Formatting and Conversion by Spring MVC
@ComponentScan(basePackages="com.springMvc.controller") // <component:scan base-package='...'> to enable component scanning
public class MvcConfiguration {
	
		// Defining the View Resolver Configuration
		@Bean
		public ViewResolver viewResolver() {
			
			InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
			viewResolver.setPrefix("/WEB-INF/view/");
			viewResolver.setSuffix(".jsp");
			
			return viewResolver;
		}
}
