package com.kh.variable;

public class A_Variable {
	//�ڷ��� ������;
	//������ = ��;
	//���� ���� �� �ʱ�ȭ
	public void declareVariable() {
		//���� ����
		//1. ����
		boolean isTrue; //The value of the local variable isTrue is not used
		//2. ������
		//2-1. ���� : �� ���� ''
		//2-2. ���ڿ� : �� ���� �̻� ""
		char ch;
		String str;
		
		//3. ������
		//3-1. ������
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//3-2. �Ǽ���
		float fNum;
		double dNum;
		
		//���� �� ���� = �ʱ�ȭ
		isTrue = true;
		
		ch = 'A';
		str = "���ڿ�";
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		fNum = 4.0f;
		dNum = 8.0;
		
		//������ ����� �� ���
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
	}
	
	// �ڷ��� ������ = ��;
	//���� ����� ���ÿ� �ʱ�ȭ
	
	public void initVariable() {
		//1. ����
		boolean isTrue = false;
		//2. ������
		//2-1. ����
		char ch = '��';
		//2-2. ���ڿ�
		String str = "a";
		
		//3. ������
		//3-1. ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 2;
		long lNum = 8L;
		
		//3-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNumd�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
	}
}
