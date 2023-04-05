package com.thusis.javabasics.overloading;

public class OverloadingTest {
	
	void test() {
		System.out.println("매개변수 없음");
	}
	
	void test(int a, int b) {
		System.out.println("매개 변수 " + a + "와 " + b);
	}
	
	void test(double d) {
		System.out.println("매개변수 " + d);
	}

}
