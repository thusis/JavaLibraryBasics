package com.thusis.javabasics.object.Polymorphism.objectArrayTest1;

public class Fire extends Spell {

	@Override
	public String casting() {
		return "화염"+super.casting();
	}
}
