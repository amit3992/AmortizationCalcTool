// Class to get APR from user's credit score

public class APRMap {
	
	private static int creditScore;
	private static double apr;
	
	public static double getAPRFromCreditScore(int cs) {
		creditScore = cs;
		
		if(creditScore < 580) {
			apr = 20.00;
			System.out.println("You have very poor credit rating. Your apr is calucated as: "+apr);
		}
		
		else if(581 <= creditScore && creditScore <= 640) {
			apr = 15.00;
			System.out.println("You have poor credit rating. Your apr is calucated as: "+apr);
		}
		
		else if(641 <= creditScore && creditScore <= 700) {
			apr = 10.00;
			System.out.println("You have average credit rating. Your apr is calucated as: "+apr);
		}
		
		else if(701 <= creditScore && creditScore <= 750) {
			apr = 5.00;
			System.out.println("You have good credit rating. Your apr is calucated as: "+apr);
		}
		else if(751 <= creditScore && creditScore <= 840) {
			apr = 2.00;
			System.out.println("You have excellent credit rating. Your apr is calucated as: "+apr);
		}
		else if (creditScore > 840) {
			System.out.println("Error! Invalid credit score!");
			apr = 60.00;
		}
		
		return apr;
		
		
		
	}    

}
