package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";//상수여서 초기화가 안됨.굳이 넣을 이유가 없음.
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {}
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;//The static field Trainee.score should be accessed in a static way //this=객체를 만들었을 때 쓰는 방법이기 때문에 오류
		
	}
	//변경 : setXXX /반환 : getXXX
	
	//name 변경 메소드
	public void setName(String name) {//매개변수에서 받아옴. 변경만 하기때문에 void로 지정해줌.
		this.name = name;
	}
	//name 반환 메소드
	public String getName() {//반환만 하기때문에 매개변수 필요없음.
		return name;
	}
	
	// classRoom 변경 메소드
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	//classRoom 반환 메소드
	public char getClassRoom() {
		return classRoom;
	}
	
	// time 변경 메소드
	public void setTime(String time) {
		this.time = time;
	}
	
	// time 반환 메소드
	public String getTime() {
		return time;
	}
	
	//ACADEMY 반환 메소드
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// score 변경 메소드
	public static void setScore(double score) {
		Trainee.score = score;
	}
	// score 반환 메소드
	public static double gerScore() {
		return score;
	}
	
	public String inform() {
		return ACADEMY + " " + classRoom + time + " 학생의 점수는" + score + "점입니다."; 
	}


}
