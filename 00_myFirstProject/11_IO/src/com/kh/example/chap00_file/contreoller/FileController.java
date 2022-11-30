package com.kh.example.chap00_file.contreoller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			//파일 만들 경로를 지정해주지 않으면 프로젝트 최상단에 파일 생성
			
//			File f2 = new File("C:/test/test.txt"); 밑에와 같은 방법
			File f2 = new File("C:\\test\\test.txt");
			f2.createNewFile();//캐치로 잡아줘서 빨간줄 안뜸
			
			File f3 = new File("C:\\temp1\\temp2");
			File f4 = new File("C:\\temp1\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs();//경로 생성
			f4.createNewFile();//파일 생성
			f4.delete();
			
			System.out.println(f2.exists()); //exists --> 존재하는가? true
			System.out.println(f3.exists()); //true
			System.out.println(f4.exists()); // 파일이 없어서--> false
			System.out.println(f3.isFile()); // isFile-->이거 파일이니? -->파일이 아닌 경로여서 --> false
			
			System.out.println("파일 명 : " +  f1.getName());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f1.getPath()); //내 위치에 따라 달라짐.
			System.out.println("저장 용량 : " + f1.length());
			System.out.println("f1 상위 폴더 : " + f1.getParent());
			System.out.println("f4 상위 폴더 : " + f4.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
