package com.kh.example;

import com.kh.example.chap05_constructor.model.vo.User;

public class Test {
	public void method1() {
//		��ȯ��x�Ű�����x
		System.out.println("��ȯ��,�Ű�����x");
	}
	
	public int method2() {
//		��ȯ��o�Ű�����x
		int i = 10;
		int i2 = 5;
		int sum = i + i2;
		return sum;
	}
	public void method3(int num) {
//		��ȯ��x �Ű�����o
		System.out.println(num);
	}
	public int method4(int num4) {
//		��ȯ��o�Ű�����o
		return num4;
	}
	public int[] method5() {
//		��ȯ���� �迭�� ���
		int[] iArr = {1, 2, 3, 4};
		
		System.out.println(iArr);
		return iArr;
	}
	public User method6() {
		User u = new User(" ", "���ǰ�");
		System.out.println(u);
		
		return u;
	}
	
	
//	��ȯ���� ������ ��� return �߰�~!!
	
	
	
	
	
	
}
