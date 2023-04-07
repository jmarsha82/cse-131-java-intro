package codingBat;

public class CodingBatRecursionOne {

	public static int factorial(int n) {
		// Base case: if n is 1, we can return the answer directly
		if (n == 1) {
			return 1;
		}
		// Recursion: otherwise make a recursive call with n-1
		// (towards the base case), i.e. call factorial(n-1).
		// Assume the recursive call works correctly, and fix up
		// what it returns to make our result.
		else{
			return n * factorial(n-1);
		}
	}

	public static int bunnyEars(int n) {
		// Base case: if bunnies==0, just return 0.
		if (n == 0) return 0;


		// Recursive case: otherwise, make a recursive call with bunnies-1
		// (towards the base case), and fix up what it returns.
		return 2 + bunnyEars(n-1);
	}
	public static int fibonacci(int n) {
		if (n > 1){
			return fibonacci(n-1)+fibonacci(n-2);
		}
		else{
			return n;
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(bunnyEars(2));
		System.out.println(fibonacci(2));
	}
}
