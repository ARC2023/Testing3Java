package com.qa.java.overriding;

public class RBE extends RBI {

	public static void main(String[] args) {

		RBE rbe = new RBE();

		System.out.println(rbe.getHomeLoanROI());

		RBI rrr= new RBE();		
		
		System.out.println(rrr.getHomeLoanROI());
		//rrr.getGoldLoanROI();
		
	}

	public double getHomeLoanROI() {

		return 9.10;
	}

	public CyprusBank fixedDepositInsurance() {

		CyprusBank r = new CyprusBank();

		return r;

	}

	public Integer getVehiclROI() {
		return 8;

	}
	public Integer getGoldLoanROI() {
		return 8;

	}
	
	
}
