import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// dynamic in programming means after the computer compiles the source code (during runtime)
		// thus dynamic polymorphism is the ability of an object to take many forms while the code is running
		
		
		Scanner scanner = new Scanner(System.in);
		Zoo zoo;
		
		System.out.println("What animal do you want?");
		System.out.print("1 = Dog, 2 = Cat?");
		int choice = scanner.nextInt();
		if (choice == 1) {
			zoo = new Dog();
			zoo.speak();
	}
		else if (choice == 2) {
			zoo = new Cat();
			zoo.speak();
		}
		
		else {
			zoo = new Zoo();
			System.out.println("That choice was invalid");
		}
			
		}

}


class Zoo{
	public void speak() {
	System.out.println("All the animals go brrrr");
}}

class Dog extends Zoo{
	@Override
	public void speak() {
		System.out.println("Dog goes bark");
	}
	
}

class Cat extends Zoo{
	@Override
	public void speak() {
		System.out.println("Cat goes meow");
	}
}
