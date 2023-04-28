package com.qa.java.staticnonstatic;

public class SNS {

	static int pin = 1111;

	public static void main(String[] args) {

		changePin();
		SNS.pin = 7;
		System.out.println(pin);

		SNS s1 = new SNS();
		s1.pin = 9000;
		
		SNS s2 = new SNS();
		s2.pin = 5000;
		System.out.println(s1.pin);
		System.out.println(s2.pin);
	}

	public static void changePin() {
		System.out.println(pin);
		SNS.pin = 8888;
		System.out.println(pin);
	}

	
	public void call() {
		changePin();
	}
}
