package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
			String[] shuffled = new String[original.length];
			
			//iterate backwards over the suffled array to fill it in
			for (int i = shuffled.length-1; i >= 0; --i){
				// pick card from 0 to i from original array
				// c is an integer 0....1
				int c = (int) (Math.random() * (i + 1));
				shuffled[i] = original[c];
				// move all the cards up from c+1 to length-1
				//the "end" is actually index i
				//we can swap original[i] and original[c]
				String t = original[i];
				original[i] = original[c];
				original[c] = t;
				
				
				for (int j=c; j < shuffled.length-1; ++j){
					original[j] = original[j+1];
					//move card c to the "end" of the original array
					//
				}
			}
			System.out.println();
			
			for (int i = 0; i < shuffled.length; ++i){
				System.out.println("Shuffled at " + i + " is " + shuffled[i]);
			}
		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//

	}
	
}