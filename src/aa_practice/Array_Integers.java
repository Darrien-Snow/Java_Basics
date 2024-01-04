package aa_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Integers {

	List<Integer> data1 = Arrays.asList(10, 900, 67, 391, 3333, 783);
	
	List<String> data2=Arrays.asList("Taj","Novotel","Dass","Mahe");

	private void ascending_Order() {
		Collections.sort(data1);
		System.out.println("Ascending Order"+data1);
		
		Collections.sort(data2);
		System.out.println("Ascending Order"+data2);

	}
	
	private void decendingOrder() {
	Collections.sort(data1,Collections.reverseOrder());
	System.out.println("Decending Order"+data1);
	
	Collections.sort(data2,Collections.reverseOrder());
	System.out.println("Decending Order"+data2);

	}
	
	 

	public static void main(String[] args) {
		Array_Integers obj = new Array_Integers();
		obj.ascending_Order();
		obj.decendingOrder();

	}

}
