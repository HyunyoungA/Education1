package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		//키보드로 입력한 숫자가 양수인지 음수인지 출력
		//양수면 "입력하신 숫자는 양수입니다"
		//음수면 "입력하신 숫자는 음수입니다"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
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
		
		//if~else문 버전
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else { //num > 0 반대 조건 == num <= 0
			if(num == 0) {
				System.out.println("입력하신 숫자는 0입니다.");
			} else {
				System.out.println("입력하신 숫자는 음수입니다.");
			}
		}
		//if~else if~else문 버전
		
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		} else if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		
	}
	
	public void method2() {
		//입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		//단일 if문 버전
		if(num % 2 == 0) {
			System.out.print("짝수입니다.");
		}
		if(num % 2 != 0) {
			System.out.print("홀수입니다.");
		}
		//if~else문 버전
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}
	
	public void method3() {
		//사용자에게 이름과 성별(M/F)을 입력받고 아래 형식과 같이 출력
		//이름님은 남/여학생입니다
		//이름 : 강건강
		// 성별(M/F) : M
		//강건강님은 남학생입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("성별을 입력하세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
//		if(gender =='M'|| gender == 'm') {
//			System.out.println(name + "님은 남학생입니다.");
//		} else if(gender == 'F' || gender =='f') {
//			System.out.println(name + "님은 여학생입니다.");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
		}
		
//		String student = null;
////		System.out.println(student.charAt(0)); //여기위치에 두면 에러가 남. 밑으로 위치 옮김
//		if(gender == 'M' || gender =='m') {
//			student = "남학생";
//		} else if(gender == 'F' || gender == 'f') {
//			student = "여학생";
//		} else {
//			student = "없는 성별";
//		}
//		System.out.printf("%s님은 %s입니다.", name, student); //charAt(0) 때문에 여학생의 맨 첫번째 단어 "여"만 출력된다. 
	
	public void method4() {
		//사용자에게 이름을 입력받아 본인인지 확인하기
		//본인 이름이 맞다면 "본인입니다" 출력, 본인 이름이 아니라면 "본인이 아닙니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : "); //안내문
		String name = sc.nextLine(); //받아오기
		
		if(name == "박신우") {
			System.out.println("본인입니다");
		}else {
			System.out.println("본인이 아닙니다");
		}
		//문자열 비교 : equals()
		if(name.equals("박신우")) {
			System.out.println("본인입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
	}
}

