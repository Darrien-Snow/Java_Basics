package D3.Test.class_abstract_interface;
//Main Class
public class Company extends Employee{
	private void companyName() {
		System.out.println("This is Company Name method- Class 2");
	}
	private void companyCode() {
		System.out.println("This is Company Code method- Class 2");
	}
	public static void main(String[] args) {
		Company object=new Company();
		object.companyCode();
		object.companyName();
		object.employeeName();
		object.employeeId();
		object.financeYear();
		object.currency();
		object.clientName();
		object.hub();
		object.bank();
		object.city();
		object.experience();
		object.currentSalary();		
	}
}
