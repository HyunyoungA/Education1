package com.kh.example.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackComparator;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		HashMap<String, Snack> map = new HashMap<>();
		//HashMap ��ü ���� (Ű�� String��ü��, ���� Snack��ü�� �� �� �ִ�)
		//put(K key, V value):V
		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("��������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����� ��", 1000));
		System.out.println("map : " + map);
		
		System.out.println(map.put("�����", new Snack("�ſ��", 1500)));//���������� ������ �� V�� ���
		System.out.println("map : " + map);
		
		
		//containsKey(Object key):boolean
//		containsValue(object value):boolean
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 1500)));
		
//		get(Object key):V
		System.out.println(map.get("�����"));
		System.out.println(map.get("Ȩ����"));
		
//		1. keySet() : Set<K>
//		map�� �ִ� key���� Set�� ��� ��ȯ
		Set<String> set1 = map.keySet();//-->��ܿ� key�� string�̾
//		System.out.println(set1);
		
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + " : " + map.get(key));
		}
		
//		2. entrySet():Set<Map.Entry<K, V>
//			entry: Ű�� ��					map�� �ִ� entry(Ű+���� ��)���� Set�� ��� ��ȯ
		Set<Entry<String, Snack>> set2 = map.entrySet();
//		System.out.println(set2);
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//Ű�� String�̶� compareTo�� �������̵� ��� �־ ����
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>(map);
		System.out.println(map2);
		
		TreeMap<String, Snack> map3 = new TreeMap<>(new SnackComparator());
		map3.putAll(map);
		System.out.println(map3);
		
		//size():int
		System.out.println(map3.size());
		
		//remove(Object key):V
		System.out.println(map3.remove("������"));
		System.out.println(map3);
		
		//remove(Object key, Object value):boolean
		System.out.println(map3.remove("��ҹ�", new Snack("����� ��", 1000)));
		System.out.println(map3);
		System.out.println(map3.remove("��������", new Snack("§��", 1500)));
		System.out.println(map3);
		
		//clear():void
		map3.clear();
		System.out.println(map3);
		//isEmpty():boolean
		System.out.println(map3.isEmpty());
		
	}
	public void doProperties() {
		Properties prop = new Properties();
		//key�� value�� String���� ���ѽ��ѳ��� Map������ �÷���
		prop.setProperty("���", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�");
		System.out.println(prop);
		
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("�߰�"));
		System.out.println(prop.getProperty("ä��", "����"));
		System.out.println(prop.getProperty("�߰�", "����"));
		//null�̾��µ� �������� ����
		//getPropety(String key, String defaultValue):String
		//key ���� �����ϸ� �� key�� �ش��ϴ� value���� ��ȯ
		//ket ���� �������������� defaultValue�� ��ȯ
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
