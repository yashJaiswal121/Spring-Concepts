package com.beanScopeAnnotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCode {

	public static void main(String[] args) {
		
		//Step2: Get the Configuration file and initialize Spring Container with it..
		ClassPathXmlApplicationContext containerContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step3: Get Beans from Spring container
		Coach coach1 = containerContext.getBean("basketballCoach",BasketBallCoach.class);//Prototype
		Coach coach11 = containerContext.getBean("basketballCoach",BasketBallCoach.class);
		
		Coach coach2 = containerContext.getBean("tableTennisCoach",TableTennisCoach.class);//Singleton
		Coach coach22 = containerContext.getBean("tableTennisCoach",TableTennisCoach.class);
		
		System.out.println(coach1 == coach11);
		System.out.println(coach1.sportName() == coach11.sportName());
		
		System.out.println(coach2 == coach22);
		System.out.println(coach2.sportName() == coach22.sportName());
		
		
		
		containerContext.close();
	}

}
