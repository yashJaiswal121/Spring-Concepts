package luv2code_iocDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoringIOC {

	public static void main(String[] args) {

		//Spring IOC to have flexibility of providing implemenations of objects
		//in our application using config files so that source code is not altered.
		//(To remove restrictions like in Driver Code)
		
		
	//Step1 & 2 : Configuring bean in applicationContext.xml(config file) 
	//	& Creating a spring container(application context) to manage and 
	//configure(instantiate) beans of application (via Object factory)  
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Step 3: Retrieveing beans from container
		//Spring IOC will give implemenation of coach class according to coachId 
		//configured in applicationContext.xml(config) file.
		Coach myCoach = ctx.getBean("coachId",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
