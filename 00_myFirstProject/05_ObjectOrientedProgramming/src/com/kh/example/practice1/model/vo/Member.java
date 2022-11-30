package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId; // - 기호는 private 사용
	private String memberPwd;
	private String memberName; //이름 저장될 곳-->하단에 changeName 으로 이름 변경
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public void changeName(String name) {//+changeName(name:String):void //String name변경할 이름
		memberName = name;
	}
	public void printName() {//+printName():void<--void 반환값 앞으로감, +public이다.
		System.out.println(memberName);
	}
}
