package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	public void method1() {
		//���� �ΰ��� �����ȣ ���� 1���� �޾Ƽ� �����ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ���
		//ex
		//ù��° �� : 1
		//�ι�° �� : 2
		//������(+,-,*,/) : *
		// 1 * 2 = 2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		System.out.print("������(+,-,*,/) : ");
		char op = sc.next().charAt(0);
		//sc.next()���ڿ� �޾ƿ��°�
		//op = ������ op��ü�� char���� -->case '+' �̱� �ڵ��̼����� ����
		int result = 0; // ���� ����� ��Ƴ��� ����
		
//		if(op == '+') {
//			result = num1 + num2;
//		}else if(op == '-') {
//			result = num1 - num2;
//		}else if(op == '*') {
//			result = num1 * num2;
//		}else if(op == '/') {
//			result = num1 / num2;
//		}
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break; //�־�ǰ� ������ **�������̾
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);

	}
	
	public void method2() {
		//�Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		switch(num % 2) {
		case 1: System.out.println("Ȧ���Դϴ�."); break;
		case 0: System.out.println("¦���Դϴ�."); break;
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12���� �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//�޾ƿ� num�� ������ �ش� �޿� ������ �� ���
		//1~12���� �� �ϳ��� �Է��ϼ��� : 7
		//�Է��Ͻ� �� 31�ϱ����Դϴ�.
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("�Է��Ͻ� ���� 31�ϱ����Դϴ�.");
			break;
		case 2 : 
			System.out.println("�Է��Ͻ� ���� 28�ϱ����Դϴ�.");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("�Է��Ͻ� ���� 30�ϱ����Դϴ�.");
			break;
		}

	}

	public void method4() {
		Scanner sc = new Scanner(System.in);//�˸��� ->�޼ҵ峪 ��ĳ�� �ȿ��ִ°� Ȱ���Ϸ��� ����
		System.out.println("===�޴�===");
		System.out.println("1. ���� ����");
		System.out.println("2. ¦/Ȧ�� �Ǵ�");
		System.out.println("3. n���� ������ ��");
		System.out.println("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.println("���� �����Դϴ�.");
			method1();
			break;
		case 2:
			System.out.println("¦Ȧ�� �Ǵ��Դϴ�.");
			method2();
			break;
		case 3:
			System.out.println("n���� ���������Դϴ�.");
			method3();
			break;
		default:
			System.out.println("�߸��� �޴� ��ȣ�Դϴ�.");
		}
	}
	
	
	
}
