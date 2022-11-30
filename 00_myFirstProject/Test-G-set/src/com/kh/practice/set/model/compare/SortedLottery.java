package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {//정렬 기준을 세워주는 메소드
		String standard = ((Lottery)o1).getName();
		String object = ((Lottery)o2).getName();
		
		if(standard.equals(object)) {
			String standardPhone = ((Lottery)o1).getPhone();
			String objectPhone = ((Lottery)o2).getPhone();
		
			return standardPhone.compareTo(objectPhone);
		}
		return standard.compareTo(object);
	}
}
