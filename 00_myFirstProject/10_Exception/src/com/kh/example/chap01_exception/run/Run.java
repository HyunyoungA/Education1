package com.kh.example.chap01_exception.run;

import java.io.IOException;

import com.kh.example.chap01_exception.controller.ExceptionController;

public class Run {
	public static void main(String[]args) {
		ExceptionController ec = new ExceptionController();
		try {
			ec.method1();
		}catch (IOException e) {//여러개 가능!!!! | 이거사용!!
//			e.printStackTrace(); //콘솔에 빨간글씨 뜨는 이유, 에러 체크해주는 부분
			System.out.println("IOException 처리 ");
		}
		
		System.out.println("정상적으로 종료됨...");
	}
}
