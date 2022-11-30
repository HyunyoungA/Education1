package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	public void method1() {
		//입력한 정수 값이 1~100 사이의 숫자인지 확인
		//1보다 크거나 같고 100보다 작거나 같다 => and &&
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "1~100사이의 숫자인가? "
				+ (num >= 1 && num <= 100));

	}
	
	public void method2() {
		//입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("대문자인가? " + (ch >= 'A' && ch <= 'Z'));
		
		System.out.println("계속하시려면 Y 또는 y를 입력해주세요 : ");
		// String strYN = sc.nextLine();
		//shar yn = strYN.charAt(0);
		char yn = sc.nextLine().charAt(0);//메소드 체이닝
		
		System.out.println("계속 하겠다고 하셨습니다? " + (yn == 'Y' || yn == 'y' ));
	}
}
