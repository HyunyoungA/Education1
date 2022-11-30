package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
//		������ �����̸� true, ����̸�
//		false ����(����: ������ 4�� ����̸鼭,100�� ����� �ƴϰų� 400�� ����� �Ǵ� ��)
		
//		for (int i = 0; i / 4 == 0; i++) {
//		if (i / 400 == 0) {
//			return true;
//		}else if(i / 100 == 0);
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
	
	public long leapDate(Calendar c) {
//		1�� 1�� 1�Ϻ��� ���ñ����� �ѳ� ���� ��� 1����� ���� �������� �� ������
//		�����̸� �� ������ 366����, ����̸� 365���� �����ش� ���� ������ �����̸� 2����
//		29�Ϸ� ����̸� 28�Ϸ� ���Կ��� ��¥ ���� ����
//		(31��: 1, 3, 5, 7, 8, 10, 12��/30��: 4, 6, 9, 11��)
//	
//		int year = c.get(Calendar.YEAR);
//		int month = c.get(Calendar.MONTH)+1;
//		int date = c.get(Calendar.DATE);
//		
//		long count = 0L;
//		
//		for(int i = 1; i < year; i++) {
//			if(isLeapYear(i)) {
//				switch(month) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//					count += 31;
//					break;
//				case 2:
//					count += 29;
//					break;
//				case 4: case 6: case 9: case 11:
//					count += 30;
//					break;
//				}
//			}else {
//				switch(month) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//					count += 31;
//					break;
//				case 2:
//					count += 28;
//					break;
//				case 4: case 6: case 9: case 11:
//					count += 30;
//					break;
//				}
//			}
//		}	count += date;
//			return count;
//	}		

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		
		long count = 0L;
		
		for(int i = 1; i <= year; i++) {
			if(isLeapYear(i)) {
				count += 366;
			} else {
				count += 365;
			}
			
			if(isLeapYear(year)) {
				for(int e = 1; e < month; e++) {
					switch(e) {
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						count += 31;
						break;
					case 2: 
						count += 29;
						break;
					default:
						count += 30;
						break;
					}
				} 
			}else {
				for(int e = 1; e < month; e++) {
					switch(e) {	
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						count += 31;
						break;
					case 2: 
						count += 28;
						break;
					default:
						count += 30;
						break;
					}
				}
			}
			count += date;
		}	return count;
	}	
}
