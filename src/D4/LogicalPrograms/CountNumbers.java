package D4.LogicalPrograms;

import java.util.Scanner;

public class CountNumbers {
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the First number:");
		Scanner inputFirstnum = new Scanner (System.in);
		int FirstNumber=inputFirstnum.nextInt();
		
			System.out.println("Enter the last number:");
			
			Scanner inputlastNum=new Scanner(System.in);
			int lastnumber = inputlastNum.nextInt();
			
			
		for (int i=FirstNumber;i<=lastnumber;i++) {
			if(i%2!=0)	
			{
			count++;
			}
	}
		System.out.println("Total even numbers count from"+FirstNumber+"to"+lastnumber+"is: "+count);
	}
}
