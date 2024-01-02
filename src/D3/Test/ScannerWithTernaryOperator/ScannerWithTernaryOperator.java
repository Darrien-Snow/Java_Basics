package D3.Test.ScannerWithTernaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//then press Enter. You can now see whitespace characters in your code.
public class ScannerWithTernaryOperator {
 public static void main(String[] args) {
     int eligible=18;
     System.out.println("Enter age:");
     Scanner ageofperson=new Scanner(System.in);
     int age=ageofperson.nextInt();
     String data=(age >= eligible)? "You are Major":" You are Minor";
     System.out.println(data);
     String cars []={"tata","nissan","Suzuki"};
     
     for(String car:cars)
    	 System.out.println(car);
    
	}

}
