package com.kh.example.chap03.branch;

import java.util.Scanner;

public class Branch {
	public void method1() {
		//����ڿ��� ���ڿ��� �Է� �޾� �ش� ���ڿ��� ���� ���� ��� (�ݺ�)
		//end�� �ԷµǸ� �ݺ� ����
		Scanner sc = new Scanner(System.in);
//		String str = "";
//		while(!str.equals("end")) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("���� ���� : " + str.length());
//		}
		
//		String str = null;
//		do {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("���� ���� : " + str.length());
//		}while(!str.equals("end"));	
//	}
		String str = null;
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			
			if(str.equals("end")) {
				break;//���� ���� ����� �ݺ����� Ż��
			}
			System.out.println("���� ���� : " + str.length());
		}while(true);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1;; i++) {
			sum +=i;
			
			if(i == num) {
				break;
			}
		}
		System.out.println("1����" + num + "������ ����" + sum + "�Դϴ�.");
	}
	
	//continue : �ٽ� ó������ ���Ƽ� ���� = �Ʒ� �ڵ�� �ǳʶ�
	//		for�� ����  continue	 : ������
	//		while�� ���� continue	 : ���ǽ�
	public void method3() {
		//1~100������ �������� ���ϴµ� 4�� ����� ���� ���
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
//			if(i % 4 != 0) {
//			sum +=i;
//			}
			if(i % 4 == 0) {//4����� true�� �Ǹ� �Ѿ�� �ؿ� �Ѱ��� ������������.
				continue;
			}
			sum+= i;//�Ѱ�
		}
		System.out.println(sum);
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

