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
		//HashMap 객체 생성 (키는 String객체가, 값은 Snack객체가 들어갈 수 있는)
		//put(K key, V value):V
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한 맛", 1000));
		System.out.println("map : " + map);
		
		System.out.println(map.put("새우깡", new Snack("매운맛", 1500)));//덮어씌우기전의 이전의 값 V를 출력
		System.out.println("map : " + map);
		
		
		//containsKey(Object key):boolean
//		containsValue(object value):boolean
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));
		
//		get(Object key):V
		System.out.println(map.get("새우깡"));
		System.out.println(map.get("홈런볼"));
		
//		1. keySet() : Set<K>
//		map에 있는 key들을 Set에 답아 반환
		Set<String> set1 = map.keySet();//-->상단에 key가 string이어서
//		System.out.println(set1);
		
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + " : " + map.get(key));
		}
		
//		2. entrySet():Set<Map.Entry<K, V>
//			entry: 키와 값					map에 있는 entry(키+값의 쌍)들을 Set에 담아 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
//		System.out.println(set2);
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//키가 String이라서 compareTo가 오버라이딩 대어 있어서 가능
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack>(map);
		System.out.println(map2);
		
		TreeMap<String, Snack> map3 = new TreeMap<>(new SnackComparator());
		map3.putAll(map);
		System.out.println(map3);
		
		//size():int
		System.out.println(map3.size());
		
		//remove(Object key):V
		System.out.println(map3.remove("다이제"));
		System.out.println(map3);
		
		//remove(Object key, Object value):boolean
		System.out.println(map3.remove("고소미", new Snack("고소한 맛", 1000)));
		System.out.println(map3);
		System.out.println(map3.remove("포테이토", new Snack("짠맛", 1500)));
		System.out.println(map3);
		
		//clear():void
		map3.clear();
		System.out.println(map3);
		//isEmpty():boolean
		System.out.println(map3.isEmpty());
		
	}
	public void doProperties() {
		Properties prop = new Properties();
		//key와 value를 String으로 제한시켜놓은 Map구조의 컬렉션
		prop.setProperty("재소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		System.out.println(prop.getProperty("채소", "배추"));
		System.out.println(prop.getProperty("견과", "땅콩"));
		//null이었는데 땅콩으로 나옴
		//getPropety(String key, String defaultValue):String
		//key 값이 존재하면 그 key에 해당하는 value값을 반환
		//ket 값이 존재하지않으면 defaultValue를 반환
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
