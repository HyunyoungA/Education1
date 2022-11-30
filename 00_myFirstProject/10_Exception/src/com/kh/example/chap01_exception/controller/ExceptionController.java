package com.kh.example.chap01_exception.controller;

import java.io.IOException;

public class ExceptionController {
	public void method1() throws IOException {
		System.out.println("method1() 호출함...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	public void method2() throws IOException {
		System.out.println("method2() 호출함...");
		method3();
		System.out.println("method2() 종료됨...");
	}
	public void method3() throws IOException {
		System.out.println("method3() 호출함...");
		throw new IOException();
//		System.out.println("method3() 종료됨...");
		//Unreachable code : 예외가 발생했기 때문에 아래 코드에 도달 못함
		//여기서 강제발생을 시켰기때문에 throw만 뜸.
	}
}
