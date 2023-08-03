package com.qa.java.constructorthissuperkeyword;

public class DiligentaCToTCS extends TCSChildToTS{

	
	public DiligentaCToTCS() {
		super(9);
		super.LSNHC="lkj";
		super.sellChemicals();
		System.out.println("Diligenta");
	}
	
	public static void main(String[] args) {
		DiligentaCToTCS nh=new DiligentaCToTCS();
		
	
	}
	
}
