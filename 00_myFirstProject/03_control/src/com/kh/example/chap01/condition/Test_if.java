package com.kh.example.chap01.condition;

import java.util.Scanner;

public class Test_if {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
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
		//if~else if~else�� ����
		
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}else if(num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		
		int num = sc.nextInt();
		//���� if�� ����
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		if(num % 2 != 0) {
			System.out.println("Ȧ���Դϴ�");
		}
		
		//if~else�� ����
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		if(gender == 'M'|| gender == 'm') {
			System.out.println(name + "���� ���л��Դϴ�.");
		}else if(gender == 'F'|| gender == 'f') {
			System.out.println(name + "���� ���л��Դϴ�.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		String student = null;
		if(gender == 'M' || gender == 'm') {
			student = "���л�";
		}else if (gender == 'F' || gender == 'f'){
			student = "���л�";
		}else {
			student = "���� ����";
		}
		System.out.printf("%s���� %s�Դϴ�.", name, student);
	}

}
