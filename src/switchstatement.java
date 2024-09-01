
public class switchstatement {
	public static void main(String[] args) {
		// a switch is a statement which compares a variable aganist a list of other variables called cases 
		String day = "Friday";
		switch(day) {
		case "Sunday": System.out.println("it is sunday");
		break; 
		// this case will be compared to friday, make sure you break the case 
		case "Saturday": System.out.println("its saturday");
		break; 
		default: System.out.println("this is not a day");
		}
	}
}
