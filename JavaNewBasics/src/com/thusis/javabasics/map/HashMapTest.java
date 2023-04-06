package com.thusis.javabasics.map;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMapTest<String,String>();//HashMap생성
		HashMap<String,String> map2 = new HashMapTest<>();//new에서 타입 파라미터 생략가능
		HashMap<String,String> map3 = new HashMapTest<>(map1);//map1의 모든 값을 가진 HashMap생성
		HashMap<String,String> map4 = new HashMapTest<>(10);//초기 용량(capacity)지정
		HashMap<String,String> map5 = new HashMapTest<>(10, 0.7f);//초기 capacity,load factor지정
		HashMap<String,String> map6 = new HashMapTest<String,String>(){{//초기값 지정
			put("a","b");
		}};
	}

}
