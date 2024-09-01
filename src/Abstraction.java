
public class Abstraction {

	public static void main(String[] args) {
		// Abstract classes cannot be instantiated, but they can have a subclass which can be instantiated
		// This prevents users in programs from instantiating a class which is to vague
		// consider the parent class vehicle and sub class car
		// if a person walks into a motor dealership and simply asks for a vehicle it doesn't make sense
		// what kind of vehicle? thus we can abstract the class vehicle and only allow them to instantiate 
		// or buy child classes like cars, trucks or bikes
		
		// Along with an abstract class you can also create an abstract method 
		
		// Abstract methods are declared with out an implementation (means without a body)
		
		
		whatCar myCar = new whatCar();
		myCar.please_go();

	}

}

// abstract class
abstract class whatVehicle{
	
	// abstract method
	abstract void please_go(); //no body
	// no body forces the user to give the method a body in the child classes, basically method overriding 
	
}

class whatCar extends whatVehicle{

	@Override
	void please_go() {
		System.out.println("The driver is the driving the car ");
		
	}
	
	
}