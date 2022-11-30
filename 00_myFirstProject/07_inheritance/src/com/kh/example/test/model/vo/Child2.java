package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	private String str;
	
	public Child2() {
//		super.num = 0; 접근불가능
		super.dNum = 0.0;
		super.bool = false;
		super.ch = 'a';
	}
	
	
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
}
