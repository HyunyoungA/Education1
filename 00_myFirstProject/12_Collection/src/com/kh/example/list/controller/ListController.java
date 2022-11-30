package com.kh.example.list.controller;

import java.util.ArrayList;

import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		List list = new List();//인터페이스는 객체생성 불가능
		ArrayList list1 = new ArrayList();
		
		
//		list1.add(Object e)//타입 미지정
		
		ArrayList<Student> list = new ArrayList<Student>(3);
//		list.add(Student e) //제네릭 사용으로 Student 제한!
		
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		list.add(new Student("남나눔", 90));
//		list.add("하이"); <>제너럴로 Student 제한해놨기 때문에 사용 불가
		
		System.out.println("list : " + list);
		//ArrayList는 Object의 toString()를 오버라이딩 했기 때문에 list만 찍어도 안에 내용이 나옴.
		
		// 장점1. 크기 제약 x 위에서 3개로 써놨지만 알아서 늘어나서 추가됨.
		list.add(new Student("하현호", 85));
		System.out.println("list : " + list);
		System.out.println("list에 담긴 element 개수 : " + list.size());
		
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		
		//장점 2. 추가/삭제/정렬 기능처리 간단
		// add(int index, E e):void
		list.add(0, new Student("류라라", 100));// 순서 맨 앞으로할 땐 0을 추가한다.
		System.out.println("list : " + list);
		
		Student kkk = new Student("강건강", 40);
		list.add(3, kkk);
		System.out.println("list : " + list);
		
		//remove(int index):E  지우기
		Student s = list.remove(1);
		System.out.println(s);
		System.out.println("list : " + list);
		
		// remove(Object o): boolean
		list.remove(kkk);
		System.out.println("list : " + list);
		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("김");
//		strList.add("이");
//		strList.add("박");
//		strList.add("최");
//		System.out.println(strList);
		
//		//이미 오버라이딩 되어있음 -->String, Integer...
//		strList.remove(new String("이"));
//		strList.add("최");
//		System.out.println(strList);
		
		//set(int nidex, E e):E -->수정
		list.set(3, new Student("박보배", 85));
		System.out.println("1list : " + list);
		
		//get(int index):E
		Student s2 = list.get(2);
		System.out.println(s2);
		
		// contains(Object o):boolean
		// indexOf(Object o):int
		System.out.println(list.contains(new Student("류라라", 100)));
		System.out.println(list.indexOf(new Student("류라라", 100)));
		
		System.out.println(list.contains(new String("김")));
		System.out.println(list.indexOf(new String("박")));
		
		//clear():void
		//isEmpty():boolean
		list.clear();
		System.out.println("list : " + list);
		System.out.println(list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
