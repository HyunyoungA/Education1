package com.kh.example.practice3.model.vo;

public class Circle {
	public static final double PI = 3.14;//PI 대문자는 상수->final 사용
	private static int radius = 1;
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println(PI*radius*radius);
	}
	public void getSizeOfCircle() {
		System.out.println(2*PI*radius);
	}
}
