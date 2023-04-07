package studio6;

public class Methods {

	// Your methods go below this line
	/**
	 * 
	 * @param n input integer
	 * @return n-factorial
	 */
	public static int fact (int n){
		if ( n > 0){
			return n * fact (n-1);
		}
		else{
			return 1;
		}
	}
	/**
	 * 
	 * @param n input integer
	 * @return fibonacci sequence starting at n
	 */
	public static int fib(int n){
		if (n > 1){
			return fib(n-1)+fib(n-2);
		}
		else{
			return n;
		}
	}
	/**
	 * 
	 * @param n input integer
	 * @return boolean true if n is odd number
	 */
	public static boolean isOdd (int n){
		if (n>0){
			return !isOdd(n-1);
		}
		else {
			return false;
		}
	}
	/**
	 * 
	 * @param a input integer
	 * @param b input integer
	 * @return a + b
	 */
	public static int sum (int a, int b){
		if (b>0){
			return sum(a+1,b-1);
		}
		else{
			return a;
		}
	}
	/**
	 * 
	 * @param n input integer
	 * @return sum of n + (n-2) +...+ 0
	 */
	public static int sumDownBy2 (int n){
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		else {
			return n + sumDownBy2 (n-2);
		}
			
	}
	/**
	 * 
	 * @param n input integer
	 * @return 1/1 + 1/2 +...+ 1/n
	 */
	public static double harmonicSum(int n){
		if (n==1) return 1;
		else return 1/(double)n + harmonicSum(n-1);
	}
	/**
	 * 
	 * @param a input integer
	 * @param b multiplicative factor
	 * @return a+a+a+...+a (b times)
	 */
	public static int mult(int a, int b){
		if (b == 0){
			return 0;
		}
		else {
			return a + mult(a, b-1);
		}
	}
	
}
