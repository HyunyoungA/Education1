package com.kh.example.practice5.model.run;

import com.kh.example.practice5.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmpNo(100);
		e.setEmpName("������");
		e.setDept("������");
		e.setJob("���");
		e.setAge(27);
		e.setGender('��');
		e.setSalary(2600000);
		e.setBonuPoint(0.10);
		e.setPhone("010-8254-0821");
		e.setAddress("����� ������");
		
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
