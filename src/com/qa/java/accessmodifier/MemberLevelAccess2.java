package com.qa.java.accessmodifier;

public class MemberLevelAccess2 {
	
	
	public static void main(String[] args) {
	MemberLevelAccess1 c1=new MemberLevelAccess1();
		
		System.out.println(c1.publicVariable);
		System.out.println(c1.privateVariable);
		System.out.println(c1.protectedVariable);
		System.out.println(c1.defaultVariable);
		
	}
}
