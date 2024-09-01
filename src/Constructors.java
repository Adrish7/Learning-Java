
public class Constructors {

	public static void main(String[] args) {
		// A constructor is a special method which is called when an object is created (instantiated)
		Human human1 = new Human("Rick",65,70.9);
		System.out.println(human1.name);
		Human human2 = new Human("Morty", 32, 61);
		System.out.println(human2.weight);
	}

}

class Human{
	// the following has to be done to assign the values when calling the class(above) to the variable 
	String name;
	int age;
	double weight;
	
	
	// this is the constructor and it takes in arguments 
	// gives us the ability to create different attributes with the same human
	Human(String name, int age, double weight){
		// assigning the argument
		this.name = name;
		this.age = age;
		this.weight = weight; // the keyword 'this' is necessary just like 'self' in python as when calling an object such as human 1
		// the this word basically transforms to human1.name  = name  letting us to access the name as the argument.
		// watch the bro code video again for clarity, Time stamp: constructors, 3 hrs and 2-3 minutes in 
		
	}
	
	void eat() {
		// to access an attribute inside the very class itself just use the this keyword
		// basically just use the name variable as this.name
		System.out.println(this.name+" is eating");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}
