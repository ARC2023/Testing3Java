package com.qa.java.strings;

public class AllAboutString {

	public static void main(String[] args) {
		String s= "Joe Biden is the president of United States";
		
		// Common operations on String
		
		System.out.println("Lenght of a string-->"+ s.length());
		
		System.out.println("Index of  e-->"+ s.indexOf('e'));//2
		
		System.out.println("Index of  e after 9th Position-->"+ s.indexOf('e',9));//15
		
		System.out.println("second occurence of Index of  e-->"+ s.indexOf('e',s.indexOf('e')+1));//7
		
		
	}

}
