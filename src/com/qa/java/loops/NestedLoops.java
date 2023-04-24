package com.qa.java.loops;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * 1. The placing of one loop inside the body of another loop is know as Nesting
		 * of loops 
		 * 2. While working with nested loops the outer loop will change only
		 * when inner loop is completely finished
		 */

		int i = 0;
		int counter=0;

		while (i < 3) {

			for (int j = 0; j < 4; j++) {
				int k = 0;
				
				do {
					System.out.println("i-->" + i + "   j-->" + j + "   k-->" + k);
					k++;
					counter++;
				} while (k < 5);

			}

			i++;

		}
		System.out.println(counter);
	}
}
