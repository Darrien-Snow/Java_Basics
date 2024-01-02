package D3.Q5_GreensAddress;

public class GreensTech {
	private void greensOmr(int Id) {
		System.out.println("Based on data type");
		System.out.println("\t Int Id: " +Id);
	}
	private void greensOmr(Float salary) {
		System.out.println("\t Float salary: " +salary);
	}
	private void greensOmr(int Id,Float salary) {
		System.out.println("\n Based on Number - Argument count");
		System.out.println("\t Int Id: " +Id+"\t Float salary: " +salary);
	}
	private void greensOmr(int Id,Float salary,String Name) {
		System.out.println("\t Int Id: " +Id+"\t Float salary: " +salary+"\t String Name: "+Name);
	}
		private void greensOmr(char Initial,int Id) {
			System.out.println("\n Based on Argument - datatyp order");
			System.out.println("\t Int Id: "+Initial+Id+"\t Float salary: " );
		}
		private void greensOmr(int Id,char Initial) {
			System.out.println("\t Float salary: " +Initial+"\t Int Id: " +Id);
	}
	public static void main(String[] args) {
		GreensTech object=new GreensTech();
		object.greensOmr(116);
		object.greensOmr(21451.327424f);
		object.greensOmr(116, 21451.327424f);
		object.greensOmr(116, 21451.327424f, "Snow");
		object.greensOmr('R',116);
		object.greensOmr(116,'R');
	}
}

