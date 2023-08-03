package com.qa.java.interfaceinclass;

public interface UKMedicalAssociation extends WHO{

	int minimumFees = 500;

	public void Nephrology();

	public void Neurology();

	public void Dental();
	
	public void Covid(String country);
	
	
	public UKMedicalAssociation() {}
	
}
