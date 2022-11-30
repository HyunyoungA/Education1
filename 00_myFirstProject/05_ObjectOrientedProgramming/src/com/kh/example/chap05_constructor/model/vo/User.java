package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//기본 생성자
	public User() {
		
	}
	
	//매개변수 있는 생성자
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd); //위에있는 코드 2줄을 함축시켜서 적음.
		this.userName = userName;
	}
	
	public User(String userId, Date enrollDate) {
		this.userId = userId;
		this.enrollDate = enrollDate;
	}
	
//	public User(String s, Date d) {
//		상단과 매개변수의 타입 동일, 순서 동일, 개수 동일 하기때문에 오류남.
//	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName);// 꼭 첫줄에 적어야한다.(아랫줄에 넣으면 에러남)
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	
	
	
	//출력용 메소드
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " +enrollDate);
	}
//	public void inform() {
//		//Duplicate method inform() in type User
//		  --> 상단에 inform의 매개변수가 같아서 오류가 남.(매개변수를 다르게 설정하면 오류가 나지 않음)
//	}
}
