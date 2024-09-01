
public class Overloadedmethods {

	public static void main(String[] args) {
		// Overloaded methods = methods that have the same name but have different parameters
		// This works because these methods need to have different method signatures 
		// method signatures  = method name + parameters
		// thus they can have the same name but they will have different parameters
		
		int x = add(23,45);
		System.out.println(x);

	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method number 1");
		return a+b;
		
		
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method number 2");
		return a+b+c;
		
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method number 3");
		return a+b+c+d;
		
	}

}
