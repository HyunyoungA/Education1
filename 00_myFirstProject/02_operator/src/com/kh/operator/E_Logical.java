package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	public void method1() {
		//�Է��� ���� ���� 1~100 ������ �������� Ȯ��
		//1���� ũ�ų� ���� 100���� �۰ų� ���� => and &&
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println(num + "1~100������ �����ΰ�? "
				+ (num >= 1 && num <= 100));

	}
	
	public void method2() {
		//�Է��� ���� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("�빮���ΰ�? " + (ch >= 'A' && ch <= 'Z'));
		
		System.out.println("����Ͻ÷��� Y �Ǵ� y�� �Է����ּ��� : ");
		// String strYN = sc.nextLine();
		//shar yn = strYN.charAt(0);
		char yn = sc.nextLine().charAt(0);//�޼ҵ� ü�̴�
		
		System.out.println("��� �ϰڴٰ� �ϼ̽��ϴ�? " + (yn == 'Y' || yn == 'y' ));
	}
}
