package com.kh.variable;

public class D_PrintMethod {
	public void printlnMethod() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(); //�ٹٲ��� �ϰڴ�.
	}
	
	public void printMethod() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		System.out.print(str1);
		System.out.print(str2);
	}
	
	public void printfMethod() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		//%s : ���ڿ�		%d : ���� 	%c : ����
		//%b : ����		%f : �Ǽ� 
		//�ȳ��ϼ���, ���ǰ��Դϴ�. �ݰ����ϴ�.
//		System.out.printf("%s, ���ǰ��Դϴ�. %s.", str1, str2);
//		System.out.println();
		// �ݰ����ϴ�, ģ�ϰ� ������.
//		System.out.printf("%s, ģ�ϰ�������.%n", str2);
//		System.out.printf("%s, ģ�ϰ�������.", str2);
//	}
	
//	public void printfMethod() {
		//�̴Ϲ���
		//�ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�ڽſ�";
		String jop = "����";
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.",str1, age, name, jop, str2);
	
	}
	public void stringExample() {
		String str1 = "�ູ�ϼ���";
		String str2 = "�ǰ��ϼ���";
		int num1 = 10;
		int num2 = 20;
		
		String str3 = str1 + str2; //�ູ�ϼ���ǰ��ϼ���
		System.out.println(str3);
		
		int num3 = num1 + num2; //30
		System.out.println(num3);
		
		System.out.println(str1 + num1); // �ູ�ϼ���10
		System.out.println(num2 + str2); //20�ǰ��ϼ���
		System.out.println(str1 + num1 + num2); //�ູ�ϼ���1020 ���ڿ� �ڿ� ���� �ڿ� �ִ� �͵��� �� ���ڷ� �ٲ�. ���� 10�� �ƴ� �׳� 10,20
		System.out.println(num1 + str1 + num2); //10�ູ�ϼ���20
		System.out.println(num1 + num2 + str1); //30�ູ�ϼ���
		
		System.out.println(str1 +(num1 + num2)); //�ູ�ϼ���30
	}
	
	
	
	
	
	
	
	
	
}
