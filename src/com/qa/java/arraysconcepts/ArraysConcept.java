package com.qa.java.arraysconcepts;

public class ArraysConcept {

	public static void main(String[] args) {

		int i = 20;
		i = 10;// At a time I can store only one value

		// 1. int array:
		int a[] = new int[5];
		System.out.println(a.length);
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println(a[4]);
		System.out.println(a[3]);
		System.out.println(a[0]);
		// System.out.println(a[5]);
		System.out.println(a.length);

		for (i = 0; i < a.length; i++) {

			System.out.println("Array Values for index ->" + i + " is -->" + a[i]);

		}

		// 2. double array:
		double b[] = new double[5];
		System.out.println(b.length);
		b[0] = 10.23;
		b[1] = 20.33;
		b[2] = 30.43;
		b[3] = 40.53;
		b[4] = 50.63;

		System.out.println(a.length);

		for (i = 0; i < b.length; i++) {

			System.out.println("Array Values for index ->" + i + " is -->" + b[i]);

		}

		// 3. char array:

		char c[] = new char[3];
		c[0] = 'Z';
		c[1] = '6';
		c[2] = '-';

		// 4. boolean array:
		boolean d[] = new boolean[2];
		d[0] = true;
		d[1] = false;

		// 5. String array
		String e[] = new String[4];
		e[0] = "ARC";
		e[1] = "Institute";
		e[2] = "and";
		e[3] = "Technology";

		System.out.println(e.length);
		for (i = 0; i < e.length; i++) {

			System.out.println("Array Values for index ->" + i + " is -->" + e[i]);

		}
		Object empData[] = new Object[5];

		empData[0] = 5643;
		empData[1] = "Mohan Rai";
		empData[2] = 'M';
		empData[3] = 100000;
		empData[4] = 30.75;

		for (Object temp : empData) {
			System.out.println(temp);
		}
	}

}
