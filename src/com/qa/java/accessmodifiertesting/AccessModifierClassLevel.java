package com.qa.java.accessmodifiertesting;

import com.qa.java.accessmodifier.ClassDefault;
import com.qa.java.accessmodifier.ClassPublic;

public class AccessModifierClassLevel {

	public static void main(String[] args) {
		ClassPublic c1=new ClassPublic();
		c1.classPublic();
		
		
		
		ClassDefault c2= new ClassDefault();
		c2.classDefault();

	}

}
