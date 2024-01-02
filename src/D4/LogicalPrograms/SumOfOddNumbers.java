package D4.LogicalPrograms;

import java.util.Scanner;

public class SumOfOddNumbers {
	private void sumOfOdd() {
		int sumOdd=0;
		System.out.println("Enter the First number:");
		
		Scanner inputFirstnum = new Scanner (System.in);
		int FirstNumber=inputFirstnum.nextInt();
		
			System.out.println("Enter the last number:");
			
			Scanner inputlastNum=new Scanner(System.in);
			int lastnumber = inputlastNum.nextInt();
			
			
		for (int i=FirstNumber;i<=lastnumber;i++) {
			if(i%2!=0)
			{
				
				sumOdd = sumOdd+i;
			}
		}
		System.out.println("Sum of Odd number from"+FirstNumber+"to"+lastnumber+"is: "+ sumOdd);
		}
	public static void main(String[] args) {
		SumOfOddNumbers objOdd=new SumOfOddNumbers();
		objOdd.sumOfOdd();
	}

	}


