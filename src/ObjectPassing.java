
public class ObjectPassing {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Car car1 = new Car("BMW");
		garage.park(car1);
		Car car2 = new Car("Lambo");
		garage.park(car2);
		
	}

}


class Garage{
	void park(Car car1) {
		System.out.println("the "+ car1.name + "is parked in the garage");
		
	}
}


class Car{
	String name;
	Car(String name){
		this.name = name;
	}
	
}