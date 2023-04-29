package com.qa.java.constructorthissuperkeyword;

public class BMW {

	int cardNo;
	int pin;
	String name;

	public BMW() {
		System.out.println("Non Parameterised Constructor");
	}

	public BMW(int cardNo) {
		System.out.println("Parameterised Constructor with value as-->" + cardNo);
		this.cardNo = cardNo;

	}

	public BMW(int pin, String name) {
		System.out.println("Parameterised Constructor with values as --> " + pin + " and " + name);
		this.pin=pin;
		this.name=name;
	}

	public static void main(String[] args) {
		BMW nBmw = new BMW();
	}
}
