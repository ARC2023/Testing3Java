package com.qa.java.polymorphism;

public class RBI {

	public static void main(String[] args) {
		RBI r = new RBI();
		r.login(9866222, "Happy123");
		r.login("HappyBhai", "Happy123");
		//r.EducationLoan(12, 12);
		System.out.println(r.addition(12,13,14,15));
	}

	public void EducationLoan(int a,double b) {

	}

	public void EducationLoan(double a , int b) {

	}
	public void EducationLoan(double a , double b) {

	}
	
	public void getHomeLoan(String bankName) {

	}

	public void getHomeLoan(String bankName, int amount) {

	}

	public void getHomeLoan(int amount, String bankName) {

	}

	public void getHomeLoan() {

	}

	public void getHomeLoan(int amount, int remainingAmount) {
		System.out.println(amount + remainingAmount);
	}

	public void getHomeLoan(int amount, int remainingAmount, int balance) {
		System.out.println(amount + remainingAmount + balance);
	}

	public void login(int number, String password) {

	}

	public void login(String userName, String password) {

	}

	public String login(String userName, String password) {

		return userName;
	}

	public int addition(int... a) {
		int add=0;
		for(int w:a) {
			
			add=w+add;
		}
		return add;
	}
}
