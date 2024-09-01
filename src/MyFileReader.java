import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// there are to catch blocks we need to install for different security scenarios 

public class MyFileReader {

	public static void main(String[] args) {
		// File reader class allows us to read the contents of a file as a stream of characters, one by one
		// the read() method returns an integer value which contains the byte value of whatever character is being read
		// we can interpret this byte as a character 
		// remember if read() returns -1 that means there is no data to be read		
		// constructing the class
		try {
			FileReader reader = new FileReader("Test.txt");
			// as it returns an integer
			int data = reader.read();
			// we would like to continue reading this file as long as read() doesn't return -1
			
			while(data!= -1) {
				// don't use println
				// have to print the data as a character as it is one at a time
				System.out.print((char)data);
				data = reader.read();
			}
			
			// closing the reader
			reader.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

}
}
