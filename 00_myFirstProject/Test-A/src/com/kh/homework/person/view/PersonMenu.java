package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;
import com.kh.homework.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� " + pc.personCount()[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + pc.personCount()[1] + "���Դϴ�.");
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			
			System.out.println();
		
			switch(num) {
			case 1: studentMenu();break;
			case 2: employeeMenu();break;
			case 9: System.out.println("�����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void studentMenu() {
		int m = 0;
		do{
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			if(pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				}
			System.out.print("�޴� ��ȣ : ");
			m = sc.nextInt();
			
			System.out.println();
	
			switch(m) {
			case 1: if(pc.personCount()[0] == 3) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					}else {
						insertStudent();
					}
					break;
			case 2: printStudent(); break;
			case 9: System.out.println("�������� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}while(m != 9);
	}
	public void employeeMenu() {
		
		
				
	}
	public void insertStudent() {
		
		while(true) {
			System.out.print("�л� �̸� : ");
			String name = sc.next();
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			System.out.print("�л� ���� : ");
			String major = sc.next();
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] == 3/*�л� ��ü �迭�� ��� �������� ���� 3�� �Ǿ��� ��*/) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				System.out.println();
				studentMenu();
				break;}
		
			if(pc.personCount()[0] != 3) {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String str = sc.next();
				if(str != "N" || str != "n") {
					insertStudent();
				}
				if(str == "N" || str == "n") {
					break;
				}
			}
		}	
	}
	
	public void printStudent() {
		Student[] sArr= pc.printStudent();
		for(Student s : sArr) {
			if(s == null) break; {
				System.out.println(s);
			}
		}
		System.out.println();
	}
		
	public void insertEmployee() {
		
	}
	public void printEmployee() {
		System.out.println(pc.printEmployee());
	}
	
	
}
