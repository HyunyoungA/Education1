package com.kh.example.chap04_Math.comtroller;

public class MathController {
	public void method() {
		double num = 4.949;
		
		double pi = Math.PI;
		System.out.println("���� : " + pi);
		
		double abs = Math.abs(-num);
		System.out.println("���밪 : " + abs);
		
		double ceil = Math.ceil(num);
		System.out.println(ceil);
		System.out.println(Math.ceil(3.2));
		
		double round = Math.round(num);
		System.out.println("�ݿø� : " + round);
		System.out.println(Math.round(3.2));
		
		double floor = Math.floor(num);
		System.out.println("���� : " + floor);
		
		double max = Math.max(ceil, floor);
		System.out.println("�ִ밪 : " + max);
		
		double min = Math.min(ceil,floor);
		System.out.println("�ּҰ� : " + min);
		
		
	}
}
