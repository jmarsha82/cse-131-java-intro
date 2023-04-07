package lab6;

public class Beer {
	/**
	 * 
	 * @param n is a number
	 * @param noBeer
	 * @param buymore
	 * @return String
	 */
	public static String bottlesOfBeer (int n){
		if (n == 0)
		{
			String noBeer = "No more bottles of beer on the wall, no more bottles of beer";
			String buyMore = "Go to the store and buy some more.....then go to an AA meeting";
			return noBeer + "\n" + buyMore;                

		}
		else if (n == 1)
		{
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
			System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
			return bottlesOfBeer(n - 1);
		}
		else
		{
			System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer");
			System.out.println("Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall");
			return bottlesOfBeer(n - 1);
		}
	}
	public static void main(String[] args) {
		System.out.println(bottlesOfBeer(5));
	}
}