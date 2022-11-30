package com.kh.general.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
		
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			
			int[] arr = num;
			for(int i = 0; i <arr.length; i++){
			     arr[i] = i + 1;
			}	
		}
	
	
	public void practice2() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		}
		
		
		
		

	}


