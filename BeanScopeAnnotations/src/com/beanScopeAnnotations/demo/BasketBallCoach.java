package com.beanScopeAnnotations.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("basketballCoach")
@Scope("prototype")
public class BasketBallCoach implements Coach{

	private Sport sport;
	
	@Autowired
	public BasketBallCoach(@Qualifier("basketBall") Sport sport) {
		System.out.println("Contructor of BasketballCoach...");
		this.sport = sport;
	}
	
	@Override
	public void doPractise() {
		System.out.println("All "+ sport.getPlayers() +" Players of BasketBall should practise for "+ sport.getPractiseTime() +" minutes");
	}

	@Override
	public Sport sportName() {
		return this.sport;
	}
	
}
