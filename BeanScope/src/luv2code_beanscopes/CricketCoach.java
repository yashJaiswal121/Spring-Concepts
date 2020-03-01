package luv2code_beanscopes;

public class CricketCoach implements Coach {
	
	
	public CricketCoach(){
		System.out.println("Default constructor : Cricket");
	}

	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from CricketCoach";
	}
}