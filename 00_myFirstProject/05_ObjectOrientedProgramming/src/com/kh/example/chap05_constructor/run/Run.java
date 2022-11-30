package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();

		//The constructor User() is undefined = ���������ڰ� ���ǵ�������
		//�Ű������� �ִ� �����ڰ� �����Ǹ� �⺻�����ڴ� JVM�� �������������.
		u1.inform();
		
		User u2 = new User("user1", "pass1","���ǰ�");
		//("user1", "pass1")-->The constructor User(String, String) is undefined
		//String�� ����. String String�� ����
		u2.inform();
		
		User u3 = new User("user2",new Date());
		//("user2","pass2")-->String, Date���� �ȵ�. String, String�̾�ߵ�.
		// �ڷ����� ��������Ѵ�.
		u3.inform();
	}
}
