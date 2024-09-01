
public class Inheritance {

	public static void main(String[] args) {
		// Inheritance is when one class inherits the attributes and methods of another 

		
		Car3 car = new Car3();
		Bike bike = new Bike();
		car.go();
		bike.go();
	}

}


class Vehicle {
	double speed;
	void go() {
		System.out.println("This vehicle is moving");
	}
	
	void stop() {
		System.out.println("This vehicle has stopped");
	}
}

// to use inheritance after defining a class you have to add 'extends' and then the name of the class
// you want to receive everything from
// here vehicle is the super/parent class while Car and Bike are sub/ child classes 
class Car3 extends Vehicle{
	int wheels = 4;
	int doors= 4;
	
}

class Bike extends Vehicle{
	int wheels = 2;
	int pedals= 2;
	
}