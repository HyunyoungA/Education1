package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";//������� �ʱ�ȭ�� �ȵ�.���� ���� ������ ����.
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {}
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;//The static field Trainee.score should be accessed in a static way //this=��ü�� ������� �� ���� ����̱� ������ ����
		
	}
	//���� : setXXX /��ȯ : getXXX
	
	//name ���� �޼ҵ�
	public void setName(String name) {//�Ű��������� �޾ƿ�. ���游 �ϱ⶧���� void�� ��������.
		this.name = name;
	}
	//name ��ȯ �޼ҵ�
	public String getName() {//��ȯ�� �ϱ⶧���� �Ű����� �ʿ����.
		return name;
	}
	
	// classRoom ���� �޼ҵ�
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	//classRoom ��ȯ �޼ҵ�
	public char getClassRoom() {
		return classRoom;
	}
	
	// time ���� �޼ҵ�
	public void setTime(String time) {
		this.time = time;
	}
	
	// time ��ȯ �޼ҵ�
	public String getTime() {
		return time;
	}
	
	//ACADEMY ��ȯ �޼ҵ�
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// score ���� �޼ҵ�
	public static void setScore(double score) {
		Trainee.score = score;
	}
	// score ��ȯ �޼ҵ�
	public static double gerScore() {
		return score;
	}
	
	public String inform() {
		return ACADEMY + " " + classRoom + time + " �л��� ������" + score + "���Դϴ�."; 
	}


}
