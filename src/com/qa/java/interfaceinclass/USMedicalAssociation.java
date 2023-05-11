package com.qa.java.interfaceinclass;

public interface USMedicalAssociation extends WHO{

	int minimumFees = 200;

	public void Radiology();

	public void ENT();

	public void Alziemer();

	public void Covid(String country);

	// public static void Parkinsons(); // In Interface we cannot create static prototype method or called as abstract method
   // public void Alziemer(){}; 
	
	
	
	public static void Parkinsons() {
		System.out.println("Parkinsons");
		
	}
	
	default void Gastro() {
		System.out.println("Gastro");
	}
	
	
}
