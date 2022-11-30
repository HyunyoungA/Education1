package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date(); //�⺻ �����ڴ� ���� �ð��� ���� ������ ���� ��ü ����
		System.out.println(today);
		
		System.out.println(today.getTime());//1970������ �帥 �ʽð�
		
		Date time = new Date(1645668927472L);//long���ΰ� �˷��ֱ� ���� ���� �ڿ� L�ڸ� ����
		System.out.println(time);//Thu Feb 24 11:15:27 KST 2022 ���� �ð� ���ٹ��
		
		Date date = new Date(2022, 7, 13);//������� ����� �� ��µ� ���Ƴ���.
		System.out.println(date);
	}
	
	public void method2() {
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		System.out.println(c);//��ü �ð��� ���� ��� ��µ�.
		
		int year = c.get(Calendar.YEAR);//���� �ڵ忡�� �⵵�� �̾Ƴ�
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month);//��¥ "��" : 0���� ���� = 1�� 0�̶�� �� 2���� 1�̶��� 12���� 11�̶��(11��)
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
		//�� �� ȭ �� �� �� ��
		//1 2 3 4 5 6 7
		
	}
	public void method3() {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		System.out.println(gc.get(Calendar.YEAR));//�ļ� Ŭ����
		
		GregorianCalendar end = new GregorianCalendar(2022, /*7*/6, 13, 17, 50, 0);
		long time = end.getTimeInMillis();
		Date endDate = new Date(time);
		System.out.println(endDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� a hh�� mm�� ss��");//24�� ���� �ð� HH
		String fmt = sdf.format(endDate);
		System.out.println(fmt);
	}
	
	
}
