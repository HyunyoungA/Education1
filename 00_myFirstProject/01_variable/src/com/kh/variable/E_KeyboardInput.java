package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {

	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(�Ҽ� ù°�ڸ�����) : ");
		double height = sc.nextDouble();
		System.out.printf("%s���� %d���̸�, Ű�� %fcm�Դϴ�.", name, age, height);
	}
	
	public void inputScanner2() {
		//�̸�, ����, �ּ�
		//�̸�(����)���� ��ô� ���� �ּ��Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// 1. �ּҸ� next()�� �޾ƿ���
		//next()�� ���⸦ �����ڷ� �����Ͽ� ���� ����
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();
		
		// 2. nextLine() �߰��ϱ�
//		int age = sc.nextInt();
//		sc.nextLine();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// 3. ���̸� ���� �� nextLine() �� �Ľ��ϱ�
		// �Ľ� : ���ڿ���(String)�� �⺻ �ڷ������� �ٲٴ� ��
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		//���ڿ��� ���ڷ� �ٲٴ� ���
		System.out.print("������ �Է��ϼ���(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		System.out.printf("%s(%d, %c)���� ��ô� ���� %s�Դϴ�.", name, age, gender, address);
	}
}
