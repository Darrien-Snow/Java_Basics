package D3.Test.test;

public class ABC  {
	public static void main(String[] args) {
		Singleton obj = Singleton.method();
		Singleton obj1 = Singleton.method();

		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
