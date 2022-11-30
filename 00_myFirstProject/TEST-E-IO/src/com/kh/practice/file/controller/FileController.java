package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	public boolean checkName(String file) {
		//DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환

	}
	public void fileSave(String file, StringBuilder sb) {
		//전달받은 매개변수를 변경하고 DAO에 전달

	}
	public StringBuilder fileOpen(String file) {
		//DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환

	}
	public void fileEdit(String file, StringBuilder sb) {
		//전달받은 매개변수를 변경하고 DAO에 전달
	}
}
