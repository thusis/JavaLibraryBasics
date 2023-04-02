package com.thusis.javabasics.object.Polymorphism.interfaceTest;

public class Dog implements Animal, Pet{

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
	
	@Override
    public void play() {
        System.out.println("산책가자~!");
    }

}
