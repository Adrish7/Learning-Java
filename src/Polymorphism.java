
public class Polymorphism {

	public static void main(String[] args) {
		// Polymorphism is the ability for an object to identify as more than one type 
		Motorbike motorbike = new Motorbike();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		// the array racers needs a data type 
		// thus all of these vehicles identify as an autommobile 
		Autommobile[] racers = {motorbike,bicycle,boat};
		
		
		for(Autommobile i : racers) {
			i.go(); // you need to define the go method in auto mobile as well
		}
	}

}

class Autommobile{

	public void go() {
		
		
	}
	
}

class Motorbike extends Autommobile{
	public void go() {
		System.out.println("The motorbike starts moving");
	}
	
}

class Bicycle extends Autommobile{
	public void go() {
		System.out.println("The bicycle starts moving");
	}
	
	
}
class Boat extends Autommobile{
	public void go() {
		System.out.println("The boat starts moving");
	}
	
	
}

