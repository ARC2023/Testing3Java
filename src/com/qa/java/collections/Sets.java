package com.qa.java.collections;
import java.util.*;


public class Sets {

	public static void main(String[] args) {
		Set<String> employeeName=new HashSet<>();
		
		employeeName.add(null);
		employeeName.add(null);
		employeeName.add("Hiteshri");
		employeeName.add("Rahul");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Pallavi");
		employeeName.add("Jaya");
		
		System.out.println(employeeName.size());
		
		
		List<String> employeeName1=new ArrayList<String>(
				Arrays.asList("Hiteshri","Rahul","Pallavi","Pallavi","Pallavi",
						"Pallavi","Pallavi","Pallavi","Arvind"));
		System.out.println(employeeName1.size());
		
		
		Set<String> employeeName2=new HashSet<>(employeeName1);
		
		System.out.println(employeeName2.size());

		//Intersection
		
		//employeeName.retainAll(employeeName2);
		//System.out.println(employeeName);
		
		// Missing Element
		//employeeName2.removeAll(employeeName);
		//System.out.println(employeeName2);
		
		// Additional Element
		
		employeeName.removeAll(employeeName2);
		System.out.println(employeeName);
		
		
		employeeName.clear();
		System.out.println(employeeName);
		
	}

}
