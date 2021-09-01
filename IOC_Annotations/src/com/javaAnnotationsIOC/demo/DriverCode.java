package com.javaAnnotationsIOC.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaAnnotationsIOC.FilePropertiesDemo.FilePropertyInjector;

public class DriverCode {

	public static void main(String[] args) {
		
		//Step2: Get the Configuration file and initialize Spring Container with it..
		ClassPathXmlApplicationContext containerContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step3: Get Beans from Spring container
		Coach coach1 = containerContext.getBean("basketballCoach",BasketBallCoach.class);
		Coach coach2 = containerContext.getBean("tableTennisCoach",TableTennisCoach.class);
		
		//Printing values from a property file:
		FilePropertyInjector injBean = containerContext.getBean("filePropInjector",FilePropertyInjector.class);
		
		coach1.doPractise();
		coach2.doPractise();
		injBean.printEmailConfig();
		
		containerContext.close();
	}

}
