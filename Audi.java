package oop;

public class Audi extends Car {
	//when same method present in parent class is as well as child class
	//with same name and same number of argument is called Method Overriding
	// Inheritance Method Overriding
	public void start() {
		System.out.println("Audi...start");
	}
	public void thretsafty() {
		System.out.println("Audi... thretsafty");
	}
}
