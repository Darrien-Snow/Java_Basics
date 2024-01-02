package D2.Q6_Computer;

public class Desktop extends Computer  {
	private void desktop() {
		System.out.println("This is Desktop Class - Child");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktop();
		obj.computer();
	}
}
