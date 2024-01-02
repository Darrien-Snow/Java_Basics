package D4.LogicalPrograms;

import java.util.Scanner;

public class FindVoteEligible {
	public static void main(String[] args) {
		
	System.out.println("Enter your Age:");
		Scanner inputAge = new Scanner(System.in); {
		int age = inputAge.nextInt();
		
		String voteCheck=(age>=18)? "the person is eligible to vote ":"the person is NOT eligible to vote";
		System.out.println(voteCheck);
	}
	}

}
