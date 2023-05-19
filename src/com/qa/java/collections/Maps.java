package com.qa.java.collections;

import java.util.*;
import java.util.Map.Entry;

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
		
		Map<String,Integer> mapper1 = new HashMap<String,Integer>();

		mapper1.put("Germany", 67);

		mapper1.put("India", 91);
		mapper1.put("US", 1);

		mapper1.put("Canada", 56);

		mapper1.put("Nepal", 95);


		/*System.out.println(mapper);
		
		
		System.out.println(mapper.get(null));
		System.out.println(mapper.get("Turkey"));		
		
		// 1. For Each Loop
		System.out.println(mapper.get("India"));
		Set<String> keys = mapper.keySet();
		System.out.println(keys);
		
		
		for(String temp: keys) {
			
			System.out.println("Country --> "+temp +" "+"and Captial --> "+mapper.get(temp));
		}
		 
		// 2. Iterator with keyset
		
		Iterator<String> itr= mapper.keySet().iterator();
		
		while(itr.hasNext()) {
			
			String keyss= itr.next();
			System.out.println("Country --> "+keyss +" "+"and Captial --> "+mapper.get(keyss));
			
			
		}
		
		
		// 3. Entry Set 
		
		

		Iterator<Entry<String, Integer>> itr = mapper1.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Entry<String, Integer> etr=itr.next();
			
			System.out.println("Country --> "+etr.getKey() +" "+"and Code --> "+etr.getValue());
			
			
		}
		
		// 4. For Each Using Lamda
		mapper1.forEach((k,v) -> System.out.println("Country --> "+k +" "+"and Code --> "+v));
		
		*/
		
		// Comparing two maps: -
				HashMap<Integer, String> mappers = new HashMap<Integer, String>();
				mappers.put(1, "Priya");
				mappers.put(2, "Kanupriya");
				mappers.put(3, "Priyanshi");
				//mappers.put(3, "Uday");
				
				HashMap<Integer, String> mapper2 = new HashMap<Integer, String>();
				mapper2.put(2, "Kanupriya");
				mapper2.put(3, "Priyanshi");
				mapper2.put(1, "Priya");
				
				
				HashMap<Integer, String> mapper3 = new HashMap<Integer, String>();
				mapper3.put(1, "Priya");
				mapper3.put(2, "Kanupriya");
				mapper3.put(3, "Pri");
				mapper3.put(4, "Priyanshi");
				
				
				// 1. Comparing Based on key value / whole Map
				
				/*System.out.println(mappers.equals(mapper2));
				System.out.println(mappers.equals(mapper3));
				
				// 2. Comparing Based on key
				System.out.println(mappers.keySet().equals(mapper2.keySet()));
				System.out.println(mappers.keySet().equals(mapper3.keySet()));
				
				// Q. How to find extra key from two maps?
			
				
				HashSet<Integer> hsh= new HashSet<Integer>(mappers.keySet());
				HashSet<Integer> hsh1= new HashSet<Integer>(mapper3.keySet());
				
				hsh1.removeAll(hsh);
				System.out.println(hsh1);
				
				// 3. Comparing based on value
				
				System.out.println(mappers.values().equals(mapper2.values()));
				System.out.println(mappers.values().equals(mapper3.values()));
					
				*/
				HashSet<String> forMap1= new HashSet<String>();
				HashSet<String> forMap2= new HashSet<String>();
				HashSet<String> forMap3= new HashSet<String>();
				
				// Case 1:  Where duplicate values are not allowed
				forMap1.addAll(mappers.values());
				forMap2.addAll(mapper2.values());
				forMap3.addAll(mapper3.values());
				
				//System.out.println(forMap1.equals(forMap2));
				
				//System.out.println(forMap1.equals(forMap3));
					
				
				// // Case 2:  Where duplicate values are allowed
				
				/*ArrayList<String> ListforMap1= new ArrayList<String>();
				ArrayList<String> ListforMap2= new ArrayList<String>();
				ArrayList<String> ListforMap3= new ArrayList<String>();
				
				ListforMap1.addAll(mappers.values());
				ListforMap2.addAll(mapper2.values());
				ListforMap3.addAll(mapper3.values());
				System.out.println(ListforMap1.equals(ListforMap2));
				System.out.println(ListforMap1.equals(ListforMap3));
				*/
				String ii="89";
				String ii1="8l9";
				int i= Integer.parseInt(ii);
				System.out.println(i);
				int i1= Integer.parseInt(ii1);
				
				double d= Double.parseDouble(ii1);
			
				
			
				
				
	}

}
