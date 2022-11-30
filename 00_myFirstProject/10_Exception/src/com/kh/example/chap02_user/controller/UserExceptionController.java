package com.kh.example.chap02_user.controller;

import com.kh.example.chap02_user.model.exception.MyException;

public class UserExceptionController {
	
	public void method() throws MyException {
		throw new MyException("곧수업끝나는 에러");
	}
}
