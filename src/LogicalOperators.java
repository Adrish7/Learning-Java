import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// logical operators 
		// &&  - AND 
		// || - OR 
		//  ! - NOT 
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp  = scanner.nextInt();
		scanner.nextLine();
		if (temp>30) {
			System.out.println("It is hot outside");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warmm outside");
		}
		else {
			System.out.println("It is cold outside ");
		}
		
		
		Scanner secondscanner  = new Scanner(System.in);
		System.out.println("You are playing a game, press lower or upper case q to quit ");
		String response = secondscanner.next();
		if (response.equals("q") || response.equals("Q")) { // for strings you can't just check if their equal with == you have to use the .equal method 
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game ");
		}
		
		// using the not logical operator 
		
		Scanner thirdscanner  = new Scanner(System.in);
		System.out.println("You are playing another game, press lower or upper case q to quit ");
		String response = thirdscanner.next();
		if (!response.equals("q") && !response.equals("Q")) { // for strings you can't just check if their equal with == you have to use the .equal method 
			System.out.println("You are still playing the game ");
		}
		else {
			System.out.println("You quit the game ");
		}
		
		
	}

}
