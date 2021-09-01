package com.springConfiguration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("basketballCoach")
public class BasketBallCoach implements Coach{

	private Sport sport;
	
	//Dependency Injection of the third party api....
	@Autowired
	private ThirdPartyApiClass thirdPartyApi;
	
	@Value("${logger.level}")
	private String loggingLevel;
	
	@Autowired
	public BasketBallCoach(@Qualifier("basketBall") Sport sport) {
		this.sport = sport;
	}
	
	@Override
	public void doPractise() {
		System.out.println("All "+ sport.getPlayers() +" Players of BasketBall should practise for "+ sport.getPractiseTime() +" minutes");
		thirdPartyApi.printMessage();
	}
	
	public void printLoggerLevel() {
		System.out.println("Logger Level in BasketBall Coach:: "+this.loggingLevel);
	}
}
