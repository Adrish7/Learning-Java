import java.util.Scanner;
public class Whileloops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (name.isBlank()) { //variable.isBlank()
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		
		// The difference with a do while loop is that it performs the function once and then the while loop runs 
		do{
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello "+ name );
		
		
		
	}

}
