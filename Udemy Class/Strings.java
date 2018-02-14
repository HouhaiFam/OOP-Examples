
public class Strings {

	public static void main(String[] args) {
		String words = "Invalid";
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
				
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}

		
		String browser = "Chrome";
		//(browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Brandon";
		String lastName = "Pozil";
		String SSN = "012345678";
		String SSN2 = "020665065002";
		if (SSN.length() > 9) {
			System.out.println(words); 
		}
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//Print the initials plus the last 4 digits of SSN
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
	}

}
