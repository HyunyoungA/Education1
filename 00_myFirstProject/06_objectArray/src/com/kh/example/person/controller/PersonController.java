package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		Person[] pArr = new Person[5];//5���� ���� pArr����
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		//���� �ȿ� ��ü ����, �ʱ�ȭ �ʼ�!!!!!
		pArr[0] = new Person();
		pArr[1] = new Person("���ǰ�", 25, '��', 174.3, 67.2);
		pArr[2] = new Person("������", 13, '��', 162.4, 55.2);
		pArr[3] = new Person("�����", 32, '��', 183.1, 70.2);
		pArr[4] = new Person("�����", 17, '��', 162.4, 52.1);
		
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
		for(int i = 0; i < pArr.length; i++) {//�޼ҵ� ȣ��
			System.out.println(pArr[i].personInfo());
		}
	}
	public void method2() {
		//int[] iArr = {1,2,3};
		Person[] pArr = {new Person("���̹�", 28, '��', 160.2, 58.4),
					  	 new Person("�ں���", 42, '��', 162.2, 44.2),
						 new Person("�ۼ���", 23, '��', 175.4, 82.5)};
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] : " + pArr[i]);
		}
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	}
}
