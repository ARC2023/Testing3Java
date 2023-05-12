package com.qa.java.abstractclass;

public class BofA extends USFed{
	
	public static void main(String[] args) {
		
		USFed bb=new BofA();
		
		bb.minFees=90;
	}
	
	public BofA() {		
		System.out.println("Child Class Constructor");
	}

	

	public double getAvailableBalance(int upiPin, int mobileNo) {

		// DataBase Connection
		// Query Running

		double bal = 98000.89;

		return bal;
	}
	
	
	public void neftTransfer(int custId,int accountNo,int destAccount, double transferAmount) {
		
		// Query 
		// Balance check 
		// transfer to dest
		// message or whatsapp confirmation sent
		
		
	}

	@Override
	public void Wealthtax() {
		// TODO Auto-generated method stub
		
	}
	public void countytax() {

	}
}
