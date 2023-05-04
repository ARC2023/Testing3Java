package com.qa.java.exception;

public class UncheckedExceptionsArrayOutOfBound {

	

	public static void main(String[] args) throws Exception {
	
		System.out.println("Begining of Method");
		try {
			System.out.println("Begining of try");
			int a[]= new int[4];			
			a[30]=90;
			System.out.println("End of try");
		} catch (Exception e) {
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
						
			throw new Exception("Deliberatelty Failing Catch block");
		}
		
		finally {
		
		System.out.println("End of Method");
		}
	}
		
		

	}

