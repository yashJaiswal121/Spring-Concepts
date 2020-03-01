package luv2code_beanscopes;

public class BaseballCoach implements Coach{
	
	public BaseballCoach(){
		System.out.println("Default constructor : Baseball");
	}
	
	public void setupBaseballCoach(){
		System.out.println("Setting up Baseball coach");
	}
	
	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from BaseballCoach";
	}
	
	public void destroyBaseballCoach(){
		System.out.println("Destroying Baseball coach");
	}

}
