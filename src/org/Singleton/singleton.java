package org.Singleton;

public class singleton {
	static singleton obj;

	private singleton() {

	}

	public static singleton temp() {

		if (obj == null) {
			obj = new singleton();
		}

		return obj;
	}

	public int temp2() {
		int a = 10, b = 20, c = a + b;
		return c;

	}

}
