package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str =  sc.next();
		System.out.print("ù ��° ���� : ");
		char c = str.charAt(0);
		System.out.println(c);
		System.out.print("�� ��° ���� : ");
		char c1 = str.charAt(1);
		System.out.println(c1);
		System.out.print("�� ��° ���� : ");
		char c2 = str.charAt(2);
		System.out.println(c2);
	}

}
