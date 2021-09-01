package com.beanScopeAnnotations.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TableTennis implements Sport{
	
	public TableTennis() {
		System.out.println("Constructor of TableTennis sport...");
	}
	
	@Override
	public int getPlayers() {
		return 2;
	}

	@Override
	public int getPractiseTime() {
		return 20;
	}
	
}
