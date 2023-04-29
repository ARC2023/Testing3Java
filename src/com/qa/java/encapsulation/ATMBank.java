package com.qa.java.encapsulation;

public class ATMBank {

	public static void main(String[] args) {
		CITIBank citi=new CITIBank();
		citi.pinATM=1234;
		citi.withdrawal("Goldy", 987654, 2378, 490);
		citi.UpdatePin("Goldy", 987654, 2378, 4909);
		citi.withdrawal("Goldy", 987654, 1234, 490);
		citi.withdrawal("Goldy", 987654, 4909, 677777777);

	}

}
