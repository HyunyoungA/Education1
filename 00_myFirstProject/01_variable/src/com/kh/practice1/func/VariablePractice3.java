package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		float num = sc.nextFloat();
		System.out.print("���� : ");
		float num2 = sc.nextFloat();
//		System.out.print("���� : ");
//		double num3 = sc.nextDouble();
		System.out.printf("���� : %.2f%n", num*num2);
		System.out.printf("�ѷ� : %.2f", (num+num2)*2);
		
	}
	

}
