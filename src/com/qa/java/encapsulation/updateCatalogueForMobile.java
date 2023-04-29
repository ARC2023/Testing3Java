package com.qa.java.encapsulation;

public class updateCatalogueForMobile {

	public static void main(String[] args) {
		
		FlipKart Flip=new FlipKart();
		//Flip.price=90;
		System.out.println("Model No-->"+Flip.getModelNo());
		System.out.println("Price No-->"+Flip.getPrice());
		System.out.println("Product-->"+Flip.getProductName());
		
		Flip.setModelNo("14 Pro Max");
		Flip.setPrice(120000);
		Flip.setProductName("iPhone");
		
		System.out.println("Model No after update-->"+Flip.getModelNo());
		System.out.println("Price No after update-->"+Flip.getPrice());
		System.out.println("Product after update-->"+Flip.getProductName());
		
		
		
		
		

	}

}
