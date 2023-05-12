package com.qa.java.abstractclass;

public abstract class USFed extends USNAvy  implements USArmy{
	static final int minFees = 900;
	
	
	

	public USFed() {
		System.out.println("Parent Class Constructor");
	}

	public static void main(String[] args) {

		// USFed us= new USFed();

	}

	public abstract void Wealthtax();

	public void countytax() {

	}

}
