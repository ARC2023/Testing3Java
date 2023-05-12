package com.qa.java.interfaceinclass;

public class Apollo extends GlobalPatientData implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {

	@Override
	public void Radiology() {
		System.out.println("Radiology");

	}

	@Override
	public void ENT() {
		System.out.println("ENT");

	}

	@Override
	public void Alziemer() {
		System.out.println("Alziemer");

	}

	@Override
	public void Nephrology() {
		System.out.println("Nephrology");

	}

	@Override
	public void Neurology() {
		System.out.println("Neurology");

	}

	@Override
	public void Dental() {
		System.out.println("Dental");

	}

	@Override
	public void Diabetes() {
		System.out.println("Diabetes");

	}

	@Override
	public void Hypertension() {
		System.out.println("Hypertension");

	}

	@Override
	public void Orthology() {
		System.out.println("Orthology");

	}

	@Override
	public void Covid(String country) {

		if (country.equalsIgnoreCase("USA")) {
			System.out.println("USA Covide");

		} else if (country.equalsIgnoreCase("UK")) {

			System.out.println("UK Covide");
		} else if (country.equalsIgnoreCase("India")) {
			System.out.println("India Covide");

		}

	}

	public void Cancer() {
		System.out.println("Cancer");
	}

	public void Dermatology() {
		System.out.println("Dermatology");
	}

	public void Cosmotology() {
		System.out.println("Cosmotology");
	}

	public void Gynacology() {
		System.out.println("Gynacology");
	}

	@Override
	public void covidvaccine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ebolavaccine() {
		// TODO Auto-generated method stub
		
	}

	public static void Parkinsons() {
		System.out.println("Parkinsons Child");
		
	}
}
