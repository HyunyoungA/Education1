package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str =  sc.next();
		System.out.print("첫 번째 문자 : ");
		char c = str.charAt(0);
		System.out.println(c);
		System.out.print("두 번째 문자 : ");
		char c1 = str.charAt(1);
		System.out.println(c1);
		System.out.print("세 번째 문자 : ");
		char c2 = str.charAt(2);
		System.out.println(c2);
	}

}
