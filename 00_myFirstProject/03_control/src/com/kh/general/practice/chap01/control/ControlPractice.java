package com.kh.general.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
//		�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
//		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1. �Է�");
		System.out.println();
		System.out.print("2. ����");
		System.out.println();
		System.out.print("3. ��ȸ");
		System.out.println();
		System.out.print("4. ����");
		System.out.println();
		System.out.print("7. ����");
		System.out.println();
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: case 2: case 3: case 4:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
			
		}
	}
	
	public void practice2() {
//		Ű����� ������ �Է� �ް�, �Է��� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
//		¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//		����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("¦����");
		}else if(num % 2 != 0) {
			System.out.println("Ȧ����");
		}
		if(num <= 0) {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
//		����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
//		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
//		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
//		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
//		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� : ");
		int num = sc.nextInt();
		System.out.println("�������� : ");
		int num2 = sc.nextInt();
		System.out.println("�������� : ");
		int num3 = sc.nextInt();
		
		int num4 = num + num2 + num3;
		if(num >= 40 && num2 >= 40 && num3 >= 40) {
			if((num4 / 3) >= 60) {
				System.out.println("���� : " + num);
				System.out.println("���� : " + num2);
				System.out.println("���� : " + num3);
				System.out.println("�հ� : " + num4);
				System.out.println("��� : " + num4 / 3);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		default:
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");	
		
		}
		
	}
	
	public void practice5() {
//		���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
//		�α��� ���� �� ���α��� ������, 
//		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
//		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
	}
}
