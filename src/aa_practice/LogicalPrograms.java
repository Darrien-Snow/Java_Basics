package aa_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogicalPrograms {
	String s1 = "Arockiadass Robert";
	private void charOccurance() {
	
	StringBuilder a2 = new StringBuilder("hello");
	StringBuffer a3 = new StringBuffer("hello");

	String[] split = s1.split("");

//	HashMap<String,Integer> hashMap = new HashMap<>();
	TreeMap<String, Integer> hashMap = new TreeMap<>();
	for (int i = 0; i < split.length; i++) {

		String string = split[i];

		if (hashMap.get(string) == null) {
			hashMap.put(string, 1);

		} else {
			hashMap.put(string, hashMap.get(string) + 1);
		}

	}

	for (String string : hashMap.keySet()) {

		if (hashMap.get(string) < 2) {
			System.out.println(string + "= " + hashMap.get(string));
		}
	}
	}
	
	private void charOccuranceTime() {
		String replace = s1.replace("s", "");
		
		System.out.println(s1.length()-replace.length());

	}
	public static void main(String[] args) {
		LogicalPrograms logicalPrograms = new LogicalPrograms();
		logicalPrograms.charOccuranceTime();
		logicalPrograms.charOccurance();
		

	}

}
