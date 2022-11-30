package com.kh.practice.snack.run;

import com.kh.practice.snack.view.SnackMenu;

public class Run {
	public static void main(String[] args) {
		//SnackMenu 객체를 생성 후 menu() 실행
		//menu() 호출
		SnackMenu sm = new SnackMenu();
//		sm.StudentMenu();
		new SnackMenu().menu(); //--> 이렇게 써도됨.
	}
}
