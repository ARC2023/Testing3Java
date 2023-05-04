package com.qa.java.finalfinallyfinalize;

public final class FinalUsage {

	public final String FullName="Rahul Vaidya";
	static final int carNO = 1456;
	//1. Final keyword on variable is To declare constants and we cannot change it throughout the java program
	//2. Final keyword on class is to prevent inheritance
	//3. Final keyword on Method is to prevent overriding

	
	public final void arc() {
		
	}
	
	
	public static void main(String[] args) {
		carNO = 245;
		System.out.println(carNO);
	}

}
		
	
	
	

