package com.qa.java.loops;

public class ForLoopTraditional {

	public static void main(String[] args) {
		
		String[] str= new String[3];
		str[0]="Swapnil";
		str[1]="Chitika";
		str[2]="Onisha";
		
		for(int i=0;i<10;i++) {
			
			System.out.println(i);
			
			
		}
		
		
		for(String temp:str) {
			
			
			if(temp.equalsIgnoreCase("Onisha")) {
				System.out.println("Salary increment");
			}
			
		}
		
		
	}

}
