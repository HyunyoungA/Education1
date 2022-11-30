package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;// ���� ����
		
		System.out.println(originArr);
		System.out.println(copyArr);//�ΰ� �ּҰ��� ���� ���´�.
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;//���� �迭 ����
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}
	
	public void method2() { //���� ����
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		System.out.println(originArr);
		System.out.println(copyArr);
		
		//for���� �̿��� ���� ����
		
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
			System.out.print(copyArr[i] + " ");//�ٸ������̾ ������ ��ġġ����.
		}
		System.out.println();
	}
	
	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		
		//System.arraycopy()�� ���� ���� ����
//		System.arraycopy(src, srcPos, dest, destPos, length);
		//	src : ���� �迭
		//	srcPos : ���� �迭���� ���縦 ������ ��ġ
		//	dest : ���� �迭
		//	destPos : ���� �迭���� �ٿ��ֱ⸦ ������ ��ġ
		//	length : ���� ����
		
		//���� �迭�� 0(index)��°���� �����迭 ���̸�ŭ ������ ���� ���� �迭 3��°���� �ٿ��ֱ�
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//�ٸ������̾ ������ ��ġġ����.
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
			System.out.print(copyArr[i] + " ");//�ٸ������̾ ������ ��ġġ����.
		}
		System.out.println();
		
		//Arrays.copyOf()�� ���� ���� ����
		//Arrays.copyOf(original, newLength)
		copyArr = Arrays.copyOf(originArr, originArr.length);//int[](��ȯ��) java.util.Arrays.copyOf(int[] original, int newLength)
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//�ٸ������̾ ������ ��ġġ����.
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");//�ٸ������̾ ������ ��ġġ����.
		}
		System.out.println();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












