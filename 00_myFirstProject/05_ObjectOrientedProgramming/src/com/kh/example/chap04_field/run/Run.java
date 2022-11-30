package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
//		KindsOfVariable2 kov2 = new KindsOfVariable2();//객체만든것
//		kov2.str = "hello"; //스테틱 변수에 적용-->스테틱변수는 객체를 만들필요없음!
							//이 방법은 인스턴스 변수에 필요
		KindsOfVariable2.str = "world";//-->이게 static변수 사용방법
		
		Math.random();
		Integer.parseInt("10");
		
		double pi = Math.PI;
		int max = Integer.MAX_VALUE;
		
		KindsOfVariable2 kov2 = new KindsOfVariable2();
		kov2.method();
		kov2.method();
		
		KindsOfVariable2 kov22 = new KindsOfVariable2();
		kov22.method();
		//static값은 스태틱 메모리에서 있어서 값이 유지되어 13이되는대
		//test num은 heap메모리에 있는데 객체를 새로 생성하면서 기존 메모리영역이 날라가서  11이다.

		
	}
}
