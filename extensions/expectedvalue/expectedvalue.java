package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double pSucceed = ap.nextDouble("Please enter the probability of succeeding");
		double pFail = 1 - pSucceed;
		int gamerSucceedSalary = 190000;
		int gamerFailSalary = 5000;
		int programmerSalary = (int) Math.round((Math.random() / 2) * 100000) + 110000;
		double euGamerSucceedSalary = (3 * Math.sqrt(190000));
		double euGamerFailSalary = (3 * Math.sqrt(5000));
		int euProgrammerSalary = (int) Math.round (2 * Math.sqrt(programmerSalary));
		
		int expectedValueOfEuGamerSalary = (int) Math.round((pSucceed * euGamerSucceedSalary) + (pFail * euGamerFailSalary));
		boolean decision2 = expectedValueOfEuGamerSalary > euProgrammerSalary;
		int expectedValueOfGamerSalary = (int) Math.round((pSucceed * gamerSucceedSalary) + (pFail * gamerFailSalary));
		//expectedValueOfGamerSalary = Math.round(expectedValueOfGamerSalary);
		boolean decision = expectedValueOfGamerSalary > programmerSalary;
		System.out.println("Gamer: " + expectedValueOfGamerSalary + 
							"\nProgrammer: " + programmerSalary +
							"\nYou should be a gamer and not a programmer? " + decision);
		System.out.println("Gamer: " + expectedValueOfEuGamerSalary + 
				"\nProgrammer: " + euProgrammerSalary +
				"\nYou should be a gamer and not a programmer? " + decision2);


	}

}
// divide 2 times 10   *
		