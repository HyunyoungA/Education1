package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//�⺻ ������
	public User() {
		
	}
	
	//�Ű����� �ִ� ������
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd); //�����ִ� �ڵ� 2���� ������Ѽ� ����.
		this.userName = userName;
	}
	
	public User(String userId, Date enrollDate) {
		this.userId = userId;
		this.enrollDate = enrollDate;
	}
	
//	public User(String s, Date d) {
//		��ܰ� �Ű������� Ÿ�� ����, ���� ����, ���� ���� �ϱ⶧���� ������.
//	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);// �� ù�ٿ� ������Ѵ�.(�Ʒ��ٿ� ������ ������)
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	
	
	
	//��¿� �޼ҵ�
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " +enrollDate);
	}
//	public void inform() {
//		//Duplicate method inform() in type User
//		  --> ��ܿ� inform�� �Ű������� ���Ƽ� ������ ��.(�Ű������� �ٸ��� �����ϸ� ������ ���� ����)
//	}
}
