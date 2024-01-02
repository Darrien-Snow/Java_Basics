package D6_String;

import java.util.Scanner;

public class Q6PhoneNumber {
	public static void main(String[] args) {
		
		Scanner Input1=new Scanner(System.in);
		System.out.print("Enter your phone number: ");
		String userInput1=Input1.nextLine();
		
		int PhLength=userInput1.length();
		if(PhLength==10) {
			System.out.println("Thank you for sharing VALID Ph number");
		}
		else {
			System.out.println("Invalid Ph number");
		}
	
		
	}

}
