package com.kh.example.practice3.model.vo;

public class Circle {
	public static final double PI = 3.14;//PI �빮�ڴ� ���->final ���
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
