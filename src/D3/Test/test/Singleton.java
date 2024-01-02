package D3.Test.test;

public class Singleton {
	
	private static Singleton ref=new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton method() {
		return ref;
		
		
	}

}

