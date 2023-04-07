package exercises2;

import cse131.ArgsProcessor;

public class Max {

	public static void main(String[] args) {
		//
		// Below, prompt the user for two ints, x and y
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Please enter a number?");
		int y = ap.nextInt("Please enter another number?");
		int max = 0;
		
		if (x > y) {
			max = x;
		}
		else {
			max = y;
		}
		//
		// Now use what you have learned about conditional
		//   execution to print the larger of the two values.
		//
		System.out.println("Max of " + x + " and " + y + " is " + max);

		// Run this program testing on various inputs for
		//    x and y:  some where x < y, some where x > y,
		//              some where x == y

	}

}
