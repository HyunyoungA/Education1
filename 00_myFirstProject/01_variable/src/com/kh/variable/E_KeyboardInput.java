package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {

	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(소수 첫째자리까지) : ");
		double height = sc.nextDouble();
		System.out.printf("%s님은 %d세이며, 키는 %fcm입니다.", name, age, height);
	}
	
	public void inputScanner2() {
		//이름, 나이, 주소
		//이름(나이)님이 사시는 곳은 주소입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 1. 주소를 next()로 받아오기
		//next()는 띄어쓰기를 구분자로 인지하여 각각 저장
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();
		
		// 2. nextLine() 추가하기
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 3. 나이를 받을 때 nextLine() 후 파싱하기
		// 파싱 : 문자열을(String)을 기본 자료형으로 바꾸는 것
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		//문자열을 문자로 바꾸는 방법
		System.out.print("성별을 입력하세요(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		System.out.printf("%s(%d, %c)님이 사시는 곳은 %s입니다.", name, age, gender, address);
	}
}
