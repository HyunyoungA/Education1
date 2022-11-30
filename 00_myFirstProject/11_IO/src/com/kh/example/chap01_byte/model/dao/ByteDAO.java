package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// ���Ϸκ��� byte������ �����͸� �о���� �ʹ�.
		// File		Stream			�Է� = Input		==> FileInputStream
		FileInputStream fis = null;//������ ����ó������
		try {
			fis = new FileInputStream("a_byte.txt");
//			int value;
//			while((value=fis.read()) != -1) {//���� a�ε�
//				System.out.print((char)value + " ");//���⼭ �� �������� ����� �ϴ°ŷ� �������� �ɷ��� ���������� ���
//			}
//			fis.read(); // �������� �����ϸ� -1�� ��ȯ�ϰڴ�. -1�� ������ ���� �����ߴٴ� ��!!
			
			File f = new File("a_byte.txt");
			int size = (int)f.length();
			byte[] bArr = new byte[size];
			fis.read(bArr);
			
			for(int i = 0; i < bArr.length; i++) {
				System.out.print((char)bArr[i] + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
					fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileSave() {
		// �����͸� ���Ͽ� byte������ ���� �ʹ�
		//		File   Stream   ��� = Output ==> FileOutputStream
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("a_byte.txt");//������ ����ó������
			fos = new FileOutputStream("a_byte.txt", true);
			// ������ �������� ������ �ڵ����� ������ �������.
			
			//write(int b) : void
			fos.write(97);//97�� �´� �ƽ�Ű�ڵ��� �� a�� �ؽ�Ʈ���Ͽ� ����
			
			// write(byte[] b:)void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b   c    d   e    f    g  =>�ؽ�Ʈ���Ϸ� ���(�ƽ�Ű �ڵ�)
			fos.write(bArr);
			
			//write(byte[] b, int, off, int len):void
			fos.write(bArr, 1, 3);//1���� 3��!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//**�� �ݾ���ߵ�!!!!**finally�� ����
			try { //���� ĳġ�� ���� ������ ����ְ� ���̳θ����� ĳġ�� �� ����ߵ�.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		//�Ұ�ȣ �ȿ� ����������ϴ� ��ü�� �������̸� (); �����ݷ� ������ߵ�. �������� ���ؼ�
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
			//���ܵ� ���� �����ߵ� -->Unhandled exception type IOException thrown by automatic close() invocation on fis
		
				File f = new File("a_byte.txt");
				int size = (int)f.length();
				byte[] bArr = new byte[size];
				fis.read(bArr);
				
				for(int i = 0; i < bArr.length; i++) {
					System.out.print((char)bArr[i] + " ");
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void fileSave2() {
		try (FileOutputStream fos = new FileOutputStream("a_byte.txt");){
			
			
			
			// ������ �������� ������ �ڵ����� ������ �������.
			
			//write(int b) : void
			fos.write(97);//97�� �´� �ƽ�Ű�ڵ��� �� a�� �ؽ�Ʈ���Ͽ� ����
			
			// write(byte[] b:)void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b   c    d   e    f    g  =>�ؽ�Ʈ���Ϸ� ���(�ƽ�Ű �ڵ�)
			fos.write(bArr);
			
			//write(byte[] b, int, off, int len):void
			fos.write(bArr, 1, 3);//1���� 3��!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
