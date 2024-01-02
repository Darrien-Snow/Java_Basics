package D6_String;

import java.util.Scanner;

public class Q4GetUserInput_CheckEquality {
	public static void main(String[] args) {
		System.out.print("Enter your first input: ");
		Scanner Input1=new Scanner(System.in);
		String userInput1=Input1.nextLine();
		System.out.print("Enter your second input: ");
		Scanner input2=new Scanner (System.in);
		String userInput2=input2.nextLine();
		boolean equalsRef=userInput1.equals(userInput2);
		System.out.println("1st User input: "+ userInput1);
		System.out.println("2nd User input: "+userInput2);
		if(equalsRef==true) {
		System.out.println(userInput1+" (Equals To) "+userInput2);
	}
		else {
			System.out.println(userInput1+" (Not Equals) "+userInput2);
		}
	}
}
