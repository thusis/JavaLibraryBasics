package com.thusis.javabasics.object.Polymorphism.objectArrayTest1;

public class Light extends Spell {

	@Override
	public String casting() {
		return "빛" + super.casting();
	}
}
