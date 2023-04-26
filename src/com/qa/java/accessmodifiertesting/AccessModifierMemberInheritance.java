package com.qa.java.accessmodifiertesting;

import com.qa.java.accessmodifier.MemberLevelAccess1;

public class AccessModifierMemberInheritance extends MemberLevelAccess1 {

	public static void main(String[] args) {
		MemberLevelAccess1 c1 = new MemberLevelAccess1();

		System.out.println(c1.publicVariable);
		System.out.println(c1.privateVariable);
		System.out.println(c1.protectedVariable);
		System.out.println(c1.defaultVariable);

		
		AccessModifierMemberInheritance a1= new AccessModifierMemberInheritance();
		System.out.println(a1.publicVariable);
		System.out.println(a1.privateVariable);
		System.out.println(a1.protectedVariable);
		System.out.println(a1.defaultVariable);
		
	}

}
