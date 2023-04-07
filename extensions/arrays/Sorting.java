package arrays;
import cse131.ArgsProcessor;

public class Sorting {

	/**
	 * size
	 * @param sorting[] is what i use to story the numbers of the array
	 * @param sortcount is how I kept track of the unsorted numbers as I worked through  the second for loop
	 * @param lowvalue what I used to story the lower of my comparison so that I could exchange the values if needs be
	 * @param total what I used to story the total of all the values of array so that I could eventually compute the average
	 * @param median is what I used to store the median.  If the array was even I would take the difference between the middle two values
	 * if the array was odd I would just take the middle value
	 * returned the array in the correct order, the mean, the median, the min, the max and the range
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("Enter the size of the array");
		if(size <= 0){ size = ap.nextInt("Please try again, the array must be a positive whole integer");}
		int[] sorting = new int[size];
		for(int i = 0; i < sorting.length; ++i){
			int input = ap.nextInt("Enter a number to input into the array");
			sorting[i] = input;
			System.out.print(sorting[i]+ " ");
		}
		System.out.println("");
		int sortCount = 0;
		while(sortCount < size){
			for(int i=sortCount + 1; i<sorting.length; ++i){
				if(sorting[sortCount]>sorting[i]) {
					int lowValue = sorting[sortCount];
					sorting[sortCount] = sorting[i];
					sorting[i] = lowValue;
				}
			}
			sortCount++;
		}
		for(int i=0;i<sorting.length;i++){ //Display array in the correct order
			System.out.print(sorting[i]+ " ");
		}
		System.out.println("");
		int total=0;
		for(int i=0;i<sorting.length;i++){//Compute and display Mean
			total+= sorting[i];
		}
		System.out.println("Mean: " + (double)total/size);
		double median;
		if (sorting.length % 2 == 0){
			median = ((double)sorting[sorting.length/2] + (double)sorting[sorting.length/2 - 1])/2;
		}
		else{
			median = (double) sorting[sorting.length/2];
		}
		System.out.println("Median: " + median + 
				"\n" + "Min: " + sorting[0] + 
				"\n" + "Max: " + sorting[size-1] + 
				"\n" + "Range: " + (size-1));

	}
}
