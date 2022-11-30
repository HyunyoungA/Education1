package com.kh.example.chap03_assist.part01_buffer.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void inputByte() {

		// ���Ͽ� �ִ� �����͸� ����Ʈ ������� ������ �о���� �ʹ�
		//File				Stream			input	 -->FileInputStream
		//							Buffered(������)	 -->BufferedIntputStream
		BufferedInputStream bis = null;
		try {
//			FileInputStream fis = new FileInputStream("c_buffer");
//			BufferedInputStream bis = new BufferedInputStream(fis);//������Ʈ�� �ȿ� ��ݽ�Ʈ���� ��ƾ��Ѵ�.(������ ����)
			bis = new BufferedInputStream(new FileInputStream("C_buffer.txt"));
			
			int value;
			while((value=bis.read()) != -1) {
				System.out.print(value + " ");
			};
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		try {
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void inputByte2() {
		try {BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C_buffer.txt"));
			
			int value;
			while((value=bis.read()) != -1) {
				System.out.print(value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputByte() {
		//���� ���Ͽ� ����Ʈ ������� �����͸� ������ ����ʹ�.
		//		File	Stream			Output ->FileOutputStream
		//							Buffered	->BufferedOutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("C_buffer.txt");
			bos = new BufferedOutputStream(fos);
			
			bos.write(65);
			
			byte[] bArr = {66, 67, 68, 69};
			bos.write(bArr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void outputByte2() {
		
		try (FileOutputStream fos = new FileOutputStream("C_buffer.txt", true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			bos.write(65);
			
			byte[] bArr = {66, 67, 68, 69};
			bos.write(bArr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputChar() {
		//���� ���Ͽ� ���� ������� �����͸� ������ ���� �ʹ�.
		// 	File						Writer
		//						Buffered 		-->BufferedWriter
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("C_buffer.txt",true);
			bw = new BufferedWriter(fw);
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("�ǰ��ϼ���\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void outputChar2() {
		
		try (FileWriter fw = new FileWriter("C_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("�ǰ��ϼ���\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputChar() {
		//���Ͽ� ���� �����͸� ���� ������� ������ �а�ʹ�.
		// File		(Stream X)			Reader -->FileReader
		//							Buffered	->BufferedReader
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C_buffer.txt"));
			
			String value;
			while((value=br.readLine()) != null) {
					System.out.print(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}

	public void inputChar2() {
		try (BufferedReader br = new BufferedReader(new FileReader("C_buffer.txt"));){
			String value;
			while((value=br.readLine()) != null) {
					System.out.print(value);
			}
		}catch (IOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
