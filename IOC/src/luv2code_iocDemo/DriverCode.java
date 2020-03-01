package luv2code_iocDemo;

public class DriverCode {

	public static void main(String[] args) {
		
		/*
		 * Ist requirement ok as can work with any type of coach(Baseball, cricket etc by writing a new implemenation and changing the object here)
		 * 2nd requirement -- App is still not configurable... as we have hardcoded the object
		 * */
		Coach coach = new BaseballCoach(); 
		
		
		/*
		 * Ist and 2nd requirement will be easily be solved if we make our implemenation
		 * to be used in app picked(read) from configuration file...
		 * Then we only need to change config files and not the source code ....Spring IOC
		 * 
		 * */
		System.out.println(coach.getDailyWorkout());
	}

}
