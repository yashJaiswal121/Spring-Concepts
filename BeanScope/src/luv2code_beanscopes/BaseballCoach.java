package luv2code_beanscopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BaseballCoach implements Coach{
	
	public BaseballCoach(){
		System.out.println("Default constructor : Baseball");
	}
	
//	@PostConstruct   //-> Singleton Scope->So called only once while bean creation...
	//equivalent to 'init-method' in xml config
	//Will be called after contructor and DI
	public void setupBaseballCoach(){
		System.out.println("Setting up Baseball coach");
	}
	
	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from BaseballCoach";
	}
	
//	@PreDestroy          //-> Singleton Scope->So called only once just before bean destruction on container closing...
	//equivalent to 'destroy-method' in xml config
	//Note: Donot work with Prototype bean
	/*
	 * In contrast to the other scopes, Spring does not manage the complete lifecycle of a
		prototype bean: the container instantiates, configures, and otherwise assembles a
		prototype object, and hands it to the client, with no further record of that prototype
		instance.
		
		Thus, although initialization lifecycle callback methods are called on all objects 
		regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks
		 are not called. The client code must clean up prototype-scoped objects and release
		  expensive resources that the prototype bean(s) are holding.   
	 * */
	public void destroyBaseballCoach(){
		System.out.println("Destroying Baseball coach");
	}

}
