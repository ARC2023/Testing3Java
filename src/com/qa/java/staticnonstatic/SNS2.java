package com.qa.java.staticnonstatic;

public class SNS2 {

	public static void main(String[] args) {
		
		SNS.changePin();
		SNS.pin=90;
		
		SNS sns=new SNS();
			sns.call();
			sns.caller();
			sns.changePin();
	}

}
