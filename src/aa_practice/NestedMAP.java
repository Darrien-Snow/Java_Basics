package aa_practice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class NestedMAP {
	
//	HP hp342 45000, Dell dell211 75000, Lenovo I202 50000
	public static void main(String[] args) {
		
		Map<String, Map<String, Integer>> ref= new LinkedHashMap<>() ;
		
		Map<String, Integer> m1=new LinkedHashMap<>();
		m1.put("hp342", 45000);
		
		Map<String, Integer> m2=new LinkedHashMap<>();
		m2.put("dell1211", 75000);
		
		Map<String, Integer> m3=new LinkedHashMap<>();
		m3.put("I202", 50000);
		
		ref.put("hp", m1);
		ref.put("Dell", m2);
		ref.put("Lenovo", m3);
		
		System.out.println(ref);
		
		 Collection<Map<String, Integer>> values = ref.values();
		for (Map<String, Integer> map : values) {
			Integer integer = map.get(null);
			System.out.println(integer);
			
		}
		System.out.println(values);
		

		
		
	}

}
