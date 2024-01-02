package D1.Q6_EmployeeInformation.Employee;
import D1.Q6_EmployeeInformation.Project.Project;
import D1.Q6_EmployeeInformation.client.Client;
import D1.Q6_EmployeeInformation.company.Company;


public class Employee {
	private void empName() {
		System.out.println("empName: BOB");
	}
	
	public static void main(String[] args) {
		Employee objEmployee= new Employee();
		Project objProject= new Project();
		Company objCompany=new Company();
		Client objClient= new Client();
		
		objEmployee.empName();
		objCompany.companyName();
		objClient.clientName();
		objProject.projectName();
		
	}
}
