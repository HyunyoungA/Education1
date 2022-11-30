package com.kh.example.chap03_assist.part01_buffer.run;

import com.kh.example.chap03_assist.part01_buffer.model.dao.BufferDAO;

public class Run {
	public static void main(String[] args) {
		BufferDAO b = new BufferDAO();
//		b.inputByte();
//		b.outputByte();
//		b.inputByte2();
//		b.outputByte2();
		b.outputChar();
		b.inputChar();
	}
}
