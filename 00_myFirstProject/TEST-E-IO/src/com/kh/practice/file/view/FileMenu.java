package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		//���� �޴� ���
		while(true){
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� ����� ");
			System.out.println("2. ��Ʈ ���� ");
			System.out.println("3. ��Ʈ ��� �����ϱ� ");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : fileSave();break;
			case 2 : fileOpen();break;
			case 3 : fileEdit();break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void fileSave() {
		//���� ��� ������ ���� ����
		
		while(true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String str = sc.nextLine();
			try {FileOutputStream fos = new FileOutputStream(str);
				 StringBuilder sb = new StringBuilder(fos);
			
			if(str.equals("ex��it")) {
				System.out.println("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
				String str2 = sc.next();
				if(str.equals(str2 == fileOpen())) {
					System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
					String str3 = sc.next();
					if(str.equals("y")) {
						fc.fileSave(str2, sb);
					}if(str.equals("n")) {
						System.out.println("������ ���� ���� �Է����ּ��� ~");
				}
			}if(str.equals(str2 != fileOpen())) {// ���� ������ ���� ���� �������� �ʴ� ���� ���̾��ٸ�
				fc.fileSave();// ���� ��� ������ fc�� fileSave �޼ҵ�� �ѱ�
			
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			// ��ex��it���� �Է��� ������ ����ڰ� �Է��ϰ� �ϰ� �� ������ StringBuilder�� ����
		
		}
	}
	public void fileOpen() {
		//���� ���� �޾� ����� ������ ���
	}
	public void fileEdit() {
		//���� ��� ������ ���� ����
	}
}
