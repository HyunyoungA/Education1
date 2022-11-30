package com.kh.example.chap01.condition;

import java.util.Scanner;

public class Test_if {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//단일 if문 버전
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}
		if(num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		//if~else if~else문 버전
		
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}else if(num < 0) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		
		int num = sc.nextInt();
		//단일 if문 버전
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}
		if(num % 2 != 0) {
			System.out.println("홀수입니다");
		}
		
		//if~else문 버전
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("음수입니다");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		if(gender == 'M'|| gender == 'm') {
			System.out.println(name + "님은 남학생입니다.");
		}else if(gender == 'F'|| gender == 'f') {
			System.out.println(name + "님은 여학생입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		String student = null;
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		}else if (gender == 'F' || gender == 'f'){
			student = "여학생";
		}else {
			student = "없는 성별";
		}
		System.out.printf("%s님은 %s입니다.", name, student);
	}

}
