package com.kh.example.chap02_Wrapper.controller;

public class WrapperController {
	public void method1() {
		// �⺻�ڷ��� WrapperŬ����
		// boxing	: �⺻ �ڷ����� wrapperŬ������ ��ȯ
		// unBoxing : wrapperŬ������ �⺻ �ڷ������� ��ȯ
		
		int num1 = 10;
		Integer integer1 = new Integer(num1); //boxing 
		int num2 = integer1.intValue(); //unBoxing
		
		//JDK1.5 -> autoBoxing, autoUnboxing
		Integer integer2 = num1; //autoBoxing
		int num3 = integer2; //autoBoxing
	}
	
	public void method2() {
		//parsing : ���ڿ��� �⺻�ڷ������� ��ȯ�ϴ� ��.
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("�ڽſ�");
		//java.lang.NumberFormatException : For input string: "�ڽſ�"
		//�Ľ��� �ڷ����� ���¸� ������ �ʾƼ� ���� ����
		short s = Short.parseShort("10");//��ȣ �ȿ� ���� �ϸ� �ȵ�.
		float f = Float.parseFloat("10");
		boolean b = Boolean.parseBoolean("true");
		Byte by = Byte.parseByte("10");
		Long l = Long.parseLong("10");
		
		//Character.parse�� �Ұ���
		//CharacterŬ������ parsing��� ���� X ==> charAt() ���
		
		//�⺻ �ڷ����� ���ڿ��� �ٲٴ� �۾�
		String str1 = i + "";//i + ""; <--���ڿ��� �ٲ�
		String str2 = String.valueOf(s);
		String str3 = Byte.valueOf(by).toString();//3���� ���
		
	}
	
}
