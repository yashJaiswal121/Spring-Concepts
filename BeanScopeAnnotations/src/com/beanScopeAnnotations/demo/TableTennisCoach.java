package com.beanScopeAnnotations.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tableTennisCoach")
@Scope("singleton")
public class TableTennisCoach implements Coach{

	private Sport sport;
	
	@Autowired
	public TableTennisCoach(@Qualifier("tableTennis") Sport sport) {
		System.out.println("Contructor of TableTennisCoach ..");
		this.sport = sport;
	}
	
	//Lifecycle/Hook method of Beans
	@PostConstruct
	private void doSomeStatupStuff() {
		//Called after creation,initialization(Dep.Inj.) of Bean
		System.out.println("TableTennisCoach: Initialize a db connection, socket etc ... But donot return value from this function as it cannot be catched");
	}
	
	@Override
	public void doPractise() {
		System.out.println("All "+ sport.getPlayers() +" Players of Table Tennis should practise for "+ sport.getPractiseTime() +" minutes");
	}
	
	@Override
	public Sport sportName() {
		return this.sport;
	}
	
	//Lifecycle/Hook method of Beans
	@PreDestroy
	public void doCleanupStuff() {
		//Called just before clean/Destoy up of Bean by spring
		System.out.println("TableTennisCoach: Close a db connection, socket etc ... But donot return value from this function as it cannot be catched");
	}
	
}
