package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {//����ڰ� ���� ���� �޴��� ���� �� �� ����. ���� ������ �ݺ� ����.
							//�� �޴��� ���� �� �ش� �޼ҵ�� �̵�.
		System.out.println("========== KH ��÷ ���α׷� ==========");
		int menuNum = 0;
		do {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ��÷ ��� �߰� ");
			System.out.println("2. ��÷ ��� ���� ");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ���� ");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: insertObject(); break;
			case 2:	deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("���α׷� ����"); return;
			default :System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}while(menuNum != 9);
	}
	
	public void insertObject() {//��÷ ��� �߰��� ���� ������ �޴� �޼ҵ�
		System.out.print("�߰��� ��÷ ��� �� : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("�̸� : ");
			String str = sc.next();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String str2 = sc.next();
			System.out.println();
			
			Lottery l = new Lottery(str, str2);
			boolean result = lc.insertObject(l);
			
			if(!result) {
				i--;
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}System.out.println(num + "�� �߰� �Ϸ�Ǿ����ϴ�.");
		
	}
	
	public void deleteObject() {//Ư�� ��÷ ��� ���� ����� �˸��� �޼ҵ�
		
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String str = sc.next();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String str2 = sc.next();
		
		Lottery lot = new Lottery(str, str2);
		boolean result = lc.deleteObject(lot);
		if(result) {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
	public void winObject() {//println �޼ҵ带 �̿��Ͽ� ��÷ ����ڸ� ����ϴ� �޼ҵ�
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {//lc���� �޾ƿ� Set��ü�� Iterator�� ���� ���
		Iterator it = lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {//��÷�� �� Ư�� ����� �ִ��� ����� ����ϴ� �޼ҵ�
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phoneNum = sc.next();
		
		Lottery lo = new Lottery(name, phoneNum);
		boolean result = lc.searchWinner(lo);
		if(!result) {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		}
	
	}

}
