
public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the previous 2 Fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib (2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(5));
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2
		System.out.println(findFact(5));
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
			
		}
		else if (n == 1) {
			return 1;
			
		}
		return ((fib(n-1)) * (fib(n-2)));

	}


	public static int findFact(int n) {
		if ( n == 0) {
		return 1;
		}
		System.out.println(n);
				return findFact(n-1) * n;
					
				}
		
	}
