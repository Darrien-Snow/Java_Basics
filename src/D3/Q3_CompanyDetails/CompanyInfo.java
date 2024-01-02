package D3.Q3_CompanyDetails;

public class CompanyInfo {
	public void companyName(int id) {
		System.out.println("int id:" +id);
	}
	public void companyName(int id,String Name) {
		System.out.println("int id:" +id+"\t"+"String Name:" +Name);
	}
		
		public void companyName(int id,String Name,Long Phone) {
			System.out.println("int id:" +id+"\t"+"String Name:" +Name+"\t"+"Long Phone:" +Phone);
	}
	public static void main(String[] args) {
		CompanyInfo obj=new CompanyInfo();
		obj.companyName(116);
		obj.companyName(116,"Darrien");
		obj.companyName(116,"Darrien",9751080759l);
	}
}
