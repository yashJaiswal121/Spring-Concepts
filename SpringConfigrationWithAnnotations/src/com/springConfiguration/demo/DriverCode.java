package com.springConfiguration.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springConfiguration.config.ContainerConfigutaion;

public class DriverCode {

	public static void main(String[] args) {
		
		//Step2: Get the Configuration file and initialize Spring Container with it..
		 AnnotationConfigApplicationContext containerContext = new AnnotationConfigApplicationContext(ContainerConfigutaion.class);
		
		//Step3: Get Beans from Spring container
		BasketBallCoach coach1 = containerContext.getBean("basketballCoach",BasketBallCoach.class);
		Coach coach2 = containerContext.getBean("tableTennisCoach",TableTennisCoach.class);
		
		ThirdPartyApiClass thPAC = containerContext.getBean("getThirdPartyApi_IOC",ThirdPartyApiClass.class);
		
		coach1.doPractise();
		coach1.printLoggerLevel();
		coach2.doPractise();
		
		System.out.println("--------");
		
		thPAC.printMessage();
		
		
		containerContext.close();
	}

}
