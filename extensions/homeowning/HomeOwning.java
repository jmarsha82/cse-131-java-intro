package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		// Define the variables as they are inputed
		String nameApartment = ap.nextString("What is the name of the Apartment Complex?");
		String zipCode = ap.nextString("What is the Zip Code of the Apartment Complex?");
		int monthlyRent = ap.nextInt("What is the monthly rent of this Apartment?");
		double interestPayment = ap.nextDouble("What is the daily interest payment on this Apartment?");
		
		int yearlyRent = monthlyRent * 12;
		double weeklyRent = Math.round((yearlyRent / 52.00) * 100);
		weeklyRent = weeklyRent / 100;
		
		double yearlyInterest = Math.round((interestPayment * 365) * 1000);
		yearlyInterest = yearlyInterest / 1000;
		double weeklyInterest = Math.round((yearlyInterest / 52.143) * 100);
		weeklyInterest = weeklyInterest / 100;
		String decision = (yearlyInterest > yearlyRent) ? "should": "should not"; 
		
		System.out.println(nameApartment + " is located in the Zip Code " + zipCode + "\n" + 
		"Rent per year: " + yearlyRent + "\n" +
		"Rent per week: " + weeklyRent + "\n" +
		"Interest paid per year: " + yearlyInterest + "\n" +
		"Interest paid per week: " + weeklyInterest + "\n" +
		"I " + decision + " rent");
		
		}
}
