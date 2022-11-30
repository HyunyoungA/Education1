package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int num = sc.nextInt();
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.printf("더하기 결과 : %d", num+num2 );
		System.out.println();
		System.out.printf("빼기 결과 : %d", num-num2);
		System.out.println();
		System.out.printf("곱하기 결과 : %d", num*num2);
		System.out.println();
		System.out.printf("나누기 몫 결과 : %d", num/num2);
	}

}
