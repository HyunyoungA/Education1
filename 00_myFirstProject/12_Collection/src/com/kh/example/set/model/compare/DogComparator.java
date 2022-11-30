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
		Double object = o2.getWeight(); //����ڽ�
		
		int result = standard.compareTo(object);
		if(result == 0) {//�����԰���
			return o1.getName().compareTo(o2.getName());
		}else {
			return result;
		}
		
//		compare, compareto ���� instanceOf ��ߵ�

	}
	
	
//	//���׸� ������ ����
//	@Override
//	public int compare(Object o1, Object o2) {
//		Dog standardDog = (Dog)o1;
//		Dog objectDog = (Dog)o2;
//		
//		double standard = standardDog.getWeight();//����
//		double object = objectDog.getWeight();//��
//		
//		if(standard > object) {//�������� -->���������Ϸ��� -1 0 1�� ���� �ٲ��ֱ�!
//			return 1;
//		}else if(standard == object) {
//			return 0;
//		}else{
//			return -1;
//		}
//		return 0;
//	}

}
