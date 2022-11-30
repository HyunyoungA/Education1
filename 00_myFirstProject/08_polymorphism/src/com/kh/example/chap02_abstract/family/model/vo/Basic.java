package com.kh.example.chap02_abstract.family.model.vo;

import java.io.Serializable;
import java.util.List;

public interface Basic extends Cloneable, Serializable/*, List*/{
	
	
	
	
//	인터페이스에서의 필드는 항상 상수 필드 : public static final
	public static final int a = 10;
	String str = "Hello";//위에 코드를 생략해도 상수형 필드로 인지함
	
//	public void method() {
//	}
	public abstract void eat();//<--이 코드와 아래 코드 둘다 사용가능
	void sleep();//앞에 코드 생략해서 사용가능
	
	
}
