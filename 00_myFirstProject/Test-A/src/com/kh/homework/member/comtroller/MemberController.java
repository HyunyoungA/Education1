package com.kh.homework.member.comtroller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {//현재 존재하는 멤버 수 반환
		return ;
	}
	public Boolean checkId(String inputId) {
		
	}//아이디 중복확인 하는 메소드
	public void inserMember(String id, String name, String password, String email, String gender, int age) {
		//Member객체를 객체배열에 저장하는 메소드
		
	}
	public String searchId(String id) {
		
	}//id로 회원조회하는 메소드
	public Member[] searchName(String name) {
		
	} //이름으로 회원조회하는 메소드
	public Member[] searchEmail(String email) {
		
	}//이메일로 회원을 조회하는 메소드
	public Boolean updatePassword(String id, String password) {
		
	}//비밀번호 변경 메소드
	public Boolean updateName(String id, String name) {
		
	}//이름 변경 메소드
	public Boolean updateEmail(String id, String email) {
		
	}//이메일 변경 메소드
	public Boolean delete(String id) {
		
	}//한 회원만 삭제하는 메소드
	public void delete() {
		
	}//전체회원삭제하는 메소드
	public Member[] printAll() {
		return Member();
	}//Member객체 반환 메소드

	
	
	
	
	
	
	
	
}
