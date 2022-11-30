package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();//추첨 대상을 담을 HashSet 객체 생성(lottery)
	private HashSet win = new HashSet();//당첨 대상을 담을 HashSet 객체 생성(win)
	
	public boolean insertObject(Lottery l) {//셋에 값 저장 하는 메소드
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		boolean result = lottery.add(l);
		return result;
	}
	
	public boolean deleteObject(Lottery l) {//셋에 있는 값을 삭제하는 메소드
		boolean result = lottery.remove(l);
		if(null != win && result) {
			win.remove(l);
		}
		return result;
	}
	
	public HashSet winObject() {//모든 당첨자를 출력하는 메소드
		ArrayList list = new ArrayList(lottery);
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		
		while(win.size() != 4) {
			int num = (int)(Math.random()*list.size());
			win.add(list.get(num));
		}return win;
	}
				
	public TreeSet sortedWinObject() {//정렬된 당첨자 목록을 출력하는 메소드
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에 당첨 대상 확인을 꼭 먼저 해야함
		TreeSet sort = new TreeSet(new SortedLottery());
		sort.addAll(win);
		
		return sort;
	}
	public boolean searchWinner(Lottery l) {//특정 당첨자를 검색하는 메소드
		// 전달 받은 l을 win에서 찾고, 찾은 결과인 boolean 값 반환
		boolean lContains = win.contains(l);
		return lContains;
	}
	
}
