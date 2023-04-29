package com.qa.java.encapsulation;

public class SBI {
	private int cardNo = 10981;
	private int pinNo = 2023;
	private int balanceAmount = 2000000;

	public void withdrawal(int account, int pin, int amounttowithdraw) {
		if (account == cardNo && pin == pinNo) {

			if (amounttowithdraw <= balanceAmount) {
				balanceAmount = balanceAmount - amounttowithdraw;
				System.out.println("Amount to be withdrawn -->" + amounttowithdraw);
				System.out.println("Remaining amount -->" + balanceAmount);
			} else {
				System.out.println("Insufficient Funds");
			}
		} else {
			System.out.println("Invalid Credentials");
		}
	}
	public void updatePin(int accountNo, int oldPin, int newPin) {
		if (accountNo == cardNo && oldPin == pinNo) {
			//pinNo = newPin;
			setPinNo(newPin);
			System.out.println("pin changed successfully");
		} else {
			System.out.println("Invalid credentials");
		}
	}

	public int deposit(int account, int pin, int amounttodeposit) {
		if (account == cardNo && pin == pinNo) {

			balanceAmount = balanceAmount + amounttodeposit;

			System.out.println("Updated amount -->" + balanceAmount);
		} else {
			System.out.println("Invalid Credentials");
		}

		return amounttodeposit;

	}

	
	public int getCardNo() {
		return cardNo;
	}

	/*
	 * public void setCardNo(int cardNo) { this.cardNo = cardNo; }
	 */

	/*
	 * public int getPinNo() { return pinNo; }
	 */

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
}
