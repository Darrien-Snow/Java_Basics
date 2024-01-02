package D2.Q10_CompanyDetails.Q10_companyDetails.client;

import D2.Q10_CompanyDetails.Q10_companyDetails.company.Company;

public class Client extends Company {
	private void clientName() {
		System.out.println("This is clientName Class - Child");
	}
	public static void main(String[] args) {
		Client obj=new Client();
		obj.clientName();
		obj.companyName();
	}
}
