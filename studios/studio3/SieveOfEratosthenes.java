package studio3;

import cse131.ArgsProcessor;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);


		int n = ap.nextInt("What is the size of the array?");
		boolean [] sieve = new boolean [n];
		for (int i = 2; i < sieve.length; ++i){
			for (int j=2; j < i; ++j){
				if (i%j == 0){
					sieve [i] = true;
				}

			}


		}
		for (int k = 2; k < sieve.length; ++k){
			if (sieve [k] == false){
				System.out.print(k + " ");

			}
		}

	}

}


