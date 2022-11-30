package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public boolean addList(Music music) {//리스트 마지막에 값 저장 메소드
		boolean b = list.add(music);
		return b;
	}
	public int addAtZero(Music music) {//리스트 첫 번째에 값 저장 메소드
		list.add(0,music);
		return 1;
	}
	public List printAll() {//모든 리스트를 반환하는 메소드
		return list;
	}
	public Music searchMusic(String title) {//곡 명을 검색하는 메소드//인덱스가 있기때문에 포문에 i=0이렇게 사용할 수 있다.
		Music findMusic = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				findMusic = list.get(i);
				break;
			}
		}
		return findMusic;
	}
	public Music removeMusic(String title) {//곡 명으로 찾아 삭제하는 메소드
		Music removeMusic = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				removeMusic = list.remove(i);
				break;
			}
		}
		return removeMusic;
	}
	public Music setMusic(String title, Music music) {//곡 명으로 찾아 내용을 수정하는 메소드
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
