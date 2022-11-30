package com.kh.example.chap02_abstract.controller;

import com.kh.example.chap02_abstract.family.model.vo.Baby;
import com.kh.example.chap02_abstract.family.model.vo.Basic;
import com.kh.example.chap02_abstract.family.model.vo.Family;
import com.kh.example.chap02_abstract.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();//추상클래스는 객체 생성 불가
		Family m = new Mother();
		Family b = new Baby();
		
		//Mother에 있는 eat(), Baby에 있는 sleep() 실행 -> 동적 바인딩
//		m.eat();
//		b.sleep();
		
//		Basic basic = new Basic();//객체생성 불가능
		Basic m2 = new Mother();
		Basic b2 = new Baby();
		m2.sleep();
		b2.eat();
	}
}
