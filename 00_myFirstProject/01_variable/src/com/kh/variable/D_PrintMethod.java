package com.kh.variable;

public class D_PrintMethod {
	public void printlnMethod() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(); //줄바꿈을 하겠다.
	}
	
	public void printMethod() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		System.out.print(str1);
		System.out.print(str2);
	}
	
	public void printfMethod() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		//%s : 문자열		%d : 정수 	%c : 문자
		//%b : 논리값		%f : 실수 
		//안녕하세요, 강건강입니다. 반갑습니다.
//		System.out.printf("%s, 강건강입니다. %s.", str1, str2);
//		System.out.println();
		// 반갑습니다, 친하게 지내요.
//		System.out.printf("%s, 친하게지내요.%n", str2);
//		System.out.printf("%s, 친하게지내요.", str2);
//	}
	
//	public void printfMethod() {
		//미니문제
		//안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		int age = 20;
		String name = "박신우";
		String jop = "강사";
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.",str1, age, name, jop, str2);
	
	}
	public void stringExample() {
		String str1 = "행복하세요";
		String str2 = "건강하세요";
		int num1 = 10;
		int num2 = 20;
		
		String str3 = str1 + str2; //행복하세요건강하세요
		System.out.println(str3);
		
		int num3 = num1 + num2; //30
		System.out.println(num3);
		
		System.out.println(str1 + num1); // 행복하세요10
		System.out.println(num2 + str2); //20건강하세요
		System.out.println(str1 + num1 + num2); //행복하세요1020 문자열 뒤에 오면 뒤에 있는 것들이 다 문자로 바뀜. 숫자 10이 아닌 그냥 10,20
		System.out.println(num1 + str1 + num2); //10행복하세요20
		System.out.println(num1 + num2 + str1); //30행복하세요
		
		System.out.println(str1 +(num1 + num2)); //행복하세요30
	}
	
	
	
	
	
	
	
	
	
}
