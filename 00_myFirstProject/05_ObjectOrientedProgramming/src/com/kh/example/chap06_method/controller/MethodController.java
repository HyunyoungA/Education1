package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	//�Ű����� ������ ��ȯ �� ������ ���� ����
	//1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void  method1() {
		//��ȯ ��X			�Ű�����X-->�� �Ұ�ȣ()
		//���� �޴� ���� ���� ��ȯ�� ���� ���� �޼ҵ�� ���븸 ���� �� ����
		System.out.println("�Ű������� ��ȯ �� �Ѵ� ���� �޼ҵ� �Դϴ�.");
//		return;-->return�� �׻� �����ִ�.
	}
	
	//2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
		int num1 = 10;
		int num2 = 3;
		int sum = num1 + num2;
//		return 123;//���� Ÿ�԰� ��������Ѵ�. int->123, String->"123" Ÿ�Ը� ���߸� ��� �ᵵ �������.
		return 13;

	}
	
	//3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		//��ȯ ���ְ�		�Ű����� ����.
		System.out.println(num1 + ", " + num2);
	}
	//4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
//		int sum = num1 + num2; <--�̷��� ����ص� ��.
		return num1 + num2;
	}
	//��ȯ ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1, 2, 3};
		System.out.println("MethodController iArr : " + iArr);
		
		return iArr;
	}
	
	//��ȯ ���� Ŭ������ ���
	public User method6() {
		User u = new User("user01", "pass01", "���ǰ�");
		System.out.println("MethodController u : " + u);
		
		return u;
	}
	
	
	
	
	
}
