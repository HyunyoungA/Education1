package com.kh.example.chap03_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.example.chap03_assist.part02_object.model.vo.Member;

public class ObjectDAO {
	
	public void fileSave() {
		Member[] mArr = {
				new Member("user01", "pass01", "���ǰ�", "kang1@kkk.kkk", 25, '��', 2349.3),
				new Member("user02", "pass02", "������", "nam1@nnn.nnn", 15, '��', 1834.6),
				new Member("user03", "pass03", "�����", "doh1@ddd.ddd", 53, '��', 3925.1),
		};
		
		//���Ͽ� ��ü�� �����ͷ� ����ʹ�.
		//File			OutputStream
		//			ObjectOutputStream
		try {FileOutputStream fos = new FileOutputStream("d_object.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i = 0; i < mArr.length; i++) {
				oos.writeObject(mArr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();{
		}
	}
}
	
	public void fileOpen() {
		//���Ͽ� �ִ� �����͸� ��ü�� �о���� �ʹ�
		//File 			
		//ObjectInputStream
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));){
			Member[] mArr = new Member[3];
			for(int i = 0; i < mArr.length; i++) {
				mArr[i] = (Member)ois.readObject();
			}
			
			for(int i = 0; i < mArr.length; i++) {
				System.out.println(mArr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen2() {
		Member[] mArr = new Member[3];
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));){
			
			int i = 0;
			while(true) {
				mArr[i] = (Member)ois.readObject();
				i++;
			}
		} catch (EOFException e) {
			for(int i = 0; i < mArr.length; i++) {
				System.out.println(mArr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
