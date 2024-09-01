import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Exceptions are the events that occurs during the execution of a program that disrupts the normal flow of instructions
		// Just like Python's syntax error 

		
		// Creating a program where you divide two numbers and display the result 
		
		// to create an exception for the following code you can surround the code inside a try block thus:
		try {
			
			System.out.println("Enter a whole number to divide: ");
			int x = scanner .nextInt();
		
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner .nextInt();
		
			int z = x/y;
			System.out.println(z);
		}
		
		// the computer will 'try' all of this code and if it encounters an exception, it will perform whatever
		// is within a catch block 
		// The variable x next to the exception can be any variable 
		catch(ArithmeticException x) {
			System.out.println("You can't divide by 0");
		}
		
		catch(InputMismatchException x) {
			System.out.println("PLease enter an actual number");
		}
		
		catch(Exception e) {
			// this catch will catch all exceptions out there 
			System.out.println("Something went wrong");
		}
		
		// a finally block will always execute whether or not we caught an exception
		// its basically just used to close scanners, files and stuff like that
		finally {
			scanner.close();
			
		}
		
	}

}
