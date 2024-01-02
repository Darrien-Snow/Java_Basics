package D3.Test.class_abstract_interface;
// Class 2
public class Employee extends Payments {
	public void employeeName() {
		System.out.println("This is Employee Name method- Class 1");
	}
	public void employeeId() {
		System.out.println("This is Employee ID method- Class 1");
	}
	@Override
	public void bank() {
		System.out.println("This is Bank method- Interface 2");	
	}
	@Override
	public void city() {
		System.out.println("This is City method- Interface 2");	
	}
	@Override
	public void experience() {
		System.out.println("This is Experience method- Interface 1");	
	}
	@Override
	public void currentSalary() {
		System.out.println("This is Current Salary method- Interface 1");	
	}
	@Override
	public void financeYear() {
		System.out.println("This is Finance Year method- Abstract 1");	
	}
	@Override
	public void hub() {
		System.out.println("This is Finance Year method- Abstract 2");	
	}
}
