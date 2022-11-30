package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();//��÷ ����� ���� HashSet ��ü ����(lottery)
	private HashSet win = new HashSet();//��÷ ����� ���� HashSet ��ü ����(win)
	
	public boolean insertObject(Lottery l) {//�¿� �� ���� �ϴ� �޼ҵ�
		// ���� ���� l�� lottery�� �߰� ��, �߰� ����� boolean �� ��ȯ
		boolean result = lottery.add(l);
		return result;
	}
	
	public boolean deleteObject(Lottery l) {//�¿� �ִ� ���� �����ϴ� �޼ҵ�
		boolean result = lottery.remove(l);
		if(null != win && result) {
			win.remove(l);
		}
		return result;
	}
	
	public HashSet winObject() {//��� ��÷�ڸ� ����ϴ� �޼ҵ�
		ArrayList list = new ArrayList(lottery);
		// �ε����� �̿��� win�� ��÷�� ����
		// �� ��, ��÷�� ���� ������ 4���̸� �̸� ���� ��÷�� ���� 4�� �̻��̾�� ��
		// ���� ��÷�� ��Ͽ� ������ ��÷ ����ڰ� �ִٸ�
		// ������ ��÷�� ����� �����ϰ� ������ ����� �ڸ��� ���ο� ��÷�ڷ� ä��
		
		while(win.size() != 4) {
			int num = (int)(Math.random()*list.size());
			win.add(list.get(num));
		}return win;
	}
				
	public TreeSet sortedWinObject() {//���ĵ� ��÷�� ����� ����ϴ� �޼ҵ�
		// �̸����� �������� �����ϵ�, �̸��� ������ ��ȣ�� �������� �ϴ�
		// ���ı����� ������ ���ĵ� ����� ��ȯ
		// �� ��, �̸� ������� win�� ������ �����ϱ� ������ ��÷ ��� Ȯ���� �� ���� �ؾ���
		TreeSet sort = new TreeSet(new SortedLottery());
		sort.addAll(win);
		
		return sort;
	}
	public boolean searchWinner(Lottery l) {//Ư�� ��÷�ڸ� �˻��ϴ� �޼ҵ�
		// ���� ���� l�� win���� ã��, ã�� ����� boolean �� ��ȯ
		boolean lContains = win.contains(l);
		return lContains;
	}
	
}
