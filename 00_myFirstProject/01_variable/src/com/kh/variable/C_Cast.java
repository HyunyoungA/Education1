package com.kh.variable;

public class C_Cast {
	// 형변환에서 제외가 되는 기본 자료형 : boolean
	// 형변환의 종류 : 자동 형변환, 강제 형변환
	
	//자동 형변환
	public void casr1() {
		//정수끼리의 자동 형변환
		byte bNum = 3;
		int iNum = bNum;  // 자동형변환
		
		// 정수와 실수끼리의 자동 형변환
		long lNum = 100;
		float fNum = lNum;
		
		// 정수와 실수끼리의 자동 형변환
		int num = 'A';
		char ch = 97;
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; //Type mismatch: cannot convert from int to char
		System.out.println("ch2 : " + ch2);
		
//		char ch3 = -10;
		int num1 = -10;
		char ch3 = (char)num1;
		System.out.println("ch3 : " + ch3);
	}
//		byte b1 = 10; // int지만 10은 리터럴 범위안에만 포함되어있는 값이면 문제없이 받아드림.
		//=10L(X) long type 이 되서 안된다.
		//컴퓨터는 모든 정수는 다 int라고 받아들인다.
//		byte b2 = 10L;
//		byte b3 = 127;
//		byte b4 = 128; // int인데 내가 받을 수 없는 값이야
		
		
	//강제 형변환
	public void cast2() {
		int iNum = 10;
		long lNum = 100L;
			
//			int result = iNum + lNum;
		//자동형변환 int ->long 작은게 큰거로 변환
		//계산 결과가 long타입이 되는데 그 값을 int에 넣으려고 하기 때문
		//방법1. 수행 결과를 int로 강제 형변환
		int result1 = (int)(iNum + lNum);
		//방법2. long형 값을 int로 강제 형변환
		int result2 = iNum + (int)lNum;
		//방법3. 결과 값을 long형으로 받기
		long result3 = iNum + lNum;
		}
	}
