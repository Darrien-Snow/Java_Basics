package aa_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import D3.Test.test.test;

public class CountChar_String {
	
	private void test() {
	String name= "oiuytfgcvbn;lgh g_ `1 mhfuiygh";
	
	HashMap<Character, Integer> hashMap = new HashMap<>();
	
	for(int i=0;i<name.length();i++)
	{
	char charAt = name.charAt(i);
	if(hashMap.containsKey(charAt))
	{
		Integer integer = hashMap.get(charAt);
		hashMap.put(charAt, integer++);
	}
	else {
		hashMap.put(charAt, 1);
	}

	}
	System.out.println(hashMap);
	}

	private void useStringMethods() {
		{
			String str = "google1222";
			// HashMap char as a key and occurrence as a value
			HashMap<Character, Integer> charCount = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				if (charCount.containsKey(str.charAt(i))) {
					int count = charCount.get(str.charAt(i));
					charCount.put(str.charAt(i), ++count);
				} else {
					charCount.put(str.charAt(i), 1);
				}
			}
			System.out.println(charCount);
		}

	}

	private void greensCountingChar() {

		String name = "Dass";
		HashMap<Character, Integer> hashMap = new  HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			char charAt = name.charAt(i);
			// System.out.println(charAt);
			if (hashMap.containsKey(charAt)) { // check is already a key present in the hashmap
				Integer count = hashMap.get(charAt); // get all the already presented key from hashmap (1 by 1)
				hashMap.put(charAt, ++count);

			} else {
				hashMap.put(charAt, 1);
			}
		}

		System.out.println(hashMap);

	}

	private void usingMaps() {

		String str = "maria";
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}

	public static void main(String[] args) {
		CountChar_String countChar_String = new CountChar_String();
//		countChar_String.useStringMethods();
//		countChar_String.greensCountingChar();
		countChar_String.test();
	}

}
