package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	public void menu() {//����ڰ� Snack��ü�� �����͸� ������ �� �ֵ��� ���� �ް� �����Ѱ��� ����ϴ� �޼ҵ�
		String kind; String name; String flavor; int numOf; int price;
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		kind = sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�� : ");
		flavor = sc.nextLine();
		System.out.print("���� : ");
		numOf = sc.nextInt();
		//int numOf = Integer.parseInt(sc.nextLine());-->�̷��� �ᵵ��.(����,����)
		System.out.print("���� : ");
		price = sc.nextInt();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϴ�?(y/n) : ");
		String ch = sc.next();
	
		if(ch.equals("y")) {
			System.out.print(scr.confirmData());
		}else if(ch.equals("n"));{
			return;
		
		}
	}

}
