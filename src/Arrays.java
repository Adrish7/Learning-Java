
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// make cars into an array
		// you need this [] after the variable and then {} on the array values 
		String[] cars = {"Camaro", "Corrette", "Tesla"}; // datatype of values shld be the same as the array data type 
		cars[0] = "Mustang";
		System.out.println(cars[0]);
		
		
		// Another way to write an a the three in the brackets is the number of element
		String[] better_cars = new String[3];
		better_cars[0] = "Lamborghini";
		// cars.length shows the number of elements in the array
	}

}
