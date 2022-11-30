package com.kh.example.animal.model.vo;

public class Dog extends Animal {// extends Animal 이걸로 상속 클래스 묶어줌.
	private double height;
	private String hair;
	
	public Dog() {}
	public Dog (String name, int age, double weight, double height, String hair) {
		super(name, age, weight);
		this.height = height;
		this.hair = hair;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getHair() {
		return hair;
	}
//	@Override
//	public String inform() {//메소드 이름이 달라지면 오버라이딩이 안됨.
//		 return super.inform() + " " + height + " " + hair;//재작성된 오버라이딩
//		 //super.inform 안에는 name, age, weight가 들어가있다.
//	}
	
//	@Override
//		public String inform() {//conrtoll + 스페이스바 -->오버라이딩 가능한 창을 보여줌
//			return super.inform() + " " + height + " " + hair;
//		}
	
	@Override
		public String toString() {
			return super.toString() + " " + height + " " + hair;
		}
	
	
	
	
	
	
	
	
}
