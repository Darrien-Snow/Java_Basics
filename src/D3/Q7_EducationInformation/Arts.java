package D3.Q7_EducationInformation;

public class Arts extends Education {
	public void bSc() {
		System.out.println("bSc method in Child class; ");
	}
	public void bEd() {
		System.out.println("bEd method in Child class; ");
	}
	public void bA() {
		System.out.println("bA method in Child class; ");
	}
	public void bBA() {
		System.out.println("bBA method in Child class; ");
	}
	@Override
	public void ug() {
		System.out.println("\nug method in Child class; ");
		super.ug();
	}
	@Override
	public void pg() {
		System.out.println("\npg method in Child class; ");
		super.pg();
	}
	public static void main(String[] args) {
		Arts obj=new Arts();
		obj.bA();
		obj.bBA();
		obj.bEd();
		obj.bSc();
		obj.ug();
		obj.pg();
	}
}
