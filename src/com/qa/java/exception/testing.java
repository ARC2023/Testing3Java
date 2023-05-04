package com.qa.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class testing {

	public static void main(String[] args) throws FileNotFoundException  {
			
		
		try {
			FileReader file = new FileReader("C:\\test\\a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader file = new FileReader("C:\\test\\a.txt");
	}
}
