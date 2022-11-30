package com.kh.example.chap04_field.controller;

public class KindsOfVariable2 {
	public static String str;
	
	private int testNum = 10;
	private static int staticTestNum = 10;
	
	public void method() {
		testNum++;
		System.out.println(testNum);
		staticTestNum++;
		System.out.println(staticTestNum);
	}
}
