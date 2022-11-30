package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();//Member type의 객체 생성
		//changeName을 이용해 이름 변경 후 --> changeNam()가 이름을 변경해주는 구나!
		//printName()를 이용해 이름 출력 -->printName()가 이름을 출력해주는 구나!
		m.changeName("강건강");
		m.printName();		
		
		
	}
//	+ main(args:String[]) : void <-  + public
//	---------------------------- <-static을 가리킴
}
