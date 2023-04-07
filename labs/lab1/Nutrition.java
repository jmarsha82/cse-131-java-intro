package lab1;

import cse131.ArgsProcessor;

public class Nutrition {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		// Define the variables as they are inputed
		
		String name = ap.nextString("What is the name of this food");
		double initialCarbs = ap.nextDouble("How many carbs is in this food?");
		double initialFat = ap.nextDouble("How much fat is in this food?");
		double initialProtein = ap.nextDouble("How much protein is in this food?");
		int statedCalories = ap.nextInt("What is the stated calories of this food?");
		// Conversion to calories
		// and conversion to fiber
		
		double carbCalories = Math.round((initialCarbs * 4) * 10);
		carbCalories = carbCalories / 10;
		double fatCalories = Math.round((initialFat * 9) * 10);
		fatCalories = fatCalories / 10;
		double proteinCalories = Math.round((initialProtein * 4) * 10);
		proteinCalories = proteinCalories / 10;
		double actualCalories = carbCalories + fatCalories + proteinCalories;
		double unavailableCalories = Math.round((actualCalories - statedCalories) * 100);
		unavailableCalories = unavailableCalories / 100;
		double gramsOfFiber = Math.round((unavailableCalories / 4) *100);
		gramsOfFiber = gramsOfFiber / 100;
		// Percentage conversion
		
		double percentCarbs = Math.round((carbCalories / statedCalories) * 1000);
		percentCarbs = percentCarbs / 10;
		double percentFat = Math.round((fatCalories / statedCalories) * 1000);
		percentFat = percentFat / 10;
		double percentProtein = Math.round((proteinCalories / statedCalories) * 1000);
		percentProtein = percentProtein / 10;
		// Boolean values
		
		boolean lowCarb = percentCarbs <= 25;
		boolean lowFat = percentFat <= 15;
		// Boolean Coin flip
		
		boolean heads = Math.random() < .5;
		
		System.out.println(name + " has" + 
		"\n" + initialCarbs + " grams of carbonydrates = " + carbCalories + " Calories" + 
		"\n" + initialFat + " grams of fat = " + fatCalories + " Calories" +
		"\n" + initialProtein + " grams of protein = " + proteinCalories + " Calories" +
		"\n" + "This food is said to have " + statedCalories + " (available) Calories." +
		"\n" + "With " + unavailableCalories + " Calories, this food has " + gramsOfFiber + " grams of fiber." + 
		"\n" + "Approximately" + 
		"\n" + "\t" + percentCarbs + "% of your food is carbohydrates." + 
		"\n" + "\t" + percentFat + "% of your food is fat." +
		"\n" + "\t" + percentProtein + "% of your food is protein." + 
		"\n" + "This food is acceptable for a low-carb diet? " + lowCarb + 
		"\n" + "This food is acceptable for a low-fat diet? " + lowFat + 
		"\n" + "By coin flip, you should eat this food? " + heads);
		}
}
