package com.qa.java.encapsulation;

public class CITIBank {

	private String custName = "Goldy";
	private int cardNo = 987654;
	private int pinATM = 2378;
	private double availableBal = 90000;
	
	

	public void UpdatePin(String name, int card, int Oldpin,int newPin) {
		if (name.equals(custName) && card == cardNo && Oldpin == pinATM) {

			pinATM=newPin;
			System.out.println("Pin Changes successfully");

		} else {
			System.out.println("Invalid Credentials!!!!!!!!!!");
		}

	}

	public void withdrawal(String name, int card, int pin, int WithdrawalAmount) {

		if (name.equals(custName) && card == cardNo && pin == pinATM) {

			if (WithdrawalAmount <= availableBal) {

				availableBal = availableBal - WithdrawalAmount;
				System.out.println("Remaining Balance-->" + availableBal);

			} else {
				System.out.println("Insufficient funds");
			}

		} else {
			System.out.println("Invalid Credentials!!!!!!!!!!");
		}

	}

}
