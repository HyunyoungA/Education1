package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

//public class DogComparator implements Comparator {
public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
//		double standard = o1.getWeight();
//		double object = o2.getWeight();
//		if(standard > object) {
//			return 1;
//		}else if(standard == object) {
//			return 0;
//		}else{
//			return -1;
//		}
		
		Double standard = o1.getWeight();
		Double object = o2.getWeight(); //오토박싱
		
		int result = standard.compareTo(object);
		if(result == 0) {//몸무게같음
			return o1.getName().compareTo(o2.getName());
		}else {
			return result;
		}
		
//		compare, compareto 쓸때 instanceOf 써야됨

	}
	
	
//	//제네릭 미지정 버전
//	@Override
//	public int compare(Object o1, Object o2) {
//		Dog standardDog = (Dog)o1;
//		Dog objectDog = (Dog)o2;
//		
//		double standard = standardDog.getWeight();//기준
//		double object = objectDog.getWeight();//비교
//		
//		if(standard > object) {//오름차순 -->내림차순하려면 -1 0 1로 순서 바꿔주기!
//			return 1;
//		}else if(standard == object) {
//			return 0;
//		}else{
//			return -1;
//		}
//		return 0;
//	}

}
