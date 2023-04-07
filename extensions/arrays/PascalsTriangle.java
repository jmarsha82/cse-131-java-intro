package arrays;

import cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Please enter a value for N");
		int[][] pascalTable = new int[N+1][N+1];
		pascalTable[0][0] = 1;
		for(int r = 0; r < pascalTable.length; ++r){
			for(int c = 0; c < pascalTable.length; ++c){
				if(c == 0 || c == r){
					pascalTable[r][c] = 1;

				}
				else if (r < 0 || c < 0 || c > r){
					pascalTable[r][c] = 0;


				}
				else{
					pascalTable[r][c] = pascalTable[r-1][c] + pascalTable[r-1][c-1];


				}
				System.out.print(pascalTable[r][c]);

			}
			System.out.println();
		}

	}



}


