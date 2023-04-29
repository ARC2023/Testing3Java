package com.qa.java.inheritance;

public class Volkswagen extends Car{

	public static void main(String[] args) {
		
		Volkswagen v=new Volkswagen();
		v.getColor();

		Car c= new Volkswagen();
		v.getTyre();
		
		//Volkswagen v1= new Car();
	}
	
	
	
	public void getTyre() {}
	
}
