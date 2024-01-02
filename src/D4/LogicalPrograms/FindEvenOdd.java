package D4.LogicalPrograms;

import java.util.Scanner;

public class FindEvenOdd {
	private void evenOdd() {
		System.out.println("Enter the Number:");
		Scanner inputNum=new Scanner(System.in);
		int Number = inputNum.nextInt();
		
		if (Number%2==0)
			System.out.println(Number+" is Even number");
		else
			System.out.println(Number+" is Odd Number");

	}
	public static void main(String[] args) {
		FindEvenOdd objCall=new FindEvenOdd();
		objCall.evenOdd();
	}

}
