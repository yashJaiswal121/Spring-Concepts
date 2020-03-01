package luv2code_DI;

public class BaseballCoach implements Coach{
	
	DailyFortune fortuneForBaseball;
	//Spring DI using Constructor
	public BaseballCoach(DailyFortune fortune){
		fortuneForBaseball = fortune;
	}
	
	public BaseballCoach(){
		System.out.println("Default constructor : Baseball");
	}
	
	//Spring DI using Setter
		public void setFortuneService(DailyFortune fortuneService){
			System.out.println("Param constructor : Baseball");
			this.fortuneForBaseball = fortuneService;
		}
	
	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from BaseballCoach";
	}

	@Override
	public String getFortune(){
		return fortuneForBaseball.getDailyFortune("Baseball");
	}
}
