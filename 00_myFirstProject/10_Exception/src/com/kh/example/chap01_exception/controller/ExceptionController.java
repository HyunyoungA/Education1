package com.kh.example.chap01_exception.controller;

import java.io.IOException;

public class ExceptionController {
	public void method1() throws IOException {
		System.out.println("method1() ȣ����...");
		method2();
		System.out.println("method1() �����...");
	}
	public void method2() throws IOException {
		System.out.println("method2() ȣ����...");
		method3();
		System.out.println("method2() �����...");
	}
	public void method3() throws IOException {
		System.out.println("method3() ȣ����...");
		throw new IOException();
//		System.out.println("method3() �����...");
		//Unreachable code : ���ܰ� �߻��߱� ������ �Ʒ� �ڵ忡 ���� ����
		//���⼭ �����߻��� ���ױ⶧���� throw�� ��.
	}
}
