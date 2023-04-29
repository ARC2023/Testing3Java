package com.qa.java.constructorthissuperkeyword;

public class TCS extends TATASONS{

	
	
	  public TCS(int a) { 
		  System.out.println("TCS  Constructor");
		  software();
	  
	  }
	 
	public void software() {
		
		super.a=90;
		System.out.println(a);
		super.software();
		System.out.println("TCS Child");
	}
	
	
}
