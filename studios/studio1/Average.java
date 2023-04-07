package studio1;

import cse131.ArgsProcessor;

public class Average {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n1 = ap.nextInt("What is the first number you want averaged?");
		int n2 = ap.nextInt("What is the second number you want averaged?");
		double n3 = (double) (n1+n2)/2;
		System.out.println("The average is " + n3);
		}

}
