package com.qa.java.encapsulation;

public class ATMProgram {

	private String custName;
	private int cardNo;
	private double availableBal;
	private int pin;

	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public int getCardNo() {
		return cardNo;
	}

	public double getAvailableBal() {
		return availableBal;
	}


	public void setAvailableBal(double availableBal) {
		this.availableBal = availableBal;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public ATMProgram(String custName, int cardNo, double availableBal, int pin) {
		this.custName = custName;
		this.cardNo = cardNo;
		this.availableBal = availableBal;
		this.pin = pin;
	}

	
	public void updatePin(int cardNo, int olDpin,int newPin) {
		
		if(this.cardNo==cardNo && this.pin==olDpin) {
			
			this.pin=newPin;
			
		} else {
			System.out.println("Fraudiya");
		}
		
		
	}
	
	
	
	public boolean withdrawBal(String custName, int cardNo, int pin, double withdrawAmt) {

		if (this.custName.equals(custName) && this.cardNo == cardNo && this.pin == pin) {

			if (this.availableBal >= withdrawAmt) {

				double temp = this.availableBal - withdrawAmt;
				
				setAvailableBal(temp);
				System.out.println("Amount Deducted");
				return true;

			} else {
				System.out.println("Insufficient Funds !!!!!!!!!!!!");
			}

		} else {

			System.out.println("Fraud");
		}
		return true;

	}

}
