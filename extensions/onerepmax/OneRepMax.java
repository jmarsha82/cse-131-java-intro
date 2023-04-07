package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int successfulWeights = ap.nextInt("Please enter your successful lifting weight?");
		int successfulReps = ap.nextInt("How many reps did you get on that weight?");
		int desiredReps = ap.nextInt("How many reps do you want to hit?");
		int oneRepMax =  (int) Math.round ((double) successfulWeights * (1 + ( (double) successfulReps / 30)));
		int desiredWeight = (int) Math.round((double)oneRepMax / (1+ ((double)desiredReps/30.00)));
		desiredWeight = (Math.round(desiredWeight/5)) * 5;
		// only rounds to the nearest 10th  desiredWeight = (Math.round(desiredWeight/10)) * 10;
		int percentOfRep = 95;
		System.out.println("One-rep max: " + oneRepMax);
		System.out.println("Weight for " + desiredReps+ " reps: " + desiredWeight);
		while (percentOfRep >= 50) {
			int newWeight = (int) (((double) percentOfRep /100) * oneRepMax);
				System.out.println(percentOfRep + "% 1 RM: " + newWeight);
				percentOfRep = percentOfRep-5;
		}
	}

}