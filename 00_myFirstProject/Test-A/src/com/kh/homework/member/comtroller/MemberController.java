package com.kh.homework.member.comtroller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {//���� �����ϴ� ��� �� ��ȯ
		return ;
	}
	public Boolean checkId(String inputId) {
		
	}//���̵� �ߺ�Ȯ�� �ϴ� �޼ҵ�
	public void inserMember(String id, String name, String password, String email, String gender, int age) {
		//Member��ü�� ��ü�迭�� �����ϴ� �޼ҵ�
		
	}
	public String searchId(String id) {
		
	}//id�� ȸ����ȸ�ϴ� �޼ҵ�
	public Member[] searchName(String name) {
		
	} //�̸����� ȸ����ȸ�ϴ� �޼ҵ�
	public Member[] searchEmail(String email) {
		
	}//�̸��Ϸ� ȸ���� ��ȸ�ϴ� �޼ҵ�
	public Boolean updatePassword(String id, String password) {
		
	}//��й�ȣ ���� �޼ҵ�
	public Boolean updateName(String id, String name) {
		
	}//�̸� ���� �޼ҵ�
	public Boolean updateEmail(String id, String email) {
		
	}//�̸��� ���� �޼ҵ�
	public Boolean delete(String id) {
		
	}//�� ȸ���� �����ϴ� �޼ҵ�
	public void delete() {
		
	}//��üȸ�������ϴ� �޼ҵ�
	public Member[] printAll() {
		return Member();
	}//Member��ü ��ȯ �޼ҵ�

	
	
	
	
	
	
	
	
}
