package com.kh.example.chap02_abstract.controller;

import com.kh.example.chap02_abstract.family.model.vo.Baby;
import com.kh.example.chap02_abstract.family.model.vo.Basic;
import com.kh.example.chap02_abstract.family.model.vo.Family;
import com.kh.example.chap02_abstract.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();//�߻�Ŭ������ ��ü ���� �Ұ�
		Family m = new Mother();
		Family b = new Baby();
		
		//Mother�� �ִ� eat(), Baby�� �ִ� sleep() ���� -> ���� ���ε�
//		m.eat();
//		b.sleep();
		
//		Basic basic = new Basic();//��ü���� �Ұ���
		Basic m2 = new Mother();
		Basic b2 = new Baby();
		m2.sleep();
		b2.eat();
	}
}
