package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	public void method1() {
		//1~5까지 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void method1_1() {
 		//자기 소개 다섯 번 하기 : 내 이름은 박신우야
//		for(int i = 1; i <= 5; i++) {
//		for(int i = 5; i <= 9; i++) {
		for(int i = 0; i < 5; i++) {
			System.out.println("내 이름은 박신우야");
		}
	}
	
	public void method2() {
		//5부터 1까지 출력
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		for(int i = 1; i <= 5; i++) {
			System.out.println(6 - i);
		}
	}
	
	public void method2_2() {
		//8부터 3까지 출력
		for(int i = 8; i >= 3; i--) {
			System.out.println(i);
		}
		for(int i = 0; i < 6;i++) {
			System.out.println(8 - i);
		}
	}
	public void method3() {
		//1에서 10 사이의 홀수만 출력 : 1 3 5 7 9
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
	}
	public void method4() {
		//정수 두개를 입력 받아 그 사이 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요.");
		System.out.println("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		for(; start <= end; start++) {
			System.out.println(start);
		}
//		int min = 0; //더 작은 값을 담아놓는 변수
//		int max = 0; //더 큰 값을 담아놓는 변수
//		//문제 해결
//		if(start > end) {
//			max = start;
//			min = end;
//		}else {
//			max = end;
//			min = start;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			System.out.println(i);
//		}
	}
	
	public void method4_1() {
		//정수를 하나 입력받아 (그 수가 1~9 사이의 수일 때만) 해당 (수의 구구단 출력)
		//                     if문                                      for문-->if문 안에 for문
		// 조건이 맞지않으면 "1~9사이의 양수를 입력하여야 합니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단, 1과 9사이의 양수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %-2d%n", num, i, num*i);
			}//%d = 정수를 받겠다. %2d = 두개의 자리를 만들어놓겠다.(오른쪽 정렬)2(양수 : 오른쪽 정렬)
			//%-2d=왼쪽정렬
		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
	}
	
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		//랜덤으로 숫자 선택 : Math클래스의 random()
//		System.out.println(Math.random());
		//(0단계) 0 <= Math.random() < 1 : 0~0.9999999999...
		//(1단계) 0 <= Math.random() * 10 < 10 : 0~9.9999999...
		//(2단계) 1 <= Math.random() * 10 + 1 < 11 : 1~10.99999...
		//(3단계) 1 <= (int)(Math.random() * 10 + 1) < 11 : 1~10
		            //int --> 강제 형변환
		//2단계와 3단계는 순서가 바뀌어도 결과는 동일
		
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		for(int i = 1; i <= random; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("1부터" + random + "까지의 정수 합계" + sum);
	
	}
	public void method5_1() {
		//1부터 50까지의 임의의 난수를 뽑아 홀수인지 짝수인지 판별
		int random = (int)(Math.random() * 50 + 1);
		
		if(random % 2 == 0) {
			System.out.println(random + "수는 짝수입니다.");
		}else {
			System.out.println(random + "수는 홀수입니다.");
		}
		
	}
	
	public void method5_2() {
		//2부터 20까지의 임의의 난수를 뽑아 해당 숫자에 대한 구구단 출력
		//0 <= Math.random() < 1
		//0 <= Math.random() * 19 < 19
		//2 <= Math.random() * 19 + 2 < 21
		//2 <= (int)(Math.random() * 20 + 2) < 21 : 2 ~ 20
		int random = (int)(Math.random() * 20 + 1);

		
		if(random >= 2 && random <= 20) {
			for(int i = 2; i <= 20; i++)
			System.out.printf("%d * %d = %d%n", random, i, random*i);
		}
	}
	
	public void method6() {
		//2단부터 9단까지 출력
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i*j);
			}
			System.out.println();//단과 단 사이 띄우기
		}
	}
	
	public void method7() {
		//아날로그 시계 : 0시 0분~ 23시 59분
		for(int i = 0; i <= 23; i++) {
			for(int j = 0; j <= 59; j++) {
				System.out.printf("%2d시 * %2d분%n", i, j);
				
			}
			System.out.println();
		}
	}
	
	
	public void method8() {
		//한줄에 별표(*)가 5번 출력되는데 사용자가 입력한 수만큼 중 출력
		/*
		 * 출력할 줄 수 : 3
		 * *****
		 * *****
		 * *****
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public void method9() {
		//한 줄에 별표문자를 입력된 줄 수와 칸 수만큼 출력
		//단, 줄수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		/*
		 * 홀수 : 6
		 * 칸수 : 3
		 * 1*****
		 * *2****
		 * **3***
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 :");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
//				System.out.print("*");
				if(i == j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}
	
}
			
			
			

	
	
	

