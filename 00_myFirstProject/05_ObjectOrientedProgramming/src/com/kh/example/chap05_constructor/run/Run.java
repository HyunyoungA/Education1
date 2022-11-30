package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();

		//The constructor User() is undefined = 유저생성자가 정의되지않음
		//매개변수가 있는 생성자가 생성되면 기본생성자는 JVM이 만들어주지않음.
		u1.inform();
		
		User u2 = new User("user1", "pass1","강건강");
		//("user1", "pass1")-->The constructor User(String, String) is undefined
		//String은 없음. String String만 있음
		u2.inform();
		
		User u3 = new User("user2",new Date());
		//("user2","pass2")-->String, Date여서 안됨. String, String이어야됨.
		// 자료형도 맞춰줘야한다.
		u3.inform();
	}
}
