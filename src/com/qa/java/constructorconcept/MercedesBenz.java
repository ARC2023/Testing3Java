package com.qa.java.constructorconcept;

public class MercedesBenz {

	int pin;
	int card;
	int amount;
	
	public MercedesBenz() {
		System.out.println("Mercedes Benz Calling Part 1!!!!!");
	}
	private MercedesBenz(int a) {
		System.out.println("Mercedes Benz Calling Part 2!!!!!");
	}
	public MercedesBenz(int pin,int card,int amount) {
		this.pin=pin;
		this.card=card;
		this.amount=amount;
		System.out.println("Mercedes Benz Calling Part 3!!!!!");
		new MercedesBenz(23);
				
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * MercedesBenz mb1=new MercedesBenz(); 
		 * MercedesBenz mb2=new MercedesBenz(23);
		 */
		MercedesBenz mb3=new MercedesBenz(123,456,789);
		System.out.println(mb3.amount+" "+mb3.card+" "+mb3.pin);
		
	}

}
