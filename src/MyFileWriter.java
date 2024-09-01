import java.io.FileWriter;
import java.io.IOException;
public class MyFileWriter {

	public static void main(String[] args) {
		// have to use the file writer class
		// list the file path in the parentheses 
		FileWriter writer;
		try {
			writer = new FileWriter("yay.txt"); // this literally creates a new file, don't need to manually create one
			// just write any file name and don't put the entire file path and it will pop up on the project folder.
			writer.write("Roses are Red \nviolets are blue\nHow do you do?/nWhy isn't this working");
			writer.append("\nA poem by Adrish"); // appends to end of the text
			writer.append("\nThanks"); 
			writer.close();
			// to surround with try and catch you can just automatically generate it from an error suggestion
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}}
