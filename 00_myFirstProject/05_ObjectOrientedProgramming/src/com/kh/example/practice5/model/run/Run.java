package com.kh.example.practice5.model.run;

import com.kh.example.practice5.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmpNo(100);
		e.setEmpName("양현영");
		e.setDept("마케팅");
		e.setJob("사원");
		e.setAge(27);
		e.setGender('여');
		e.setSalary(2600000);
		e.setBonuPoint(0.10);
		e.setPhone("010-8254-0821");
		e.setAddress("서울시 성동구");
		
		System.out.println(e.getEmpNo());
		System.out.println(e.getEmpName());
		System.out.println(e.getDept());
		System.out.println(e.getJob());
		System.out.println(e.getAge());
		System.out.println(e.getGender());
		System.out.println(e.getSalary());
		System.out.println(e.getBonusPoint());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());
	}
	
}
