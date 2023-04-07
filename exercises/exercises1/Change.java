package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int pennies = ap.nextInt("Please enter number of pennies");
		int dollars = pennies / 100;  // Started with the largest values first
		pennies = pennies % 100;      // Kept re-assigning the pennies data type
		
		System.out.println("You have " + dollars + " dollars");
		int quarters = pennies / 25;
		pennies = pennies % 25;
		System.out.println(quarters + " quarters");
		int dimes = pennies / 10;
		pennies = pennies % 10;
		System.out.println(dimes + " dimes");
		int nickels = pennies / 5;
		pennies = pennies % 5;
		System.out.println(nickels + " nickels");
		System.out.println("and " + pennies + " pennies");
		
		System.out.println("So in summary you have " + dollars + " dollar(s), " + quarters + " quarter(s), " 
		+ dimes + " dime(s), " + nickels + " nickel(s) " + "and " + pennies + " pennies");
		//  Made sure to make a structure sentence with spaces and commas
		//  so that it would be clear.  Regret not having the knowledge to use the correct
		//  tense on the change types
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
