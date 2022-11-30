package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age = 10;
		final int AGE = 10;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		age = 20;
//		AGE = 20;
		// The final local variable AGE cannot be assigned. It must be blank and not using a compound assignment
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
	}
}
