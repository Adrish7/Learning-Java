 
public class encapsulation {

	public static void main(String[] args) {
		// Encapsulation keeps attributes of classes hidden or private,
		// can be accessed through methods (getters & setters)
		// You should make attributes privates unless you have a reason to keep them public 
		
		
		Carsale car = new Carsale("Chevrolet", "Camaro", 2021);
		System.out.println(car.make);// as of now car.make won't work as the variable make is private in
		// the car sale class, we can use getter methods for these
		
		// if we use getMake however
		
		System.out.println(car.getMake()); // it works as this method is public 
		
		
		// to change the attributes of the car or set one as in a garage you have many types of cars
		// you have to use setter methods

		
		car.year(); // the issue here again is that the private 'year' variable isn't visible 
		car.setYear(2022); // now it can be changed (set)
		
		Carsale car2 = new Carsale("Ford", "Mustang", 2022);	
		
		// step 1 of copying car 2 to car. step 2 is at the bottom of the car sale class
		car2.copy(car);
		
		
		// what if you wanted to copy the values of a car to another but copy it while instantiating the car
		// for example car 2 was copied after it was instantiated as a Ford but it wasn't just an immediate
		// copy of car (1)
		
		
		// creating a copy constructor 
		Carsale car3 = new Carsale(car); // pass in the original car as the argument (in the brackets)
		
		
		
	}

}


class Carsale{
	private String make;
	private String model;
	private int year;
	Carsale(String make, String model, int year){
		//this.make = make;
		//this.model = model;
		//this.year = year;
		// the above is no longer needed as these have already been set in the setter methods 
		// instead we write
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	// overloaded constructor as making another car sale class
	Carsale(Carsale x){
		this.copy(x); // using the copy constructor down below 
	}
	
	// the following needed for accessing the private variables 
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	// create setter methods
	// no return type 
	// you have to pass in an argument
	public void setMake(String make) {
		this.make = make;
		
	}
	public void setModel(String model) {
		this.model = model;
		
	}
	public void setYear(int year) {
		this.year = year;
		
	}
	// Step 2 of copying car 2 to car (1)
	public void copy(Carsale x) { // here x is car (1)
		// here this refers to car 2 as above car 2 is the object calls upon the method 
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear()); 
	}
	
	
	
	
}


