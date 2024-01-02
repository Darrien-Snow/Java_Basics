package D4.LogicalPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		System.out.print("Enter the number to check Prime or Not: ");
		Scanner inputNum=new Scanner(System.in);
		int num=inputNum.nextInt();
		
		for (int i=2;i<num;i++) {
	
			if(num%i==0) {
				System.out.println(num+" is Not a prime Number");
				System.exit(0);
			} 
				
		}System.out.println(num+" is a prime Number");
		
	}

}
