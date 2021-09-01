package com.javaAnnotationsIOC.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("basketballCoach")
public class BasketBallCoach implements Coach{

	private Sport sport;
	
	@Autowired
	public BasketBallCoach(@Qualifier("basketBall") Sport sport) {
		this.sport = sport;
	}
	
	@Override
	public void doPractise() {
		System.out.println("All "+ sport.getPlayers() +" Players of BasketBall should practise for "+ sport.getPractiseTime() +" minutes");
	}
}
