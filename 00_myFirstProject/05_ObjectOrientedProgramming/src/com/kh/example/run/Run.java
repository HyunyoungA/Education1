package com.kh.example.run;

import com.kh.example.Test;
import com.kh.example.chap06_method.controller.MethodController;

public class Run {
	public static void main(String[] args) {//static ���α׷� ���ۺ��� ������ ����!
		Test t = new Test();
		
		System.out.println("�ʱ� ���� ���̿� �ѷ� ��");
		t.getAreaOfCircle();
		t.getSizeOfCircle();
		
		System.out.println("== ������1 ���� ==");
		t.incrementRadius();
		
		
		System.out.println("������ ���� �� ���� �ѷ�, ���� ��");
		t.getAreaOfCircle();
		t.getSizeOfCircle();
		
		t.method3();
		System.out.println(t.method3());
	}
	
	
	
	private int globalNum;
	public void method1(int num) {
		int localNum;
		System.out.println(num);
		System.out.println(globalNum);
		
	}
	public void method2() {
		System.out.println(globalNum);
	}
	
		
		
	
	
}


