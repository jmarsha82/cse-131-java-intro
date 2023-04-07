package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");
		double sum = 0;
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		while(!StdIn.isEmpty()){
			double d = StdIn.readDouble();
			if(d > max){
				max = d;
			}
			if(d < min){
				min = d;
			}
			sum = sum + d;
			count = count + 1;
		}
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The average of the numbers is " + (sum / count));
		System.out.println("The count of the numbers is " + count);
		System.out.println("The min value is " + min);
		System.out.println("The max value is " + max);

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
