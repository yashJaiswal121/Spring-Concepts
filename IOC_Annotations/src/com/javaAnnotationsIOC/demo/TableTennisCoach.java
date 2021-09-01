package com.javaAnnotationsIOC.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tableTennisCoach")
public class TableTennisCoach implements Coach{

	private Sport sport;
	
	@Autowired
	public TableTennisCoach(@Qualifier("tableTennis") Sport sport) {
		this.sport = sport;
	}
	
	@Override
	public void doPractise() {
		System.out.println("All "+ sport.getPlayers() +" Players of Table Tennis should practise for "+ sport.getPractiseTime() +" minutes");
	}
}
