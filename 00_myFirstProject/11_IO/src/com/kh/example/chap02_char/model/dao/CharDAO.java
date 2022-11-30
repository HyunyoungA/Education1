package com.kh.example.chap02_char.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class CharDAO {
	public void fileOpen() {
		//���Ϸκ��� ���ڴ����� �����͸� �о���� �ʹ�
		// File	 (Stream X)		Reader ==> FileReader
		FileReader fr = null;
		try {
			 fr = new FileReader("b_char.txt");

			int value = 0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value + " ");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	public void fileOpen2() {
		try (FileReader fr = new FileReader("b_char.txt");){
			
			int value = 0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value + " ");
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fileSave() {
		//�����͸� ���Ͽ� ���� ������ ���� �ʹ�
		// File				Writer  ==> FileWriter
		FileWriter fw = null;
		try {
			 fw = new FileWriter("b_char.txt");
			
			fw.write("��! IO ��մ�~!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void FileSave2() {
		try (FileWriter fw = new FileWriter("b_char.txt");){
			fw.write("��! IO ��մ�~!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
