package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
////		���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
////		������� �迭 �ε����� ���� �� �� ���� ����ϼ���
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void practice2() {
//		���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
//		�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		int[] d = new int[10];
		
		for(int c = d.length; c > 0; c--) {
			System.out.print(c + " ");
		}
	}
		public void practice3() {
//			����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
//			1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
			Scanner sc = new Scanner(System.in);
			System.out.print("����� ���� : ");
			int num = sc.nextInt();
			
			int[] num2 = new int[num];
			for(int i = 0; i < num2.length; i++) {
				num2[i] = i+1;
				System.out.print(num2[i] + " ");
			}
			
		}
		
		public void practice4() {
//			���̰� 5�� String�迭�� �����ϰ� 
//			�������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
//			�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
			String[] str = new String[5];
			
			str[0] = "���";
			str[1] = "��";
			str[2] = "����";
			str[3] = "������";
			str[4] = "����";
			System.out.println(str[1]);	
		}
		public void practice5() {
//			���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
//			������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();
			System.out.print("���� : ");
			char ch = sc.nextLine().charAt(0);
			
			char[] ch2 = new char[str.length()];
			int i = 0;
			
			System.out.print(str + "��" + "" + ch + "�� �����ϴ� ��ġ(�ε���) : ");
			
			for(int num = 0; num < str.length(); num++) {//�Է¹��� ���� ��� -->apple�� ���� �����ϴ� ��ġ(�ε���) : 
				ch2[num] = str.charAt(num);
			
				if(ch == ch2[num]) {//�Է¹��� ���ڿ� �Է¹��� ���ڿ��� ���ڰ� ���ٸ�,���ڿ� : apple ���� : pp ��� pp�� ���
					i++;
					System.out.print(num+" ");
				}
			}
			System.out.println();
			System.out.println(ch + "����: " + i);
		}
		
		public void practice6() {
//			������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
//			�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
//			������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
			String[] str = {"��", "ȭ", "��", "��", "��", "��", "��"};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0~6 ���� ���� �Է� : ");
			int num = sc.nextInt();
			
			if(num >= 0 && num <= 6) {
				System.out.println(str[num] + "����");
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}	
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int num = sc.nextInt();
			System.out.print("�迭 0��° �ε����� ���� �� : ");
			int num2 = sc.nextInt();
			System.out.print("�迭 1��° �ε����� ���� �� : ");
			int num3 = sc.nextInt();
			System.out.print("�迭 2��° �ε����� ���� �� : ");
			int num4 = sc.nextInt();
			System.out.print("�迭 3��° �ε����� ���� �� : ");
			int num5 = sc.nextInt();
			System.out.print("�迭 4��° �ε����� ���� �� : "); 
			int num6 = sc.nextInt();
			
			int[] i = {num2, num3, num4, num5, num6};//�����ϱ�
			for(int e = 0; e < i.length; e++) {
				System.out.print(i[e]+ " ");
			}
			System.out.println();
			System.out.println("�� �� : " + (num2 + num3 + num4 + num5 + num6));
		}
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int num = sc.nextInt();
			int[] num2 = {num/2, num/2-1, num/2-2};
			
			for(int i = 0; i <= num2.length; i++){
				System.out.println(num2[i]);	
			} 
		}
		
		public void practice9() {
//			����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
//			������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
//			��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
			Scanner sc = new Scanner(System.in);
			System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
			String str = sc.nextLine();
			String str2 ="���";
			String str3= "�Ķ��̵�";
			
//			String[] Date = new String[2];

			if(str == str2 && str == str3) {
				System.out.print(str2 + "ġŲ ��� ����");
			}else {
				System.out.print(str + "ġŲ�� ���� �޴��Դϴ�.");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}			
}
		
