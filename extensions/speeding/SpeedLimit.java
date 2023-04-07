package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		// Define the variables as they are inputed
		int carSpeed = ap.nextInt("How fast were you going in MPH?");
		int speedLimit = ap.nextInt("What was the posted speed limit in MPG?");
		int overSpeedLimit1 = carSpeed - speedLimit;
		int overSpeedLimit2 = (carSpeed - speedLimit) - 10;
		int fine1 = (overSpeedLimit1  >= 10) ? 50: 0;
		int fine2 = (fine1 != 0) ? overSpeedLimit2 * 10: 0;
		int totalFine = fine1 + fine2;
		System.out.println("You reported a speed of " + carSpeed+  " MPH for a speed limit of " + speedLimit + " MPH." + "\n" + 
		"You went " + overSpeedLimit1 + " MPH over the speed limit. Your fine is $" + totalFine + ".");			

	}

}
