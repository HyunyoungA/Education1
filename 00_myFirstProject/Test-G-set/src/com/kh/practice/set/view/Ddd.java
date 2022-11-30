package com.kh.practice.set.view;

public class Ddd{
	public void main() {
		int num=8;
		String team;
		switch(num % 5) {
		case 1: team = "1조"; break;
		case 2: team = "2조"; break;
		default: team = "다시"; break;
		
		
		}
		//초기식;조건식;증감식;
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "출력");
			for(int e = 10; e >= 8; e++) {
				System.out.println("끝-");
				break;
			}
		}
		
		
		
	}
}
