package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {
	public void method() {
		//1. 부모 타입 레퍼런스로 부모 객체를 다룰 때
		System.out.println("1. 부모 타입 레퍼런스로 부모 객체를 다룰때");
		Parent p1 = new Parent();
		//ㄴ부모타입 레퍼런스 ㄴ 자식 객체
		p1.printParent();
		
		System.out.println();
		
		//2. 자식 타입 레퍼런스로 자식 객체를 다룰 때
		System.out.println("2. 자식 타입 레퍼런스로 자식 객체를 다룰 때");
		Child1 c1 = new Child1();
		//ㄴ자식타입 레퍼런스   ㄴ자식 객체
		c1.printChild1();
		c1.printParent();
		
		System.out.println();
		
		//3. 부모 타입 레퍼런스로 자식 객체를 다룰 때
		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 다룰 때");
		Parent p2 = new Child2(); //다형성 적용, 업 캐스팅 : 부모 타입 참조 변수가 자식 객체를 받는 것
		p2.printParent();
		((Child2)p2).printChild2();//다운 캐스팅 : 부모타입 참조 변수를 자식 클래스 타입으로 형변환 -->자식 객체의 멤버에 접근 가능
		
		System.out.println();
		
		//4. 자식 타입 레퍼런스로 부모 객체를 다룰 때
		//ClassCastException -->가지고 있는게 없어서 확장할 수 없음. 자식 타입 레퍼런스가 부모객체를 다룰 때
//		Child2 c2 = new Parent();
		//ㄴ 자식타입 레퍼런스  ㄴ부모 객체
		
		
		System.out.println();
		System.out.println("== 다형성 활용 ==");
		System.out.println();
		
		//1. 객체배열
		//배열 : <하나의 자료형>의 여러개 값을 저장할 수 있는 공간
		//Child1 객체와 Child2 객체를 저장할 수 있는 4개의 공간 생성
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();
		//ㄴ부모타입   ㄴ자식객체
		for(int i = 0; i < pArr.length; i++) {
//			pArr[i].printParent();
//			if(pArr[i] instanceof Child1) {
//				((Child1)pArr[i]).printChild1();
//			} else if(pArr[i] instanceof Child2) {
//				((Child2)pArr[i]).printChild2();
//			}
			pArr[i].print();//상단에 저장된 객체때문에 동적 바인딩이 일어남.
		}
		//2. 매개변수
		
		
		
		
	}
}
