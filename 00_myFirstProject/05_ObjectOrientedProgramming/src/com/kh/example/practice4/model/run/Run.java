package com.kh.example.practice4.model.run;

import com.kh.example.practice4.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("책1", "출판사1", "저자1");
		b2.inform();
		
		Book b3 = new Book("책2", "출판사2", "저자2", 10000, 0.3);
		b3.inform();
		
//		Run r = new Run("제목", "퍼블리쉬", "작가", "가격", "디스카운트");
//		r.inform();
	}

}
