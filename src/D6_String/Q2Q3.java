package D6_String;

public class Q2Q3 {
//  Find the last index of o
	 String input1= "GreensTechnology" ;
//   Find the index of o
	String input2= "SeleniumAutomationtool"; 
//  Find the index of n
	String input3= "Velmurugan"; 
//  Find the last index of  (empty space)
	String input4= "j a v a p r o g r a m"; 
//  Find the index of 8
	String input5= "9095484678"; 

//	Java D6 Q1 - By method
	private void q1OutputMethod() {
		int indexOfRef1 =input1.indexOf('o');
		System.out.println("Index of 'o' in GreensTechnology is: "+indexOfRef1);
		int indexOfRef2 =input2.indexOf('o');
		System.out.println("Index of 'o' in SeleniumAutomationtool is: "+indexOfRef2);
		int indexOfRef3 =input3.indexOf('n');
		System.out.println("Index of 'n' in Velmurugan is: "+indexOfRef3);
		int indexOfRef4 =input4.lastIndexOf(' ');
		System.out.println("Last Index of 'emptyspace' in 'j a v a p r o g r a m' is: "+indexOfRef4);
		int indexOfRef5 =input5.indexOf('8');
		System.out.println("Index of '8' in 9095484678 is: "+indexOfRef5);
		System.out.println("_______________________________________________________________________");
	}

	private void q2OutputMethod() {
		//Q3_ find the character 
				System.out.println("Java D6 Q3 \n");
//				print the character h
				int indexOfh=input1.indexOf('h');
				char charAtRef_h=input1.charAt( indexOfh);
				System.out.println("Index of 'h' in GreensTechnology is: "+indexOfh);
				System.out.println("Print the charater 'h': "+charAtRef_h);
//				     print the character o
				int indexOfo=input2.indexOf('o');
				char charAtRef_o=input2.charAt( indexOfo);
				System.out.println("Index of 'h' in SeleniumAutomationtool is: "+indexOfo);
				System.out.println("Print the charater 'h': "+charAtRef_o);
//				 print the character u
				int indexOfu=input3.indexOf('u');
				char charAtRef_u=input3.charAt( indexOfu);
				System.out.println("Index of 'h' in velmurugan is: "+indexOfh);
				System.out.println("Print the charater 'h': "+charAtRef_u);
//				  print the character p
				int indexOfp=input4.indexOf('p');
				char charAtRef_p=input4.charAt( indexOfh);
				System.out.println("Index of 'h' in 'j a v a p r o g r a m' is: "+indexOfp);
				System.out.println("Print the charater 'h': "+charAtRef_p);
//				  print the character 7
				int indexOf7=input5.indexOf('7');
				char charAtRef_7=input5.charAt(indexOf7);
				System.out.println("Index of '7' in 9095484678 is: "+indexOf7);
				System.out.println("Print the charater '7': "+charAtRef_7);
				System.out.println("_______________________________________________________________________");

	}
	
	public static void main(String[] args) {
		Q2Q3 newObj=new Q2Q3();
		newObj.q1OutputMethod();
		newObj.q2OutputMethod();
	}

}
