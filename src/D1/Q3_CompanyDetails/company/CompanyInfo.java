package D1.Q3_CompanyDetails.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("companyName: ABC corp");
	}
	private void companyId() {
		System.out.println("companyId: ABC41178");
	}
	private void companyAddress() {
		System.out.println("companyAddress: Chennai");
	}
	
	public static void main(String[]args) {
		CompanyInfo COMPOBJ=new CompanyInfo();
		COMPOBJ.companyName();
		COMPOBJ.companyId();
		COMPOBJ.companyAddress();
	}
}

