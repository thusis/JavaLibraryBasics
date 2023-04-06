package com.thusis.javabasics.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	      // map<key : value> value의 자료형이 Object라 모든 Object는 다 들어갈수 있다.
        Map<String, Object> map = new HashMap<String, Object>();
        
        // Map에 문자열 데이터를 넣는다.
        map.put("testStr", "테스트 데이터 입니다.");
        
        // Map에 정수 데이터를 넣는다.
        map.put("testInt", 1234567890);
        
        System.out.println("문자열 데이터 표출 : " + map.get("testStr"));
        System.out.println("정수 데이터 표출 : " + map.get("testInt"));
        
        System.out.println("자료형 :: " + map.get("testStr").getClass().getName());
        System.out.println("자료형 :: " + map.get("testInt").getClass().getName());
        
        // map 데이터를 문자열에 셋팅
        String setStr = map.get("testStr").toString();
        
        // map 데이터를 int에 셋팅
        int setInt = (int)map.get("testInt");

	}

}
