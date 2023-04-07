package arrays;
import cse131.ArgsProcessor;
/**
 * @param N is the number of people in the room
 * @output fraction (or percentage) of people born in that month
 * @output average of the 12 values you computed for the above
 * @output For each day, the fraction (or percentage) of people born on that day,
 *         whether in the same or in a different month.
 * @output average of the 31 values you computed for the above.
 * @output fraction (or percentage) of people born on exactly the same day.
 */
public class Birthday {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many people are in the room?");
		int[][] birthday = new int [13][32];
		double monthSum = 0.0;
		double daySum = 0.0;
		for(int i = 0; i <= N; ++i){ // Starts the loop that creates random dates
			int day = (int) ((Math.random() * 31) + 1);
			int month = (int) ((Math.random() * 12) + 1);
			birthday[month][day] += 1;
		}

		for(int month = 1; month <= 12; ++month ){ // Iterate through ragged array to compute output
			for(int day = 1; day <= 31; ++day){
				birthday[month][0] += birthday[month][day];
				birthday[0][day] += birthday[month][day];
				if(birthday[month][day] > 1){
					birthday[0][0] += 1;
				}
			}
		}
		for(int month = 1; month <= 12; ++month ){
			monthSum += birthday[month][0];
			if(birthday[month][0] != 0){
				System.out.println("For Month " + month + " the fraction of people with birthdays in that month is " + birthday[month][0]+ "/" + N);
			}

		}
		System.out.println("\n" + "The average of the above fractions " + ((monthSum/12)/100) + "\n");
		for(int day = 1; day <= 31; ++day ){
			daySum += birthday[0][day];
			if(birthday[0][day] != 0){
				System.out.println("For Day " + day + " the fraction of people with birthdays on that day is " + birthday[0][day]+ "/" + N);
			}
		}
		System.out.println("\n" + "The average of the above fractions " + ((daySum/31)/100) + "\n");
		System.out.println("The fraction of people with birthdays on the extact same month and day is " + birthday[0][0]+ "/" + N);
	}
}