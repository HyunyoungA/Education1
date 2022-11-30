package com.kh.homework.member.view;

import java.util.Scanner;

import com.kh.homework.member.comtroller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		System.out.println("최대 등록 가능한 회원 수는" + MemberController.SIZE + "명입니다.");
		System.out.println("현재 등록된 회원 수는" + mc.existMemberNum() + "명입니다.");
		System.out.println("1. 새 회원 등록");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 모두 출력");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int numb = sc.nextInt();
		
		}//메인 메뉴 출력 메소드
	
	
	public void insertMember() {
		String id; String name; String password; String email; char gender; int age;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("새 회원을 등록합니다.");
			System.out.print("아이디 : ");
			id = sc.nextLine();
			
			if(!mc.checkId()) {
				return;
			}
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("비밀번호 : ");
			password = sc.nextLine();
			System.out.print("이메일 : ");
			email = sc.nextLine();
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
			System.out.print("나이 : ");
			age = sc.nextInt();
				if(i >= 10) {
					System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
					System.out.println("2. 회원 검색");
					System.out.println("3. 회원 정보 수정");
					System.out.println("4. 회원 삭제");
					System.out.println("5. 모두 출력");
					System.out.println("9. 끝내기");
					System.out.println("메뉴 번호 : ");
					int num = sc.nextInt();
				}int num = 0;
				if(num == 9) {
					System.out.println("프로그램을 종료합니다");
				}
			} 
		}//회원등록하기 위한 데이터를 사용자에게 입력 받는메소드

	public void searchMember() {
		
	}//검색 메뉴 출력 메소드

	public void searchId() {
		System.out.println();
	}//아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void searchName() {
		
	}//이름 검색을 위한 데이터를 사용자에게 입력 받는메소드
	public void searchEmail() {
		
	}//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
	public void updateMember() 
	{}//수정 메뉴 출력 메소드
	public void updatePassword() {
		
	}//비밀번호 수정을 위한 데이터를 사용자에게 입력 받는메소드
	public void updateName() {
		
	}//이름 수정을 위한 데이터를 사용자에게 입력 받는메소드
	public void updateEmail() {
		
	}//이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드
	public void deleteMember() {
		
	}//삭제 메뉴 출력 메소드
	public void deleteOne() {
		
	}//하나의 회원 삭제 결과를출력하는 메소드
	public void deleteAll() {
		
	}//전체 회원 삭제 결과를 출력하는 메소드
	
	public void printAll() {
		
	}//전체 회원을 출력하는 메소드

}
