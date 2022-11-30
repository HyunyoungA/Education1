package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		//1~5���� ���
		
		//while��
//		int i = 1;//�ʱ�� ����
//		while( i <= 5) {
//			System.out.println(i);
//			i++;//������ -->�� �Ʒ��� �����ʾƵ���.
//		}
		
		//do~while��
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 5);
	}
	
	public void method2() {
		//5���� 1���� ���
		
		//while��
//		int i = 5;
//		while(i >=1) {
//			System.out.println(i);
//			i--;
//		}
		
		//do~while��
		int i = 5;
		do {
			System.out.println(i);
			i--;
		}while(i >= 1);
	}
	
	public void method3() {
		//���� �ΰ��� �Է� �޾� �� ���� ���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڸ� �� ��° ���ں��� �۰� �Է����ּ���.");
		System.out.println("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int end = sc.nextInt();
		
		int min = 0; //�� ���� ���� ��Ƴ��� ����
		int max = 0; //�� ū ���� ��Ƴ��� ����
		//���� �ذ�
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max = end;
			min = start;
		}
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}
	
	public void method4() {
		//���ڿ��� �Է¹޾� �ε��� ���� ���� ���
		//���ڿ� �Է� : test
		//0 : t
		//1 : e
		//2 : s
		//3 : t
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}
//		while��
//		int i = 0;
//			while(i < str.length()) {
//				System.out.println(i + " : " + str.charAt(i));
//				i++;
//			}
		
//		do~while��
		int i =0;
		do {
			System.out.println(i + " : " + str.charAt(i));
			i++;
		}while(i < str.length());
	}
	
	//while ��ø �ϼ�
	public void method5() {
		//2�ܺ��� 9�ܱ��� ���
		
		//int den = 2;
				//while(den <= 9){
				//	int i = 1;
				//	while(i <= 9) {
				//		System.out.println(den + " * " + i + " = " + (den * i));
				//		i++;
				//	den++;
				//}
				//}
				//	while(i <= 9) {
				//		System.out.println(den + " * " + i + " = " + (den * i));
				//		i++;
				//	den++;
				//}
				//}
		
		int i = 2;
		while(i < 10) {
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d*%d = %2d%n", i, j, i*j);
				j++; 
		}
			System.out.println();
		i++;}
	}
	
	public void method6() {
		//�Ƴ��α� �ð� : 0�� 0��~ 23�� 59��
		//int hour = 0;
		//while(hour < 24) {
		//	int min = 0;
		//while(min < 60) {
		//		System.out.println(hour + "��" + min + "��");
		//		min++
		//}
		//		System.out.println();
		//hour++;
		//}
		
		
		int i = 0;
		while(i < 24) {
			int j = 0;
			while(j <= 59) {
				System.out.printf("%d�� %d��%n", i, j);
				j++;
			}
				System.out.println();
			i++;
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(menuNum != 9) { 
			System.out.println("1. 1���� 5����");
			System.out.println("2. 5���� 1����");
			System.out.println("3. m���� n����");
			System.out.println("4. �ε����� ����");
			System.out.println("5. ������");
			System.out.println("6. �Ƴ��α� �ð�");
			System.out.println("9. ����");
			System.out.println("�޴� ��ȣ : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸��� �޴���ȣ�Դϴ�.");
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) { //������ true���� ���ѹݺ���
			System.out.println("1. 1���� 5����");
			System.out.println("2. 5���� 1����");
			System.out.println("3. m���� n����");
			System.out.println("4. �ε����� ����");
			System.out.println("5. ������");
			System.out.println("6. �Ƴ��α� �ð�");
			System.out.println("9. ����");
			System.out.println("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("���α׷��� �����մϴ�.");return;
			//return�� ȣ���� ��(main method)���� ���ư�.�ؿ� ������ �����ʰ� ���⼭ ����.
			default : System.out.println("�߸��� �޴���ȣ�Դϴ�.");
			}
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		do{ 
			System.out.println("1. 1���� 5����");
			System.out.println("2. 5���� 1����");
			System.out.println("3. m���� n����");
			System.out.println("4. �ε����� ����");
			System.out.println("5. ������");
			System.out.println("6. �Ƴ��α� �ð�");
			System.out.println("9. ����");
			System.out.println("�޴� ��ȣ : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸��� �޴���ȣ�Դϴ�.");
			}
		}while(menuNum != 9);//�� �� �̻��� ���� ����!
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		do{ //������ true���� ���ѹݺ���
			System.out.println("1. 1���� 5����");
			System.out.println("2. 5���� 1����");
			System.out.println("3. m���� n����");
			System.out.println("4. �ε����� ����");
			System.out.println("5. ������");
			System.out.println("6. �Ƴ��α� �ð�");
			System.out.println("9. ����");
			System.out.println("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 6: method6(); break;
			case 9: System.out.println("���α׷��� �����մϴ�.");return;
			//return�� ȣ���� ��(main method)���� ���ư�.�ؿ� ������ �����ʰ� ���⼭ ����.
			default : System.out.println("�߸��� �޴���ȣ�Դϴ�.");
			}
		}while(true);
	}
	
	public void method11() {
		//Ű����� ���ڿ��� �Է� �޾� ��� �ݺ� ����
		//exit�� �ԷµǸ� �ݺ� ����
		Scanner sc = new Scanner(System.in);
		
//		String str = "";
//		while(!str.equals("exit")) {//str != "exit"(X)����, ���ڿ��� str.equals("exit")
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
//		String str = "";
		String str = null;
		do{//str != "exit"(X)����, ���ڿ��� str.equals("exit")
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}while(!str.equals("exit"));
	}
	
	
	
	

}
