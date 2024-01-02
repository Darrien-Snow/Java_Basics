package D3.Test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class test {
	
	   public static void main(String[] args) {
		
	
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Score", "102");
		hashMap.put("Marks", "33");
		hashMap.put("name", "Sam");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("Marks"));
		
		String ref="dfghjkl;.,mnbv";
		
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Dass");
		hashSet.add("sam");
		hashSet.add("Mahe");
		
		System.out.println(hashSet);
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		System.out.println(arrayList);
		System.out.println(arrayList.get(1));
		

		}
}

