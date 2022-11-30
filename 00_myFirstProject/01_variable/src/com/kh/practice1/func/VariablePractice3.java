package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		float num = sc.nextFloat();
		System.out.print("세로 : ");
		float num2 = sc.nextFloat();
//		System.out.print("면적 : ");
//		double num3 = sc.nextDouble();
		System.out.printf("면적 : %.2f%n", num*num2);
		System.out.printf("둘레 : %.2f", (num+num2)*2);
		
	}
	

}
