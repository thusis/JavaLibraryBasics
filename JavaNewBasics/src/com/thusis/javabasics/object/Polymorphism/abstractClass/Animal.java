package com.thusis.javabasics.object.Polymorphism.abstractClass;

public abstract class Animal {
	
	private String name;
	private int age;
	
	public Animal() {}
	
	public void eat() {
		System.out.println("냠냠 맛있다!");
	}
	
	public void sleep() {
		System.out.println("쿨쿨 돼지꿈을 꾸자!");
	}
	
	abstract void cry();
}
