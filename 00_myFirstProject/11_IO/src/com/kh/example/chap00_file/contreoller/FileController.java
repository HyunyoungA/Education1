package com.kh.example.chap00_file.contreoller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			//���� ���� ��θ� ���������� ������ ������Ʈ �ֻ�ܿ� ���� ����
			
//			File f2 = new File("C:/test/test.txt"); �ؿ��� ���� ���
			File f2 = new File("C:\\test\\test.txt");
			f2.createNewFile();//ĳġ�� ����༭ ������ �ȶ�
			
			File f3 = new File("C:\\temp1\\temp2");
			File f4 = new File("C:\\temp1\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs();//��� ����
			f4.createNewFile();//���� ����
			f4.delete();
			
			System.out.println(f2.exists()); //exists --> �����ϴ°�? true
			System.out.println(f3.exists()); //true
			System.out.println(f4.exists()); // ������ ���--> false
			System.out.println(f3.isFile()); // isFile-->�̰� �����̴�? -->������ �ƴ� ��ο��� --> false
			
			System.out.println("���� �� : " +  f1.getName());
			System.out.println("���� ���� ��� : " + f1.getAbsolutePath());
			System.out.println("���� ��� ��� : " + f1.getPath()); //�� ��ġ�� ���� �޶���.
			System.out.println("���� �뷮 : " + f1.length());
			System.out.println("f1 ���� ���� : " + f1.getParent());
			System.out.println("f4 ���� ���� : " + f4.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
