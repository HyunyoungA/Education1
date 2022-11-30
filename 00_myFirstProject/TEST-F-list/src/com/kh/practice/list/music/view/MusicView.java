package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {//사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동
		int menuNum = 0;
		do{
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 곡 명 오름차순 정렬");
			System.out.println("8. 가수 명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 6: setMusic(); break;
			case 9: System.out.println("종료"); break;
			default : System.out.println("잘못입력하셨습니다. 다시입력해주세요."); break;
			}
		}while(menuNum != 9);
		
	}
	public void addList() {//마지막 위치에 곡 추가 성공을 알리는 메소드
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		boolean result = mc.addList(m);
		if(result) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	public void addAtZero() {//첫 위치에 곡 추가 성공을 알리는 하는 메소드
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.println("추가 성공");
		
		Music m = new Music(title, singer);
		int result = mc.addAtZero(m);
		if(result == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	public void printAll() {//전체 곡 목록을 출력 성공을 알리는 메소드
		System.out.println("****** 전체 곡 목록 출력 *****");
		List<Music> list = mc.printAll();
		System.out.println(list);
	}
	public void searchMusic() {//특정 곡 검색의 결과를 보여주는 메소드
		System.out.println("****** 특정 곡 검색 ******");
		
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music findMusic = mc.searchMusic(title);
		if(findMusic == null) {
			System.out.println("검색한 곳이 없습니다.");
		}else {
			System.out.println("검색한 곳은" + findMusic + "입니다.");
		}
		
	}
	public void removeMusic() {//특정 곡 삭제 결과를 보여주는 메소드
		System.out.println("****** 특정 곡 삭제 ******");
		
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		Music removeMusic = mc.removeMusic(title);
		if(removeMusic == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(removeMusic + "을 삭제 했습니다.");
		}
		
	}
	public void setMusic() {//특정 곡 정보 수정 결과를 보여주는 메소드
		System.out.println("****** 특정 곡 정보 수정 ******");
		
		System.out.print("변경하고 싶은 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("변경할 곡 명 : ");
		String newTitle = sc.nextLine();
		System.out.println("변경할 가수 명 : ");
		String newSinger = sc.nextLine();
		
		Music m = new Music(newTitle, newSinger);
		
		Music setMusic = mc.setMusic(title, m);
		if(setMusic ==null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(setMusic + "의 값이 변경되었습니다.");
		}
		mc.searchMusic(title);
		
	}

}
