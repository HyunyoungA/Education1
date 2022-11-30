package com.kh.example.chap04_field.controller;

public class KindsOfVariable1 {// <--중괄호를 클래스영역의 시작

	//전역변수 = 멤버변수 = 멤버필드 = 필드 : 클래스 영역에 작성하는 변수
	private int globalNum;
	//					매개변수
	public void method1(int num) {// <--메소드 영역의 시작
		// 지역변수 : 메소드 영역에서 작성하는 변수
		// 매개변수도 지역변수의 일종으로 취급
		
		int localNum;
//		System.out.println(localNum);
		//지역변수는 선언만 하고 다른 연산으로 사용할 때는 반드시 초기화를 해야함
		
		System.out.println(num); //<--위에서 받아올거기 때문에
		
		System.out.println(globalNum);
		
	}// <--메소드 영역의 끝
	
	public void method2() {
		System.out.println(globalNum);
		
//		System.out.println(localNum);--둘다 영역 밖이어서 안됨
//		System.out.println(num);
	}
	
}// <-- 클래스 영역의 끝
