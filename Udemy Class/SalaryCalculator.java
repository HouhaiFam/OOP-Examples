
public class SalaryCalculator {
	public static void main(String args[]) {
	//Lets create a variable to define our career
	
		
	//Declare variable
	String career;
	System.out.println("Program is starting");
	
	//Defined a variable
	career = "Software Developer";
	
	System.out.println("My career: " + career);
	
	//Declare & Define
	int hoursPerWeek = 40;
	int weeksPerYear = 50;
	double rate = 42.50;
	career = "Web Developer";
	
	double salary = hoursPerWeek * weeksPerYear * rate;
	System.out.println("My salary as a " + career + " at the rate of $" + salary + " per year." );
	
	//Compute our annual salary
	// Algorithm  is as follows: hoursPerWeek * weeksPerYear * rate
	
	}
}