package com.kh.variable;

import java.util.Scanner;

public class Test {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "�����" : "����� �ƴϴ�";
		
		String str2 = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println(str2);
	}
	
	public void method2() {
		//����ڿ��� ������ �Է� �ް�(M/F)
		//M�̸� "�����Դϴ�", F�� "�����Դϴ�", �� �� �ƴϸ� "�߸� �Է��ϼ̽��ϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = gender == 'M' ? "�����Դϴ�" : (gender == 'F' ? "�����Դϴ�" : "�߸��Է��ϼ̽��ϴ�");
		System.out.println(result);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void method() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ϳ� �Է� : ");
//		int num = sc.nextInt();
//		
//		if(num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ��� �Դϴ�");
//		}
//		if(num == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
//		}
//		if(num < 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ���� �Դϴ�");
//		}
//		
//		if(num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
//		} else {
//			if(num == 0) {
//				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
//			} else {
//				System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
//			}
//		}
//			
//		if(num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
//		}else if(num == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
//		}else {
//			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
//		}
//
//	}
//	
//	public void method2() {
//		//�Է��� ���ڰ� ¦������ Ȧ������ ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ϳ� �Է� : ");
//		int num = sc.nextInt();
//		//���� if�� ����
//		if(num % 2 == 0) {
//			System.out.println("¦���Դϴ�");
//		}
//		
//		if(num % 2 != 0) {
//			System.out.println("Ȧ���Դϴ�");
//		}
//		//if~else�� ����
//		if(num % 2 == 0) {
//			System.out.println("¦���Դϴ�");
//		}else {
//			System.out.println("Ȧ���Դϴ�");
//		}
//
//	}
//	
//	public void method3() {
//		//����ڿ��� �̸��� ����(M/F)�� �Է¹ް� �Ʒ� ���İ� ���� ���
//		//�̸����� ��/���л��Դϴ�
//		//�̸� : ���ǰ�
//		// ����(M/F) : M
//		//���ǰ����� ���л��Դϴ�.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�̸��� �Է��ϼ���");
//		String name = sc.nextLine();
//		System.out.print("������ �Է��ϼ���(M/F)");
//		char gender = sc.nextLine().charAt(0);
//		
//		if(gender == 'M') {
//			System.out.println("name���� ���л��Դϴ�.");
//		}else if(gender == 'F') {
//			System.out.println("name���� ���л��Դϴ�.");
//		}else { //������ else�� ������ �ʿ����. ���� ���ǿ� ����false�� ��� ����������
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
