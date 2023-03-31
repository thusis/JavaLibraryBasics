package com.thusis.javabasics.callby;

public class SwapTest {
//https://devlog-wjdrbs96.tistory.com/44
	int value;
	
	public SwapTest(int value) {
		this.value = value;
	}
	
	public static void swap(SwapTest a, SwapTest b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	public static void main(String[] args) {
		SwapTest a = new SwapTest(1);
		SwapTest b = new SwapTest(2);
		
		// 객체를 만들어 참조 변수인 a,b를 넘기는 Call by Reference
		
		System.out.println(a.value + " " + b.value);
		swap(a,b);
		System.out.println(a.value + " " + b.value);
	}
}
