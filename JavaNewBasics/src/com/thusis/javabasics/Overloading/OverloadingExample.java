package com.thusis.javabasics.Overloading;

public class OverloadingExample {
	
	public static void main(String[] args) {
		
		OverloadingTest ob = new OverloadingTest();
		
		ob.test();
		ob.test(10,20);
		ob.test(50);
		ob.test(123.4);
		
	}

}
