package com.qa.java.interfaceinclass;

public class TestingClass {

	public static void main(String[] args) {
		
		
		//USMedicalAssociation us= new USMedicalAssociation();
		
		Apollo ap= new Apollo();
		USMedicalAssociation us=  new Apollo();
		UKMedicalAssociation uk= new Apollo();
		IndianMedicalAssociation india= new Apollo();
		
		USMedicalAssociation.Parkinsons();
		
		
		/*
		try {
		//Apollo uas=  new  USMedicalAssociation();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println(USMedicalAssociation.minimumFees);
		System.out.println(UKMedicalAssociation.minimumFees);
		System.out.println(IndianMedicalAssociation.minimumFees);
		
		
		USMedicalAssociation.Parkinsons();
		
		us.Alziemer();
		us.ENT();
		us.Radiology();
		us.Covid("USA");
		us.Gastro();
		
		
		uk.Dental();
		uk.Nephrology();
		uk.Neurology();
		uk.Covid("UK");
		
		india.Diabetes();
		india.Hypertension();
		india.Orthology();
		india.Covid("INDIA");
		
		
		
		ap.Alziemer();
		ap.ENT();
		ap.Radiology();
		ap.Covid("USA");		
		ap.Dental();
		ap.Nephrology();
		ap.Neurology();
		ap.Covid("UK");		
		ap.Diabetes();
		ap.Hypertension();
		ap.Orthology();
		ap.Covid("INDIA");
		ap.Cancer();
		ap.Gynacology();
		ap.Cosmotology();
		ap.Dermatology();
		ap.Gastro();
		ap.getPatientList("USA");
		
*/
	}

}
