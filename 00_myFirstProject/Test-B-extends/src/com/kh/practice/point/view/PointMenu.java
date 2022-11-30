package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		//���θ޴� ���, �߸� �Է����� �� �ٽ� �޵��� �ݺ�
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 :circleMenu();
					break;
			case 2 :rectangleMenu();
					break;
			case 9 :System.out.println("�����մϴ�.");
					return;
			default :System.out.println("�߸��Է��ϼ̽��ϴ� �ٽ� �Է����ּ���.");
			}
		}
		
	}
	public void circleMenu() {
		//�� �޴� ���, �߸� �Է����� �� ���θ޴��� ���ư�
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���� �޴��� ���ư��ϴ�.");
					  mainMenu();
			}
		}
	public void rectangleMenu() {
		//�簢�� �޴� ���, �߸� �Է����� �� ���θ޴��� ���ư�
			System.out.println("===== �簢�� �޴� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: calcPerimeter();
					break;
			case 2: calcRectArea();
					break;
			case 3: mainMenu();
					break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���� �޴��� ���ư��ϴ�.");
					  mainMenu();
			}
	}
	
	public void calcCircum() {
		//X, y ��ǥ�� �������� �޾� ���� ������ �� �ѷ� ���
		
		System.out.print("x ��ǥ : ");
		int num = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int num2 = sc.nextInt();
		System.out.print("������ : ");
		int num3 = sc.nextInt();
		
		System.out.println("�ѷ� : "+ cc.calcCircum(num, num2, num3));//**���� ������ cc Ȯ�� ���ϰ� ����ã��ɾ�����....
	
	}
	
	public void calcCircleArea() {
		//X, y ��ǥ�� �������� �޾� ���� ������ �� ���� ���
		System.out.print("x ��ǥ : ");
		int num = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int num2 = sc.nextInt();
		System.out.print("������ : ");
		int num3 = sc.nextInt();
		
		System.out.println("���� : " + cc.calcArea(num, num2, num3));
		
	}
	public void calcPerimeter() {
		//X, y ��ǥ�� ����, �ʺ� �޾� �簢���� ������ �簢�� �ѷ� ���
		System.out.print("x ��ǥ : ");
		int num = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int num2 = sc.nextInt();
		System.out.print("���� : ");
		int num3 = sc.nextInt();
		System.out.print("�ʺ� : ");
		int num4 = sc.nextInt();
		
		System.out.println("�ѷ� : " + rc.calcPerimeter(num, num2, num3, num4));
	}
	public void calcRectArea() {
		//X, y ��ǥ�� ����, �ʺ� �޾� �簢���� ������ �簢�� ���� ���
		System.out.print("x ��ǥ : ");
		int num = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int num2 = sc.nextInt();
		System.out.print("���� : ");
		int num3 = sc.nextInt();
		System.out.print("�ʺ� : ");
		int num4 = sc.nextInt();
		
		System.out.println("���� : " + rc.calcArea(num, num2, num3, num4));
	}
}
