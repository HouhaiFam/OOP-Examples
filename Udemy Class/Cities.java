
public class Cities {

	public static void main(String[] args) {
	// 1. Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
	// 2. Declare and define an array(Size only)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "Nevada";
		states[3] = "Connecticut";
		states[4] = "Utah";
		
		//Declare an array
		String[] countries;
		
		//Define an array
		countries = new String[3];
		countries[0] = "United States";
		countries[1] = "UK";
		countries[2] = "Europe";	
		int i = 0;
		// Do Loop: control flow statement that executes a block of code at least once, and then repeatedly executes the block, or not, depending on a given boolean condition at the end of the block
		do {
			System.out.println("STATE: " + states[i]);
			i++;
		} while (i < 5);
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "California") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP");
		// For Loop: Best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
		}
	}


