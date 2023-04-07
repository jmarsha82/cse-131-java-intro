package lab3;

import cse131.ArgsProcessor;

public class GameOfDice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// Add the two inputs
		int numberOfDice = ap.nextInt("How many dice will you throw?");
		int numberOfThrows = ap.nextInt("How many times will you throw the dice?");
		//System.out.println("The number of dice throw is " + DiceThrown + " and the number of throws is " + NumberOfThrows);
		int[] diceThrown = new int [numberOfDice];
		int[] totalAmount = new int [(6 * numberOfDice) + 1];
		int sum = 0;
		int numTimes = 0;
		for (int t = 0; t < numberOfThrows - 1; ++t){
			sum = 0;
			boolean same = true;
			for (int i = 0; i <= numberOfDice-1; ++i){
				int v = (int) (Math.random()* 6) + 1;
				diceThrown[i] = v;
				System.out.print(diceThrown[i] + "  ");
				sum = sum + v;
				if (diceThrown[i] != diceThrown[0]){
					same = false;
				}
			}
			if (same == true) {
				numTimes++;
				totalAmount[sum] = totalAmount[sum] + 1;
				System.out.println("Total: " + sum + "    The dice are the same");
			}
			else{
				totalAmount[sum] = totalAmount[sum] + 1;
				System.out.println("Total: " + sum);
			}
		}
		for(int z = 0; z < totalAmount.length; ++z){
			if(totalAmount[z] > 0)
			System.out.println( " We've seen " + z + ": " + totalAmount[z] +" times.");
		}
		System.out.println("The dice are the same " + (((double)numTimes/numberOfThrows) * 100) + "% of the time");
	}

}


