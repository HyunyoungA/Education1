package com.kh.example.chap02_user.model.exception;

public class MyException extends Exception{
	public MyException() {} //�⺻ ������ �־�ߵ�.
	public MyException(String msg) { //�Ű����� �־���ϴ� ������ ���� ������ �� ������ �־��ֱ� ���ؼ�! �� ���������� ���� ��� ����
		super(msg);
	}
}
