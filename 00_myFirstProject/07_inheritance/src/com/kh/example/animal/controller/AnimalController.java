package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snack;

public class AnimalController {
	public void method() {
		Animal a = new Animal("������", 9, 6.4);
//		System.out.println(a.inform());
		System.out.println(a);
//		System.out.println(a.toString());
		
		Dog d = new Dog("�κ�", 1, 4.2, 50, "���");
//		System.out.println(d.inform());
		System.out.println(d);
//		System.out.println(d.toString());
		
		Snack s = new Snack("�����", 4, 10.2, "����");
//		System.out.println(s.inform());
		System.out.println(s);//toString�� �̿��ؼ� (s)�� �־ ��밡��
//		System.out.println(s.toString());//object�� �ִ� toString ȣ��
	}
	

}
