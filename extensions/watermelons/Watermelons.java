package watermelons;

import java.util.Arrays;

public class Watermelons {

	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once.  So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the result.
	 * For example, if all of the incoming values are 0, then so are all of the returned values.
	 * @param nums an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	public static int[] allPairSums(int[] nums) {
		int newArraySize = (nums.length * (nums.length-1))/2;
		int[] ans = new int[newArraySize]; 
		int h = 0;
		for(int c=0; c<ans.length;++c ){
			for(int j=c+1;j<nums.length; ++j){
				ans[h] = nums[c] + nums[j];
				++h;
			}
		}
		return ans;
	}
	/**
	 * The method below must COMPUTE and return a solution as described
	 * on the web page for this extension.  
	 * 
	 * You must compute the solution by trying
	 * lots of possibilities, and finding the one that yields the right answer.
	 * 
	 * You can run the provided unit test to see if you are right.
	 * @param pairSums is array of watermelon pairwise sums.  In other words,
	 *    each element of pairSums represents the sum of one pair of watermelons in our puzzle.
	 * @return
	 */
	public static int[] getSolution(int[] pairSums) {
		int[] watermelAns = new int[5];
		int[] tester = new int[10];
		int max = (int) Double.NEGATIVE_INFINITY;
		for(int i=0;i<pairSums.length;++i){
			if(pairSums[i]>max){max=pairSums[i];}
		}
		while(!sameIntArrays(pairSums,tester)){
			for(int i=0;i<watermelAns.length;++i){
				watermelAns[i] = Math.abs((int) ((Math.random() * 1000) / 10) - (101-max));
			}
			tester = allPairSums(watermelAns);	
		}

		return watermelAns;
	}

	/**
	 * Compare two arrays for equality.  They must first be
	 * sorted, so that Arrays.equals can do its thing element
	 * by element, as is it wants.
	 * 
	 * However, what if the caller doesn't want the arrays to
	 * be disturbed?  We therefore clone the arrays (copies are
	 * made of them) before we do the compare, and we compare the
	 * clones.
	 * @param one: an array, not mutated
	 * @param two: another array, not mutated
	 * @return true iff the arrays' contents are the same
	 */
	public static boolean sameIntArrays(int[] one, int[] two) {
		int[] cone = (int[]) one.clone();
		int[] ctwo = (int[]) two.clone();
		Arrays.sort(cone);
		Arrays.sort(ctwo);
		return Arrays.equals(cone, ctwo);

	}

}
