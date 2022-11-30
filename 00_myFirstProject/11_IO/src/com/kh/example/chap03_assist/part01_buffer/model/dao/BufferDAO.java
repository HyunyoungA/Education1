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

		// 파일에 있는 데이터를 바이트 기반으로 빠르게 읽어오고 싶다
		//File				Stream			input	 -->FileInputStream
		//							Buffered(빠르게)	 -->BufferedIntputStream
		BufferedInputStream bis = null;
		try {
//			FileInputStream fis = new FileInputStream("c_buffer");
//			BufferedInputStream bis = new BufferedInputStream(fis);//보조스트림 안에 기반스트림을 담아야한다.(다형성 적용)
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
		//나는 파일에 바이트 기반으로 데이터를 빠르게 쓰고싶다.
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
		//나는 파일에 문자 기반으로 데이터를 빠르게 쓰고 싶다.
		// 	File						Writer
		//						Buffered 		-->BufferedWriter
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter("C_buffer.txt",true);
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("건강하세요\n");
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
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("건강하세요\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputChar() {
		//파일에 쓰인 데이터를 문자 기반으로 빠르게 읽고싶다.
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
