package com.qa.java.finalfinallyfinalize;

public class Finalize {


	public void finalize() {
		
		System.out.println("Calling Finalize");
	}
	
	
	public static void main(String[] args) {
		Finalize f1= new Finalize();
		Finalize f2= new Finalize();
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1=null;
		f2=null;
		
		System.out.println(f1);
		System.out.println(f2);
		
		
		System.gc();
	}
	
	
}
