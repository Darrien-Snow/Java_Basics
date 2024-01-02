package D6_String;

import java.util.Scanner;

public class Starts_Ends_With {
	public static void main(String[] args) {
		Scanner Input1=new Scanner(System.in);
		System.out.print("Enter First input: ");
		String userInput1=Input1.nextLine();
//	Starts With
		boolean userInput1Ref=userInput1.startsWith("Welcome");
		System.out.println("Is it starts with:"+userInput1Ref);
//		Ends With
		boolean userInput2Ref=userInput1.endsWith("Welcome");
		System.out.println("Is it ends with: "+userInput2Ref);
//		String Empty or not
		boolean userEmptyRef=userInput1.isEmpty();
		System.out.println("Is String empty: "+userEmptyRef);
		int ref=System.identityHashCode(userInput1);
		System.out.println(ref);
	}

}
