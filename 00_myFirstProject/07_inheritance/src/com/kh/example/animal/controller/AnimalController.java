package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snack;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9, 6.4);
//		System.out.println(a.inform());
		System.out.println(a);
//		System.out.println(a.toString());
		
		Dog d = new Dog("두부", 1, 4.2, 50, "장모");
//		System.out.println(d.inform());
		System.out.println(d);
//		System.out.println(d.toString());
		
		Snack s = new Snack("방울이", 4, 10.2, "빗살");
//		System.out.println(s.inform());
		System.out.println(s);//toString을 이용해서 (s)만 넣어서 사용가능
//		System.out.println(s.toString());//object에 있는 toString 호출
	}
	

}
