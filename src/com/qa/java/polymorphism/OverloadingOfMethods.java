package com.qa.java.polymorphism;

public class OverloadingOfMethods {

	public static void main(String[] args) {
		System.out.println("Main main method");
		OverloadingOfMethods o = new OverloadingOfMethods();
		o.add();
		o.add(2);
		o.add(2, 4);
		o.add(12, 34, "Priya");
		
	}

	public static void main(String s) {

	}

	public static void main(String s, int b) {

	}
	public static void main(String[] args,String[] q) {
		
	}

	public void add() { // o paramters
		System.out.println("Adding ---->>>>");
	}

	public void add(int a) {
		System.out.println("Adding with ---->>>>" + a);
	}
	public void add(double a) {
		System.out.println("Adding with ---->>>>" + a);
	}
	public void add(int a, int b) {
		System.out.println("Adding with ---->>>>" + a + " and " + b);
	}

	public void add(int a, int b, String s) {
		System.out.println("Adding with ---->>>>" + a + " and " + b + "  and name ->" + s);
	}
}
