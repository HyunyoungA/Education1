package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	public void method1() {
		//Ű����� �Է��� ���ڰ� ������� �������� ���
		//����� "�Է��Ͻ� ���ڴ� ����Դϴ�"
		//������ "�Է��Ͻ� ���ڴ� �����Դϴ�"
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//���� if�� ����
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}
		if(num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		//if~else�� ����
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else { //num > 0 �ݴ� ���� == num <= 0
			if(num == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
			}
		}
		//if~else if~else�� ����
		
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
	}
	
	public void method2() {
		//�Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//���� if�� ����
		if(num % 2 == 0) {
			System.out.print("¦���Դϴ�.");
		}
		if(num % 2 != 0) {
			System.out.print("Ȧ���Դϴ�.");
		}
		//if~else�� ����
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	
	public void method3() {
		//����ڿ��� �̸��� ����(M/F)�� �Է¹ް� �Ʒ� ���İ� ���� ���
		//�̸����� ��/���л��Դϴ�
		//�̸� : ���ǰ�
		// ����(M/F) : M
		//���ǰ����� ���л��Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
//		if(gender =='M'|| gender == 'm') {
//			System.out.println(name + "���� ���л��Դϴ�.");
//		} else if(gender == 'F' || gender =='f') {
//			System.out.println(name + "���� ���л��Դϴ�.");
//		}else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
//		String student = null;
////		System.out.println(student.charAt(0)); //������ġ�� �θ� ������ ��. ������ ��ġ �ű�
//		if(gender == 'M' || gender =='m') {
//			student = "���л�";
//		} else if(gender == 'F' || gender == 'f') {
//			student = "���л�";
//		} else {
//			student = "���� ����";
//		}
//		System.out.printf("%s���� %s�Դϴ�.", name, student); //charAt(0) ������ ���л��� �� ù��° �ܾ� "��"�� ��µȴ�. 
	
	public void method4() {
		//����ڿ��� �̸��� �Է¹޾� �������� Ȯ���ϱ�
		//���� �̸��� �´ٸ� "�����Դϴ�" ���, ���� �̸��� �ƴ϶�� "������ �ƴմϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : "); //�ȳ���
		String name = sc.nextLine(); //�޾ƿ���
		
		if(name == "�ڽſ�") {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("������ �ƴմϴ�");
		}
		//���ڿ� �� : equals()
		if(name.equals("�ڽſ�")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}

