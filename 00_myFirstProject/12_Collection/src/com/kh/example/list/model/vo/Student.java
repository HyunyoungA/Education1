package com.kh.example.list.model.vo;

public class Student {
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	   public boolean equals(Object obj) {
	      // 클래스 비교
	      if(this == obj) {
	         return true;
	      }
	      if(obj == null) {
	         return false;
	      }
	      if(getClass() != obj.getClass()) {
	         return false;
	      }
	      
	      // 내용 비교
	      Student other = (Student)obj;
	      if(name == null) {
	         if(other.name != null) {
	            return false;
	         }
	      } else if(!name.equals(other.name)) {
	         return false;
	      }
	      
	      if(score != other.score) {
	         return false;
	      }
	      
	      return true;
	   }
	   
	   @Override
	   public int hashCode() {
	      final int PRIME = 31;
	      int result = 1;
	      
	      result = PRIME * result + (name == null ? 0 : name.hashCode());
	      result = PRIME * result + score;
	      
	      return result;
	   }
	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
	
	

}
