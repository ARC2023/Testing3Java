package com.qa.java.overriding;

public class Barclays extends RBE {

	public double getHomeLoanROI() {

		return 5.89;
	}

	public static void main(String[] args) {

		RBE rbe = new Barclays();

		System.out.println(rbe.getHomeLoanROI());

		Barclays b = new Barclays();

		Barclays bb = (Barclays) new RBE();
	}

}
