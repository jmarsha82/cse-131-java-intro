package lab6;

public class Methods {
	/**
	 * @param n some number
	 * @return f
	 */
	public static int f(int n){
//		System.out.println("Method " + n);
		if(n>100){
//			int resultOne = n-10;
//			System.out.println("Greater than 100 so " + n + " - 10 = " + resultOne);
			return n-10;
		}
		else{
//			int result = f(n+11)-10;
//			System.out.print("f(" + n + " + 11) - 10");
//			System.out.println(" = " + result);
			return f(n+11)-10;
		}
	}
	/**
	 * @param x some number
	 * @param y some number
	 * @return g
	 */
	public static int g(int x, int y){
//		System.out.println("Method " + g);
  		if(x==0){
			return y+1;
		}
		else if(x>0 && y==0){
			return g(x-1,1);
		}
		else{
			return g(x-1, g(x,y-1));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(f(99));
		System.out.println(f(87));
		
		System.out.println(g(1,0));
		System.out.println(g(1,2));
		System.out.println(g(2,2));
		
		System.out.println(g(3,5)); // x < 4
		System.out.println(g(1,6)); // x < 4
		System.out.println(g(2,7)); // x < 4
		
//		System.out.println(g(4,5)); // x = 4 StackOverflow
//		System.out.println(g(4,1)); // x = 4 StackOverflow
//		System.out.println(g(4,7)); // x = 4 StackOverflow


	}

}
