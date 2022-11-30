package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodController mc = new MethodController();
		
		mc.method1();
//		int result = mc.method2(); <���1> : �޼ҵ� Ȱ���ؼ� ������ ��ߵǸ� <���1> ���!
//		System.out.println(result); 
		System.out.println(mc.method2()); //<���2>
		
		int num1 = 10;
		mc.method3(num1, 3);
		
		int result = mc.method4(8, 6);
		System.out.println(result);
		
		int[] arr = mc.method5();
		System.out.println("Run arr : " + arr);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		User user = mc.method6();
		System.out.println("User user : " + user);
		
		user.inform();
		
		System.out.println();
		System.out.println();
		
		Trainee t = new Trainee("������", 'G', "����", 100);//new�� �ּҰ��� �޶� �ٸ� �л���.
		System.out.println(t.inform());
		
		Trainee t2 = new Trainee("������", '��', "����", 100);//new�� �ּҰ��� �޶� �ٸ� �л���.
		System.out.println(t2.inform());
		//�����ڷ� �ʱ�ȭ�ϴ°� �ƴ϶� �޼ҵ�� �ʱ�ȭ�� �� �ִ�.-->������ �ּҰ��� �����ϰ� ���� �� ����.
		Trainee t3 = new Trainee();
		// �̸��� ���� ���� �� �ִ� �޼ҵ� �̿��� �� �ʱ�ȭ
		
		System.out.println("== �� ���� ==");
		char classRoom = t.getClassRoom();
		System.out.println(classRoom);
		t.setClassRoom('��');
		System.out.println(t.inform());
		
		Trainee.setScore(98);
		System.out.println(Trainee.gerScore());
		System.out.println(t.inform());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
