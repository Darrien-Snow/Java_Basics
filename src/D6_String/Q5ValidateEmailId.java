package D6_String;

import java.util.Scanner;

public class Q5ValidateEmailId {
	public static void main(String[] args) {
		
		Scanner Input1=new Scanner(System.in);
		System.out.print("Enter your Email ID: ");
		String userInput1=Input1.nextLine();
		
		boolean containsRef=userInput1.contains("@");
		boolean checkRef=userInput1.contains("gmail");
		
		if(containsRef==true && checkRef==true) {
		
			System.out.println("'@ & gmail' present in the given Email ID");
			String modifiedEmail=userInput1.replace("gmail", "yahoo");
			System.out.println("\nDomain Modified Email:  "+modifiedEmail);
		}
		else {
			System.out.println("Enter valid Email ID with '@, gmail'");
		}
		
	
	}
}
	

