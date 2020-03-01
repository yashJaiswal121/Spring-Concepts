package luv2code_beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Here not using Prototype scoped bean as onDestroy lifecycle meth 
		//not work for them...see video
		
		//BeanLifeCycle in spring:
		//Bean-Instantiated -> Dependencies Injected -> Spring Preprocessing -> Your Custom Init method(for allocating resources like opening a file,Websockets) -> Bean ready to used -->Your Custom destroy method --> Bean destoyed 
		
		//Beans requested from container(Singleton by default)
		Coach baseballCoach1 = ctx.getBean("coachIdBaseball",Coach.class);
				
		System.out.println("-----------For baseball:--------------");
		System.out.println("Workout: "+baseballCoach1.getDailyWorkout());
		
		//Beans on destroy will be called when container is closed
		ctx.close();
		
	}

}
