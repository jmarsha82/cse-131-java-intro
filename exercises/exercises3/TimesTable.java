package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		//Table should include 0....N  --> N + 1 rows and columns
		// this just produces the array and the contents in it
		int[][] table = new int[N+1][N+1];
		for(int r=0; r <= N; ++r){
			for(int c=0; c <= N; ++c) {
				table[r][c] = r * c;
				
			}
		}
		// this produces the labels for the columns
		System.out.print("  |  ");
		for( int c=0; c<=N; ++c){
			System.out.print(c + " ");
		}
		//this produces the row lable and bar
		System.out.println();
		System.out.println("----------------------------");
		// System.out println(Arrays.deepToString(table));
		//produces the table and prints it, row by row
		for (int r=0; r <= N; ++r) {
			System.out.print(r + " | ");
			for (int c=0; c <= N; ++c){
				//print with space to the right
				// but all on the same line
				int entry = table[r][c];
				if (entry < 10){
					System.out.print(" " + table[r][c] + " ");
				}
				else {
				System.out.print(table[r][c] + "  ");
				}
			}
			//end of that row
			System.out.println();
		}
		
	}

}

