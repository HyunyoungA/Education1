package com.kh.example.chap02_abstract.family.model.vo;

import java.io.Serializable;
import java.util.List;

public interface Basic extends Cloneable, Serializable/*, List*/{
	
	
	
	
//	�������̽������� �ʵ�� �׻� ��� �ʵ� : public static final
	public static final int a = 10;
	String str = "Hello";//���� �ڵ带 �����ص� ����� �ʵ�� ������
	
//	public void method() {
//	}
	public abstract void eat();//<--�� �ڵ�� �Ʒ� �ڵ� �Ѵ� ��밡��
	void sleep();//�տ� �ڵ� �����ؼ� ��밡��
	
	
}
