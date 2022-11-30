package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	public void mrthod1() {
		//10~90 10, 20,30, 변수
		//같은 자료형이어서 배열로 묶을 수 있다.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9;
		
		//num1 ~ num9까지 묶을 것 = 배열 : 모두 같은 자료형이어서(int)
		//int값이 9개 들어갈 수 있는 배열 arr생성
		
		int[] arr = new int[9];
		System.out.println(arr);
//		System.out.println(arr[10]);
//		System.out.println(arr[20]);
//		System.out.println(arr[30]);
//		System.out.println(arr[40]);
//		System.out.println(arr[50]);
//		System.out.println(arr[60]);
//		System.out.println(arr[70]);
//		System.out.println(arr[80]);
//		System.out.println(arr[90]);
//		System.out.println(arr[9]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 배열 값 초기화
		// 1. 인덱스 이용
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		arr[5] = 60;
//		arr[6] = 70;
//		arr[7] = 80;
//		arr[8] = 90;
		
		//2. for문 이용 : 규칙이 있을 때 사용 가능
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
	
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//3. {}을 이용 : 선언과 동시에 초기화 가능
		int[] arr2 = {1, 2, 3, 4};
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = {"apple", "banana", "grape"};
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		int[] arr4 = new int[] {11, 22, 33, 44, 55};
		for(int i = 0; i< arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		String[] str = new String[3];

		str[0] = "Apple";
		str[1] = "Kiwi";​
		str[2] = "Strawberry";
		str[3] = "Banana";​

		System.out.println(str[1]);
	}
	public void method2() {
		// 배열 선언 : Stack영역에 공간 생성
		int[] iArr;
		char chArr[];
		
		// 배열 할당 : Heap영역에 공간 생성
		iArr = new int[5];
		chArr = new char[10];
		//배열의 선언과 할당 분리 가능
		
		int[] iArr2 = new int[5];
		char[] chArr2 = new char[10];
		//배열의 선언과 할당 동시에 가능
		
		// 사용자에게 입력받은 정수로 배열 길이를 지정한 double배열 dArr생성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이 입력 : ");
		int size = sc.nextInt();
		double[] dArr = new double[size];
		System.out.println("dArr의 길이 : " + dArr.length);
		System.out.println("dArr의 주소값 : " + dArr);
		
		dArr = new double[5];
		System.out.println("변경 후 dArr의 길이 : " + dArr.length);
		System.out.println("변경 후 dArr의 주소값 : " + dArr);
		
		//배열 삭제
		dArr = null;
		
	}
	
	
	
}
