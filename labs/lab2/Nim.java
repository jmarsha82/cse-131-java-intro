package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int turnChoice = ap.nextInt("Which turn do you want, 1 or 2?");
		int i = 7; // i is number of sticks
		int round = 0;
		int i2 = 7;
		// Begin Game
		
		if (turnChoice == 1) { // Human goes first
		System.out.println("Human Starts");
			while (i != 0 && turnChoice == 1) {
			i = i2;
			int pulledNumberOfSticks = ap.nextInt("How many sticks will you pull, 1 or 2?");
			if ((pulledNumberOfSticks != 1 && pulledNumberOfSticks != 2) || (pulledNumberOfSticks > i2)) {
				System.out.println("Incorrect amount entered, please try again");
			}
			else {
			i = i2 - pulledNumberOfSticks;
			System.out.println("Round " + round + "," + i2 + " sticks at start, human took " + pulledNumberOfSticks + ", so " + i + " stick(s) remain"); 
			round ++;
				if (i == 0) {
				System.out.println("Human Wins");
				System.exit(0);
				}
				else{
				double j = Math.random();
					if (j < 0.5 || i == 1) { // j is the random
					int computerSticksPulled = 1;
					i2 = i - computerSticksPulled;
					System.out.println("Round " + round + "," + i + " sticks at start, computer took " + computerSticksPulled + ", so " + i2 + " stick(s) remain");
						if (i2 == 0) {
						System.out.println("Computer Wins");
						System.exit(0);
						}		
						else{
						round ++;
						}
					}
					else {
					int computerSticksPulled = 2;
					for (computerSticksPulled = 2; 2 > i; computerSticksPulled = 1){}
					i2 = i - computerSticksPulled;
					System.out.println("Round " + round + "," + i + " sticks at start, computer took " + computerSticksPulled + ", so " + i2 + " stick(s) remain");
						if (i2 == 0) {
						System.out.println("Computer Wins");
						System.exit(0);
						}		
						else{
						round ++;
					}
				}
			}
		}
	}
}
		else {
		System.out.println("Computer Starts"); // Computer goes first
				while (i != 0) {
				double j = Math.random();
					if (j <= 0.5 || i == 1) { // j is the random
					int computerSticksPulled = 1;
					i2 = i - computerSticksPulled;
					System.out.println("Round " + round + "," + i + " sticks at start, Computer took " + computerSticksPulled + ", so " + i2 + " stick(s) remain");
						if (i2 == 0) {
						System.out.println("Computer Wins");
						System.exit(0);
						}
						else{
						round ++;}
					}
					else {
					int computerSticksPulled = 2;
					for (computerSticksPulled = 2; 2 > i; computerSticksPulled = 1){}
					i2 = i - computerSticksPulled;
					System.out.println("Round " + round + "," + i + " sticks at start, Computer took " + computerSticksPulled + ", so " + i2 + " stick(s) remain");
						if (i2 == 0) {
						System.out.println("Computer Wins");
						System.exit(0);
						}
						else{
						round ++;}
					}
						int pulledNumberOfSticks = ap.nextInt("How many sticks will you pull, 1 or 2?");
						if ((pulledNumberOfSticks != 1 && pulledNumberOfSticks != 2) || (pulledNumberOfSticks > i2)) {
							System.out.println("Incorrect amount entered, please try again");
						}
						else {
						i = i2 - pulledNumberOfSticks;
						System.out.println("Round " + round + "," + i2 + " sticks at start, Human took " + pulledNumberOfSticks + ", so " + i + " stick(s) remain"); 
							if (i == 0) {
							System.out.println("Human Wins");
							System.exit(0);
							}
							else{
							round ++;
						}
					}
				}
			} 
		}
	}


