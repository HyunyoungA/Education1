package com.kh.variable;

public class A_Variable {
	//자료형 변수명;
	//변수명 = 값;
	//변수 선언 후 초기화
	public void declareVariable() {
		//변수 선언
		//1. 논리형
		boolean isTrue; //The value of the local variable isTrue is not used
		//2. 문자형
		//2-1. 문자 : 한 글자 ''
		//2-2. 문자열 : 한 글자 이상 ""
		char ch;
		String str;
		
		//3. 숫자형
		//3-1. 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2. 실수형
		float fNum;
		double dNum;
		
		//변수 값 대입 = 초기화
		isTrue = true;
		
		ch = 'A';
		str = "문자열";
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		fNum = 4.0f;
		dNum = 8.0;
		
		//변수에 저장된 값 출력
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
	}
	
	// 자료형 변수명 = 값;
	//변수 선언과 동시에 초기화
	
	public void initVariable() {
		//1. 논리형
		boolean isTrue = false;
		//2. 문자형
		//2-1. 문자
		char ch = '가';
		//2-2. 문자열
		String str = "a";
		
		//3. 숫자형
		//3-1. 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 2;
		long lNum = 8L;
		
		//3-2. 실수
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNumd의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
	}
}
