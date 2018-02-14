package example2;

public class Example3 {

	public static void main(String[] args) {
		int var; // This declares the variable an integer.
		double x; // This declares a floating point variable.
		
		var = 10; // This assigns the variable to the value 10
		
		x = 10.00; // This declares x to the value 10
		
		System.out.println("Origianl value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); // This prints a blank line
		
		
		// Now divide by 4
		
		var = var / 4;
		x = x / 4;
		
		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);
	}

}
