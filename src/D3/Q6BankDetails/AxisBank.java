	package D3.Q6BankDetails;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {//over rided method
		System.out.println("New deposit: 32151");
		super.deposit();
		super.fixed();
		
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.deposit();
		obj.saving();
		
	}
}
