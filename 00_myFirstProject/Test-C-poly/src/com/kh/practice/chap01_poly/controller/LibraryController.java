package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo(){
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		Book[] iArr = new Book[bList.length]; // Book[] iArr = new Book[5]-->5개로 정해놓지않고, 리스트의 길이로 받아와야 한다.
 		
		int count = 0;
		for(int i = 0; i < iArr.length; i++) {
			if(bList[i]. getTitle().contains(keyword));{
				iArr[count++] = bList[i];
			}
		}
		return iArr;
	}
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기  HINT : count 이용
		
		
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge())
			result = 1;
			
		} if(bList[index] instanceof CookBook){
			if(((CookBook)bList[index]).getCoupon() == true){
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return index;
		
		// 전달 받은 index의 bList 객체가 만화책을 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화  나이제한으로 대여 불가
		
		// 전달 받은 index의 bList 객체가 요리책을 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “유”일 경우
		// 회원의 couponCount 1 증가 처리 후 <--회원의 쿠폰을 1개 증가시키려면 회원의 기존 쿠폰함의 정보를 불러와야한다!!
		// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰 발급
		// result 값 리턴
		
	}
}
