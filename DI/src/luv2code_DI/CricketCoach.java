package luv2code_DI;

public class CricketCoach implements Coach {
	
	//For Constructor or Setter Injection of Spring DI
	DailyFortune fortuneForCricket; 
	
	//For injecting literal values by Spring DI
	private String emailAddr;
	
	public CricketCoach(){
		System.out.println("Default constructor : Cricket");
	}
	
	//Spring DI using Constructor
	public CricketCoach(DailyFortune fortuneForCricket){
		System.out.println("Param constructor : Cricket");
		this.fortuneForCricket = fortuneForCricket;
	}
	
	//Spring DI using Setter
	public void setFortuneService(DailyFortune fortuneService){
		this.fortuneForCricket = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "getDailyWorkout from CricketCoach";
	}

	@Override
	public String getFortune(){
		return fortuneForCricket.getDailyFortune("Cricket");
	}
	
	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
}