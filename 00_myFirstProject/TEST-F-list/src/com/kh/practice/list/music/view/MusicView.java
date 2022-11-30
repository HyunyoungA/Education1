package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {//����ڰ� ���� ���� �޴��� ������ �� ����. ���� ������ �ݺ� ����. �� �޴��� ���� �� �ش� �޼ҵ�� �̵�
		int menuNum = 0;
		do{
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ����");
			System.out.println("7. �� �� �������� ����");
			System.out.println("8. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.println();
			System.out.print("�޴� ��ȣ �Է� : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 9: System.out.println("����"); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���."); break;
			}
		}while(menuNum != 9);
		
	}
	public void addList() {//������ ��ġ�� �� �߰� ������ �˸��� �޼ҵ�
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		boolean result = mc.addList(m);
		if(result) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
	}
	public void addAtZero() {//ù ��ġ�� �� �߰� ������ �˸��� �ϴ� �޼ҵ�
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		System.out.println("�߰� ����");
		
		Music m = new Music(title, singer);
		int result = mc.addAtZero(m);
		if(result == 1) {
			System.out.println("�߰� ����");
		}else {
			System.out.println("�߰� ����");
		}
		
	}
	public void printAll() {//��ü �� ����� ��� ������ �˸��� �޼ҵ�
		System.out.println("****** ��ü �� ��� ��� *****");
		List<Music> list = mc.printAll();
		System.out.println(list);
	}
	public void searchMusic() {//Ư�� �� �˻��� ����� �����ִ� �޼ҵ�
		System.out.println("****** Ư�� �� �˻� ******");
		
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		
		Music findMusic = mc.searchMusic(title);
		if(findMusic == null) {
			System.out.println("�˻��� ���� �����ϴ�.");
		}else {
			System.out.println("�˻��� ����" + findMusic + "�Դϴ�.");
		}
		
	}
	public void removeMusic() {//Ư�� �� ���� ����� �����ִ� �޼ҵ�
		System.out.println("****** Ư�� �� ���� ******");
		
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		
		Music removeMusic = mc.removeMusic(title);
		if(removeMusic == null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(removeMusic + "�� ���� �߽��ϴ�.");
		}
		
	}
	public void setMusic() {//Ư�� �� ���� ���� ����� �����ִ� �޼ҵ�
		System.out.println("****** Ư�� �� ���� ���� ******");
		
		System.out.print("�����ϰ� ���� �� �� : ");
		String title = sc.nextLine();
		
		System.out.println("������ �� �� : ");
		String newTitle = sc.nextLine();
		System.out.println("������ ���� �� : ");
		String newSinger = sc.nextLine();
		
		Music m = new Music(newTitle, newSinger);
		
		Music setMusic = mc.setMusic(title, m);
		if(setMusic ==null) {
			System.out.println("������ ���� �����ϴ�.");
		}else {
			System.out.println(setMusic + "�� ���� ����Ǿ����ϴ�.");
		}
		mc.searchMusic(title);
		
	}

}
