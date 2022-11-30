package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date(); //기본 생성자는 현재 시간에 대한 정보를 갖고 객체 생성
		System.out.println(today);
		
		System.out.println(today.getTime());//1970년대부터 흐른 초시간
		
		Date time = new Date(1645668927472L);//long값인걸 알려주기 위해 숫자 뒤에 L자를 붙힘
		System.out.println(time);//Thu Feb 24 11:15:27 KST 2022 과거 시간 접근방법
		
		Date date = new Date(2022, 7, 13);//사용하지 말라는 뜻 출력도 막아놓음.
		System.out.println(date);
	}
	
	public void method2() {
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);//전체 시간에 대해 길게 출력됨.
		
		int year = c.get(Calendar.YEAR);//위에 코드에서 년도만 뽑아냄
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month);//날짜 "월" : 0부터 시작 = 1월 0이라고 뜸 2월은 1이라고뜸 12월은 11이라뜸(11월)
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		int ampm = c.get(Calendar.AM_PM);
		System.out.println(ampm);
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = c.get(Calendar.SECOND);
		System.out.println(second);
		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.println(millisecond);
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		//일 월 화 수 목 금 토
		//1 2 3 4 5 6 7
		
	}
	public void method3() {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		System.out.println(gc.get(Calendar.YEAR));//후손 클래스
		
		GregorianCalendar end = new GregorianCalendar(2022, /*7*/6, 13, 17, 50, 0);
		long time = end.getTimeInMillis();
		Date endDate = new Date(time);
		System.out.println(endDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a hh시 mm분 ss초");//24시 기준 시간 HH
		String fmt = sdf.format(endDate);
		System.out.println(fmt);
	}
	
	
}
