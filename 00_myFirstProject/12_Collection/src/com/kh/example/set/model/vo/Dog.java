package com.kh.example.set.model.vo;

//public class Dog implements Comparable{
public class Dog implements Comparable<Dog>{//오버라이딩 안해서 뜨는 도그 빨간줄
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight; 
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}
	
	@Override
	public boolean equals(Object obj) {//equals 객체는 이미 만들어져있다는 뜻
		if(this == obj) {//this는 주소값
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {//getClass 안에 들어가있는 클래스 정보
			return false;
		}
		
		Dog other = (Dog)obj;//other 레퍼런스변수--> null인지 먼저 체크해야됨!!!
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		
		result = PRIME * result + (name ==null ? 0 : name.hashCode());
		result = PRIME * result + (int)weight;
		
		return result;
	}
	
	//Comparable에 제네릭 지정 버전
	@Override
	public int compareTo(Dog o) {
//		String other = o.name;
//		return name.compareTo(other);
//		return name.compareTo(o.name);//오름차순
		return -name.compareTo(o.name);//내림차순
	}
	//Comparable에 제네릭 미지정 버전
//	@Override
//	public int compareTo(Object o) {
	// Dog 이름 오름차순
//		Dog otherDog = (Dog)o;//형변환 다운캐스팅
//		String other = otherDog.name;
//		
//		int result = name.compareTo(other);
//		
//		return 0;
//	}
	

	
}
