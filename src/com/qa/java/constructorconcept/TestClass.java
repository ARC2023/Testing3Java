package com.qa.java.constructorconcept;

public class TestClass {
	public static void main(String[] args) {

		//ConstructorBasics cb = new ConstructorBasics();
		ConstructorBasics cb1 = new ConstructorBasics("Chitika");

		System.out.println(cb1.FN + " and " + cb1.LN + " and " + cb1.mobileNo);
		
				
		ConstructorBasics cb2 = new ConstructorBasics("Chitika", "Malewar", 123456);

				
		System.out.println(cb2.FN + " and " + cb2.LN + " and " + cb2.mobileNo);
	}
}
