package D2.Q9_BankDetails;

public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("This is saving Class - Child");
	}
	private void fixed() {
		System.out.println("This is fixed Class - Child");
	}
	public static void main(String[] args) {
		BankInfo obj=new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}
}
