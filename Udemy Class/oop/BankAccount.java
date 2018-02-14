package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	//Static >> belongs to CLASS not the object instance
	//Final >> constant (often static final)
	static final String routingNumber = "018546" ;
	
	//Instance variable
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: Unique methods
		//1. They are used to define, setup or initialize properties of an object
		//2. Constructors are IMPLICITLY called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have NO return type
	BankAccount() {
		System.out.println("New Account Created");
			}
	//Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit; accountType; Msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg =("ERROR: Minimum deposit must be at least $1,000");
			} else {
			Msg = "Thanks for your intial deposit of: $" + initDeposit;
			}
		System.out.println(Msg);
		balance = balance+initDeposit;
	}
	
	
	//Getters / Setters
	
	// Allow the user to define the name
	public void setnName(String name) {
		this.name = "Mr." + name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}

	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("Withdraw");
				
	}
	//Private - can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction:" + activity);
		System.out.println("Your New Balance is: $" + balance);
		
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name:" + name + ", Account Number:" + accountNumber  +  ", Routing Number:" + routingNumber + ", BALANCE: $" + balance + "]";
	}
	
}
