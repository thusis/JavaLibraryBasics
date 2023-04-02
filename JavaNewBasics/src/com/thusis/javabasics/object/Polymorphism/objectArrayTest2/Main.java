package com.thusis.javabasics.object.Polymorphism.objectArrayTest2;

public class Main {

	public static void main(String[] args) {
		Racer numberOne = new Racer();
		
		Car car1 = new Car();
		numberOne.drive(car1);
		numberOne.drive(new Maserati());
		numberOne.drive(new Ferrari());
	}
}
