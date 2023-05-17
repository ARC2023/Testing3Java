package com.qa.java.collections;

import java.util.*;

public class ArrayListInSession {

	public static void main(String[] args) {

		ArrayList<String> arl1 = new ArrayList<String>();

		arl1.add("Sagar");
		arl1.add("Pallavi");
		arl1.add("Priyanka");
		// System.out.println("List arl1 -->" + arl1);

		ArrayList<String> arl2 = new ArrayList<String>();
		arl2.add("Swapnil");
		arl2.add("Rajan");
		// System.out.println("List arl2 -->" + arl2);

		ArrayList<String> arl3 = new ArrayList<String>();
		arl3.add("Shital");
		arl3.add("vaibhav");
		// System.out.println("List arl3 -->" + arl3);

		Object[] in = new Object[4];

		in[0] = 2;
		in[1] = 2;
		in[2] = 2;
		in[3] = 2;

		ArrayList<Object> lister = new ArrayList<Object>();

		lister.add("Sagar");
		lister.add(54);
		lister.add(90000.89);
		lister.add('M');

		// System.out.println(lister.get(2));

		//System.out.println("Size of Array -->" + lister.size());
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < arl3.size(); i++) {

			temp.add(arl3.get(i));
		}

		/*
		 * for (int i = 0; i < arl3.size(); i++) {
		 * 
		 * 
		 * if(arl3.get(i).equalsIgnoreCase("Shital")) {
		 * System.out.println("Name Identified"); break; } else {
		 * 
		 * System.out.println(lister.get(i)); } }
		 */
/*
		// 1.a. AddAll
		System.out.println(arl1);
		System.out.println(arl2);

		arl1.addAll(arl2);

		System.out.println(arl1);
		System.out.println(arl2);

		// 1.b. AddAll - with index

		System.out.println("List arl3 -->" + arl3);

		System.out.println("before Add All" + arl1);
		arl1.addAll(1, arl3);
		System.out.println("after Add All" + arl1);

		// 2. Clear a list

		System.out.println("before Clear=" + arl3);
		arl3.clear();
		System.out.println("after Clear=" + arl3);

		// 3. Clone

		ArrayList<String> cloner = (ArrayList<String>) arl1.clone();

		System.out.println("Cloned Object=" + cloner);

		// 4.a Contains

		System.out.println(arl1.contains("Priyanka"));
		System.out.println(arl1.contains("Onisha"));

		// 4.b ContainsAll

		ArrayList<String> arl4 = new ArrayList<String>();
		arl4.add("Priyanka");
		arl4.add("Sagar");
		System.out.println(arl1.containsAll(arl4));

		ArrayList<String> arl5 = new ArrayList<String>();
		arl5.add("Lochna");
		arl5.add("Sagar");
		System.out.println(arl1.containsAll(arl5));

		// 5. Arrays.asList
		ArrayList<String> arl6 = new ArrayList<String>(
				Arrays.asList("Sid", "Akshay", "Arjun", "Akshay", "Varun", "Akshay"));
		System.out.println(arl6);


		// 6. indexOf

		/*
		  System.out.println(arl6.indexOf("Akshay"));
		  System.out.println(arl6.indexOf("Hritik"));
		 

		// 7. lastIndexOf

		
		  System.out.println(arl6.lastIndexOf("Akshay"));
		  System.out.println(arl6.lastIndexOf("Varun"));
		 
		// 8.a Remove with index

			
		  //arl6.remove(1);
		  System.out.println(arl6);
			 

			// 8.b Remove with Object/Element

			
		  //arl6.remove("Akshay"); 
		  System.out.println(arl6);
			 

			// 8.c removeAll
			ArrayList<String> arl7 = new ArrayList<String>(Arrays.asList("Akshay","Arjun"));
			//System.out.println(arl6);
			arl6.removeAll(arl7);
			System.out.println(arl6);
			*/
			
			// Q. How to compare two list and find additional element from list -
			// removeAll()
			ArrayList<String> arl9 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
			ArrayList<String> arl10= new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

			/*arl9.removeAll(arl10); 
			System.out.println(arl9);
			 
			// Q. How to compare two list and find missing element from list - removeAll()
			
			arl10.removeAll(arl9); 
			System.out.println(arl10);
			
			
			// 8.d removeIf
			ArrayList<Integer> arl11 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
			
			 arl11.removeIf(xy -> xy%2!=0);

			System.out.println(arl11);
			*/
			
			// 9.a retainAll() - Singleton

			ArrayList<String> arl12 = new ArrayList<String>(
					Arrays.asList("Sid", "Akshay", "Arjun", "Akshay", "Varun", "Akshay"));
			
			/*
			
			 arl12.retainAll(Collections.singleton("Akshay"));
			
			  System.out.println(arl12);
			  
			  System.out.println(arl12.size());
			

			// 9.b retainAll() -- List
			// How to compare and find common element - retainAll()

			 arl9.retainAll(arl10);

			 System.out.println(arl9); 
			 
			// 10. Sublist()

			 ArrayList<Integer> arl20 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
			 
				  ArrayList<Integer> arl14 = new ArrayList<Integer>(arl20.subList(2, 7));
				  
				  
				  System.out.println(arl14);
				 
				// 10. subList with clear
			ArrayList<Integer> arl20 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
				
				  arl20.subList(2, 7).clear();
				  System.out.println(arl20);
				 

				// 11. toArray()

				
				  Object arr[] = arl20.toArray();
				  
				  for(Object o:arr) { 
					  System.out.println(o); 
					  }
				 
				// 12. How to remove duplicate elements from list
					ArrayList<Integer> arl21 = new ArrayList<Integer>(
							Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 9, 10));
					 for(Integer p:arl21) { 
						  System.out.println(p); 
						  }
					LinkedHashSet<Integer> removeDuplicate = new LinkedHashSet<Integer>(arl21);

					
					  ArrayList<Integer> arl13= new ArrayList<Integer>(removeDuplicate);
					  System.out.println("***********************************************");
					  for(Integer p:arl13) { 
						  System.out.println(p); 
						  }
					 	  
					// 13. sort and compare

						ArrayList<String> arrl14 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
						ArrayList<String> arrl15 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
						ArrayList<String> arrl16 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

						Collections.sort(arrl14);
						Collections.sort(arrl15);
						Collections.sort(arrl16);
						
						System.out.println(arrl14.equals(arrl15));

						System.out.println(arrl14.equals(arrl16));
						
						*/
						
						
						// Traverse 
			ArrayList<String> arrl14 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));	
						// 1. Traditional For Loop
						
						for(int i=0;i<arrl14.size();i++) {
							
							System.out.println(arrl14.get(i));
						}
						
						// 2. For Each Loop
						
						for(String temporary:arrl14) {
							
							System.out.println(temporary);
						}
						// 3. For Each using Lambda Expression
						
						arrl14.forEach(tem -> System.out.println(tem));
						
						// 4. While Loop and Iterator
						
						Iterator<String> itr= arrl14.iterator();
						
						while(itr.hasNext()) {
							
							System.out.println(itr.next());
							
						}
						
						
						
	}

}
