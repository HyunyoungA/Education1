package com.kh.example.chap03_assist.part02_object.model.run;

import com.kh.example.chap03_assist.part02_object.model.dao.ObjectDAO;

public class Run {
	public static void main(String[] args) {
		ObjectDAO od = new ObjectDAO();
		od.fileSave();
//		od.fileOpen();
//		od.fileOpen2();
		
	}

}
