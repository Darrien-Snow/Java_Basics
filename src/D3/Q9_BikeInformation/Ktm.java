package D3.Q9_BikeInformation;

public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("Fully abstract Cost: Interface");
		
	}
	@Override
	public void speed() {
		System.out.println("Fully abstract Speed: Interface");
	}
	public static void main(String[] args) {
		Ktm obj=new Ktm();
		obj.cost();
		obj.speed();
	}

}
