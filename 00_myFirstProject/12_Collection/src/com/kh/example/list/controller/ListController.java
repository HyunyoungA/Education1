package com.kh.example.list.controller;

import java.util.ArrayList;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		List list = new List();//�������̽��� ��ü���� �Ұ���
		ArrayList list1 = new ArrayList();
		
		
//		list1.add(Object e)//Ÿ�� ������
		
		ArrayList<Student> list = new ArrayList<Student>(3);
//		list.add(Student e) //���׸� ������� Student ����!
		
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		list.add(new Student("������", 90));
//		list.add("����"); <>���ʷ��� Student �����س��� ������ ��� �Ұ�
		
		System.out.println("list : " + list);
		//ArrayList�� Object�� toString()�� �������̵� �߱� ������ list�� �� �ȿ� ������ ����.
		
		// ����1. ũ�� ���� x ������ 3���� ������� �˾Ƽ� �þ�� �߰���.
		list.add(new Student("����ȣ", 85));
		System.out.println("list : " + list);
		System.out.println("list�� ��� element ���� : " + list.size());
		
		list.add(new Student("���̹�", 66));
		System.out.println("list : " + list);
		
		//���� 2. �߰�/����/���� ���ó�� ����
		// add(int index, E e):void
		list.add(0, new Student("�����", 100));// ���� �� �������� �� 0�� �߰��Ѵ�.
		System.out.println("list : " + list);
		
		Student kkk = new Student("���ǰ�", 40);
		list.add(3, kkk);
		System.out.println("list : " + list);
		
		//remove(int index):E  �����
		Student s = list.remove(1);
		System.out.println(s);
		System.out.println("list : " + list);
		
		// remove(Object o): boolean
		list.remove(kkk);
		System.out.println("list : " + list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("��");
//		strList.add("��");
//		strList.add("��");
//		strList.add("��");
//		System.out.println(strList);
		
//		//�̹� �������̵� �Ǿ����� -->String, Integer...
//		strList.remove(new String("��"));
//		strList.add("��");
//		System.out.println(strList);
		
		//set(int nidex, E e):E -->����
		list.set(3, new Student("�ں���", 85));
		System.out.println("1list : " + list);
		
		//get(int index):E
		Student s2 = list.get(2);
		System.out.println(s2);
		
		// contains(Object o):boolean
		// indexOf(Object o):int
		System.out.println(list.contains(new Student("�����", 100)));
		System.out.println(list.indexOf(new Student("�����", 100)));
		
		System.out.println(list.contains(new String("��")));
		System.out.println(list.indexOf(new String("��")));
		
		//clear():void
		//isEmpty():boolean
		list.clear();
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
