package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		Person[] pArr = new Person[5];//5개의 공간 pArr생성
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		//공간 안에 객체 생성, 초기화 필수!!!!!
		pArr[0] = new Person();
		pArr[1] = new Person("강건강", 25, '남', 174.3, 67.2);
		pArr[2] = new Person("남나눔", 13, '남', 162.4, 55.2);
		pArr[3] = new Person("도대담", 32, '남', 183.1, 70.2);
		pArr[4] = new Person("류라라", 17, '여', 162.4, 52.1);
		
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
		for(int i = 0; i < pArr.length; i++) {//메소드 호출
			System.out.println(pArr[i].personInfo());
		}
	}
	public void method2() {
		//int[] iArr = {1,2,3};
		Person[] pArr = {new Person("문미미", 28, '여', 160.2, 58.4),
					  	 new Person("박보배", 42, '여', 162.2, 44.2),
						 new Person("송성실", 23, '남', 175.4, 82.5)};
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	}
}
