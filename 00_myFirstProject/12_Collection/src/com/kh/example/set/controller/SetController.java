package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<Dog> set = new HashSet<>();//�ڿ� ���׸� ���� --> Ÿ���߷�
		
		Dog jangoon = new Dog("�屺", 2.2);
		set.add(jangoon);
		set.add(new Dog("����", 3.3));
		set.add(new Dog("���", 5.4));
		System.out.println("set : " + set);//����������������
		
		set.add(new Dog("�屺", 2.2));
		System.out.println("set : " + set);//�ߺ� ���� �Ұ���
		//equals() hashCode()�������̵�
		
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("�ȳ�");
		strSet.add("�ݰ���");
		strSet.add(new String("�ݰ���"));
		strSet.add("�ʴ�");
		strSet.add("�̸���");
		strSet.add("����?");
		strSet.add("�츮");
		strSet.add("ģ�ϰ�");
		strSet.add("������");
		strSet.add("�?");
		strSet.add("�Ⱦ�?");
		strSet.add("��?");
		strSet.add("����..");
	
		System.out.println("strSet : " + strSet);
		
		//������ �����ǰ� �ߺ������� �ȵǴ� �÷��� --> LinkedHashSet
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println("set2 : " + set2);
		//DogŬ������ equals()�� �������̵����־
		//���� �񱳰� �����ϰ� �Ǿ��� �� ������
		//���� ��ü�� �����Ǿ��� ������ �ߺ��� �ȵ�.
		
		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.2));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
		set2.add(new Dog("�ɴ�", 6.1));//������ ���Ŀ� ���� ������ �� ������
		System.out.println("set2 : " + set2);
		
		
		// ���� ���ִ� Set --> TreeSet / String-->�������� 
		TreeSet<String> set3 = new TreeSet<>();
		set3.addAll(strSet);
		System.out.println("set3 : " + set3);
		
		//StringŬ������ Comparable �������̽�(comparaTo())�� ������ �Ǿ��ֱ� ������ ���� ������ ������ �ְ�
		//���� ������ ������ �ִ� Ŭ���� String�� TreeSet �ȿ� �� �ֱ� ������ ���� ����
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(set2);
		System.out.println("set4 : " + set4);
		
		TreeSet<Dog> set5 = new TreeSet<Dog>(new DogComparator());
		set5.addAll(set2);
		System.out.println("set5 : " + set5);
		
		
		//List�� �ִ� element�� �ϳ��� �����ϰ� ���� �� for�� �̿� ���� -> �ε���
//		for(int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}
		
		//Set���� �ε����� ���� -> List��  ���� ������� �ϳ��� element�� ���� �Ұ��� ==> Iterator
		//Iterator : �÷��ǿ� ����� element�� ������ �� �ֵ��� ��
		Iterator<Dog> it = set2.iterator();
		while(it.hasNext()) {//hasNext() : boolean ���� ���� ������ true��ȯ, ������ false��ȯ //�ε������� ->�ε��� �־����� ������ �����������.
			Dog d = it.next(); //next():E ���� �� ��ȯ
			System.out.println(d);
		}
		
		while(it.hasNext()) {
			Dog d = it.next();
			System.out.println("11" + d);
		}
		
		System.out.println();
		
		ArrayList<Dog> list = new ArrayList<Dog>(set2);//������
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		ListIterator<Dog> li = list.listIterator();
		while(li.hasNext()) {//������
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
