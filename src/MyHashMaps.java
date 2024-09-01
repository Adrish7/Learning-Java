import java.util.HashMap;// need to import this 
public class MyHashMaps {

	public static void main(String[] args) {
		// implements the map interface 
		// is very similar to ArrayLists, but with key value pairs like a name, email or country, capital. So a pair of information like a dictionary in python
		// it stores objects and needs to use Wrapper Class
		
		
		
		// create a hashmap 
		// in the angle brackets you have to list the data type of the pairs you are storing, here we are dping countries and its capitals so strings
		// have to use wrapper class so instead of int it'll be Integer
		HashMap<String,String> countries = new HashMap<String,String>();
		
		// add a key and value 
		countries.put("United States of America","Washington DC");// (key,value)
		countries.put("India","New Delhi");
		countries.put("Russia","Moscow");
		
		// to display all the values within our hashmap
		System.out.println(countries); // not so pretty
		
		countries.remove("Russia"); // only need to put in the key in the parentheses
		
		// get a value from a key 
		System.out.println(countries.get("India"));
		
		// countries.clear();
		
		// size or how many key-value pairs there are in this hashmap 
		System.out.println(countries.size());
		
		//replace
		countries.replace("USA", "Detroit"); // here USA doesn't change only the value does so the capital of US changes to detroit 
		System.out.println(countries);
		
		System.out.println(countries.containsKey("England")); // these two both returns boolean values
		System.out.println(countries.containsValue("Beijing"));
		
		
		
		// a better way of printing the hash map using a for each loop
		for (String i: countries.keySet()) {
			System.out.print(i+ " = "); //prints the keys
			System.out.println(countries.get(i)); // prints the value
		}
	}

}
