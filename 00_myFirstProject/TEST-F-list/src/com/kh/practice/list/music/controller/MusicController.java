package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public boolean addList(Music music) {//����Ʈ �������� �� ���� �޼ҵ�
		boolean b = list.add(music);
		return b;
	}
	public int addAtZero(Music music) {//����Ʈ ù ��°�� �� ���� �޼ҵ�
		list.add(0,music);
		return 1;
	}
	public List printAll() {//��� ����Ʈ�� ��ȯ�ϴ� �޼ҵ�
		return list;
	}
	public Music searchMusic(String title) {//�� ���� �˻��ϴ� �޼ҵ�//�ε����� �ֱ⶧���� ������ i=0�̷��� ����� �� �ִ�.
		Music findMusic = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				findMusic = list.get(i);
				break;
			}
		}
		return findMusic;
	}
	public Music removeMusic(String title) {//�� ������ ã�� �����ϴ� �޼ҵ�
		Music removeMusic = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				removeMusic = list.remove(i);
				break;
			}
		}
		return removeMusic;
	}
	public Music setMusic(String title, Music music) {//�� ������ ã�� ������ �����ϴ� �޼ҵ�
		Music setMusic = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				setMusic = list.remove(i);
				break;
			}
		}
		return setMusic;
	}
	
}
