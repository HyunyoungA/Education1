package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		//ex.
//		���� : -9
//		����� �ƴϴ�

		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0? "�����" : "����� �ƴϴ�";
		System.out.println(result);
	
	}
	public void practice2() {
//		Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
//		����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
//		ex.
//		���� : -9
//		������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int i = sc.nextInt();
		
		String result = i > 0 ? "�����" : (i == 0? "0�̴�" : "������");
		System.out.println(result);
		
	}
	public void practice3() {
//		Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int n = sc.nextInt();
		
		String result = n % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);

	}
	public void practice4() {
//		��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
//		1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ο� �� : ");
		int p = sc.nextInt();
		System.out.println("������ ���� : ");
		int c = sc.nextInt();
		System.out.println("1�δ� ���� ���� : " + (c / p));
		System.out.println("���� ���� ���� : " +  (c % p));

	}
	
	public void practice5() {
//		Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
//		�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String str = sc.nextLine();
		System.out.println("�г�(���ڸ�) : ");
		int i = sc.nextInt();
		System.out.println("��(���ڸ�) : ");
		int i2 = sc.nextInt();
		System.out.println("��(���ڸ�) : ");
		int i3 = sc.nextInt();
		System.out.println("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.println("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double i4 = sc.nextDouble();

		String result = gender == 'M' ? "���л�" : (gender == 'F' ? "���л�" : "�߸��Է��ϼ̽��ϴ�.");
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", i, i2, i3, str, result, i4);
		
//		3�г� 4�� 15�� �ڽſ� ���л��� ������ 85.75�̴�.
	}
	public void practice6() {
//		���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
//		����(19�� �ʰ�)���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "���" : (20 <= age ? "����" : "û�ҳ�");
		System.out.println(result);
	}
	public void practice7() {
//		����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
//		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
//		�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
//		�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		System.out.println("���� : ");
		int num2 = sc.nextInt();
		System.out.println("���� : ");
		int num3 = sc.nextInt();
		int num4 = num + num2 + num3;
		System.out.println("�հ� : " + num4);
		System.out.printf("��� : " + "%.1f", (num4 / 3));
//		System.out.printf(%.1f, (num4 / 3));
		
		
		String result = (num4 / 3) >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
		
	}
	public void practice11() {
		
	}
	
	

}
