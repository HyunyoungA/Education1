package com.kh.example.chap03.branch;

import java.util.Scanner;

public class Branch {
	public void method1() {
		//사용자에게 문자열을 입력 받아 해당 문자열의 글자 개수 출력 (반복)
		//end가 입력되면 반복 종료
		Scanner sc = new Scanner(System.in);
//		String str = "";
//		while(!str.equals("end")) {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("글자 개수 : " + str.length());
//		}
		
//		String str = null;
//		do {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("글자 개수 : " + str.length());
//		}while(!str.equals("end"));	
//	}
		String str = null;
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			
			if(str.equals("end")) {
				break;//나와 가장 가까운 반복문만 탈출
			}
			System.out.println("글자 개수 : " + str.length());
		}while(true);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1;; i++) {
			sum +=i;
			
			if(i == num) {
				break;
			}
		}
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
	}
	
	//continue : 다시 처음으로 돌아서 실행 = 아래 코드는 건너뜀
	//		for문 안의  continue	 : 증감식
	//		while문 안의 continue	 : 조건식
	public void method3() {
		//1~100까지의 정수들을 합하는데 4의 배수는 빼고 계산
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
//			if(i % 4 != 0) {
//			sum +=i;
//			}
			if(i % 4 == 0) {//4배수가 true가 되면 넘어가서 밑에 총값에 도달하지않음.
				continue;
			}
			sum+= i;//총값
		}
		System.out.println(sum);
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

