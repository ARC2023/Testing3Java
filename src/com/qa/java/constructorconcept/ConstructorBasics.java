package com.qa.java.constructorconcept;

public class ConstructorBasics {
	String FN;
	String LN;
	String Email;
	int mobileNo;
	String PAN;

	public ConstructorBasics() {
		System.out.println("Database Connection");

	}

	public ConstructorBasics(String FN) {
		//System.out.println("First name is -->" + FN);

	}

	public ConstructorBasics(String FN, String LN, int mobileNo) {

		this.FN = FN;
		this.LN = LN;
		this.mobileNo = mobileNo;

		System.out.println();

	}

	
	public void updateDB() {
		
	}
	

}
