package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodController mc = new MethodController();
		
		mc.method1();
//		int result = mc.method2(); <방법1> : 메소드 활용해서 여러번 써야되면 <방법1> 사용!
//		System.out.println(result); 
		System.out.println(mc.method2()); //<방법2>
		
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
		
		Trainee t = new Trainee("양현영", 'G', "종일", 100);//new의 주소값이 달라서 다른 학생임.
		System.out.println(t.inform());
		
		Trainee t2 = new Trainee("양현영", '꽃', "종일", 100);//new의 주소값이 달라서 다른 학생임.
		System.out.println(t2.inform());
		//생성자로 초기화하는게 아니라 메소드로 초기화할 수 있다.-->때문에 주소값을 동일하게 만들 수 없다.
		Trainee t3 = new Trainee();
		// 이름만 값을 넣을 수 있는 메소드 이용해 값 초기화
		
		System.out.println("== 값 변경 ==");
		char classRoom = t.getClassRoom();
		System.out.println(classRoom);
		t.setClassRoom('꽃');
		System.out.println(t.inform());
		
		Trainee.setScore(98);
		System.out.println(Trainee.gerScore());
		System.out.println(t.inform());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
