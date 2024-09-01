
public class Interface {

	public static void main(String[] args) {
		// An interface is a template that can be applied to a class
		// it is similar to inheritance, but specifies what a class must do
		// classes can apply more than 1 interfaces while inheritance is limited to 1 super class
		
		
		// Going to create 2 interfaces - one called prey and other predator 
		// Creating an interface: file - new - interface

		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}

}

// to implement an interface you have to write your class like below 
class Rabbit implements InterfacePrey{
	// interfaces work like an abstract method and so you need to override all the methods of the interfaces
	@Override
	public void flee() {
		System.out.println("The rabbit is fleeing");
		
	}
	
	
	
}

class Hawk implements InterfacePredator{

	@Override
	public void hunt() {
		System.out.println("The hawk is hunting");
		
	}
	

}

class Fish implements InterfacePrey,InterfacePredator{

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("This fish is hunting smaller fish");
		
	}

	@Override
	public void flee() {
		// TODO Auto-generated method stub
		System.out.println("This fish is fleeing from bigger fish");
		
	}
	
}