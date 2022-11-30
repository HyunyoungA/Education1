package com.kh.example.set.model.vo;

//public class Dog implements Comparable{
public class Dog implements Comparable<Dog>{//�������̵� ���ؼ� �ߴ� ���� ������
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
	public boolean equals(Object obj) {//equals ��ü�� �̹� ��������ִٴ� ��
		if(this == obj) {//this�� �ּҰ�
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {//getClass �ȿ� ���ִ� Ŭ���� ����
			return false;
		}
		
		Dog other = (Dog)obj;//other ���۷�������--> null���� ���� üũ�ؾߵ�!!!
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
	
	//Comparable�� ���׸� ���� ����
	@Override
	public int compareTo(Dog o) {
//		String other = o.name;
//		return name.compareTo(other);
//		return name.compareTo(o.name);//��������
		return -name.compareTo(o.name);//��������
	}
	//Comparable�� ���׸� ������ ����
//	@Override
//	public int compareTo(Object o) {
	// Dog �̸� ��������
//		Dog otherDog = (Dog)o;//����ȯ �ٿ�ĳ����
//		String other = otherDog.name;
//		
//		int result = name.compareTo(other);
//		
//		return 0;
//	}
	

	
}
