package luv2code_beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopes {

	public static void main(String[] args) {
		
		//There are many of bean scopes(in video) , but we will first look following.. 
		//Singleton - Default Scope of Beans in spring[mainly used for stateless data]
		//Prototype[as new keyword] - Scope which makes a new object of bean at each container request[Used for stateful data].But we cannot call ondestroy() of beanlife-cycle on it
		
		//WE made baseball coaches as singleton and cricket coaches as prototype
		//So each time we request a bean of(from container):
		//a>baseball -> we will get same shared object of baseball .. made once by container on every request from container
		//b>cricket ->  we will get a new object of cricket everytime requested from container
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Beans requested 1st time from container
		Coach baseballCoach1 = ctx.getBean("coachIdBaseball",Coach.class);
		Coach cricketCoach1 = ctx.getBean("coachIdCricket",Coach.class);
		
		//Beans requested 2nd time from container
		Coach baseballCoach2 = ctx.getBean("coachIdBaseball",Coach.class);
		Coach cricketCoach2 = ctx.getBean("coachIdCricket",Coach.class);
		
		//Compare memory locn(references[hash]) of both objs to see if they are same objs 
		boolean isBaseballObjsSame = baseballCoach1 == baseballCoach2; // should be true(SINGLETON scope)... also will call default constructor of Baseball once due to Singleton scope
		
		//Compare memory locn(references[hash]) of both objs to see if they are same objs 
		boolean isCricketObjsSame = cricketCoach1 == cricketCoach2;// should be true(PROTOTYPE scope)...also will call Cricket's default constructor 2 times due to its prototype scope
		
		System.out.println("BAseball objs are same? -> "+isBaseballObjsSame);
		System.out.println("Cricket objs are same? -> "+isCricketObjsSame);
		
		System.out.println("-----------For baseball:--------------");
		System.out.println("Workout: "+baseballCoach1.getDailyWorkout());
		System.out.println("-----------For Cricket:--------------");
		System.out.println("Workout: "+cricketCoach1.getDailyWorkout());		
	}

}
