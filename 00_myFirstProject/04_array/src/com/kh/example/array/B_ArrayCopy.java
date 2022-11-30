package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;// 얕은 복사
		
		System.out.println(originArr);
		System.out.println(copyArr);//두개 주소값이 같게 나온다.
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;//원본 배열 변경
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}
	
	public void method2() { //깊은 복사
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		System.out.println(originArr);
		System.out.println(copyArr);
		
		//for문을 이용한 깊은 복사
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i <originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//다른공간이어서 영향을 미치치않음.
		}
		System.out.println();
	}
	
	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		
		//System.arraycopy()를 통한 깊은 복사
//		System.arraycopy(src, srcPos, dest, destPos, length);
		//	src : 원본 배열
		//	srcPos : 원본 배열에서 복사를 시작할 위치
		//	dest : 복사 배열
		//	destPos : 복사 배열에서 붙여넣기를 시작할 위치
		//	length : 복사 길이
		
		//원본 배열의 0(index)번째부터 원본배열 길이만큼 복사한 것을 복사 배열 3번째부터 붙여넣기
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//다른공간이어서 영향을 미치치않음.
		}
		System.out.println();
		
	}
	
	public void method4() {//1 2 3 4 5
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//다른공간이어서 영향을 미치치않음.
		}
		System.out.println();
		
		//Arrays.copyOf()를 통한 깊은 복사
		//Arrays.copyOf(original, newLength)
		copyArr = Arrays.copyOf(originArr, originArr.length);//int[](반환값) java.util.Arrays.copyOf(int[] original, int newLength)
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//다른공간이어서 영향을 미치치않음.
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//다른공간이어서 영향을 미치치않음.
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












