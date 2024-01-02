package D4.LogicalPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int Factorial=1;
		System.out.print("Enter Factorial Number:");
		
		Scanner inputFact=new Scanner(System.in);
		int FactNum=inputFact.nextInt();
		
		for(int i=1;i<=FactNum;i++) {
			
			Factorial=Factorial*i;
		}
		System.out.println("Factorial of "+FactNum+": "+Factorial);
	}


}
