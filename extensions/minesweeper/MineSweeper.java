package minesweeper;

import cse131.ArgsProcessor;

public class MineSweeper {

	/**
	 * @param cols is the number of columns in the mine field
	 * @param rows is the number of rows in the mine field
	 * @param percent chance in .## that you will hit a bomb
	 */
	public static void main (String[] args) {

		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		boolean[][] bombs = new boolean[cols+2][rows+2]; //Generates the first matrix that shows the bombs
		for (int i = 1; i <= cols; i++)
			for (int j = 1; j <= rows; j++)
				bombs[i][j] = (Math.random() < percent);

		for (int i = 1; i <= cols; i++) {
			for (int j = 1; j <= rows; j++)
				if (bombs[i][j]) System.out.print("* ");
				else             System.out.print(". ");
			System.out.println();
		}

		int[][] solution = new int[cols+2][rows+2];//Generates the second matrix that shows the solution
		for (int i = 1; i <= cols; i++)
			for (int j = 1; j <= rows; j++)
				for (int ii = i - 1; ii <= i + 1; ii++)
					for (int jj = j - 1; jj <= j + 1; jj++)
						if (bombs[ii][jj]) solution[i][j]++;

		System.out.println();
		for (int i = 1; i <= cols; i++) {
			for (int j = 1; j <= rows; j++) {
				if (bombs[i][j]) System.out.print("* ");
				else             System.out.print(solution[i][j] + " ");
			}
			System.out.println();
		}

	}
}
