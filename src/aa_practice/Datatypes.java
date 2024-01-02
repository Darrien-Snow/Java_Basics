package aa_practice;

public class Datatypes {

		private void empId() {
			Byte age=10;  // -128 to 127
			Short empId=1116; // -32768 to 32767
			Integer landlinePhone= 1044254132; // Upto 9 digit in total
			Long phoneNumber = 9751080759L; // Upto 19 digit
			Float salary= 4.56f; // before point 9 digit after point 7 digit
			Double previousSalary = 8979821.2131451; // before point 19 digit after point 15 digit
			Character section = 'B';
			String gender="Male"; // Non primitive data type 
			Boolean result= true;
			
	
			System.out.println("My Age is:" +age);
			System.out.println("My Employee id:" +empId);
			System.out.println("My Landline Number:" +landlinePhone +"\n" +"My Mobile number:" +phoneNumber );
			
			System.out.println("My Salary : " +salary +"\n"+"My previous salary is:" +previousSalary 
					 +"\n"+"My Section:" +section  +"\n"+"My Gender:" +gender +"\n"+"All the above details are:" +result);	
		}
	public static void main (String[]args){
		Datatypes objDatatype=new Datatypes();
		objDatatype.empId();
	}	
}
