package luv2code_DI;

public class GetFortuneDICoach implements DailyFortune{

	@Override
	public String getDailyFortune(String game) {
		return "Yesh Fortune is best" + "[ "+game+" ]";
	}
	
}
