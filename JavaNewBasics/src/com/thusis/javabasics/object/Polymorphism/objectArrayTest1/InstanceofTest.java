package com.thusis.javabasics.object.Polymorphism.objectArrayTest1;

public class InstanceofTest {
    public static void main(String[] args){

    	Spell spell = new Spell();
    	Fire fire = new Fire();
    	
    	System.out.println(spell instanceof Spell); //true
    	System.out.println(fire instanceof Spell); //true
    	System.out.println(spell instanceof Fire); //false
    	System.out.println(fire instanceof Fire); //true

    }
}
