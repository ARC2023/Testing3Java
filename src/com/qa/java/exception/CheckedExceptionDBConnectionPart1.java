package com.qa.java.exception;

public class CheckedExceptionDBConnectionPart1 {

	public static void main(String[] args) {
		// If due to exception the program fails and DB connectivity is not closed
		// No other user can access the db
		// So we need to a block of code that will be executed no matter what happens in try or catch 
		// Finally block will execute all the time
		
		try {
			//DB Connection
			//Executing Query
			//Exception Occurred
			System.out.println("Establishing in Try of DB Connection"); 
			double l=10/0;
			System.out.println("Executing Query in Try of DB Connection");
		}catch (Throwable t) {
			//Exception caught
			System.out.println("Error caught in DB Connection");
			double l=10/0;

		}
		finally {
			//Closed DB connection
			System.out.println("Closing DB Connection in finally");
		}
		
		
		
	}

}
