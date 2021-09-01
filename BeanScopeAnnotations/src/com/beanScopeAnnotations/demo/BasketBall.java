package com.beanScopeAnnotations.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BasketBall implements Sport{

	public BasketBall() {
		System.out.println("Contructor of Basketball sport");
	}
	
	@Override
	public int getPlayers() {
		return 10;
	}

	@Override
	public int getPractiseTime() {
		return 100;
	}
}
