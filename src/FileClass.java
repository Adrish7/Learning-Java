// need to import:
import java.io.File;
public class FileClass {

	public static void main(String[] args) {
		// A file is an abstract representation of file and directory pathnames
		
		File file = new File("/Users/adrish/Coding/Java/secret_message.rtf");// listing the file we are going to associate with the file object
		// using an if statement to check if this file exists 
		

		if (file.exists()) {
			System.out.println("That file exists");
			// get path is whatever is listed within the constructor method
			System.out.println(file.getPath());
			// get absolute path is the real full path
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile()); // boolean if the document is really a file 
			// file.delete() deletes the file
			
		}
		
		else {
			System.out.println("This file doesn't exist");
		}
		

		// if the file is not in the same project folder remember to paste the entire file path, you can do this
		// by right clicking on the file and copying its location

	

	
		}
	


}



