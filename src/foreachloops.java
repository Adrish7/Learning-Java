import java.util.ArrayList;

public class foreachloops {

	public static void main(String[] args) {
		// for-each loops take less steps but is less flexible as well
		
		String[] animals = {"cat","dog","rat","bird"};
		// read it like for every String index in animals, colon is 'in'
		for(String i : animals) {
			System.out.println(i);
		}

		ArrayList<String> zoo_animals = new ArrayList<String>();
		zoo_animals.add("dog");
		//basically it'll work with a for each loop as well
		
		
	}

}
