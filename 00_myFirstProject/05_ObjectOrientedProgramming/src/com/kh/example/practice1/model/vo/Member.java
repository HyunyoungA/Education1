package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId; // - ��ȣ�� private ���
	private String memberPwd;
	private String memberName; //�̸� ����� ��-->�ϴܿ� changeName ���� �̸� ����
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public void changeName(String name) {//+changeName(name:String):void //String name������ �̸�
		memberName = name;
	}
	public void printName() {//+printName():void<--void ��ȯ�� �����ΰ�, +public�̴�.
		System.out.println(memberName);
	}
}
