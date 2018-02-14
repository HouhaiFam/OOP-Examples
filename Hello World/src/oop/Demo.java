package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "Joe@hotmail.com";
		person1.phone = "1234567894";
		
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		/*
		// person
		String name = "Joe";
		String email = "joe@hotmail.com";
		String phone = "5467891234";
		
		//Action, activity, behavior
		// System.out.println(name + " is walking")
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to this for another person?
		String name2 = "Sarah";
		String email2 = "sarah@hotmail.com";
		String phone2 = "1234567894";
		
		//Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
	}
		
		//Enhance by adding functions to eliminate code
		static void walking(String name) {
			System.out.println(name + " is walking");
			
		//What about binding attributes and properties together?
				*/
	}

}
