package com.javaAnnotationsIOC.demo;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Sport{

	@Override
	public int getPlayers() {
		return 10;
	}

	@Override
	public int getPractiseTime() {
		return 100;
	}
}
