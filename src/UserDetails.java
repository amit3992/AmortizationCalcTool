import java.util.*;


public class UserDetails {
	
	private static String firstName; 
	private static String lastName;
	private static String address;
	private static String phoneNumber;
	private static int creditScore;
	
	static Scanner sc = new Scanner(System.in);
	private static String address2;
	
	public static void getName() {
		System.out.println("Please enter your name in the format -> (firstName lastName)");
		String name = sc.nextLine();
		String [] fullName = name.split(" ");
		
		firstName = fullName[0];
		lastName = fullName[fullName.length-1];
		
	}
	
	public static void getAddress() {
		System.out.println("Enter your address");
		address = sc.nextLine();
	}
	
	public static void getPhoneNumber() {
		System.out.println("Enter your Phone Number");
		phoneNumber = sc.nextLine();
	}
	
	public static void getCreditScore() {
		System.out.println("Enter your credit score");
		creditScore = sc.nextInt();
	}
	
	public static void printName() {
		
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
	}
	
	public static void getUserDetails() {
		
		getName();
		getAddress();
		getPhoneNumber();
		getCreditScore();
	}
	
}
