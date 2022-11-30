package com.kh.example.chap02_user.model.exception;

public class MyException extends Exception{
	public MyException() {} //기본 생성자 있어야됨.
	public MyException(String msg) { //매개변수 있어야하는 이유는 에러 오른쪽 상세 설명을 넣어주기 위해서! 곧 수업끝나는 에러 라는 설명
		super(msg);
	}
}
