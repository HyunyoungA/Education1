package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child1 {
	public Child1() {
		Parent p = new Parent();
		p.num = 0;//다른 패키지여서 안됨. 밑도 동일
		p.dNum = 10.0;
		p.bool = bool;
		p.ch = 'a';
	}
}
