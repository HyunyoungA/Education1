package com.kh.example.chap04_field.controller;

public class KindsOfVariable1 {// <--�߰�ȣ�� Ŭ���������� ����

	//�������� = ������� = ����ʵ� = �ʵ� : Ŭ���� ������ �ۼ��ϴ� ����
	private int globalNum;
	//					�Ű�����
	public void method1(int num) {// <--�޼ҵ� ������ ����
		// �������� : �޼ҵ� �������� �ۼ��ϴ� ����
		// �Ű������� ���������� �������� ���
		
		int localNum;
//		System.out.println(localNum);
		//���������� ���� �ϰ� �ٸ� �������� ����� ���� �ݵ�� �ʱ�ȭ�� �ؾ���
		
		System.out.println(num); //<--������ �޾ƿðű� ������
		
		System.out.println(globalNum);
		
	}// <--�޼ҵ� ������ ��
	
	public void method2() {
		System.out.println(globalNum);
		
//		System.out.println(localNum);--�Ѵ� ���� ���̾ �ȵ�
//		System.out.println(num);
	}
	
}// <-- Ŭ���� ������ ��
