package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� : ");
		int num = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		System.out.printf("���ϱ� ��� : %d", num+num2 );
		System.out.println();
		System.out.printf("���� ��� : %d", num-num2);
		System.out.println();
		System.out.printf("���ϱ� ��� : %d", num*num2);
		System.out.println();
		System.out.printf("������ �� ��� : %d", num/num2);
	}

}
