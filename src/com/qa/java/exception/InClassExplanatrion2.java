package com.qa.java.exception;

public class InClassExplanatrion2 {

	public static void main(String[] args) throws Exception {
		System.out.println("Begining of Method");
		try {
			System.out.println("Begining of try");
			int x = 10;
			int y = 0;
			x = x / y;
			System.out.println("Value of x --> " + x);
			System.out.println("End of try");
		} catch (Exception e) {
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new Exception("Meri Marzi");
		}
		finally {
		System.out.println("End of Method");
		}
	}

}
