package com.qa.java.loops;

public class BreakContinue {

	public static void main(String[] args) {
		
		
		
		for (int i = 0; i <= 10; i++) {

			if (i >= 5 && i <= 8)
				continue;// Skip the iteration

			System.out.println(i);

		}
		System.out.println("Outside Loop");

	}

}
