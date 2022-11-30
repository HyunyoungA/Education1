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
		HashSet<Dog> set = new HashSet<>();//뒤에 제네릭 생략 --> 타입추론
		
		Dog jangoon = new Dog("장군", 2.2);
		set.add(jangoon);
		set.add(new Dog("구름", 3.3));
		set.add(new Dog("사랑", 5.4));
		System.out.println("set : " + set);//순서유지하지않음
		
		set.add(new Dog("장군", 2.2));
		System.out.println("set : " + set);//중복 저장 불가능
		//equals() hashCode()오버라이딩
		
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("안녕");
		strSet.add("반가워");
		strSet.add(new String("반가워"));
		strSet.add("너는");
		strSet.add("이름이");
		strSet.add("뭐니?");
		strSet.add("우리");
		strSet.add("친하게");
		strSet.add("지내자");
		strSet.add("어때?");
		strSet.add("싫어?");
		strSet.add("왜?");
		strSet.add("제발..");
	
		System.out.println("strSet : " + strSet);
		
		//순서가 유지되고 중복저장이 안되는 컬렉션 --> LinkedHashSet
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println("set2 : " + set2);
		//Dog클래스에 equals()를 오버라이딩해주어서
		//내용 비교가 가능하게 되었고 그 때문에
		//같은 객체로 인지되었기 때문에 중복이 안됨.
		
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		set2.add(new Dog("꽃님", 6.1));//몸무게 정렬에 같은 몸무게 는 빼버림
		System.out.println("set2 : " + set2);
		
		
		// 정렬 해주는 Set --> TreeSet / String-->오름차순 
		TreeSet<String> set3 = new TreeSet<>();
		set3.addAll(strSet);
		System.out.println("set3 : " + set3);
		
		//String클래스에 Comparable 인터페이스(comparaTo())가 구현이 되어있기 때문에 정렬 기준이 정해져 있고
		//정렬 기준이 정해져 있는 클래스 String이 TreeSet 안에 들어가 있기 때문에 정렬 가능
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(set2);
		System.out.println("set4 : " + set4);
		
		TreeSet<Dog> set5 = new TreeSet<Dog>(new DogComparator());
		set5.addAll(set2);
		System.out.println("set5 : " + set5);
		
		
		//List에 있는 element에 하나씩 접근하고 싶을 때 for문 이용 가능 -> 인덱스
//		for(int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}
		
		//Set에는 인덱스가 없음 -> List와  같은 방법으로 하나씩 element에 접근 불가능 ==> Iterator
		//Iterator : 컬렉션에 저장된 element에 접근할 수 있도록 함
		Iterator<Dog> it = set2.iterator();
		while(it.hasNext()) {//hasNext() : boolean 다음 값이 있으면 true반환, 없으면 false반환 //인덱스없음 ->인덱스 있었으면 포문을 사용햇을것임.
			Dog d = it.next(); //next():E 다음 값 반환
			System.out.println(d);
		}
		
		while(it.hasNext()) {
			Dog d = it.next();
			System.out.println("11" + d);
		}
		
		System.out.println();
		
		ArrayList<Dog> list = new ArrayList<Dog>(set2);//정방향
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		ListIterator<Dog> li = list.listIterator();
		while(li.hasNext()) {//역방향
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
