import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I love Pizza");
		//ln is for new line  
		
		// \n is the escape sequences for a new line ,  \t is for tab
		
		Scanner scanner = new Scanner(System.in);
		// the second 'scanner' is the name of the Scanner 
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine(); // have to write nextLine as the user types it into the next line 
		// it'll be .nextint for an integer 
		// after using next int you should just write scanner.nextLine(); so the scanner doesn't stop working
		System.out.println("Hello "+name);
		scanner.close();
		// must close the scanner 
	}

}
