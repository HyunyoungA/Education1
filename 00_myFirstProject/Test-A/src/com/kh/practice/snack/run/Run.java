package com.kh.practice.snack.run;

import com.kh.practice.snack.view.SnackMenu;

public class Run {
	public static void main(String[] args) {
		//SnackMenu ��ü�� ���� �� menu() ����
		//menu() ȣ��
		SnackMenu sm = new SnackMenu();
//		sm.StudentMenu();
		new SnackMenu().menu(); //--> �̷��� �ᵵ��.
	}
}
