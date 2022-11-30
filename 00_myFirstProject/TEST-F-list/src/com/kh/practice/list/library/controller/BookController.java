package com.kh.practice.list.library.controller;

import java.util.ArrayList;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList bookList = new ArrayList();
	
	public BookController() {
		//초기 값을 넣어줄 기본 생성자
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("안 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk) {//리스트에 값 저장 메소드
		bookList.add(bk);
	}
	public ArrayList selectList() {//모든 리스트를 출력하는 메소드
		return bookList;
	}
	public ArrayList searchBook(String keyword) {//키워드로 책을 검색하는 메소드
		ArrayList searchList = new ArrayList();
		for(int i = 0; i <bookList.size(); i++) {
			if(((Book) bookList.get(i)).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}return searchList;
	}
			
	public Book deleteBook(String title, String author) {
		//책 제목과 저자 명으로 책을 삭제하는 메소드
		Book removeBook = null;
		
		for(int i = 0; i < bookList.size();i++) {
			if(((Book) bookList.get(i)).getTitle().equals(title) && 
					((Book) bookList.get(i)).getAuthor().equals(author)) {
					removeBook = (Book) bookList.remove(i);
				}
			}return removeBook;
		}
		
	}