package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
//		사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동
		System.out.println("== Welcome KH Library ==");
		int menuNum = 0;
		do {
			System.out.println();
			System.out.println("******* 메인 메뉴 ******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회 ");
			System.out.println("4. 도서 삭제 ");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 5: ascBook(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
			}
		}while(menuNum != 9);
	}

	public void insertBook() {//도서 추가를 위해 정보를 받는 메소드
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.next();
		System.out.print("저자 명 : ");
		String author = sc.next();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = Integer.parseInt(sc.nextLine());
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		String cateName = null;
		switch(category) {
		case 1: cateName = "인문";
				break;
		case 2: cateName = "과학";
				break;
		case 3: cateName = "외국어";
				break;
		case 4: cateName = "기타";
				break;
		}
		//(객체 생성 시 장르 번호 별로 조건식 이용해 장르번호가 아닌 장르 명으로 값 넘겨야 함
		Book b = new Book(title, author, cateName, price);
		bc.insertBook(b);
		
	}
	public void selectList() {//전체 도서 목록 출력 성공을 알리는 메소드
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList bookList = bc.selectList();
		if(bookList == null) {//bookList.isEmpty() --라고 쓸 수도있음.
			System.out.println("존재하는 도서가 없습니다.");
		}else if(bookList != null) {
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));//**System.out.println(bookList);-->"Wt" + bookList.get(i)
			}
		}
		
	}
	public void searchBook() {//특정 도서 검색 결과를 보여주는 메소드
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.next();
		ArrayList searchList = bc.searchBook(keyword);//** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
		if(searchList == null) {
			System.out.println("검색 결과가 없습니다.");
		}else if(searchList != null) {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	public void deleteBook() {//특정 도서 삭제 성공을 알리는 메소드
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.next();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.next();//** 도서명과 저자명을 같이 입력 받는 이유--> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		Book remove = bc.deleteBook(title, author); 
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else{
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	private void ascBook() {
		
	}
	
}
