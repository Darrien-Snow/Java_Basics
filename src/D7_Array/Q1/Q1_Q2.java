package D7_Array.Q1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Q1_Q2 {

	private void sum_Average() {
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;  
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		
		float sum=0f;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter '1' for Sum of number / '2' for average:" );
		int userInput = input.nextInt();
		
		if (userInput==1) {
			for (int i=0;i<a.length;i++) {
				sum+=a[i];
			}
			System.out.println("sum of given numbers (1 to 10): "+sum);
		}
		else {
			for (int i=0;i<a.length;i++) {
				sum+=a[i];
			}
			System.out.println("sum of given numbers (1 to 10): "+sum);
			
			float avg=sum/a.length;
			System.out.println(avg);
		}
	}
	
	public static void main(String[] args) {
		Q1_Q2 obj=new Q1_Q2();
		obj.sum_Average();
	}
}
