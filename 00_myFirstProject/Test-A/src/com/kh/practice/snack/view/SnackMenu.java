package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	public void menu() {//사용자가 Snack객체에 데이터를 저장할 수 있도록 값을 받고 저장한값을 출력하는 메소드
		String kind; String name; String flavor; int numOf; int price;
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		kind = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("맛 : ");
		flavor = sc.nextLine();
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		//int numOf = Integer.parseInt(sc.nextLine());-->이렇게 써도됨.(개수,가격)
		System.out.print("가격 : ");
		price = sc.nextInt();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.print("저장한 정보를 확인하시겠습니다?(y/n) : ");
		String ch = sc.next();
	
		if(ch.equals("y")) {
			System.out.print(scr.confirmData());
		}else if(ch.equals("n"));{
			return;
		
		}
	}

}
