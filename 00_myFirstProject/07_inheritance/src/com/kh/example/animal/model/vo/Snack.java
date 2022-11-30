package com.kh.example.animal.model.vo;

public class Snack extends Animal{// extends Animal 이걸로 상속 클래스 묶어줌.
	private String pattern;
	
	public Snack() {}
	public Snack (String name, int age, double weight, String pattern) {
		super(name, age, weight);
		this.pattern = pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getPattern() {
		return pattern;
	}
//	@Override
//	public String inform() {
//		 return super.inform() + " " + pattern;//재작성된 오버라이딩
//	}
//	@Override
//	public String inform() {//conrtoll + 스페이스바 -->오버라이딩 가능한 창을 보여줌
//		return super.inform() + " " + pattern;
//	}
	@Override
		public String toString() {
			return super.toString() + " " + pattern;
		}
	
	
	
	
	
	
	
	
	
}
