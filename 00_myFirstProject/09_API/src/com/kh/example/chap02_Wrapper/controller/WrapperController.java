package com.kh.example.chap02_Wrapper.controller;

public class WrapperController {
	public void method1() {
		// 기본자료형 Wrapper클래스
		// boxing	: 기본 자료형을 wrapper클래스로 변환
		// unBoxing : wrapper클래스를 기본 자료형으로 변환
		
		int num1 = 10;
		Integer integer1 = new Integer(num1); //boxing 
		int num2 = integer1.intValue(); //unBoxing
		
		//JDK1.5 -> autoBoxing, autoUnboxing
		Integer integer2 = num1; //autoBoxing
		int num3 = integer2; //autoBoxing
	}
	
	public void method2() {
		//parsing : 문자열을 기본자료형으로 변환하는 것.
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("박신우");
		//java.lang.NumberFormatException : For input string: "박신우"
		//파싱할 자료형의 형태를 지니지 않아서 나는 에러
		short s = Short.parseShort("10");//괄호 안에 띄어쓰기 하면 안됨.
		float f = Float.parseFloat("10");
		boolean b = Boolean.parseBoolean("true");
		Byte by = Byte.parseByte("10");
		Long l = Long.parseLong("10");
		
		//Character.parse는 불가능
		//Character클래스는 parsing기능 제공 X ==> charAt() 사용
		
		//기본 자료형을 문자열로 바꾸는 작업
		String str1 = i + "";//i + ""; <--문자열로 바뀜
		String str2 = String.valueOf(s);
		String str3 = Byte.valueOf(by).toString();//3가지 방법
		
	}
	
}
