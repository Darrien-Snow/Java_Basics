package D3.Q10_Partial_Abstraction.computer;

public class Desktop implements HardWare,Software {

	@Override
	public void hardwareResources() {
		System.out.println("Parent 1: interface");
	}

	@Override
	public void softwareResources() {
		System.out.println("Parent 2: interface");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();	
		obj.hardwareResources();
		obj.softwareResources();
		
	}
}
