package luv2code_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DI_Demo {
	
	public static void main(String[] args){
		//Constructor Injection - DI meth 1(applicationContext.xml)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach baseballCoach = ctx.getBean("coachIdBaseball",Coach.class);
		Coach cricketCoach = ctx.getBean("coachIdCricket",Coach.class);
		
		System.out.println("-----------For baseball[Constructor]:--------------");
		System.out.println("Workout: "+baseballCoach.getDailyWorkout());
		System.out.println("Fortune: "+baseballCoach.getFortune());

		System.out.println("-----------For Cricket[Constructor]:--------------");
		System.out.println("Workout: "+cricketCoach.getDailyWorkout());
		System.out.println("Fortune: "+cricketCoach.getFortune());
		
		
		//Setter Injection - DI meth 2(applicationContext.xml)
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach baseballCoach2 = ctx2.getBean("coachIdBaseballSetter",Coach.class);
		Coach cricketCoach2 = ctx2.getBean("coachIdCricketSetter",Coach.class);
		
		System.out.println("-----------For baseball[Setter]:--------------");
		System.out.println("Workout: "+baseballCoach2.getDailyWorkout());
		System.out.println("Fortune: "+baseballCoach2.getFortune());

		System.out.println("-----------For Cricket[Setter]:--------------");
		System.out.println("Workout: "+cricketCoach2.getDailyWorkout());
		System.out.println("Fortune: "+cricketCoach2.getFortune());

		
			
		
		
		//TODO:Injecting values from Properties file
		
		
		
		//TODO:Injecting Literal values
		Coach cricketCoach3 = ctx2.getBean("coachIdCricketInjLit",Coach.class);

		System.out.println("-----------For Cricket[Injecting Literals by DI]:--------------");
		System.out.println("Workout: "+cricketCoach3.getDailyWorkout());
		System.out.println("Fortune: "+cricketCoach3.getFortune());
		System.out.println("Email: "+((CricketCoach)cricketCoach3).getEmailAddr());
		
		
	}

}
