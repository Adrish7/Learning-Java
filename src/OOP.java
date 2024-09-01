 
public class OOP {

	public static void main(String[] args) {
		// An object is an instance of a class that may contain some attributes and methods, its a bundle of attributes and methods
		// think of attributes as the characteristics of the object and methods as the different actions that this object can perform
		
		Car myCar = new Car(); // now mycar has the characteristics of the car class
		System.out.println(myCar.model);
		
		Car myCar2 = new Car();
		System.out.println(myCar2.model);

	}

}

class Car {
	String company = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.0;
	
	
	void drive(){
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You hit the brakes");
	}
}
