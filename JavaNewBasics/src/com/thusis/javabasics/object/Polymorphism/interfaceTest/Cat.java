package com.thusis.javabasics.object.Polymorphism.interfaceTest;

public class Cat implements Animal, Pet{

	@Override
	public void cry() {
		System.out.println("냐옹냐옹!");
	}

	@Override
	public void play() {
		System.out.println("쥐 잡기 놀이하자~!");
	}

}
