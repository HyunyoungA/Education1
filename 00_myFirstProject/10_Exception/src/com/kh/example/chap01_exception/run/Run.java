package com.kh.example.chap01_exception.run;

import java.io.IOException;

import com.kh.example.chap01_exception.controller.ExceptionController;

public class Run {
	public static void main(String[]args) {
		ExceptionController ec = new ExceptionController();
		try {
			ec.method1();
		}catch (IOException e) {//������ ����!!!! | �̰Ż��!!
//			e.printStackTrace(); //�ֿܼ� �����۾� �ߴ� ����, ���� üũ���ִ� �κ�
			System.out.println("IOException ó�� ");
		}
		
		System.out.println("���������� �����...");
	}
}
