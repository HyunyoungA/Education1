package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child2 extends Parent {
	public Child2() {
//		super.num = 0;//해당클래스아니어서
//		super.dNum = 21.3;//해당클래스아니어서
		super.bool = false;//다른패키지 후손클래스 한정 접근가능
		super.ch = '가';//퍼블릭이어서 다 접근가능
	}
}
