package com.kh.example.chap02_encapsulation;

public class Account {
	//�������� = ������� = ����ʵ� = �ʵ�
	private String name = "���ǰ�"; //Ŭ������ ĸ��ȭ�� ��Ģ�̾ �ʵ带 ���鶩 private���
	private String phone = "010-1111-2222";
	private String pwd = "1q2w3e";
	private int bankCode = 2020;
	private int balance = 0;
	
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿�" + money + "���� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//��� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿���" + money + "���� ��ݵǾ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
	//�ܾ� ��ȸ �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ���" + balance + "���Դϴ�.");
	}

}
