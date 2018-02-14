package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> Think Instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "51065115";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "54651231";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "54056406";
		acc3.checkBalance();
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
	}

}
