package com.qa.java.strings;

public class AllAboutString {

	public static void main(String[] args) {
		String s = "Joe Biden is the president of United States";
		String s6 = "Hilary CLinton is the president of United States";
		String s1 = "Joe Biden is the president of United States";
		String s2 = "Joe Biden is the President of United States";
		String s3 = "Joe Biden is the Candidate of United States";
		String trim= "     Joe Biden is the president of United States       ";
		String sw = "Joe Biden is the president of the United States where the state is NY";

		// Common operations on String
/*
		System.out.println("Lenght of a string-->" + s.length());

		System.out.println("Index of  e-->" + s.indexOf('e'));// 2

		System.out.println("Index of  e after 9th Position-->" + s.indexOf('e', 9));// 15

		System.out.println("second occurence of Index of  e-->" + s.indexOf('e', s.indexOf('e') + 1));// 7

		
		System.out.println("Index of  the-->" + s1.indexOf("the"));

		System.out.println("second occurence of Index of  the-->" + s1.indexOf("the", s1.indexOf("the") + 1));

		System.out.println("Which character is at 14-->"+s.charAt(14));
	
		
		System.out.println(s.equals(s1)); 
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		
		// Substring
				System.out.println(s.substring(13, 16));
				System.out.println("Substring-->"+s.substring(7));
		
		int temp=s6.indexOf("is")-1;
		System.out.println(s6.substring(0, temp));
		
		
		
		// Trim
		
				
				System.out.println("Before trim-->"+trim);
				System.out.println("After trim-->"+trim.trim());
				*/
		// Replace
				System.out.println("Before Replace space-->"+trim);
				System.out.println("After Replace space-->"+trim.replace(" ", "_"));
				
				
				// Spilt
				String h="Java_Hello_world";
				String arr[]=h.split("_");
				
				
				
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}			
		
	}

}
