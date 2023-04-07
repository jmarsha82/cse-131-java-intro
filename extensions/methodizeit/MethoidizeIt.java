package methodizeit;

import cse131.ArgsProcessor;

public class MethoidizeIt {
	/**
	 * calculates yearly rent
	 * @param monthlyRent int value that is used by the method
	 * @return yearly rent
	 */
	public static int yearlyRentCompute(int monthlyRent){
		int yearlyRent = monthlyRent * 12;
		return yearlyRent;
	}
	/**
	 * calculates weekly rent
	 * @param yearlyRent int value that is used by the method
	 * @return weeklyRent
	 */
	public static double weeklyRentCompute(int yearlyRent){	
		double weeklyRent = Math.round((yearlyRent / 52.00) * 100);
		weeklyRent = weeklyRent / 100;
		return weeklyRent;
	}
	/**
	 * calculates the yearly interest
	 * @param interestPayment double value that is used by the method
	 * @return yearlyInterest
	 */
	public static double yearlyInterestCompute(double interestPayment){
		double yearlyInterest = Math.round((interestPayment * 365) * 1000);
		yearlyInterest = yearlyInterest / 1000;
		return yearlyInterest;
	}
	/**
	 * calculates weekly interest
	 * @param yearlyInterest double value that is used by the method
	 * @return weeklyInterest
	 */
	public static double weeklyInterestCompute(double yearlyInterest){
		double weeklyInterest = Math.round((yearlyInterest / 52.143) * 100);
		weeklyInterest = weeklyInterest / 100;
		return weeklyInterest;
	}
	/**
	 * makes a decision to rent versus buy
	 * @param yearlyInterest double value that is used by the method
	 * @param yearlyRent double value that is used by the method
	 * @return decision
	 */
	public static String decision(double yearlyInterest, int yearlyRent){
		String decision = (yearlyInterest > yearlyRent) ? "should": "should not";
		return decision;
	}
	/**
	 * instantiates the parameters that are sent to the methods
	 * creates output
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String nameApartment = ap.nextString("What is the name of the Apartment Complex?");
		String zipCode = ap.nextString("What is the Zip Code of the Apartment Complex?");
		int monthlyRent = ap.nextInt("What is the monthly rent of this Apartment?");
		double interestPayment = ap.nextDouble("What is the daily interest payment on this Apartment?");
		int yearlyRent = yearlyRentCompute(monthlyRent);
		double weeklyRent = weeklyRentCompute(yearlyRent);
		double yearlyInterest = yearlyInterestCompute(interestPayment);
		double weeklyInterest = weeklyInterestCompute(yearlyInterest);
		System.out.println(nameApartment + " is located in the Zip Code " + zipCode + "\n" + 
		"Rent per year: " + yearlyRent + "\n" +
		"Rent per week: " + weeklyRent + "\n" +
		"Interest paid per year: " + yearlyInterest + "\n" +
		"Interest paid per week: " + weeklyInterest + "\n" +
		"I " + decision(yearlyInterest,yearlyRent) + " rent");
		
		}
}
