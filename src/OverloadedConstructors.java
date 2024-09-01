
public class OverloadedConstructors {

	public static void main(String[] args) {
		// Overloaded constructors are multiple constructors within a class with the same name, but have different parameters
		// name + parameters = signature and they all have a different signature 
		// Check overloaded methods for understanding 
		
		Pizza pizza = new Pizza("Thick crust", "tomato", "mozzarella", "pepperoni");
		System.out.println("Here are the toppings of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);

	}

}


class Pizza{
	String bread;
	String sauce;
	String cheese;
	String topping;
	Pizza(String bread, String sauce, String cheese, String topping){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
		
	}
	
	Pizza(String bread, String sauce, String cheese){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		
		
		
	}
	Pizza(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
	
		
		
		
	}
}