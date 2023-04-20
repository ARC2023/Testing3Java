package com.qa.java.datatype;

public class FixedAsset {

	public static void main(String[] args) {

		new FixedAsset().openFD();
		new FixedAsset().openRD();

		FixedAsset fa = new FixedAsset();
		FixedAsset fa1 = new FixedAsset();
		FixedAsset fa2 = new FixedAsset();
		FixedAsset fa3 = new FixedAsset();

		System.out.println("Address of Reference variable -->" + fa);

		fa.openFD();

		fa.openRD();
	}

	public void openFD() {

		System.out.println("Open Fixed Deposit");
	}

	public void openRD() {

		System.out.println("Open Recurring Deposit");
	}

}
