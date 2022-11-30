package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	//매개변수 유무와 반환 값 유무에 따른 구분
	//1. 매개변수 없고 반환 값 없는 메소드
	public void  method1() {
		//반환 값X			매개변수X-->빈 소괄호()
		//전달 받는 값도 없고 반환할 값도 없는 메소드로 내용만 수행 후 끝남
		System.out.println("매개변수와 반환 값 둘다 없는 메소드 입니다.");
//		return;-->return이 항상 숨어있다.
	}
	
	//2. 매개변수 없고 반환 값 있는 메소드
	public int method2() {
		int num1 = 10;
		int num2 = 3;
		int sum = num1 + num2;
//		return 123;//위에 타입과 맞춰줘야한다. int->123, String->"123" 타입만 맞추면 어떤걸 써도 상관없다.
		return 13;

	}
	
	//3. 매개변수 있고 반환 값 없는 메소드
	public void method3(int num1, int num2) {
		//반환 값있고		매개변수 있음.
		System.out.println(num1 + ", " + num2);
	}
	//4. 매개변수 있고 반환 값 있는 메소드
	public int method4(int num1, int num2) {
//		int sum = num1 + num2; <--이렇게 사용해도 됨.
		return num1 + num2;
	}
	//반환 값이 배열인 경우
	public int[] method5() {
		int[] iArr = {1, 2, 3};
		System.out.println("MethodController iArr : " + iArr);
		
		return iArr;
	}
	
	//반환 값이 클래스인 경우
	public User method6() {
		User u = new User("user01", "pass01", "강건강");
		System.out.println("MethodController u : " + u);
		
		return u;
	}
	
	
	
	
	
}
