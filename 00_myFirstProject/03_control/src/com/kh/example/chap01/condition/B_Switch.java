package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	public void method1() {
		//정수 두개와 연산기호 문자 1개를 받아서 연산기호 문자에 해당하는 계산을 수행하고 출력
		//ex
		//첫번째 값 : 1
		//두번째 값 : 2
		//연산자(+,-,*,/) : *
		// 1 * 2 = 2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 값 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 값 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+,-,*,/) : ");
		char op = sc.next().charAt(0);
		//sc.next()문자열 받아오는거
		//op = 연산자 op자체가 char여서 -->case '+' 싱글 코데이션으로 만듬
		int result = 0; // 연산 결과를 담아놓을 변수
		
//		if(op == '+') {
//			result = num1 + num2;
//		}else if(op == '-') {
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break; //넣어도되고 빼도됨 **마지막이어서
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);

	}
	
	public void method2() {
		//입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		switch(num % 2) {
		case 1: System.out.println("홀수입니다."); break;
		case 0: System.out.println("짝수입니다."); break;
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		//받아온 num을 가지고 해당 달에 마지막 날 출력
		//1~12까지 중 하나를 입력하세요 : 7
		//입력하신 달 31일까지입니다.
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("입력하신 달은 31일까지입니다.");
			break;
		case 2 : 
			System.out.println("입력하신 달은 28일까지입니다.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("입력하신 달은 30일까지입니다.");
			break;
		}

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);//알맹이 ->메소드나 스캐너 안에있는거 활용하려고 만듬
		System.out.println("===메뉴===");
		System.out.println("1. 간단 계산기");
		System.out.println("2. 짝/홀수 판단");
		System.out.println("3. n월의 마지막 날");
		System.out.println("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.println("간단 계산기입니다.");
			method1();
			break;
		case 2:
			System.out.println("짝홀수 판단입니다.");
			method2();
			break;
		case 3:
			System.out.println("n월의 마지막날입니다.");
			method3();
			break;
		default:
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	
	
}
