package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		//메인 메뉴 출력
		while(true){
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기 ");
			System.out.println("2. 노트 열기 ");
			System.out.println("3. 노트 열어서 수정하기 ");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : fileSave();break;
			case 2 : fileOpen();break;
			case 3 : fileEdit();break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void fileSave() {
		//파일 명과 저장할 값을 받음
		
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			try {FileOutputStream fos = new FileOutputStream(str);
				 StringBuilder sb = new StringBuilder(fos);
			
			if(str.equals("ex끝it")) {
				System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
				String str2 = sc.next();
				if(str.equals(str2 == fileOpen())) {
					System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
					String str3 = sc.next();
					if(str.equals("y")) {
						fc.fileSave(str2, sb);
					}if(str.equals("n")) {
						System.out.println("저장할 파일 명을 입력해주세요 ~");
				}
			}if(str.equals(str2 != fileOpen())) {// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
				fc.fileSave();// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
			
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
		
		}
	}
	public void fileOpen() {
		//파일 명을 받아 저장된 데이터 출력
	}
	public void fileEdit() {
		//파일 명과 저장할 값을 받음
	}
}
