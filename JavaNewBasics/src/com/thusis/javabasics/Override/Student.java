package com.thusis.javabasics.Override;

public class Student extends People {
	
	String job;
	
	public void print() {
		System.out.println("이름은 "+this.name+"이고, 나이는 "+this.age+"입니다.");
		System.out.println(this.name + "은 " + this.job + "입니다.");
	}
	
}
