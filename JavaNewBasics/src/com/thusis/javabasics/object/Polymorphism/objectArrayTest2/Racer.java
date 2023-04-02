package com.thusis.javabasics.object.Polymorphism.objectArrayTest2;

public class Racer {
	
	public void drive(Car car) {
		car.run();
	}
	
	public void drive(Maserati car) {
		car.run();
	}
	
	public void drive(Ferrari car) {
		car.run();
	}
	
}
