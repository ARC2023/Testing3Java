package com.qa.java.overriding;

public class RBI {

	public double getHomeLoanROI() {

		return 7.15;
	}

	public RBI fixedDepositInsurance() {

		RBI r = new RBI();

		return r;

	}

	public Number getVehiclROI() {
		return 5;

	}
	
	
	public static final Number get() {
		
		System.out.println("Parent Class Static method");
		return 5;

	}
	

}
