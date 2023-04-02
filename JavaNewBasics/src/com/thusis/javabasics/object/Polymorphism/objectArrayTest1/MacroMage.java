package com.thusis.javabasics.object.Polymorphism.objectArrayTest1;

public class MacroMage {

	public static void main(String[] args) {
		Spell[] mage = new Spell[3];
		
		mage[0] = new Fire();
		mage[1] = new Ice();
		mage[2] = new Light();
		
		for(int i=0; i<mage.length; i++) {
			System.out.println(mage[i].casting());
		}
//		for(Spell spell : mage) {
//			System.out.println(spell.casting());
//		}
		
	}
}
