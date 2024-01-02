package D4.LogicalPrograms;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
//		getting input from user
		System.out.print("Enter the Fibonacci Number: ");
		Scanner input=new Scanner(System.in);
		int UserFib=input.nextInt();
		
		/*0,1,1,2,3,5,8,13,21,34.........
		  A,B
		*/
//		Initial declaration 
		
		int a=0,b=1;
		int Fibonacci=1;
		System.out.println("Fibonacci series from 1 to "+ UserFib+"is: ");	
		System.out.print(a+","+b);

			
		while (Fibonacci<=UserFib) {
			
			Fibonacci=a+b;
			if (Fibonacci>=100) { 
				break;}
			System.out.print( ","+Fibonacci);
			a=b;
			b=Fibonacci;

			Fibonacci++;	
		}
	}

}
