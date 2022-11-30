package com.kh.example.chap04_Math.comtroller;

public class MathController {
	public void method() {
		double num = 4.949;
		
		double pi = Math.PI;
		System.out.println("파이 : " + pi);
		
		double abs = Math.abs(-num);
		System.out.println("절대값 : " + abs);
		
		double ceil = Math.ceil(num);
		System.out.println(ceil);
		System.out.println(Math.ceil(3.2));
		
		double round = Math.round(num);
		System.out.println("반올림 : " + round);
		System.out.println(Math.round(3.2));
		
		double floor = Math.floor(num);
		System.out.println("내림 : " + floor);
		
		double max = Math.max(ceil, floor);
		System.out.println("최대값 : " + max);
		
		double min = Math.min(ceil,floor);
		System.out.println("최소값 : " + min);
		
		
	}
}
