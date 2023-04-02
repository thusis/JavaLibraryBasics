package com.thusis.javabasics.object.Polymorphism.objectArrayTest1;

public class Ice extends Spell{

	@Override
	public String casting() {
		return "얼음" + super.casting();
	}
}
