package com.kh.example.practice4.model.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("å1", "���ǻ�1", "����1");
		b2.inform();
		
		Book b3 = new Book("å2", "���ǻ�2", "����2", 10000, 0.3);
		b3.inform();
		
//		Run r = new Run("����", "�ۺ���", "�۰�", "����", "��ī��Ʈ");
//		r.inform();
	}

}
