import javax.swing.JOptionPane;
// Have to import this class for those dialogue boxes 
public class BasicGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		// Integer.parseInt converts a string into an integer 
		JOptionPane.showMessageDialog(null, "You are " + age+" years old");
	}

}
