package com.qa.java.encapsulation;

public class ATM {

	public static void main(String[] args) {
		SBI s=new SBI();
		
		s.withdrawal(10981, 1234, 1000000);
		s.withdrawal(10981, 2023, 500000);
		s.pinNo=1234;
		s.updatePin(10981, 1234, 1234);
		s.updatePin(10981, 2023, 1234);		
		s.withdrawal(10981, 1234, 500000);

	}

}
