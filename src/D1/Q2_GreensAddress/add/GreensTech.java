package D1.Q2_GreensAddress.add;


public class GreensTech {
	private void greensOmr() {
		System.out.println("Yes studying in OMR");
	}

	private void greensAdayar() {
		System.out.println("Not studying Adayar");
	}
	private void greensTambaram() {
		System.out.println("Not studying Tambaram");
	}
	private void greensVelacherry() {
		System.out.println("Not studying Velacherry");
	}
	private void greensAnnaNagar() {
		System.out.println("Not studying in AnnaNagar");
	}

	public static void main(String[]srgs) {
		
		GreensTech instituteobj= new GreensTech();
		
		instituteobj.greensAdayar();
		instituteobj.greensOmr();
		instituteobj.greensAnnaNagar();
		instituteobj.greensTambaram();
		instituteobj.greensVelacherry();
	}
}
