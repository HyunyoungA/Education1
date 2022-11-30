package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		//1~5까지 출력
		
		//while문
//		int i = 1;//초기식 역할
//		while( i <= 5) {
//			System.out.println(i);
//			i++;//증감식 -->꼭 아래에 있지않아도됨.
//		}
		
		//do~while문
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 5);
	}
	
	public void method2() {
		//5부터 1까지 출력
		
		//while문
//		int i = 5;
//		while(i >=1) {
//			System.out.println(i);
//			i--;
//		}
		
		//do~while문
		int i = 5;
		do {
			System.out.println(i);
			i--;
		}while(i >= 1);
	}
	
	public void method3() {
		//정수 두개를 입력 받아 그 사이 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자를 두 번째 숫자보다 작게 입력해주세요.");
		System.out.println("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		int min = 0; //더 작은 값을 담아놓는 변수
		int max = 0; //더 큰 값을 담아놓는 변수
		//문제 해결
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max = end;
			min = start;
		}
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public void method4() {
		//문자열을 입력받아 인덱스 별로 문자 출력
		//문자열 입력 : test
		//0 : t
		//1 : e
		//2 : s
		//3 : t
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}
//		while문
//		int i = 0;
//			while(i < str.length()) {
//				System.out.println(i + " : " + str.charAt(i));
//				i++;
//			}
		
//		do~while문
		int i =0;
		do {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}while(i < str.length());
	}
	
	//while 중첩 완성
	public void method5() {
		//2단부터 9단까지 출력
		
		//int den = 2;
				//while(den <= 9){
				//	int i = 1;
				//	while(i <= 9) {
				//		System.out.println(den + " * " + i + " = " + (den * i));
				//		i++;
				//	den++;
				//}
				//}
				//	while(i <= 9) {
				//		System.out.println(den + " * " + i + " = " + (den * i));
				//		i++;
				//	den++;
				//}
				//}
		
		int i = 2;
		while(i < 10) {
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d*%d = %2d%n", i, j, i*j);
				j++; 
		}
			System.out.println();
		i++;}
	}
	
	public void method6() {
		//아날로그 시계 : 0시 0분~ 23시 59분
		//int hour = 0;
		//while(hour < 24) {
		//	int min = 0;
		//while(min < 60) {
		//		System.out.println(hour + "시" + min + "분");
		//		min++
		//}
		//		System.out.println();
		//hour++;
		//}
		
		
		int i = 0;
		while(i < 24) {
			int j = 0;
			while(j <= 59) {
				System.out.printf("%d시 %d분%n", i, j);
				j++;
			}
				System.out.println();
			i++;
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(menuNum != 9) { 
			System.out.println("1. 1부터 5까지");
			System.out.println("2. 5부터 1까지");
			System.out.println("3. m부터 n까지");
			System.out.println("4. 인덱스별 문자");
			System.out.println("5. 구구단");
			System.out.println("6. 아날로그 시계");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 메뉴번호입니다.");
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) { //조건이 true여서 무한반복문
			System.out.println("1. 1부터 5까지");
			System.out.println("2. 5부터 1까지");
			System.out.println("3. m부터 n까지");
			System.out.println("4. 인덱스별 문자");
			System.out.println("5. 구구단");
			System.out.println("6. 아날로그 시계");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("프로그램을 종료합니다.");return;
			//return은 호출한 쪽(main method)으로 돌아감.밑에 실행은 하지않고 여기서 종료.
			default : System.out.println("잘못된 메뉴번호입니다.");
			}
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		do{ 
			System.out.println("1. 1부터 5까지");
			System.out.println("2. 5부터 1까지");
			System.out.println("3. m부터 n까지");
			System.out.println("4. 인덱스별 문자");
			System.out.println("5. 구구단");
			System.out.println("6. 아날로그 시계");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 메뉴번호입니다.");
			}
		}while(menuNum != 9);//한 번 이상의 실행 보장!
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		do{ //조건이 true여서 무한반복문
			System.out.println("1. 1부터 5까지");
			System.out.println("2. 5부터 1까지");
			System.out.println("3. m부터 n까지");
			System.out.println("4. 인덱스별 문자");
			System.out.println("5. 구구단");
			System.out.println("6. 아날로그 시계");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("프로그램을 종료합니다.");return;
			//return은 호출한 쪽(main method)으로 돌아감.밑에 실행은 하지않고 여기서 종료.
			default : System.out.println("잘못된 메뉴번호입니다.");
			}
		}while(true);
	}
	
	public void method11() {
		//키보드로 문자열을 입력 받아 출력 반복 실행
		//exit가 입력되면 반복 종료
		Scanner sc = new Scanner(System.in);
		
//		String str = "";
//		while(!str.equals("exit")) {//str != "exit"(X)숫자, 문자열은 str.equals("exit")
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
//		String str = "";
		String str = null;
		do{//str != "exit"(X)숫자, 문자열은 str.equals("exit")
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}while(!str.equals("exit"));
	}
	
	
	
	

}
