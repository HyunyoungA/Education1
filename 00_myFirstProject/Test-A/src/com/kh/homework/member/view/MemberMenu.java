package com.kh.homework.member.view;

import java.util.Scanner;

import com.kh.homework.member.comtroller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		System.out.println("�ִ� ��� ������ ȸ�� ����" + MemberController.SIZE + "���Դϴ�.");
		System.out.println("���� ��ϵ� ȸ�� ����" + mc.existMemberNum() + "���Դϴ�.");
		System.out.println("1. �� ȸ�� ���");
		System.out.println("2. ȸ�� �˻�");
		System.out.println("3. ȸ�� ���� ����");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ��� ���");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int numb = sc.nextInt();
		
		}//���� �޴� ��� �޼ҵ�
	
	
	public void insertMember() {
		String id; String name; String password; String email; char gender; int age;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("�� ȸ���� ����մϴ�.");
			System.out.print("���̵� : ");
			id = sc.nextLine();
			
			if(!mc.checkId()) {
				return;
			}
			System.out.print("�̸� : ");
			name = sc.nextLine();
			System.out.print("��й�ȣ : ");
			password = sc.nextLine();
			System.out.print("�̸��� : ");
			email = sc.nextLine();
			System.out.print("����(M/F) : ");
			gender = sc.nextLine().charAt(0);
			System.out.print("���� : ");
			age = sc.nextInt();
				if(i >= 10) {
					System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
					System.out.println("2. ȸ�� �˻�");
					System.out.println("3. ȸ�� ���� ����");
					System.out.println("4. ȸ�� ����");
					System.out.println("5. ��� ���");
					System.out.println("9. ������");
					System.out.println("�޴� ��ȣ : ");
					int num = sc.nextInt();
				}int num = 0;
				if(num == 9) {
					System.out.println("���α׷��� �����մϴ�");
				}
			} 
		}//ȸ������ϱ� ���� �����͸� ����ڿ��� �Է� �޴¸޼ҵ�

	public void searchMember() {
		
	}//�˻� �޴� ��� �޼ҵ�

	public void searchId() {
		System.out.println();
	}//���̵� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void searchName() {
		
	}//�̸� �˻��� ���� �����͸� ����ڿ��� �Է� �޴¸޼ҵ�
	public void searchEmail() {
		
	}//�̸��� �˻��� ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void updateMember() 
	{}//���� �޴� ��� �޼ҵ�
	public void updatePassword() {
		
	}//��й�ȣ ������ ���� �����͸� ����ڿ��� �Է� �޴¸޼ҵ�
	public void updateName() {
		
	}//�̸� ������ ���� �����͸� ����ڿ��� �Է� �޴¸޼ҵ�
	public void updateEmail() {
		
	}//�̸��� ������ ���� �����͸� ����ڿ��� �Է� �޴� �޼ҵ�
	public void deleteMember() {
		
	}//���� �޴� ��� �޼ҵ�
	public void deleteOne() {
		
	}//�ϳ��� ȸ�� ���� ���������ϴ� �޼ҵ�
	public void deleteAll() {
		
	}//��ü ȸ�� ���� ����� ����ϴ� �޼ҵ�
	
	public void printAll() {
		
	}//��ü ȸ���� ����ϴ� �޼ҵ�

}
