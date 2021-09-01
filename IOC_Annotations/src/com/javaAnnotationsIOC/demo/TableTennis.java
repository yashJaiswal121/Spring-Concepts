package com.javaAnnotationsIOC.demo;

import org.springframework.stereotype.Component;

@Component
public class TableTennis implements Sport{
	
	@Override
	public int getPlayers() {
		return 2;
	}

	@Override
	public int getPractiseTime() {
		return 20;
	}
	
}
