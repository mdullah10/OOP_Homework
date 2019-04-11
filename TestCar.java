package oop;

public class TestCar {

	public static void main(String[] args) {
		//Static Polimerfism or compile-time polimerfism
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.brake();
		a.thretsafty();
		
		System.out.println("........");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.brake();
		//Child class object can be refereed by Parent class reference variable
		// is called dynamic Polimerfism
		Car c1 = new Audi();
		c1.start();
		c1.stop();
		c1.brake();
		


		

	}

}
