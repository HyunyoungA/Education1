package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
//		����ڰ� ���� ���� �޴��� ������ �� ����. ���� ������ �ݺ� ����. �� �޴��� ���� �� �ش� �޼ҵ�� �̵�
		System.out.println("== Welcome KH Library ==");
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("******* ���� �޴� ******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ ");
			System.out.println("4. ���� ���� ");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}while(menuNum != 9);
	}

	public void insertBook() {//���� �߰��� ���� ������ �޴� �޼ҵ�
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.next();
		System.out.print("���� �� : ");
		String author = sc.next();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int category = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		String cateName = null;
		switch(category) {
		case 1: cateName = "�ι�";
				break;
		case 2: cateName = "����";
				break;
		case 3: cateName = "�ܱ���";
				break;
		case 4: cateName = "��Ÿ";
				break;
		}
		//(��ü ���� �� �帣 ��ȣ ���� ���ǽ� �̿��� �帣��ȣ�� �ƴ� �帣 ������ �� �Ѱܾ� ��
		Book b = new Book(title, author, cateName, price);
		bc.insertBook(b);
		
	}
	public void selectList() {//��ü ���� ��� ��� ������ �˸��� �޼ҵ�
		System.out.println("===== ���� ��ü ��ȸ =====");
		ArrayList bookList = bc.selectList();
		if(bookList == null) {//bookList.isEmpty() --��� �� ��������.
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}else if(bookList != null) {
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));//**System.out.println(bookList);-->"Wt" + bookList.get(i)
			}
		}
		
	}
	public void searchBook() {//Ư�� ���� �˻� ����� �����ִ� �޼ҵ�
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.next();
		ArrayList searchList = bc.searchBook(keyword);//** ��� ���� �� ������ Book ��ü�� �ƴ϶� ����Ʈ�� �������� ���α׷����� �˻� �� �� Ǯ ������ �ļ� �˻����� �ʰ� Ű����� �˻���, Ű���带 ������ ����� �ϳ��� �ƴ� ���� ���� �� �ֱ� ������ ����Ʈ�� �ޱ�
		if(searchList == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else if(searchList != null) {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	public void deleteBook() {//Ư�� ���� ���� ������ �˸��� �޼ҵ�
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.next();
		System.out.print("������ ���� �� : ");
		String author = sc.next();//** ������� ���ڸ��� ���� �Է� �޴� ����--> ���� �������̶�� �ص� ���ڸ��� �ٸ� ������ ���� �� �ֱ� ������
		Book remove = bc.deleteBook(title, author); 
		if(remove != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else{
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
	}
	private void ascBook() {
		
	}
	
}
