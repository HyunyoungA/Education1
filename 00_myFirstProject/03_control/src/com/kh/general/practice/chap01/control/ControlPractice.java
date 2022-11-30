package com.kh.general.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
//		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 입력");
		System.out.println();
		System.out.print("2. 수정");
		System.out.println();
		System.out.print("3. 조회");
		System.out.println();
		System.out.print("4. 삭제");
		System.out.println();
		System.out.print("7. 종료");
		System.out.println();
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: case 2: case 3: case 4:
			System.out.println("조회 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		}
	}
	
	public void practice2() {
//		키보드로 정수를 입력 받고, 입력한 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		}else if(num % 2 != 0) {
			System.out.println("홀수다");
		}
		if(num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		int num = sc.nextInt();
		System.out.println("수학점수 : ");
		int num2 = sc.nextInt();
		System.out.println("영어점수 : ");
		int num3 = sc.nextInt();
		
		int num4 = num + num2 + num3;
		if(num >= 40 && num2 >= 40 && num3 >= 40) {
			if((num4 / 3) >= 60) {
				System.out.println("국어 : " + num);
				System.out.println("수학 : " + num2);
				System.out.println("영어 : " + num3);
				System.out.println("합계 : " + num4);
				System.out.println("평균 : " + num4 / 3);
				System.out.println("축하합니다, 합격입니다!");
			}else {
				System.out.println("불합격입니다.");
			}
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");	
		
		}
		
	}
	
	public void practice5() {
//		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”, 
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
	}
}
