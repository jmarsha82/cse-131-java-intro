package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double startAmount   = ap.nextInt("How much money are you starting with?");
		double winChance = ap.nextDouble("What are your chances of winning?");
		double winAmount =  ap.nextInt("How much money will you need to win to stop?");
		int totalPlays = ap.nextInt("How many total plays will you have?");
		double lossChance = 1 - winChance;
		
		double Ruin = 0;
				
		
		if (lossChance != winChance){
			  Ruin = ((double) (lossChance/winChance)*startAmount - (lossChance/winChance)*winAmount) / (1 - (lossChance/winChance)*winAmount);
		}
		
		if (lossChance == winChance){
			  Ruin = 1 - (double) startAmount / winAmount;
		 }
		double totalAmount = startAmount;
		int l = 0;
		
			 
		for (int i = 0; i !=totalPlays; i++){
			int hands = 0;
			String outcome = "";
			while (totalAmount != 0 && totalAmount != winAmount){
				hands++;
				double gamble = Math.random();
				if (gamble > winChance){
					totalAmount--;
				}
				else{
					totalAmount++;
				}
				if (totalAmount == 0){
					outcome = "LOSE";
					l++;
				}
				if (totalAmount == winAmount){
					outcome = "WIN";
				}
				
			}
			System.out.println("Simulation " + (i+1) + ": " + hands + " rounds \t" + outcome);
			totalAmount = startAmount;
		}
		System.out.println("Losses: " + l + "\t Simulations: " + totalPlays + "\n Actual Ruin Rate: " + (double) l/totalPlays + "\t Expected Ruin Rate: " + Ruin);	
		
	}
	
}

			
		
	
		

		

