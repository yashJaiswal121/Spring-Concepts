package com.springConfiguration.demo;

/*
 * This is a third party api class without the spring support....i.e isn't annotated with
 * @Component/other annotation to make it a spring bean... 
 * 
 * 
 * But we want to use this class object in our source code through spring ... 
 * ie auto inject it as an dependency in our application...
 * 
 * */
public class ThirdPartyApiClass {

	public ThirdPartyApiClass() {
		System.out.println("Constructor of ThirdPartyApiClass...");
	}
	
	public void printMessage() {
		System.out.println("This is a message of xyz 3rd party api methord");
	}
	
}
