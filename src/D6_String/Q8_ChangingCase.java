package D6_String;

import java.util.Scanner;

public class Q8_ChangingCase {
	private void mainCaseMethod() {
		lowerCaseMethod();
		upperCaseMethod();
	}
	
	private void lowerCaseMethod() {
		Scanner Input1=new Scanner(System.in);
		System.out.print("Enter your name in Upper Case: ");
		String userInput1=Input1.nextLine();
		
		System.out.println("Entered name is: "+userInput1);
		
		String lowerCaseRefObj = userInput1.toLowerCase();
		System.out.println("Entered name in lower Case: "+lowerCaseRefObj);
	}
	private void upperCaseMethod() {
		Scanner Input2=new Scanner(System.in);
		System.out.print("\n Enter your name in lower Case: ");
		String userInput2=Input2.nextLine();
		
		System.out.println("Entered name is: "+userInput2);
		
		String upperCaseRefObj = userInput2.toUpperCase();
		String upperCaseRefObj1 = userInput2.toUpperCase();
		System.out.println("Entered name in Upper Case: "+upperCaseRefObj);
	}
	
	public static void main(String[] args) {
		Q8_ChangingCase newObj=new Q8_ChangingCase();
		newObj.mainCaseMethod();
		
	}

}
