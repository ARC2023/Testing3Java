package com.qa.java.polymorphism;

public class SBI {

	public static void main(String[] args) {
		SBI sbi = new SBI();

		sbi.IMPS(600000, 899);
		sbi.IMPS(600000.89, 899.69);
		sbi.sum(12, 23, 45);
		System.out.println(sbi.sum(10,34,56,77,322,23));
	}
	public static void main(String args) {
		System.out.println("No Runn!!!!!!!!!!!!!");
		
	}
	
	
	public void IMPS(int availableBal, int requestedbal) {

		System.out.println("Remaining Balance-->" + (availableBal - requestedbal));

	}

	public void IMPS(double availableBal, double requestedbal) {

		System.out.println("Remaining Balance-->" + (availableBal - requestedbal));

	}

	public void IMPS(double availableBal, int requestedbal) {

		System.out.println("Remaining Balance-->" + (availableBal - requestedbal));

	}

	public void IMPS(int availableBal, double requestedbal) {

		System.out.println("Remaining Balance-->" + (availableBal - requestedbal));

	}
	
	
	public int getAvailableBal(String UN,String PW) {
		return 1;
	}
	

	
	public int getAvailableBal(int UN,String PW) {
		return 1;
	}
	
	
	public void sum(int a,int b,int c) {
		
		int sum=a+b+c;
		
		System.out.println(sum);
		
	}
	public int sum(int... a) {
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
	
	
	
	
	
	

}
