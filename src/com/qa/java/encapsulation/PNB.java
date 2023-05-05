package com.qa.java.encapsulation;

public class PNB {

	public static void main(String[] args) {
		
		
		ATMProgram atm= new ATMProgram("Shital", 123456,7800000, 0000);
		//atm.pin=9090;
		atm.updatePin(123456, 0000, 9999);
		atm.withdrawBal("Shital", 123456, 9999, 800000);
		
		

	}

}
