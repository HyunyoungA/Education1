package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	public void method1() {
		//1~5���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void method1_1() {
 		//�ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �ڽſ��
//		for(int i = 1; i <= 5; i++) {
//		for(int i = 5; i <= 9; i++) {
		for(int i = 0; i < 5; i++) {
			System.out.println("�� �̸��� �ڽſ��");
		}
	}
	
	public void method2() {
		//5���� 1���� ���
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		for(int i = 1; i <= 5; i++) {
			System.out.println(6 - i);
		}
	}
	
	public void method2_2() {
		//8���� 3���� ���
		for(int i = 8; i >= 3; i--) {
			System.out.println(i);
		}
		for(int i = 0; i < 6;i++) {
			System.out.println(8 - i);
		}
	}
	public void method3() {
		//1���� 10 ������ Ȧ���� ��� : 1 3 5 7 9
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
	}
	public void method4() {
		//���� �ΰ��� �Է� �޾� �� ���� ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڸ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.println("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		for(; start <= end; start++) {
			System.out.println(start);
		}
//		int min = 0; //�� ���� ���� ��Ƴ��� ����
//		int max = 0; //�� ū ���� ��Ƴ��� ����
//		//���� �ذ�
//		if(start > end) {
//			max = start;
//			min = end;
//		}else {
//			max = end;
//			min = start;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			System.out.println(i);
//		}
	}
	
	public void method4_1() {
		//������ �ϳ� �Է¹޾� (�� ���� 1~9 ������ ���� ����) �ش� (���� ������ ���)
		//                     if��                                      for��-->if�� �ȿ� for��
		// ������ ���������� "1~9������ ����� �Է��Ͽ��� �մϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��, 1�� 9������ ����� �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %-2d%n", num, i, num*i);
			}//%d = ������ �ްڴ�. %2d = �ΰ��� �ڸ��� �������ڴ�.(������ ����)2(��� : ������ ����)
			//%-2d=��������
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
	
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		//�������� ���� ���� : MathŬ������ random()
//		System.out.println(Math.random());
		//(0�ܰ�) 0 <= Math.random() < 1 : 0~0.9999999999...
		//(1�ܰ�) 0 <= Math.random() * 10 < 10 : 0~9.9999999...
		//(2�ܰ�) 1 <= Math.random() * 10 + 1 < 11 : 1~10.99999...
		//(3�ܰ�) 1 <= (int)(Math.random() * 10 + 1) < 11 : 1~10
		            //int --> ���� ����ȯ
		//2�ܰ�� 3�ܰ�� ������ �ٲ� ����� ����
		
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		for(int i = 1; i <= random; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println("1����" + random + "������ ���� �հ�" + sum);
	
	}
	public void method5_1() {
		//1���� 50������ ������ ������ �̾� Ȧ������ ¦������ �Ǻ�
		int random = (int)(Math.random() * 50 + 1);
		
		if(random % 2 == 0) {
			System.out.println(random + "���� ¦���Դϴ�.");
		}else {
			System.out.println(random + "���� Ȧ���Դϴ�.");
		}
		
	}
	
	public void method5_2() {
		//2���� 20������ ������ ������ �̾� �ش� ���ڿ� ���� ������ ���
		//0 <= Math.random() < 1
		//0 <= Math.random() * 19 < 19
		//2 <= Math.random() * 19 + 2 < 21
		//2 <= (int)(Math.random() * 20 + 2) < 21 : 2 ~ 20
		int random = (int)(Math.random() * 20 + 1);

		
		if(random >= 2 && random <= 20) {
			for(int i = 2; i <= 20; i++)
			System.out.printf("%d * %d = %d%n", random, i, random*i);
		}
	}
	
	public void method6() {
		//2�ܺ��� 9�ܱ��� ���
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i*j);
			}
			System.out.println();//�ܰ� �� ���� ����
		}
	}
	
	public void method7() {
		//�Ƴ��α� �ð� : 0�� 0��~ 23�� 59��
		for(int i = 0; i <= 23; i++) {
			for(int j = 0; j <= 59; j++) {
				System.out.printf("%2d�� * %2d��%n", i, j);
				
			}
			System.out.println();
		}
	}
	
	
	public void method8() {
		//���ٿ� ��ǥ(*)�� 5�� ��µǴµ� ����ڰ� �Է��� ����ŭ �� ���
		/*
		 * ����� �� �� : 3
		 * *****
		 * *****
		 * *****
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	public void method9() {
		//�� �ٿ� ��ǥ���ڸ� �Էµ� �� ���� ĭ ����ŭ ���
		//��, �ټ��� ĭ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		/*
		 * Ȧ�� : 6
		 * ĭ�� : 3
		 * 1*****
		 * *2****
		 * **3***
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� :");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
//				System.out.print("*");
				if(i == j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}
	
}
			
			
			

	
	
	

