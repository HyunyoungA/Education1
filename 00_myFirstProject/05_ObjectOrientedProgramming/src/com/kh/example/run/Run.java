package com.kh.example.run;

import com.kh.example.Test;
import com.kh.example.chap06_method.controller.MethodController;

public class Run {
	public static void main(String[] args) {//static 프로그램 시작부터 끝까지 유지!
		Test t = new Test();
		
		System.out.println("초기 원의 넓이와 둘레 값");
		t.getAreaOfCircle();
		t.getSizeOfCircle();
		
		System.out.println("== 반지름1 증가 ==");
		t.incrementRadius();
		
		
		System.out.println("반지름 증가 후 원의 둘레, 넓이 값");
		t.getAreaOfCircle();
		t.getSizeOfCircle();
		
		t.method3();
		System.out.println(t.method3());
	}
	
	
	
	private int globalNum;
	public void method1(int num) {
		int localNum;
		System.out.println(num);
		System.out.println(globalNum);
		
	}
	public void method2() {
		System.out.println(globalNum);
	}
	
		
		
	
	
}


