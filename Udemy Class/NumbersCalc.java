
public class NumbersCalc {

public static void main(String[] args) {	
	System.out.println("Program is starting");
	printName();
	int numA = 10;
	int numB = 20;
	addNumbers(numA, numB);
	int product = multiplyNumbers(numA, numB);
	//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB)); 
	System.out.println("The product of numbers " + numA + " and " + numB + " is " + product); 
}
	static void printName() {
			System.out.println("My name is Brandon");
	}
	
	
	static void addNumbers(int numberA, int numberB) {
		int Sum = numberA + numberB;
		System.out.println("The sum of the numbers " + numberA +" and " + numberB +" is " + Sum);
	}

	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product + 50, product);
		return product;
	}
	

}
