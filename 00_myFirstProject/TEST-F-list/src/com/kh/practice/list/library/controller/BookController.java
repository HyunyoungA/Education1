package com.kh.practice.list.library.controller;

import java.util.ArrayList;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList bookList = new ArrayList();
	
	public BookController() {
		//�ʱ� ���� �־��� �⺻ ������
		bookList.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		bookList.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		bookList.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		bookList.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
	}
	public void insertBook(Book bk) {//����Ʈ�� �� ���� �޼ҵ�
		bookList.add(bk);
	}
	public ArrayList selectList() {//��� ����Ʈ�� ����ϴ� �޼ҵ�
		return bookList;
	}
	public ArrayList searchBook(String keyword) {//Ű����� å�� �˻��ϴ� �޼ҵ�
		ArrayList searchList = new ArrayList();
		for(int i = 0; i <bookList.size(); i++) {
			if(((Book) bookList.get(i)).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}return searchList;
	}
			
	public Book deleteBook(String title, String author) {
		//å ����� ���� ������ å�� �����ϴ� �޼ҵ�
		Book removeBook = null;
		
		for(int i = 0; i < bookList.size();i++) {
			if(((Book) bookList.get(i)).getTitle().equals(title) && 
					((Book) bookList.get(i)).getAuthor().equals(author)) {
					removeBook = (Book) bookList.remove(i);
				}
			}return removeBook;
		}
		
	}