package com.qa.java.collections;

import java.util.*;

public class ArrayListInSession {

	public static void main(String[] args) {
		ArrayList<String> arl1 = new ArrayList<String>();
		arl1.add("Sagar");
		arl1.add("Pallavi");
		arl1.add("Priyanka");
		System.out.println("List arl1 -->" + arl1);
		
		ArrayList<String> arl2 = new ArrayList<String>();
		arl2.add("Swapnil");
		arl2.add("Rajan");
		System.out.println("List arl2 -->" + arl2);	
		

		
		ArrayList<String> arl3 = new ArrayList<String>();
		arl3.add("Shital");
		arl3.add("vaibhav");		
		System.out.println("List arl3 -->" + arl3);	
/*
		Object[] in = new Object[4];

		in[0] = 2;
		in[1] = 6;
		in[2] = 8;
		in[3] = 4;

		ArrayList<Object> lister = new ArrayList<Object>();

		lister.add("Sagar");
		lister.add(54);
		lister.add(90000.89);
		lister.add('M');

		System.out.println(lister.get(2));

		System.out.println("Size of Array -->" + lister.size());

		for (int i = 0; i < lister.size(); i++) {

			System.out.println(lister.get(i));

		}

		// 1.a. AddAll
		
		
		
		
		
		arl1.addAll(arl2);
		
		System.out.println(arl1);
		System.out.println(arl2);

		// 1.b. AddAll - with index
		
		System.out.println("List arl3 -->" + arl3);	
		
		
		System.out.println("before Add All"+arl1);
		arl1.addAll(0, arl3);
		System.out.println("after Add All"+arl1);
		
		
		// 2.  Clear a list
		
		System.out.println("before Clear="+arl3);
		arl3.clear();
		System.out.println("after Clear="+arl3);
		*/
		// 3. Clone
		
		ArrayList<String> cloner= (ArrayList<String>) arl1.clone();
				
		System.out.println("Cloned Object="+cloner);
		
		
		

	}

}
