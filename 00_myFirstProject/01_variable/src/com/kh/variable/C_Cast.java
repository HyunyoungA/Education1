package com.kh.variable;

public class C_Cast {
	// ����ȯ���� ���ܰ� �Ǵ� �⺻ �ڷ��� : boolean
	// ����ȯ�� ���� : �ڵ� ����ȯ, ���� ����ȯ
	
	//�ڵ� ����ȯ
	public void casr1() {
		//���������� �ڵ� ����ȯ
		byte bNum = 3;
		int iNum = bNum;  // �ڵ�����ȯ
		
		// ������ �Ǽ������� �ڵ� ����ȯ
		long lNum = 100;
		float fNum = lNum;
		
		// ������ �Ǽ������� �ڵ� ����ȯ
		int num = 'A';
		char ch = 97;
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; //Type mismatch: cannot convert from int to char
		System.out.println("ch2 : " + ch2);
		
//		char ch3 = -10;
		int num1 = -10;
		char ch3 = (char)num1;
		System.out.println("ch3 : " + ch3);
	}
//		byte b1 = 10; // int���� 10�� ���ͷ� �����ȿ��� ���ԵǾ��ִ� ���̸� �������� �޾Ƶ帲.
		//=10L(X) long type �� �Ǽ� �ȵȴ�.
		//��ǻ�ʹ� ��� ������ �� int��� �޾Ƶ��δ�.
//		byte b2 = 10L;
//		byte b3 = 127;
//		byte b4 = 128; // int�ε� ���� ���� �� ���� ���̾�
		
		
	//���� ����ȯ
	public void cast2() {
		int iNum = 10;
		long lNum = 100L;
			
//			int result = iNum + lNum;
		//�ڵ�����ȯ int ->long ������ ū�ŷ� ��ȯ
		//��� ����� longŸ���� �Ǵµ� �� ���� int�� �������� �ϱ� ����
		//���1. ���� ����� int�� ���� ����ȯ
		int result1 = (int)(iNum + lNum);
		//���2. long�� ���� int�� ���� ����ȯ
		int result2 = iNum + (int)lNum;
		//���3. ��� ���� long������ �ޱ�
		long result3 = iNum + lNum;
		}
	}
