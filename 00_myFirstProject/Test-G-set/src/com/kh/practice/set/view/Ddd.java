package com.kh.practice.set.view;

public class Ddd{
	public void main() {
		int num=8;
		String team;
		switch(num % 5) {
		case 1: team = "1��"; break;
		case 2: team = "2��"; break;
		default: team = "�ٽ�"; break;
		
		
		}
		//�ʱ��;���ǽ�;������;
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "���");
			for(int e = 10; e >= 8; e++) {
				System.out.println("��-");
				break;
			}
		}
		
		
		
	}
}
