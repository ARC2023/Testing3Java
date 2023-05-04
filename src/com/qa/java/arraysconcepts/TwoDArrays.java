package com.qa.java.arraysconcepts;

public class TwoDArrays {

	public static void main(String[] args) {

		String str[][] = new String[3][4];
		System.out.println(str.length);
		System.out.println(str[0].length);
		// str[4][5]="D";
		// 1st row
		str[0][0] = "Nikhil";
		str[0][1] = "Pooja";
		str[0][2] = "Amruta";
		str[0][3] = "Priya";
		// 2nd row
		str[1][0] = "Abhishek";
		str[1][1] = "Goldy";
		str[1][2] = "Piyush";
		str[1][3] = "Lochna";
		// 3rd row
		str[2][0] = "Prachiti";
		str[2][1] = "Sunny";
		str[2][2] = "Kunal";
		str[2][3] = "Shubham";

		System.out.println(str[2][3]);

		for (int i = 0; i < str.length; i++) {
			System.out.println("This Loop will print Columns");
			for (int j = 0; j < str[0].length; j++) {
				
				System.out.println("Row --> " + i + " and Column -->" + 
				j + " -->>>" + str[i][j]);				
				
				if( str[i][j].equals("Goldy")|| str[i][j].equals("Sunny") || 
						str[i][j].equals("Nikhil")) {
					System.out.println("Found Found Found");
					break;
				}
				
			}
		}

	}

}
