package D4.LogicalPrograms;

import java.util.Scanner;

public class PrintEvenNumbers {
	
	public static void main(String[] args) {
		System.out.println("Enter the last number:");
		Scanner input=new Scanner(System.in);
		int lastnumber = input.nextInt();
		
	for (int i=1;i<=lastnumber;i++) {
		if(i%2==0)
		{
			System.out.print(i+",");
		}
	}
	}

}
