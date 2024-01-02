package org.Singleton;

public class CallingClass {

	public static void main(String[] args) {

//		singleton obj = new singleton();
//		singleton obj2 = new singleton();
//		obj.temp2();
//
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
		singleton ref1 = singleton.temp();
		singleton ref2 = singleton.temp();
		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
	
	
		System.out.println(ref1.temp2());
		System.out.println(singleton.temp().temp2());

	}

}
