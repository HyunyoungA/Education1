package com.kh.example.chap02_encapsulation;

public class Account {
	//전역변수 = 멤버변수 = 멤버필드 = 필드
	private String name = "강건강"; //클래스는 캡슐화가 원칙이어서 필드를 만들땐 private사용
	private String phone = "010-1111-2222";
	private String pwd = "1q2w3e";
	private int bankCode = 2020;
	private int balance = 0;
	
	//입금 메소드
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에" + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	//출금 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서" + money + "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");
		}
	}
	
	//잔액 조회 메소드
	public void displayBalance() {
		System.out.println(name + "님의 계좌에 잔액은" + balance + "원입니다.");
	}

}
