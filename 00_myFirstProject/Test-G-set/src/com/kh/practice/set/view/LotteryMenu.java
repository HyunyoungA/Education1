package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	public void mainMenu() {//사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복 실행.
							//각 메뉴를 누를 시 해당 메소드로 이동.
		System.out.println("========== KH 추첨 프로그램 ==========");
		int menuNum = 0;
		do {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 추첨 대상 추가 ");
			System.out.println("2. 추첨 대상 삭제 ");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료 ");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: insertObject(); break;
			case 2:	deleteObject(); break;
			case 3: winObject(); break;
			case 4: sortedWinObject(); break;
			case 5: searchWinner(); break;
			case 9: System.out.println("프로그램 종료"); return;
			default :System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
			}
		}while(menuNum != 9);
	}
	
	public void insertObject() {//추첨 대상 추가를 위해 정보를 받는 메소드
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("이름 : ");
			String str = sc.next();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String str2 = sc.next();
			System.out.println();
			
			Lottery l = new Lottery(str, str2);
			boolean result = lc.insertObject(l);
			
			if(!result) {
				i--;
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			}
		}System.out.println(num + "명 추가 완료되었습니다.");
		
	}
	
	public void deleteObject() {//특정 추첨 대상 삭제 결과를 알리는 메소드
		
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String str = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String str2 = sc.next();
		
		Lottery lot = new Lottery(str, str2);
		boolean result = lc.deleteObject(lot);
		if(result) {
			System.out.println("삭제 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	public void winObject() {//println 메소드를 이용하여 당첨 대상자를 출력하는 메소드
		System.out.println(lc.winObject());
	}
	public void sortedWinObject() {//lc에서 받아온 Set객체를 Iterator를 통해 출력
		Iterator it = lc.sortedWinObject().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void searchWinner() {//당첨자 중 특정 대상이 있는지 결과를 출력하는 메소드
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phoneNum = sc.next();
		
		Lottery lo = new Lottery(name, phoneNum);
		boolean result = lc.searchWinner(lo);
		if(!result) {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}else {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}
	
	}

}
