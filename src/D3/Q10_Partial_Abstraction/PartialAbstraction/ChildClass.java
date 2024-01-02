package D3.Q10_Partial_Abstraction.PartialAbstraction;

public class ChildClass extends PartialAbstract  {

	@Override
	public void demoTry() {
		System.out.println("Declaring method for Parent class (abstracted menthod");
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.demoTry();
		obj.nonAbstract();
	}

}
