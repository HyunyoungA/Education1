package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
//		연도가 윤년이면 true, 평년이면
//		false 리턴(윤년: 연도가 4의 배수이면서,100의 배수가 아니거나 400의 배수가 되는 해)
		
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
//		1년 1월 1일부터 오늘까지의 총날 수를 계산 1년부터 현재 연도까지 각 연도가
//		윤년이면 총 날수에 366일을, 평년이면 365일을 더함해당 현재 연도가 윤년이면 2월을
//		29일로 평년이면 28일로 더함월의 날짜 수를 더함
//		(31일: 1, 3, 5, 7, 8, 10, 12월/30일: 4, 6, 9, 11월)
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
