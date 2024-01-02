package D6_String;

import java.util.Scanner;

public class Q7Replace {
	public static void main(String[] args) {
		
		Scanner Input1=new Scanner(System.in);
		System.out.print("Enter First input: ");
		String userInput1=Input1.nextLine();
		
		System.out.println("Your First input is: "+ userInput1 );
		
		Scanner replaceOld=new Scanner(System.in);
		System.out.print("Which word you want to replace: ");
		String userReplace=replaceOld.nextLine();
		
		Scanner replaceNew=new Scanner(System.in);
		System.out.print("Which new word to replace: ");
		String userReplaceNew=replaceNew.nextLine();

		String replaceRef=userInput1.replace(userReplace, userReplaceNew);
		System.out.println("Modifed new sentence \n");
		System.out.println(replaceRef);
	
		
	}

}
