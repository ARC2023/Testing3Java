package com.qa.java.collections;

import java.util.*;

public class Maps {

	public static void main(String[] args) {

		Map<String, String> mapper = new HashMap<String, String>();

		mapper.put("Germany", "Berlin");

		mapper.put("India", "Delhi");
		mapper.put("Poland", "Warsaw");

		mapper.put("Croatia", "Zagreb");

		mapper.put("Croatia", "Ankara");

		mapper.put("Turkey", "Ankara");

		mapper.put(null, "Canbera");
		mapper.put(null, "Wellington");

		mapper.put("Nepal", null);
		mapper.put("China", null);

		/*System.out.println(mapper);
		
		
		System.out.println(mapper.get(null));
		System.out.println(mapper.get("Turkey"));		
		
		// For Each Loop
		System.out.println(mapper.get("India"));
		Set<String> keys = mapper.keySet();
		System.out.println(keys);
		
		
		for(String temp: keys) {
			
			System.out.println("Country --> "+temp +" "+"and Captial --> "+mapper.get(temp));
		}
		 */
		// Iterator with keyset
		
		Iterator<String> itr= mapper.keySet().iterator();
		
		while(itr.hasNext()) {
			
			String keyss= itr.next();
			System.out.println("Country --> "+keyss +" "+"and Captial --> "+mapper.get(keyss));
			
			
		}
		
		
	}

}
