package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
			ArgsProcessor ap = new ArgsProcessor(args);
			int originalInches = ap.nextInt("Enter a number of inches");
			int feet = originalInches / 12;
			int inches = originalInches % 12;
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		System.out.println("We have");
		if (feet ==1){
			System.out.println("" + feet + " foot");
		}
		else {
			System.out.println("" + feet + " feet");
		}
		if (inches == 1){
			System.out.println("" + inches + " inch");
		}
		else{
			System.out.println("" + inches + " inches");
		}
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
