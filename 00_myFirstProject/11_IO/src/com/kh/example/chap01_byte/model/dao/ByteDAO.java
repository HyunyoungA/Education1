package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// 파일로부터 byte단위로 데이터를 읽어오고 싶다.
		// File		Stream			입력 = Input		==> FileInputStream
		FileInputStream fis = null;//생성자 예외처리가능
		try {
			fis = new FileInputStream("a_byte.txt");
//			int value;
//			while((value=fis.read()) != -1) {//값이 a인데
//				System.out.print((char)value + " ");//여기서 또 다음값을 출력이 하는거로 이중으로 걸려서 다음값으로 출력
//			}
//			fis.read(); // 마지막에 도달하면 -1을 반환하겠다. -1이 나오면 끝에 도착했다는 뜻!!
			
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
		// 데이터를 파일에 byte단위로 쓰고 싶다
		//		File   Stream   출력 = Output ==> FileOutputStream
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("a_byte.txt");//생성자 예외처리가능
			fos = new FileOutputStream("a_byte.txt", true);
			// 파일이 존재하지 않으면 자동으로 파일을 만들어줌.
			
			//write(int b) : void
			fos.write(97);//97에 맞는 아스키코드의 값 a를 텍스트파일에 생성
			
			// write(byte[] b:)void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b   c    d   e    f    g  =>텍스트파일로 출력(아스키 코드)
			fos.write(bArr);
			
			//write(byte[] b, int, off, int len):void
			fos.write(bArr, 1, 3);//1부터 3개!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//**꼭 닫아줘야됨!!!!**finally로 닫음
			try { //위에 캐치는 위에 구문을 잡아주고 파이널리에서 캐치를 또 해줘야됨.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		//소괄호 안에 구분해줘야하는 객체가 여러개이면 (); 새미콜로 붙혀줘야됨. 구분짓기 위해서
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {
			//예외도 같이 잡아줘야됨 -->Unhandled exception type IOException thrown by automatic close() invocation on fis
		
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
			
			
			
			// 파일이 존재하지 않으면 자동으로 파일을 만들어줌.
			
			//write(int b) : void
			fos.write(97);//97에 맞는 아스키코드의 값 a를 텍스트파일에 생성
			
			// write(byte[] b:)void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b   c    d   e    f    g  =>텍스트파일로 출력(아스키 코드)
			fos.write(bArr);
			
			//write(byte[] b, int, off, int len):void
			fos.write(bArr, 1, 3);//1부터 3개!!
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
