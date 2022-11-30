package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		//메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 :circleMenu();
					break;
			case 2 :rectangleMenu();
					break;
			case 9 :System.out.println("종료합니다.");
					return;
			default :System.out.println("잘못입력하셨습니다 다시 입력해주세요.");
			}
		}
		
	}
	public void circleMenu() {
		//원 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
					  mainMenu();
			}
		}
	public void rectangleMenu() {
		//사각형 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("3. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: calcPerimeter();
					break;
			case 2: calcRectArea();
					break;
			case 3: mainMenu();
					break;
			default : System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
					  mainMenu();
			}
	}
	
	public void calcCircum() {
		//X, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
		
		System.out.print("x 좌표 : ");
		int num = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		
		System.out.println("둘레 : "+ cc.calcCircum(num, num2, num3));//**위에 정의한 cc 확인 못하고 오류찾고앉아있음....
	
	}
	
	public void calcCircleArea() {
		//X, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
		System.out.print("x 좌표 : ");
		int num = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		
		System.out.println("면적 : " + cc.calcArea(num, num2, num3));
		
	}
	public void calcPerimeter() {
		//X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 둘레 출력
		System.out.print("x 좌표 : ");
		int num = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		
		System.out.println("둘레 : " + rc.calcPerimeter(num, num2, num3, num4));
	}
	public void calcRectArea() {
		//X, y 좌표와 높이, 너비를 받아 사각형의 정보와 사각형 넓이 출력
		System.out.print("x 좌표 : ");
		int num = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		
		System.out.println("면적 : " + rc.calcArea(num, num2, num3, num4));
	}
}
