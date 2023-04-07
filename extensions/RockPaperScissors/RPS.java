package RockPaperScissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// Add the two inputs
		int numberOfRounds = ap.nextInt("How many rounds will you play");	
		String playerOneText = null;
		String playerTwoText = null;
		int c = 0;
		int PlayerOneScore = 0;
		int PlayerTwoScore = 0;
		int Tie = 0;
		for(int i = 1; i <= numberOfRounds; ++i){
			++c;
			int playerOneNum = (int) Math.round((Math.random() / 2) * 10);
			if (playerOneNum == 0 || playerOneNum == 1){
				playerOneText = "Rock";
			}
			else if(playerOneNum == 2){
				playerOneText = "Paper";
			}
			else{
				playerOneText = "Scissor";
			}
			if (c % 3 == 1){
				playerTwoText = "Rock";
			}
			else if (c % 3 == 2){
				playerTwoText = "Paper";
			}
			else{
				playerTwoText = "Scissor";
			}
			if(playerOneText == playerTwoText){
				++Tie;
			}
			else if(playerOneText == "Rock" && playerTwoText == "Scissor"){
				++PlayerOneScore;
			}
			else if(playerOneText == "Scissor" && playerTwoText == "Paper"){
				++PlayerOneScore;
			}
			else if(playerOneText == "Paper" && playerTwoText == "Rock"){
				++PlayerOneScore;
			}
			else if(playerOneText == "Paper" && playerTwoText == "Scissor"){
				++PlayerTwoScore;
			}
			else if(playerOneText == "Rock" && playerTwoText == "Paper"){
				++PlayerTwoScore;
			}
			else if(playerOneText == "Scissor" && playerTwoText == "Rock"){
				++PlayerTwoScore;
			}
			System.out.println("Round " + i);
			System.out.println("Player One threw " + playerOneText);
			System.out.println("Player Two threw " + playerTwoText);
		}
		System.out.println("");
		System.out.println("There were " + Tie + " Ties");
		System.out.println("Players One Score: " + PlayerOneScore);
		System.out.println("Players Two Score: " + PlayerTwoScore);
		System.out.println("Players Ones Percent of wins " + Math.round(((double)PlayerOneScore/numberOfRounds) * 100) + "%");
		System.out.println("Players Two Percent of wins " + Math.round(((double)PlayerTwoScore/numberOfRounds) * 100) + "%");
	}
}
