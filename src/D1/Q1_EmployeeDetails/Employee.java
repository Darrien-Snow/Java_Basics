package D1.Q1_EmployeeDetails;

public class Employee {

	private void empId() {
		System.out.println("ID::AB1116");
	}
	private void empName() {
		System.out.println("Name:Darrien");
	}
	private void empPhone() {
		System.out.println("Ph:978836570");
	}
	private void empEmail() {
		System.out.println("Email:abc@gmail.com");
	}
	private void empAddress() {
		System.out.println("City:Chennai");
	}


public static void main (String[]args)
{

	Employee empobj=new Employee();
	
	empobj.empAddress();
	empobj.empEmail();
	empobj.empName();
	empobj.empId();
	empobj.empPhone();
}
}
