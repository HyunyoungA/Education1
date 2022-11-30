package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	public void method1() {
		//입력한 정수가 양수인지 아닌지 판별
		//양수면 "양수다", 양수가 아니면 "양수가 아니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수다" : "양수가 아니다";
		
		//양수일 때는 "양수다", 0일 때는 "0이다", 음수일때는 "음수다"
		
		String str2 = num > 0 ? "양수다" : (num == 0? "0이다" : "음수다");
		System.out.println(str2);
	}
	
	public void method2() {
		//사용자에게 성별을 입력 받고(M/F)
		//M이면 "남자입니다", F면 "여자입니다", 둘 다 아니면 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 입력(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = gender == 'M' ? "남자입니다" : (gender == 'F' ?  "여자입니다" : "잘못입력하셨습니다.");
		System.out.println(result);
		
	}
}
