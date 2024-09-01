
public class SuperKeyword {

	public static void main(String[] args) {
		// super is a keyword which refers to the super/parent class of an object and is 
		// very similar to the 'this' keyword in classes
		Hero hero1 = new Hero("Batman", 42, "Money");
		System.out.println(hero1.name);
		
		Hero hero2 = new Hero("Superman", 43, "Everything");
		System.out.println(hero2);

	}

}


class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return this.name + "\n"+ this.age +"\n";
	}
}

class Hero extends Person{
	String power;
	Hero(String name, int age, String power){
		super(name,age);
		// by using the super keyword and putting in the name and age, the word super refers to the class
		// 'Person' and the name and age calls the this.name and this.age equations in the person class 
		// into the Hero class
		// we could also physically write this.name = name, this.age = age in the hero class
		// but it'll be very time consuming on a larger time scale 
		this.power = power;
		
		
			}
	
	public String toString() {
		return super.toString() +this.power;
	}

}
