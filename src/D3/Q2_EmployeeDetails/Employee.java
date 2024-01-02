package D3.Q2_EmployeeDetails;

public class Employee {
	public void empId(int Id) {
		System.out.println("Emp id is in int:"+Id);
	}
	public void empId(String Id) {
		System.out.println("Emp id in String: "+Id);
	}
	public void empId(short Id) {
		System.out.println("Emp id is in short: "+Id);
	}
	public void empId(float Id) {
		System.out.println("Emp id is in float:"+Id);
	}
	public void empId(double Id) {
		System.out.println("Emp id is in double: "+Id);
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empId(21412.342535);
		obj.empId(21442.32535f);
		obj.empId(116);
		obj.empId(24151);
		obj.empId("AB116");
	}
}
