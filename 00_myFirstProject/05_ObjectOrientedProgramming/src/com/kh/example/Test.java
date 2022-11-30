package com.kh.example;

import com.kh.example.chap05_constructor.model.vo.User;

public class Test {
	public void method1() {
//		반환값x매개변수x
		System.out.println("반환값,매개변수x");
	}
	
	public int method2() {
//		반환값o매개변수x
		int i = 10;
		int i2 = 5;
		int sum = i + i2;
		return sum;
	}
	public void method3(int num) {
//		반환값x 매개변수o
		System.out.println(num);
	}
	public int method4(int num4) {
//		반환값o매개변수o
		return num4;
	}
	public int[] method5() {
//		반환값이 배열인 경우
		int[] iArr = {1, 2, 3, 4};
		
		System.out.println(iArr);
		return iArr;
	}
	public User method6() {
		User u = new User(" ", "강건강");
		System.out.println(u);
		
		return u;
	}
	
	
//	반환값이 있으면 모두 return 추가~!!
	
	
	
	
	
	
}
