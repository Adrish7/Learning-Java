import java.util.ArrayList; // have to import 
public class ArrayLists {

	public static void main(String[] args) {
		// ArrayLists - a resizable array, difference from a normal array is that arrays are fixed in size, you have to mention
		// the number of elements before making it unlike arraylists
		
		// if you wanted to put primitive values between the <> you need to use its wrapper class  
		ArrayList<String> food  = new ArrayList<String>();
		
		// add function
		food.add("pizza");
		food.add("hamburger");
		//Unlike normal arrays where it would be food.length for arraylists it is size
		for(int i = 0; i<= food.size();i++) {
			//to retreive an element of the array use the get() function
			System.out.println(food.get(i));
			
			
			food.set(0,"sushi");
			// replaces pizza with sushi
			food.remove(2);
			// clearing the entire lists 
			food.clear();
		}
	}

}
