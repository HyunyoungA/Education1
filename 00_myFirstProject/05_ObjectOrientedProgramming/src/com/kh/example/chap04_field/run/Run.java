package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
//		KindsOfVariable2 kov2 = new KindsOfVariable2();//��ü�����
//		kov2.str = "hello"; //����ƽ ������ ����-->����ƽ������ ��ü�� �����ʿ����!
							//�� ����� �ν��Ͻ� ������ �ʿ�
		KindsOfVariable2.str = "world";//-->�̰� static���� �����
		
		Math.random();
		Integer.parseInt("10");
		
		double pi = Math.PI;
		int max = Integer.MAX_VALUE;
		
		KindsOfVariable2 kov2 = new KindsOfVariable2();
		kov2.method();
		kov2.method();
		
		KindsOfVariable2 kov22 = new KindsOfVariable2();
		kov22.method();
		//static���� ����ƽ �޸𸮿��� �־ ���� �����Ǿ� 13�̵Ǵ´�
		//test num�� heap�޸𸮿� �ִµ� ��ü�� ���� �����ϸ鼭 ���� �޸𸮿����� ���󰡼�  11�̴�.

		
	}
}
