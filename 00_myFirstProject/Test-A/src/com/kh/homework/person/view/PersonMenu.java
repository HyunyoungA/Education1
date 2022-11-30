package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;
import com.kh.homework.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			System.out.println();
		
			switch(num) {
			case 1: studentMenu();break;
			case 2: employeeMenu();break;
			case 9: System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void studentMenu() {
		int m = 0;
		do{
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				}
			System.out.print("메뉴 번호 : ");
			m = sc.nextInt();
			
			System.out.println();
	
			switch(m) {
			case 1: if(pc.personCount()[0] == 3) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					}else {
						insertStudent();
					}
					break;
			case 2: printStudent(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}while(m != 9);
	}
	public void employeeMenu() {
		
		
				
	}
	public void insertStudent() {
		
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.personCount()[0] == 3/*학생 객체 배열에 담긴 데이터의 수가 3이 되었을 때*/) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				System.out.println();
				studentMenu();
				break;}
		
			if(pc.personCount()[0] != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
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
