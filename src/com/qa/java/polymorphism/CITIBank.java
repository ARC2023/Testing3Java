package com.qa.java.polymorphism;

public class CITIBank {

	public static void main(String[] args) {
		CITIBank c = new CITIBank();
		//c.balanceTransfer(10.0, 23);
		// c.balanceTransfer(12.23,23.45);
			System.out.println(c.addition(10,12,14,16,18));
	}
	public static void main(String args) {

	}

	public static void main(int a) {

	}
	
	public int addition(int... a) {
		int sum =0;
		for(int d:a) {
			 
			sum= sum +d;//0+10
			//10+12=22
			//22+14=36
			//36+16=52
			//52+18=70
			
		}
		
		return sum;
	
	}


	
	
	
	
	

	public void balanceTransfer(int transferAmount, double remainingAmount) {
		System.out.println("Balance Transfer" + (transferAmount - remainingAmount));
	}
	public void balanceTransfer(int transferAmount, double remainingAmount,int y) {
		System.out.println("Balance Transfer" + (transferAmount - remainingAmount));
	}
	public void balanceTransfer(double transferAmount, int remainingAmount) {
		System.out.println("Balance Transfer" + (transferAmount - remainingAmount));
		
		
	}

	public void balanceTransfer() {
		System.out.println("Balance Transfer");
	}

	public void balanceTransfer(int a) {
		System.out.println("Balance Transfer" + a);
	}

	public void balanceTransfer(int transferAmount, int remainingAmount) {
		System.out.println("Balance Transfer" + (transferAmount - remainingAmount));
	}

	public void balanceTransfer(double transferAmount, double remainingAmount) {
		System.out.println("Balance Transfer" + (transferAmount - remainingAmount));
	}

	public void logIn(int number, String password) {

	}

	public void logIn(String userName, String password) {

	}

	public void logIn(String UN, String PW) {

	}

	public String getOTP(int mobileno) {

		return "OTP";

	}
	
	public String getOTP(int cellno) {

		return "OTP";

	}
	
}
