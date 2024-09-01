
public class Makingmethods {

	public static void main(String[] args) {
		// A method is a block of code that is executed whenever it is called upon
		// making our own method outside the main method 
		
		String name = "Adrish";
		hello(name,age); // calling the method 
		int age = 15 
		
		
	

	}
	// To make a method you need a return type 
	static void hello(String title, int age) { // need to add static if you are going to call this method from another method which is static like the main method above  
		// anything within these braces is within the hello method 
		// you can call the hello method from a different place as well
		System.out.println("Hello " + title );
		System.out.println("You are "+age+" years old");
		
		// the argument and parameters work just like Python, here title is the parameter and name is the argument 
		// title and name don't need to be the same variable and you know why
		
		
		// if the method doesn't return anything it is called void though if it returns say the sum of two integers the return type has to be 
		// integer. For it to return something it needs a return statement like the one in python 
	}
	
}
