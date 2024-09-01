import java.util.*; // for using 2d array list
public class TwoDArrayList {
	public static void main(String[] args) {
		ArrayList<String> bakery_list  = new ArrayList<String>();
		bakery_list.add("Pizza");
		bakery_list.add("pasta");
		bakery_list.add("donuts ");
		
		
		ArrayList<String> produce_list  = new ArrayList<String>();
		produce_list.add("tomatoes");
		produce_list.add("cucumbers");
		produce_list.add("peppers ");
		
		ArrayList<String> drink_list  = new ArrayList<String>();
		drink_list.add("soda");
		drink_list.add("tea");
		drink_list.add("coffee ");
		
		// lets create a 2d arraylist that combines all of these lists 
		
		ArrayList<ArrayList<String>> grocery_list = new ArrayList();
		grocery_list.add(produce_list);
		grocery_list.add(bakery_list);
		grocery_list.add(drink_list);
		System.out.println(grocery_list);
		System.out.println(grocery_list.get(0).get(2));
		// the first get is the row and the second get is the column
	}


}
