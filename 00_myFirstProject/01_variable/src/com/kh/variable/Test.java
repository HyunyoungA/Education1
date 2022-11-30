package com.kh.variable;

import java.util.Scanner;

public class Test {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수다" : "양수가 아니다";
		
		String str2 = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println(str2);
	}
	
	public void method2() {
		//사용자에게 성별을 입력 받고(M/F)
		//M이면 "남자입니다", F면 "여자입니다", 둘 다 아니면 "잘못 입력하셨습니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 입력(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = gender == 'M' ? "남자입니다" : (gender == 'F' ? "여자입니다" : "잘못입력하셨습니다");
		System.out.println(result);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void method() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num > 0) {
//			System.out.println("입력하신 숫자는 양수 입니다");
//		}
//		if(num == 0) {
//			System.out.println("입력하신 숫자는 0 입니다");
//		}
//		if(num < 0) {
//			System.out.println("입력하신 숫자는 음수 입니다");
//		}
//		
//		if(num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");
//		} else {
//			if(num == 0) {
//				System.out.println("입력하신 숫자는 0입니다");
//			} else {
//				System.out.println("입력하신 숫자는 음수입니다");
//			}
//		}
//			
//		if(num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");
//		}else if(num == 0) {
//			System.out.println("입력하신 숫자는 0입니다");
//		}else {
//			System.out.println("입력하신 숫자는 음수입니다");
//		}
//
//	}
//	
//	public void method2() {
//		//입력한 숫자가 짝수인지 홀수인지 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력 : ");
//		int num = sc.nextInt();
//		//단일 if문 버전
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		
//		if(num % 2 != 0) {
//			System.out.println("홀수입니다");
//		}
//		//if~else문 버전
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
//
//	}
//	
//	public void method3() {
//		//사용자에게 이름과 성별(M/F)을 입력받고 아래 형식과 같이 출력
//		//이름님은 남/여학생입니다
//		//이름 : 강건강
//		// 성별(M/F) : M
//		//강건강님은 남학생입니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요");
//		String name = sc.nextLine();
//		System.out.print("성별을 입력하세요(M/F)");
//		char gender = sc.nextLine().charAt(0);
//		
//		if(gender == 'M') {
//			System.out.println("name님은 남학생입니다.");
//		}else if(gender == 'F') {
//			System.out.println("name님은 여학생입니다.");
//		}else { //마지막 else는 조건이 필요없다. 위에 조건에 전부false일 경우 마지막선언
//			System.out.println("잘못 입력하셨습니다.");
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
