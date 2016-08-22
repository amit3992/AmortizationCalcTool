import java.util.Scanner;


public class UserLoanDetails {

	private static double loanAmount; 
	private static int duration;
	private static int creditScore;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void getLoanAmount() {
		System.out.println("Enter your loan Amount");
		loanAmount = sc.nextDouble();
	}
	
	public static void getLoanDuration() {
		System.out.println("Enter your loan duration");
		duration = sc.nextInt();
	}
	
	public static void getCreditScore() {
		System.out.println("Enter your credit score");
		creditScore = sc.nextInt();
		
	}
	
	public static void getUserDetails() {
		getLoanAmount();
		getLoanDuration();
		getCreditScore();
	}
	
}
